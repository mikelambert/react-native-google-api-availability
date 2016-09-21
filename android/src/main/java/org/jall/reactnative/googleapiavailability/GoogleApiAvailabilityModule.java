package org.jall.reactnative.firebase;

import android.app.Activity;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;

import javax.annotation.Nullable;

public class GoogleApiAvailabilityModule extends ReactContextBaseJavaModule {
    public GoogleApiAvailabilityModule(ReactApplicationContext reactContext) {
        super(reactContext);
    }

    @Override
    public String getName() {
        return "GoogleApiAvailability";
    }

    @ReactMethod
    public void isGooglePlayServicesAvailable() {
        GoogleApiAvailability apiAvailability = GoogleApiAvailability.getInstance();
        int resultCode = apiAvailability.isGooglePlayServicesAvailable(getReactApplicationContext());
        promise.resolve(resultCode == ConnectionResult.SUCCESS);
    }
}
