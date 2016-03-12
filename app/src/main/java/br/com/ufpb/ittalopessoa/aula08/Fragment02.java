package br.com.ufpb.ittalopessoa.aula08;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/**
 * Created by Ittalo Pessoa on 10/03/2016.
 */
public class Fragment02 extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.frag_02,container,false);
        ImageView imageView = (ImageView)view.findViewById(R.id.imageView);
        return view;
    }
}
