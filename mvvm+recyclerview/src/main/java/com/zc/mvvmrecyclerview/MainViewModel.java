package com.zc.mvvmrecyclerview;

import com.zc.mvvmrecyclerview.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.List;

import me.tatarka.bindingcollectionadapter.ItemView;
import rx.Observable;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by zc on 2017/12/17.
 */

public class MainViewModel {

    public ActivityMainBinding binding;

    public List<MainModel> list = new ArrayList<>();

    public ItemView itemView = ItemView.of(BR.item, R.layout.item_rv);
    public List<MainItemViewModel> itemViewModels = new ArrayList<>();

    //构造方法
    public MainViewModel(ActivityMainBinding binding) {
        this.binding = binding;
        initData();
        updateView();
    }

    private void initData() {
        for (int i = 0; i < 20; i++) {
            MainModel mainModel = new MainModel();
            mainModel.setContent("item " + i);
            list.add(mainModel);
        }
    }

    private void updateView() {
        //使用Lambda表达式
        Observable.from(list)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(mainModel -> {
                    itemViewModels.add(new MainItemViewModel(mainModel));
                }, e -> {

                }, () -> {
                    if (binding.recyclerview.getAdapter() != null) {
                        binding.recyclerview.getAdapter().notifyDataSetChanged();
                    }
                });

//        Observable.from(list)
//                .subscribeOn(Schedulers.io())
//                .observeOn(AndroidSchedulers.mainThread())
//                .subscribe(new Subscriber<MainModel>() {
//                    @Override
//                    public void onCompleted() {
//                        if (binding.recyclerview.getAdapter() != null) {
//                            binding.recyclerview.getAdapter().notifyDataSetChanged();
//                        }
//                    }
//
//                    @Override
//                    public void onError(Throwable e) {
//
//                    }
//
//                    @Override
//                    public void onNext(MainModel mainModel) {
//                        itemViewModels.add(new MainItemViewModel(mainModel));
//                    }
//                });
    }
}
