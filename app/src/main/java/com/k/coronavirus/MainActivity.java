package com.k.coronavirus;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.material.navigation.NavigationView;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener{

    FirebaseDatabase database = FirebaseDatabase.getInstance();
    DatabaseReference myRef = database.getReference();

    private RecyclerView recyclerView;
    private List<ulke_model> list;
    private ImageView imageView;
    private DrawerLayout drawer;
    NavigationView navigationView;
    private AdView mAdView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MobileAds.initialize(this,"ca-app-pub-7866301689844823~4434555251");

        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);


        Toolbar toolbar=findViewById(R.id.toolbarx);
        setSupportActionBar(toolbar);
        drawer=findViewById(R.id.drawer_layout);

        ActionBarDrawerToggle toggle=new ActionBarDrawerToggle(this,drawer,toolbar,R.string.navigation_drawer_open,R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        imageView=findViewById(R.id.gunluk_image);
        recyclerView=findViewById(R.id.rcyl);
        LinearLayoutManager layoutManager= new LinearLayoutManager(this);
        layoutManager.setOrientation(RecyclerView.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setEnabled(false);

        navigationView=findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);



        list = new ArrayList<>();
        final ulke_adapter adaptor= new ulke_adapter(list);
        recyclerView.setAdapter(adaptor);
        myRef.child("Ülkeler").addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                for(DataSnapshot dataSnapshot1 : dataSnapshot.getChildren()){
                    list.add(dataSnapshot1.getValue(ulke_model.class));
                }
                adaptor.notifyDataSetChanged();
            }
            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
                Toast.makeText(MainActivity.this,databaseError.getMessage(),Toast.LENGTH_SHORT).show();
            }
        });


        myRef.child("Tablo").addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {

                String photoUrl = dataSnapshot.child("url").getValue(String.class);

                    Glide.with(MainActivity.this).load(photoUrl).into(imageView);


            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
                Toast.makeText(MainActivity.this,databaseError.getMessage(),Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.nedir:
                Intent ıntent1=new Intent(getApplicationContext(), Covid19_Nedir.class);
                startActivity(ıntent1);
                onBackPressed();
                break;
            case R.id.nasil:
                Intent ıntent2=new Intent(getApplicationContext(), Korunma_Activity.class);
                startActivity(ıntent2);
                onBackPressed();
                break;
            case R.id.tablo:
                Intent ıntent3=new Intent(getApplicationContext(), tablo.class);
                startActivity(ıntent3);
                onBackPressed();
                break;
            case R.id.tedavi:
                Intent ıntent4=new Intent(getApplicationContext(), korona_tedavi.class);
                startActivity(ıntent4);
                onBackPressed();
                break;
            /*case R.id.sehirler:
                Intent ıntent5=new Intent(getApplicationContext(), Covid19_Nedir.class);
                startActivity(ıntent5);
                onBackPressed();
                break;/**/
        }
        return true;
    }

    @Override
    public void onBackPressed() {
        if(drawer.isDrawerOpen(GravityCompat.START)){
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }

    }
}
 /* ln1=findViewById(R.id.lineer1);
        ln2=findViewById(R.id.lineer2);
        ln3=findViewById(R.id.lineer3);
        ln4=findViewById(R.id.lineer4);
        ln5=findViewById(R.id.lineer5);

        ln1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ıntent= new Intent(getApplicationContext(), Covid19_Nedir.class);
                startActivity(ıntent);

            }
        });

        ln2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ıntent= new Intent(getApplicationContext(), Korunma_Activity.class);
                startActivity(ıntent);

            }
        });

        ln4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ıntent= new Intent(getApplicationContext(), tablo.class);
                startActivity(ıntent);
            }
        });

        ln5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(getApplicationContext(),ulkeler_activity.class);
                startActivity(intent);
            }
        });

        ln3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(getApplicationContext(),korona_tedavi.class);
                startActivity(intent);
            }
        });*/

