package com.example.next.databindexample;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.example.next.databindexample.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    public static final String TAG =MainActivity.class.getSimpleName();

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        User user = new User();
        user.setName("Learn2Crack");
        binding.setUser(user);
        binding.setActivity(this);
    }

    public void onButtonClick(String email){

//email is getting by using below method
        Log.d(TAG, "Email :" +binding.getUser().getEmail());
        Log.d(TAG, "Email : "+email);
        Toast.makeText(this,email, Toast.LENGTH_SHORT).show();
    }
}

