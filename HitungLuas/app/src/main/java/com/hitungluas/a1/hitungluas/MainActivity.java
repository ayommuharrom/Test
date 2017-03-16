package com.hitungluas.a1.hitungluas;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView txt_hasil;
    private EditText edit_panjang, edit_lebar;
    private Button btn_hitung;
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setTitle("Hitung Luas Persegi");

        edit_panjang = (EditText) findViewById(R.id.edt_panjang);
        edit_lebar = (EditText) findViewById(R.id.edt_lebar);
        btn_hitung = (Button) findViewById(R.id.btn_hitung);
        txt_hasil = (TextView) findViewById(R.id.txt_hasil);//tes bedes
        btn_hitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                try{

                    Double panjang = Double.valueOf(edit_panjang.getText().toString());
                    Double lebar = Double.valueOf(edit_lebar.getText().toString());

                    double Luas = panjang* lebar;

                    txt_hasil.setText("LUAS : " + Luas);

                }catch (NumberFormatException e){
                    Toast.makeText(getBaseContext(), "Panjang dan lebar tidak boleh kosong", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
    }
