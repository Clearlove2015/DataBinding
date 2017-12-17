package com.zc.mvvmrecyclerview;

import android.databinding.BaseObservable;
import android.databinding.ObservableField;

/**
 * Created by zc on 2017/12/17.
 */

public class MainItemViewModel extends BaseObservable{
    public final ObservableField<MainModel> data = new ObservableField<>();//注意属性需要public

    public MainItemViewModel(MainModel mainModel) {
        this.data.set(mainModel);
    }
}
