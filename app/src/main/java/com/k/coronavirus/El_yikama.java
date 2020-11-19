package com.k.coronavirus;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class El_yikama extends AppCompatActivity {

    TextView txt1, txt2,txt3,txt4,txt5,txt6,txt7,txt8,txt9,txt10,txt11,txt12;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_el_yikama);
        txt1=findViewById(R.id.metin1);
        txt2=findViewById(R.id.metin2);
        txt3=findViewById(R.id.metin3);
        txt4=findViewById(R.id.metin4);
        txt5=findViewById(R.id.metin5);
        txt6=findViewById(R.id.metin6);
        txt7=findViewById(R.id.metin7);
        txt8=findViewById(R.id.metin8);
        txt9=findViewById(R.id.metin9);
        txt10=findViewById(R.id.metin10);
        txt11=findViewById(R.id.metin11);
        txt12=findViewById(R.id.metin12);
        txt1.setText("Ellerinizi ıslatın.");
        txt2.setText("Islattığınız elinize biraz sabun alın ve ellerinize yayın.");
        txt3.setText("Avuç içlerinizi güzelce ovun.");
        txt4.setText("Sağ elinizle sol elinizin sırtını ve parmak aralarını, sol elinizle sağ elinizin sırtını ve parmak aralarını ovun.");
        txt5.setText("Avuç içleriniz birbirine bakacak şekilde parmak aralarınızı ovun.");
        txt6.setText("Avuç içleriniz birbirine bakacak şekilde parmaklarınızı kenetleyin ve aşağı yukarı oynatarak parmaklarınızı temizleyin.");
        txt7.setText("Sol elinizle sağ elinizin baş parmağını, sağ elinizle sol elinizin başparmağını ovun.");
        txt8.setText("Sağ ve sol parmak uçlarınızı avuç içine koyup tırnak içlerinizle avuç içinizi ovun.");
        txt9.setText("Sağ ile sol el bileğinizi, sol ile sağ el bileğinizi ovun.");
        txt10.setText("Ellerinizi akan suyun altında, tüm sabun yok olacak şekilde durulayın.");
        txt11.setText("Ellerinizi kağıt havlu ile kurulayın.");
        txt12.setText("Ellerinizi kuruladığınız kağıt havlu ile musluğu kapatın ve kağıt havluyu çöpe atın.");



    }
}
