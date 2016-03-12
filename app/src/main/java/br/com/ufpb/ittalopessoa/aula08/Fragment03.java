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
public class Fragment03 extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.frag_03,container,false);
        Bundle bundle = getArguments(); //O fragment 03 é o que está recebendo parametros da minha activity
        TextView textView = (TextView)view.findViewById(R.id.textView2);
        textView.setText(bundle.getString("nome"));

        return view;
    }
}
