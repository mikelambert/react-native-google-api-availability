package org.jall.reactnative.googleapiavailability;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;

public class GoogleApiAvailabilityModule extends ReactContextBaseJavaModule {
    public GoogleApiAvailabilityModule(ReactApplicationContext reactContext) {
        super(reactContext);
    }

    @Override
    public String getName() {
        return "GoogleApiAvailability";
    }

    @ReactMethod
    public void isGooglePlayServicesAvailable(Promise promise) {
        GoogleApiAvailability apiAvailability = GoogleApiAvailability.getInstance();
        int resultCode = apiAvailability.isGooglePlayServicesAvailable(getReactApplicationContext());
        promise.resolve(resultCode == ConnectionResult.SUCCESS);
    }
}
