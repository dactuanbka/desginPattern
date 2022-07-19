package com.example.baseproject.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.example.baseproject.R;
import com.example.baseproject.builder.MyStoreHouse;
import com.example.baseproject.databinding.ActivityMyStoreBinding;

public class MyStoreActivity extends AppCompatActivity {
    MyStoreHouse myStoreHouse;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMyStoreBinding activityMyStoreBinding = DataBindingUtil.setContentView(this,
                R.layout.activity_my_store);
        myStoreHouse = MyStoreHouse.getInstance();
        activityMyStoreBinding.txtName.setText(
                "BRAND: " + myStoreHouse.getCar().getBrand() +
                        "\nTYPE: " + myStoreHouse.getCar().getTypeCar()
                        + "\nSEAT: " + myStoreHouse.getCar().getSeat() +
                        "\nPOWER :" + myStoreHouse.getCar().getPower()
                        + "\nFUEL: " + myStoreHouse.getCar().getFuel());

    }
}