package com.example.barbershop.activity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;


import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import es.dmoral.toasty.Toasty;

public class BaseActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    public void startNewActivity(Class target){
        Intent intent = new Intent(this,target);
        startActivity(intent);
    }

    public void showMessage(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }

    public void showMessegeSuccess(String message1) {
        Toasty.success(this, message1, Toast.LENGTH_SHORT).show();
    }

    public void showMessegeWarning(String message2) {
        Toasty.warning(this, message2, Toast.LENGTH_SHORT).show();
    }

    public void showMessegeError(String message3) {
        Toasty.error(this, message3, Toast.LENGTH_SHORT).show();
    }
}
