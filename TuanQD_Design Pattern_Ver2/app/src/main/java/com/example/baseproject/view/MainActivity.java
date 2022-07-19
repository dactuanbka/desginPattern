package com.example.baseproject.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.baseproject.builder.CarDirector;
import com.example.baseproject.builder.MWBuilder;
import com.example.baseproject.builder.MyStoreHouse;
import com.example.baseproject.builder.RollRoyceBuilder;
import com.example.baseproject.R;
import com.example.baseproject.databinding.ActivityMainBinding;
import com.example.baseproject.viewModel.MyViewModel;
import com.example.baseproject.model.Car;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Car car;
    ActivityMainBinding activityMainBinding;
    CarDirector carDirector;
    MWBuilder mwBuilder;
    RollRoyceBuilder mRollRoyceBuilder;
    MyViewModel myViewModel;
    MyStoreHouse myStoreHouse;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityMainBinding = DataBindingUtil.setContentView(this,
                R.layout.activity_main);
        carDirector = new CarDirector();
        mwBuilder = new MWBuilder();
        mRollRoyceBuilder = new RollRoyceBuilder();

        car = carDirector.createMWSport(mwBuilder);
        activityMainBinding.setModel(car);
        activityMainBinding.executePendingBindings();
        activityMainBinding.btnMWSport.setOnClickListener(this);
        activityMainBinding.btnMWBusiness.setOnClickListener(this);
        activityMainBinding.btnRRSport.setOnClickListener(this);
        activityMainBinding.btnRRBusiness.setOnClickListener(this);
        activityMainBinding.btnMyStoreHouse.setOnClickListener(this);
        myStoreHouse = MyStoreHouse.getInstance();
        myStoreHouse.setCar(car);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case (R.id.btnMWSport):
                car = carDirector.createMWSport(mwBuilder);
                myViewModel = new MyViewModel(this, car);
                myViewModel.getCarLiveData().setValue(car);
                setDataChange();
                break;
            case (R.id.btnMWBusiness):
                car = carDirector.createMWBusiness(mwBuilder);
                myViewModel = new MyViewModel(this, car);
                myViewModel.getCarLiveData().setValue(car);
                setDataChange();
                break;
            case (R.id.btnRRSport):
                car = carDirector.createRollRoyceSport(mRollRoyceBuilder);
                myViewModel = new MyViewModel(this, car);
                myViewModel.getCarLiveData().setValue(car);
                setDataChange();
                break;
            case (R.id.btnRRBusiness):
                car = carDirector.createRollRoyceBusiness(mRollRoyceBuilder);
                myViewModel = new MyViewModel(this, car);
                myViewModel.getCarLiveData().setValue(car);
                setDataChange();
                break;
            case (R.id.btnMyStoreHouse):
                Intent intent = new Intent(this, MyStoreActivity.class);
                startActivity(intent);
        }
    }

    private void setDataChange() {
        myViewModel.getCarLiveData().observe(this, new Observer<Car>() {
            @Override
            public void onChanged(Car car) {
                activityMainBinding.setModel(car);
                activityMainBinding.executePendingBindings();
                myStoreHouse.setCar(car);
            }
        });
    }
}