package com.zc.mvvmrecyclerview.viewmodel;

import android.databinding.BaseObservable;
import android.databinding.ObservableField;

import com.zc.mvvmrecyclerview.model.MainModel;

/**
 * Created by zc on 2017/12/17.
 */

public class MainItemViewModel extends BaseObservable{
    public final ObservableField<MainModel> data = new ObservableField<>();//注意属性需要public

    public MainItemViewModel(MainModel mainModel) {
        this.data.set(mainModel);
    }
}
