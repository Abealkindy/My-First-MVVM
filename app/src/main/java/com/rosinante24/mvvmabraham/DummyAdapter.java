package com.rosinante24.mvvmabraham;

import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.rosinante24.mvvmabraham.databinding.DummyRowBinding;

import java.util.List;

import id.gits.mvvmcore.adapter.GitsAdapter;

/**
 * Created by Rosinante24 on 9/25/17.
 */
public class DummyAdapter extends GitsAdapter<DummyDao, DummyRowVM, DummyRowBinding> {
    public DummyAdapter(List<DummyDao> collection) {
        super(collection);
    }

    @Override
    public DummyRowVM createViewModel(AppCompatActivity activity, DummyRowBinding binding, DummyDao item, int position) {
        return new DummyRowVM(activity, binding, item);
    }


    @Override
    public int getLayoutRes() {
        return R.layout.dummy_row;
    }

    @Override
    public void render(DummyRowBinding binding, DummyRowVM viewModel, DummyDao item) {
        binding.setVm(viewModel);
    }

    @Override
    public void onRowClick(DummyDao data, int position) {
        Toast.makeText(mContext, "Hello " + mCollection.get(position), Toast.LENGTH_SHORT).show();
    }
}
