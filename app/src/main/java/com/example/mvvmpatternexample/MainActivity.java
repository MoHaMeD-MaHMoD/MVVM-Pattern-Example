package com.example.mvvmpatternexample;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.mvvmpatternexample.ui.MovieViewModel;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @BindView(R.id.Data_textView)
    TextView DataTextView;
    @BindView(R.id.show_button)
    Button showButton;
    MovieViewModel movieViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        showButton.setOnClickListener(this);

        movieViewModel = ViewModelProviders.of(this).get(MovieViewModel.class);
        movieViewModel.MoviewMutableLiveData.observe(this, new Observer<String>() {
            @Override
            public void onChanged(String s) {
                DataTextView.setText(s);
            }
        });
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.show_button)
            movieViewModel.getMovieName();
    }
}
