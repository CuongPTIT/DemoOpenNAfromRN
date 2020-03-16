package com.demoopennafromrn;

import android.graphics.Color;
import android.view.View;

import androidx.annotation.NonNull;

import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.annotations.ReactProp;

public class ViewManager extends SimpleViewManager<View> {
    private View view;
    @NonNull
    @Override
    public String getName() {
        return "ViewManager";
    }

    @NonNull
    @Override
    protected View createViewInstance(@NonNull ThemedReactContext reactContext) {
        view = new View(reactContext);
        view.setBackgroundColor(Color.GREEN);
        return view;
    }

    @ReactProp(name = "exampleProps")
    public void setExampleProps(View view, String string){

    }
}
