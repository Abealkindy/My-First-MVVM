package com.rosinante24.mvvmabraham;

import android.content.Context;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;

import java.util.ArrayList;
import java.util.List;

import id.gits.mvvmcore.viewmodel.GitsVM;

/**
 * Created by Rosinante24 on 9/25/17.
 */

public class MainActivityVM extends GitsVM{
    private final List<DummyDao> mList = new ArrayList<>();
    public DummyAdapter bAdapter;
    public LinearLayoutManager bLayoutManager;

    public MainActivityVM(Context context) {
        super(context);

        //create dummy data
        mList.add(new DummyDao("Hello!"));
        mList.add(new DummyDao("Ya Halo!"));
        mList.add(new DummyDao("Hai!"));
        mList.add(new DummyDao("Hahai!"));
        mList.add(new DummyDao("Yeay!"));
        mList.add(new DummyDao("Yayayay!"));

        bAdapter = new DummyAdapter(mList);
        bLayoutManager = new LinearLayoutManager(context);
    }
}
