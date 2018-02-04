package com.ramdhany.ari.studycase;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;


public class FormActivity extends AppCompatActivity {
    private static final String LOG_TAG = FormActivity.class.getSimpleName();
//    extras merupakan kunci untuk mendapatkan kembali suatu nilai teks. mendefinisikan extras intent
//    dengan menggunakan nama paket aplikasi.
//    memastikan extras itu unik
    static final String MAKAN ="com.ramdhany.ari.studycase.extra.MAKAN";
    static final String Jumlah ="com.ramdhany.ari.studycase.extra.Jumlah";

    EditText makan;
    EditText jum;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);
//variabel makan disini untuk mencari suatu EdiText dengan cara
//        memanggil id dari suatu Edit TeXT
        makan = (EditText) findViewById(R.id.editText_main);
        jum = (EditText) findViewById(R.id.editTextJmlh);
    }

    public void EatBus(View view) {
        Log.d(LOG_TAG, "Button clicked!"); //cek tombol bisa berfungsi pada log


        Intent intent = new Intent(this, FormActivity2.class);

        intent.putExtra("tempat","Eatbus");

        String makanan = makan.getText().toString();
        intent.putExtra(MAKAN, makanan);

        String jumlah = jum.getText().toString();
        intent.putExtra(Jumlah,jumlah);

        intent.putExtra("nominal","50000");

        startActivity(intent);
    }

    public void Abnormal(View view) { //deklarasi instance class
        Log.d(LOG_TAG, "Button clicked!"); //cek tombol bisa berfungsi pada log


        Intent intent = new Intent(this, FormActivity2.class);

        //Metod putExtra() menambahkan nilai EditText ke intent
        intent.putExtra("tempat","Abnormal");

        String makanan = makan.getText().toString();
        intent.putExtra(MAKAN, makanan);

        String jumlah = jum.getText().toString();
        intent.putExtra(Jumlah,jumlah);

        intent.putExtra("nominal","30000");

        startActivity(intent);
    }
}
