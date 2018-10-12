package com.example.diceout.nak.myapplication;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;

public class CustomDialogClass extends Dialog implements android.view.View.OnClickListener {

    public Activity c;
    public Dialog d;
    public Button yesButton, noButton;

    public CustomDialogClass(Activity context) {
        super(context);

        this.c = context;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.custom_dialog);
        yesButton = findViewById(R.id.yesButton);
        yesButton.setOnClickListener(this);
        noButton = findViewById(R.id.noButton);
        noButton.setOnClickListener(this);
    }

    public void setAgreeButtonTitle(String title) {
        yesButton.setText(title.toUpperCase());
    }

    public void setDisagreeButtonTitle(String title) {
        noButton.setText(title.toUpperCase());
    }

    @Override
    public void onClick(View v) {
        dismiss();
    }
}
