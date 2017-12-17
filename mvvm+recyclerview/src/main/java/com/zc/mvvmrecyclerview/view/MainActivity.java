package com.zc.mvvmrecyclerview.view;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.zc.mvvmrecyclerview.viewmodel.MainViewModel;
import com.zc.mvvmrecyclerview.R;
import com.zc.mvvmrecyclerview.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        MainViewModel mainViewModel = new MainViewModel(binding);
        binding.setViewModel(mainViewModel);
    }
}
