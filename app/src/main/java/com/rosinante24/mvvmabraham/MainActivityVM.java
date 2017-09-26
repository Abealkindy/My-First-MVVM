package com.rosinante24.mvvmabraham;

import android.content.Context;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.StringRequest;

import java.util.ArrayList;
import java.util.List;

import id.gits.mvvmcore.viewmodel.GitsVM;

/**
 * Created by Rosinante24 on 9/25/17.
 */

public class MainActivityVM extends GitsVM{
//    RequestQueue requestQueue;
//    StringRequest stringRequest
    private final List<DummyDao> mList = new ArrayList<>();
    public DummyAdapter bAdapter;
    public LinearLayoutManager bLayoutManager;

    public MainActivityVM(Context context) {
        super(context);



        bAdapter = new DummyAdapter(mList);
        bLayoutManager = new LinearLayoutManager(context);
    }
}
