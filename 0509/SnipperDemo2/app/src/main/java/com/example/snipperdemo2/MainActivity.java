package com.example.snipperdemo2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener{

    private EditText opd1, opd2;
    private TextView output;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        opd1 = (EditText) findViewById(R.id.txtOpd1);
        opd1.setText("100");
        opd2 = (EditText) findViewById(R.id.txtOpd2);
        opd2.setText("50");
        output = (TextView) findViewById(R.id.lblOutput);
        Spinner sp = (Spinner) findViewById(R.id.spinner);
        sp.setOnItemClickListener(this);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int pos){
        int v1, v2;
        double r = 0.0;
        
    }
}

