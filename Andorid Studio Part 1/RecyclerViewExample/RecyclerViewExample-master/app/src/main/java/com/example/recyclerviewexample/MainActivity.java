package com.example.recyclerviewexample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        MyMovieData[] myMovieData = new MyMovieData[]{
                new MyMovieData("Avengers: Endgame"," Action, Adventure, Drama",R.drawable.avenger_end_game),
                new MyMovieData("Venom"," Action, Adventure, Sci-Fi",R.drawable.venom),
                new MyMovieData("Spiderman: Far From Home"," Action, Adventure, Sci-Fi",R.drawable.spiderman),
                new MyMovieData("Thor: Ragnarok"," Action, Adventure, Comedy",R.drawable.thor_ragnarok),
                new MyMovieData("Doctor Strange"," Action, Adventure, Fantasy",R.drawable.doctor_strange2),
                new MyMovieData("Black Panther"," Action, Adventure, Sci-F",R.drawable.black_panther),
                new MyMovieData("Guardians of the Galaxy Vol. 2"," Action, Adventure, Comedy",R.drawable.guardian_of_the_galaxy),
        };

        MyMovieAdapter myMovieAdapter = new MyMovieAdapter(myMovieData,MainActivity.this);
        recyclerView.setAdapter(myMovieAdapter);

    }
}
