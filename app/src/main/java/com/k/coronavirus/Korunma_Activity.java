package com.k.coronavirus;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Korunma_Activity extends AppCompatActivity {


    TextView txt1,txt2, txt3, txt4,txt5;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_korunma_);

        txt1=findViewById(R.id.txt1);
        txt2=findViewById(R.id.txt2);
        txt3=findViewById(R.id.txt3);
        txt4=findViewById(R.id.txt4);
        txt5=findViewById(R.id.txt5);

        txt1.setText("1. Ellerinizi düzenli olarak 20 saniye boyunca sabun ve suyla yıkayın veya alkol bazlı sıvıyla ovalayın.");
        txt2.setText("2. Öksürürken veya hapşırırken burnunuzu ve ağzınızı tek kullanımlık mendille ya da dirseğiniz içi ile örtün.");
        txt3.setText("3. Kendisini iyi hissetmeyen kişilerle yakın temastan (1 meter) kaçının.");
        txt4.setText("4. Kendinizi iyi hissetmiyorsanız, evde kalıp kendinizi diğer kişilerden ayrı tutun.");
        txt5.setText("5. Elleriniz temiz değilken gözlerinize, burnunuza veya ağzınıza kesinlikle dokunmayın.");
        btn=findViewById(R.id.buton);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ıntent= new Intent(getApplicationContext(), El_yikama.class);
                startActivity(ıntent);
            }
        });
    }
}
