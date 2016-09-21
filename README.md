# react-native-google-api-availability

This is a wrapper for the functionality in GoogleApiAvailability, useful for checking if the Google Play Services you depend on are available for use in your React Native app. Since these APIs don't exist on iOS (where you bundle the Play Services in with your app), this module only works on Android.

## RemoteConfig Usage:

    import { RemoteConfig } from 'react-native-firebase3';

    RemoteConfig.setDefaults({
       blog: 'url',
    });

    #ES7 async syntax...but you can pass promises if you prefer instead.
    async function someFunction() {
        console.log('Blog URL is: ', await RemoteConfig.getString('blog'));
    }
    someFunction();

## Android Installation

Install and link the npm
    npm install react-native-google-api-availability
    react-native link react-native-google-api-availability

