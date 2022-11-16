package edu.cs1191704.bmi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText weight, height;
    Switch maleSwitch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        weight = findViewById(R.id.weight);
        height = findViewById(R.id.heightPerson);
        maleSwitch = findViewById(R.id.switch1);
    }



    public void calcBMI(View view) {

        int weightPerson = Integer.parseInt(weight.getText().toString());
        int heightPerson = Integer.parseInt(height.getText().toString());

        int result = weightPerson / (heightPerson * heightPerson);


        if(maleSwitch.isSelected())
        {
             double ifMale =  result * 1.05;
            Toast.makeText(this, ifMale + " ", Toast.LENGTH_LONG).show();
        }
        else
        {
            Toast.makeText(this, result + " ", Toast.LENGTH_LONG).show();
        }




    }
}