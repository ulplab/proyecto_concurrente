package com.example.admin.pruebatracking.IU;

import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.admin.pruebatracking.R;

import java.util.ArrayList;


public class ListarUnGrupo extends ActionBarActivity {

    String[] titulos;
    int[] imagenes;
    String[] descripciones;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listar_un_chat);



    }
}
