package com.example.baseproject.viewModel;

import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.databinding.BindingAdapter;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.baseproject.builder.CarDirector;
import com.example.baseproject.model.Car;


public class MyViewModel extends ViewModel {
    private Car car;

    private final MutableLiveData<Car> carLiveData = new MutableLiveData<>();

    public MyViewModel(Context context, Car car) {
        this.car = car;
    }

    @BindingAdapter("bindType:text")
    public static void setTypeCar(TextView textView, String type) {
        if (type == null) {
            textView.setText(null);
        } else {
            textView.setText("TYPE: " + type);
        }
    }

    @BindingAdapter("bindSeat:text")
    public static void setSeat(TextView textView, int seat) {
        if (seat == 0) {
            textView.setText(0);
        } else {
            textView.setText(String.valueOf(seat));
        }
    }

    @BindingAdapter("bindPower:text")
    public static void setPower(TextView textView, int power) {
        if (power == 0) {
            textView.setText(0);
        } else {
            textView.setText(String.valueOf(power));
        }
    }

    @BindingAdapter("bindFuel:text")
    public static void setFuel(TextView textView, int fuel) {
        if (fuel == 0) {
            textView.setText(0);
        } else {
            textView.setText(String.valueOf(fuel));
        }
    }

    @BindingAdapter("bindBrand:text")
    public static void setBrand(TextView textView, String brand) {
        if (brand == null) {
            textView.setText(null);
        } else {
            textView.setText(brand);
        }
    }

    public void solutionEventClick(Car car) {
        carLiveData.setValue(car);
    }

    public LiveData<Car> getCarLiveData() {
        return carLiveData;
    }

}



