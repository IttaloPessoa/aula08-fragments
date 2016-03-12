package br.com.ufpb.ittalopessoa.aula08;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Ittalo Pessoa on 10/03/2016.
 */
public class Fragment01 extends Fragment {

    private TextView textView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) { // metodo responsavel por criar o meu fragment
        View view = inflater.inflate(R.layout.frag_01,container,false); // o metodo inflate irá preencher o espaço do meu fragment, passando como parametro seu layout, seu gerenciador de layout e u valor booleando que não permite que o mesmo preencha espaço caso esteja vazio.
        //aqui acontece toda regra de negócio do meu fragment
		textView = (TextView)view.findViewById(R.id.textView);
        textView.setText("Olá Mobral");
        return view;
    }
}
