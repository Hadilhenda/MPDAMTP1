package com.example.mpdamtp1;



import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {




    TextView tvPomme ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        tvPomme =(TextView) findViewById(R.id.tvPommes);


    }


    public void compter(View v){

            int nbPomme = Integer.valueOf(tvPomme.getText().toString());
            tvPomme.setText(String.valueOf(nbPomme+1));

    }



}

