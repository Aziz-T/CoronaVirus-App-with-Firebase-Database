package com.k.coronavirus;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Covid19_Nedir extends AppCompatActivity {

    TextView txt1,txt2, txt3, txt4,txt5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_covid19__nedir);
        txt1=findViewById(R.id.txt1);
        txt2=findViewById(R.id.txt2);
        txt3=findViewById(R.id.txt3);
        txt4=findViewById(R.id.txt4);
        txt5=findViewById(R.id.txt5);

        txt1.setText("1. Koronavirusler (CoV), soğuk algınlığından Orta Doğu Solunum Sendromu (MERS-CoV) ve Şiddetli Akut Solunum Sendromu (SARS-CoV) gibi daha ciddi hastalıklara kadar çeşitli hastalıklara neden olan büyük bir virüs ailesidir.");
        txt2.setText("2. Koronavirüs hastalığı (COVID-19) yeni bir virüsten kaynaklanan bulaşıcı bir hastalıktır.");
        txt3.setText("3. Hastalık kuru öksürük, ateş ve daha ciddi vakalarda nefes almada zorluk gibi semptomlarla birlikte solunum yolu sorununa (grip gibi) yol açar.");
        txt4.setText("4. Koronavirüs hastalığı en çok, hastalığa yakalanmış kişilerle öksürdükleri veya hapşırdıkları sırada temasla bulaşır.");
        txt5.setText("5. Kişilerin, üzerinde virüs bulunan bir yüzeye veya nesneye dokunup daha sonra kendi gözlerine, burunlarına veya ağızlarına dokunmaları yoluyla da bulaşır.");


    }
}
