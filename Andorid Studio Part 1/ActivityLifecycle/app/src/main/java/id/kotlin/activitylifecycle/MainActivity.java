package id.kotlin.activitylifecycle;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d("activity_lifecycle", "onCreate Called");
    }
    @Override
    protected void onStart(){
        super.onStart();
        Log.d("activity_lifecycle", "onStart Called");
    }
    @Override
    protected void onResume(){
        super.onResume();
        Log.d("activity_lifecycle", "onResume Called");
    }
    @Override
    protected void onPause(){
        super.onPause();
        Log.d("activity_lifecycle", "onPause Called");
    }
    @Override
    protected void onStop(){
        super.onStop();
        Log.d("activity_lifecycle", "onStop Called");
    }
    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.d("activity_lifecycle", "onDestroy Called");
    }
}