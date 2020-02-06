package com.example.viewmodelandlivedatatest;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

/**
 * ViewModel的生命周期长(比Activity的生命周期长)：通过ViewModel保存数据(例如：横竖屏切换Activity重新创建通知观察者数据变化重新赋值)
 */

public class NameViewModel extends ViewModel {

    // Create a LiveData with a String
    private MutableLiveData<String> currentName;

    public MutableLiveData<String> getCurrentName() {//return LiveData
        if (currentName == null) {
            currentName = new MutableLiveData<String>();
        }
        return currentName;
    }

    // Rest of the ViewModel...

}
