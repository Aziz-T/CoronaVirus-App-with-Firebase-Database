package com.k.coronavirus;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class korona_tedavi extends AppCompatActivity {

    private TextView txt1,txt2,txt3,txt4,txt5,txt6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_korona_tedavi);

        txt1=findViewById(R.id.txt1);
        txt2=findViewById(R.id.txt2);
        txt3=findViewById(R.id.txt3);
        txt4=findViewById(R.id.txt4);
        txt5=findViewById(R.id.txt5);
        txt6=findViewById(R.id.txt6);

        txt1.setText("Koronavirüs hastalığını (COVID-19) önlemek veya tedavi etmek için spesifik bir ilaç yoktur. Hastalar nefes almalarına yardımcı olmak için destek tedavisine ihtiyaç duyabilirler.");
        txt2.setText("Hafif belirtileriniz varsa iyileşene kadar evden çıkmayın. Aşağıdakileri yaparsanız belirtilerinizi hafifletebilirsiniz:");
        txt3.setText("dinlenmek ve uyumak");
        txt4.setText("vücudu sıcak tutmak");
        txt5.setText("bol miktarda sıvı tüketmek");
        txt6.setText("boğaz ağrısı ve öksürüğü hafifletmek için oda nemlendiricisi kullanmak veya sıcak duş almak");


    }
}
