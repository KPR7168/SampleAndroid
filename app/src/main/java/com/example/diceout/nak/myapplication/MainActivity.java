package com.example.diceout.nak.myapplication;

import android.renderscript.Sampler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast.makeText(getApplicationContext(), "Sample test", Toast.LENGTH_LONG).show();
    }

    public void showAlert(View v) {
        CustomDialogClass alert = new CustomDialogClass(this);
        alert.show();
        alert.setAgreeButtonTitle("This is agree button");
        alert.setDisagreeButtonTitle("This is disagree button");
    }
}
