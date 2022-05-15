package com.material.components;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.material.components.place.BaliSafari;
import com.material.components.place.Batur;
import com.material.components.place.SanurBeach;
import com.material.components.place.TanahLot;
import com.material.components.place.Tegallalang;
import com.material.components.place.TirtaGangga;

public class DashboardTravel extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard_travel);
        initToolbar();
    }

    private void initToolbar() {
        Tools.setSystemBarColor(this, android.R.color.white);
        Tools.setSystemBarLight(this);
    }

    public void tanah_lot(View view) {
        Intent intent = new Intent(DashboardTravel.this, TanahLot.class);
        startActivity(intent);
    }

    public void view_all(View view) {
        Intent intent = new Intent(DashboardTravel.this, SliderImg1.class);
        startActivity(intent);
    }

    public void tegallalang_pindah(View view) {
        Intent intent = new Intent(DashboardTravel.this, Tegallalang.class);
        startActivity(intent);
    }

    public void batur_pindah(View view) {
        Intent intent = new Intent(DashboardTravel.this, Batur.class);
        startActivity(intent);
    }
    public void balisafari_pindah(View view) {
        Intent intent = new Intent(DashboardTravel.this, BaliSafari.class);
        startActivity(intent);
    }

    public void sanur_pindah(View view) {
        Intent intent = new Intent(DashboardTravel.this, SanurBeach.class);
        startActivity(intent);
    }

    public void tirtagangga_pindah(View view) {
        Intent intent = new Intent(DashboardTravel.this, TirtaGangga.class);
        startActivity(intent);
    }

    public void view_all2(View view) {
        Intent intent = new Intent (DashboardTravel.this, SliderImg2.class);
        startActivity(intent);
    }
}
