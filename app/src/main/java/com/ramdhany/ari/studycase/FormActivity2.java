package com.ramdhany.ari.studycase;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class FormActivity2 extends AppCompatActivity {

    TextView makan;
    TextView porsi;
    TextView tempat;
    TextView nominal;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form2);


        Intent intent = getIntent();

        String pTempat = intent.getStringExtra("tempat");
        String pMakan = intent.getStringExtra(FormActivity.MAKAN);
        String pJumlah = intent.getStringExtra(FormActivity.Jumlah);
        String pNominal = intent.getStringExtra("nominal");
        int jNominal = Integer.valueOf(pJumlah)*Integer.valueOf(pNominal);

        tempat = (TextView) findViewById(R.id.tTempat);
        tempat.setText(pTempat);

        makan = (TextView) findViewById(R.id.Makanan);
        makan.setText(pMakan);

        porsi = (TextView) findViewById(R.id.tJumlah) ;
        porsi.setText(pJumlah);

        nominal = (TextView) findViewById(R.id.tNom);
        nominal.setText(String.valueOf(jNominal));


        //perintah conditional untuk memeriksa  suatu kondisi,lalu akan menjalankan program sesuai
        // dengan syarat/kondisi yang akan ditampilkan.
        if (jNominal > 65000){
            Context context = getApplicationContext();
            Toast toast = Toast.makeText(context, "Jangan Makan Malam disini! Kemahalan. Uangmu Sedikit", Toast.LENGTH_LONG);
            toast.show();
        }else {
            Context context =getApplicationContext();
            Toast toast = Toast.makeText(context, "Makan malam disini aja! Agak murah", Toast.LENGTH_LONG);
            toast.show();
        }

    }
}
