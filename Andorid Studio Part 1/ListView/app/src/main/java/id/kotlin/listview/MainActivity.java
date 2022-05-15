package id.kotlin.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Deskripsi> deskripsis;
    ListView deskripsiLV ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        deskripsiLV = findViewById(R.id.descripsiLV);

        deskripsis = new ArrayList<>();
        deskripsis.add(new Deskripsi("Ayam Goreng", "Rp.13.000"));
        deskripsis.add(new Deskripsi("Ikan Bakar", "Rp.16.000"));
        deskripsis.add(new Deskripsi("Nasi Goreng", "Rp.10.000"));
        deskripsis.add(new Deskripsi("Tempe Penyet", "Rp.4000"));
        deskripsis.add(new Deskripsi("Ayam Bakar", "Rp.15.000"));

        DeskripsiAdapter deskripsiAdapter = new DeskripsiAdapter(this,deskripsis);

        deskripsiLV.setAdapter(deskripsiAdapter);
        deskripsiLV.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(MainActivity.this, deskripsis.get(i).getMainTitle(), Toast.LENGTH_SHORT).show();
            }
        });

    }
}