package com.example.admin.pruebatracking.IU;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.admin.pruebatracking.Cliente;
import com.example.admin.pruebatracking.R;


public class FragmentGps extends Fragment {

    private Button btnLocalizacion;
    private ImageView imageView;
    TextView response;
    EditText editTextAddress, editTextPort;
    private AnimationDrawable savinAnimation;
    Context context;
    Cliente myClient;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_gps, container, false);

        context = getActivity();

        imageView = (ImageView)view.findViewById(R.id.animacion);
        editTextAddress = (EditText) view.findViewById(R.id.textIP);
        editTextPort = (EditText) view.findViewById(R.id.textPuerto);
        response = (TextView) view.findViewById(R.id.respuesta);
        imageView.setBackgroundResource(R.drawable.animacion_desplazamiento);
        savinAnimation = (AnimationDrawable)imageView.getBackground();

        btnLocalizacion = (Button)view.findViewById(R.id.btnEnviarLocalizacion);

        btnLocalizacion.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        switch (btnLocalizacion.getText().toString())
                        {
                            case "ENVIAR LOCALIZACIÓN":
                                btnLocalizacion.setText("STOP LOCALIZACIÓN");
                                btnLocalizacion.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_stop1, 0, 0, 0);
                                myClient = new Cliente(context,editTextAddress.getText()
                                        .toString(), Integer.parseInt(editTextPort
                                        .getText().toString()), response);
                                myClient.execute();
                                savinAnimation.start();
                                break;
                            case "STOP LOCALIZACIÓN":
                                btnLocalizacion.setText("ENVIAR LOCALIZACIÓN");
                                btnLocalizacion.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_localizacion, 0, 0, 0);
                                myClient.cancel(true);
                                savinAnimation.stop();
                        }
                    }
                }

        );


        return view;
    }
}