package com.example.yura.mydialogfragment;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view) {
        MyDialogFragment myDialogFragment = new MyDialogFragment();
        FragmentManager manager = getSupportFragmentManager();
        //myDialogFragment.show(manager, "dialog");

        FragmentTransaction transaction = manager.beginTransaction();
        myDialogFragment.show(transaction, "dialog");

    }

    public void onClick1(View view) {
        MyDialogFragment1 myDialogFragment = new MyDialogFragment1();
        FragmentManager manager = getSupportFragmentManager();
        //myDialogFragment.show(manager, "dialog");

        FragmentTransaction transaction = manager.beginTransaction();
        myDialogFragment.show(transaction, "dialog");

    }


    public void okClicked() {
        Toast.makeText(getApplicationContext(), "Вы выбрали кнопку OK!",
                Toast.LENGTH_LONG).show();
    }

    public void cancelClicked() {
        Toast.makeText(getApplicationContext(), "Вы выбрали кнопку отмены!",
                Toast.LENGTH_LONG).show();
    }


}
