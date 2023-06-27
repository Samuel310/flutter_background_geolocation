package com.transistorsoft.flutter.backgroundgeolocation;

import android.util.Log;

import androidx.annotation.NonNull;

import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.embedding.engine.plugins.activity.ActivityAware;
import io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding;
import io.flutter.plugin.common.MethodChannel.MethodCallHandler;
import io.flutter.plugin.common.PluginRegistry;


import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.MethodChannel.Result;

/**
 * FlutterBackgroundGeolocationPlugin
 */
public class FLTBackgroundGeolocationPlugin implements FlutterPlugin, MethodCallHandler  {

  private MethodChannel channel;

  private static final String TAG = "BG_PLUGIN";

  public FLTBackgroundGeolocationPlugin() {
    Log.d(TAG, "FLTBackgroundGeolocationPlugin: Constructor called");
  }

  @Override
  public void onAttachedToEngine(@NonNull FlutterPluginBinding flutterPluginBinding) {
    channel = new MethodChannel(flutterPluginBinding.getBinaryMessenger(), "com.transistorsoft/flutter_background_geolocation/methods");
    channel.setMethodCallHandler(this);
  }

  @Override
  public void onMethodCall(@NonNull MethodCall call, @NonNull Result result) {
    
  }

  @Override
  public void onDetachedFromEngine(@NonNull FlutterPluginBinding binding) {
    channel.setMethodCallHandler(null);
  }
}
