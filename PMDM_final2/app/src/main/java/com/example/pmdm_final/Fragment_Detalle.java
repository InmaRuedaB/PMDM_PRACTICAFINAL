package com.example.pmdm_final;

import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;


import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

public class Fragment_Detalle extends Fragment {
    // representa el ID del elemento selecionado en la lista y que a este fragmento le llega para cargar el contenido apropiado

    public static final String ARG_ID_ENTRADA_SELECIONADA = "item_id";

    private static final String TAG = "fragment";

    private View v;

    // El contenido que cargaremos en este fragmento
    private Lista_contenido.Lista_entrada mItem;

    public Fragment_Detalle() {

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        Log.i(TAG, "Ha entrado en el fragment");

        if (getArguments().containsKey(ARG_ID_ENTRADA_SELECIONADA)) {
            //Cargamos el contenido de la entrada con cierto ID seleccionado en la lista. Se recomiendo usar un Loader para cargar el contenido
            mItem = Lista_contenido.ENTRADAS_LISTA_HASHMAP.get(getArguments().getString(ARG_ID_ENTRADA_SELECIONADA));
        }

    }


    //método para el IMageButoon y donde configuro el mensaje que aparecerá cuando nos situemos sobre él
    private void configureImageButton() {
        ImageButton btn = (ImageButton) v.findViewById(R.id.backButtom);

        btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "Vas a volver", Toast.LENGTH_LONG).show();
                Intent i = new Intent(getActivity(), Activity_Principal.class);
                startActivity(i);
                ((Activity) getActivity()).overridePendingTransition(0, 0);
            }
        });


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.layout_fragment_detalle, container, false);

        //Mostramos el contenido al usuario
        if (mItem != null) {
            ((TextView) v.findViewById(R.id.textView_superior)).setText(mItem.textoEncima);
            ((TextView) v.findViewById(R.id.textView_inferior)).setText(mItem.textoDebajo);
            ((ImageView) v.findViewById(R.id.imageView_imagen)).setImageResource(mItem.idImagen);
        }

        configureImageButton();

        return v;
    }

//colocamos un Log que nos indica que s eha iniciado el Frangment Detalle
    private void onCreate() {
        super.onStart();
        Log.i(TAG, "Se ha iniciado el Fragment detalle");
    }

}