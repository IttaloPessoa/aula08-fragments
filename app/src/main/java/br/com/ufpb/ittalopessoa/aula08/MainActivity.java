package br.com.ufpb.ittalopessoa.aula08;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    private ListView listView;
    String[]lista = new String[]{"Fragment01","Fragment02","Fragment03"}; //Lista que será vizualizada no ListView
    ArrayAdapter<?> adapter; //necessário para armezenar qualquer estrutura de dados em um listView
    FragmentManager fm = getSupportFragmentManager(); // objeto responsável por gerenciar os fragments

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        adapter = new ArrayAdapter<Object>(this,android.R.layout.simple_list_item_1,lista); //instancia do ArrayAdapter passando como parametro, a minha activty atual, o estilo do listView e a lista que será inserida
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = (ListView)findViewById(R.id.listView);
        listView.setAdapter(adapter); // adpter inserido no listview
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() { //ação do clique no listView
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position ==0){ //verifica cada posição do listView
                    Fragment f1 = new Fragment01(); //recurperação do fragment que será visualizado na posição 0 do meu listView
                    fm.beginTransaction().replace(R.id.ladodireito,f1).commit(); // o metodo beginTransaction(), é responsável pela transição dos fragments na tela, o replace() indica onde e qual fragment irá aparecer, o commit é joga na tela o fragment
                }
                else if( position == 1){
                    Fragment f2 = new Fragment02();
                    fm.beginTransaction().replace(R.id.ladodireito,f2).commit();
                }
                else{
                    Bundle bundle = new Bundle(); //é possivel mandar parametro de uma activty para um fragment
                    bundle.putString("nome","Abestado");
                    Fragment f3 = new Fragment03();
                    f3.setArguments(bundle); //passagem dos parametros
                    fm.beginTransaction().replace(R.id.ladodireito,f3).commit();
                }
            }
        });
    }
}
