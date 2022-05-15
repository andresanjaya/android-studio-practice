package id.kotlin.startactivityforresult;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class secondActivity extends AppCompatActivity {
EditText ed1;
Button bt2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        ed1=findViewById(R.id.ed1);
        bt2=findViewById(R.id.bt2);

        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String msg=ed1.getText().toString();
                Intent i= new Intent();
                i.putExtra("MSG",msg);
                setResult(5,i);
                finish();

            }
        });
    }
}