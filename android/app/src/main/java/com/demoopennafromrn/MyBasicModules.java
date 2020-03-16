package com.demoopennafromrn;

import android.content.Intent;

import androidx.annotation.NonNull;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;

public class MyBasicModules extends ReactContextBaseJavaModule {
    public MyBasicModules(@NonNull ReactApplicationContext reactContext) {
        super(reactContext);
    }

    @NonNull
    @Override
    public String getName() {
        return "BasicModules";
    }

    @ReactMethod
    public void NavigatoNative(){
        Intent intent = new Intent(getReactApplicationContext(), HomeActivity.class);
        if(intent.resolveActivity(getReactApplicationContext().getPackageManager()) != null){
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            getReactApplicationContext().startActivity(intent);
        }
    }
}
