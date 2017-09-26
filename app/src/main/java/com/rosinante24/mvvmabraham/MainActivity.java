package com.rosinante24.mvvmabraham;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.rosinante24.mvvmabraham.databinding.ActivityMainBinding;

import id.gits.mvvmcore.activity.GitsActivity;

public class MainActivity extends GitsActivity<MainActivityVM, ActivityMainBinding> {

    @Override
    public int getResLayout() {
        return R.layout.activity_main;
    }

    @Override
    public MainActivityVM getViewModel() {
        return new MainActivityVM(this);
    }

    @Override
    public void bindViewModel(ActivityMainBinding binding, MainActivityVM viewModel) {
        binding.setVm(viewModel);
    }

    @Override
    protected int getToolbarId() {
        return R.id.toolbar;
    }
}
