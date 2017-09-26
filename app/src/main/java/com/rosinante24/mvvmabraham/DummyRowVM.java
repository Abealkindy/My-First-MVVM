package com.rosinante24.mvvmabraham;

import android.databinding.ObservableField;
import android.support.v7.app.AppCompatActivity;

import com.rosinante24.mvvmabraham.databinding.DummyRowBinding;

import id.gits.mvvmcore.viewmodel.GitsRowVM;

/**
 * Created by Rosinante24 on 9/25/17.
 */

public class DummyRowVM extends GitsRowVM {
    public ObservableField<String> textdummy = new ObservableField<>();
    public ObservableField<String> imagedummy = new ObservableField<>();


    public DummyRowVM(AppCompatActivity activity, DummyRowBinding binding, DummyDao item) {
        super(activity, binding, item);
        textdummy.set(item.getText());
        imagedummy.set(item.getUrlImage());
    }

}
