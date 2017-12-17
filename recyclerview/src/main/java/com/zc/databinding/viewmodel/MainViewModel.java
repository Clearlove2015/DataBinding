package com.zc.databinding.viewmodel;

import android.content.Context;
import android.databinding.ObservableArrayList;
import android.databinding.ObservableList;

import com.zc.databinding.BR;
import com.zc.databinding.R;

import me.tatarka.bindingcollectionadapter.ItemView;

/**
 * Created by zc on 2017/12/12.
 */

public class MainViewModel {
    public ObservableList<MainItemViewModel> itemViewModels = new ObservableArrayList<>();
    public ItemView itemView = ItemView.of(BR.item, R.layout.item);
    private Context context;

    public MainViewModel(Context context) {
        this.context = context;
        for (int i = 0; i < 50; i++) {
            itemViewModels.add(new MainItemViewModel(this.context, "item" + i));
        }
    }
}
