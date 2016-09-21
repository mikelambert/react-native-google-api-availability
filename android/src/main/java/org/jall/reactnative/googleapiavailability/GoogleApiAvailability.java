package org.jall.reactnative.firebase;

import android.app.Activity;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;

import javax.annotation.Nullable;

public class GoogleApiAvailability extends ReactContextBaseJavaModule {
    public GoogleApiAvailability(ReactApplicationContext reactContext) {
        super(reactContext);
    }

    @Override
    public String getName() {
        return "GoogleApiAvailability";
    }

    @ReactMethod
    public void isGooglePlayServicesAvailable() {
        GoogleApiAvailability apiAvailability = GoogleApiAvailability.getInstance();
        int resultCode = apiAvailability.isGooglePlayServicesAvailable(this);
        return (resultCode == ConnectionResult.SUCCESS);
    }
}
