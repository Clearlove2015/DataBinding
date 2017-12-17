package com.zc.databinding;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.zc.databinding.bean.MainBean;
import com.zc.databinding.databinding.ActivityMainBinding;
import com.zc.databinding.viewmodel.MainViewModel;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        ActivityMainBinding binding = DataBindingUtil.setContentView(this,R.layout.activity_main);
        MainBean bean = new MainBean("test_name");
        binding.setBean(bean);
        binding.setViewModule(new MainViewModel(this));
    }
}
