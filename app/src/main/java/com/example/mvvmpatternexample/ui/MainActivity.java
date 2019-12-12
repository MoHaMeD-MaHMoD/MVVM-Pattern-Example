package com.example.mvvmpatternexample.ui;

import android.graphics.Movie;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProviders;

import com.example.mvvmpatternexample.R;
import com.example.mvvmpatternexample.databinding.ActivityMainBinding;


public class MainActivity extends AppCompatActivity {


    MovieViewModel movieViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        movieViewModel = ViewModelProviders.of(this).get(MovieViewModel.class);
        binding.setViewModel(movieViewModel);
        binding.setLifecycleOwner(this);


    }


}
