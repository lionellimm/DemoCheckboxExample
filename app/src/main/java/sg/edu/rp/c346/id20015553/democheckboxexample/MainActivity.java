package sg.edu.rp.c346.id20015553.democheckboxexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Button;
import android.widget.Toast;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    CheckBox checkBoxDiscount;
    Button btnCheck;
    TextView textDisplay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        checkBoxDiscount = findViewById(R.id.checkBoxDiscount);
        btnCheck = findViewById(R.id.btnCheck);
        textDisplay = findViewById(R.id.textDisplay);

        btnCheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("MyActivity", "Inside onClick()");
                if(checkBoxDiscount.isChecked() == true){
                    textDisplay.setText("The discount is given.");
                }
                else{
                    textDisplay.setText("The discount is not given.");
                }
                Toast a = Toast.makeText(getApplicationContext(), "Check", Toast.LENGTH_LONG);
                a.show();
            }
        });
    }
}