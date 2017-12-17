package com.zc.databinding.viewmodel;

import android.content.Context;
import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.view.View;
import android.widget.Toast;

/**
 * Created by zc on 2017/12/12.
 */

public class MainItemViewModel extends BaseObservable{
    private Context context;

    @Bindable
    private String title;

    public MainItemViewModel(Context context) {
        this.context = context;
    }

    public MainItemViewModel(Context context, String title) {
        this.context = context;
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void itemClick(View v) {
        Toast.makeText(context, title, Toast.LENGTH_SHORT).show();
    }
}
