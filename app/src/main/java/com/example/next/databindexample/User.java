package com.example.next.databindexample;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

/**
 * Created by next on 18/3/17.
 */
public class User extends BaseObservable {



    private String name;
    private String email;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
//to change email @bind...
    @Bindable
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
        //br is auto generatd clss
        notifyPropertyChanged(com.example.next.databindexample.BR.email);
    }
}
