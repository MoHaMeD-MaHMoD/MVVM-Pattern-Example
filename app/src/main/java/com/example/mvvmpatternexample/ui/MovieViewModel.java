package com.example.mvvmpatternexample.ui;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.mvvmpatternexample.pojo.DataModel;

public class MovieViewModel extends ViewModel {
    public MutableLiveData<String> MoviewMutableLiveData = new MutableLiveData<>();

    public void getMovieName() {
        String x = getDataFromDataBAse().getName();
        MoviewMutableLiveData.setValue(x);

    }


    private DataModel getDataFromDataBAse() {
        return new DataModel("Dark Shadows", "9-1-2012");
    }
}
