package com.solvo.newdllib.dynamicload;


import android.app.Service;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.IBinder;

import com.solvo.newdllib.dynamicload.internal.DLPluginPackage;


public interface DLServicePlugin {

     void onCreate();

     void onStart(Intent intent, int startId);
    
     int onStartCommand(Intent intent, int flags, int startId);
    
     void onDestroy();
    
     void onConfigurationChanged(Configuration newConfig);
    
     void onLowMemory();
    
     void onTrimMemory(int level);
    
     IBinder onBind(Intent intent);
    
     boolean onUnbind(Intent intent);
    
     void onRebind(Intent intent);
    
     void onTaskRemoved(Intent rootIntent);
    
     void attach(Service proxyService, DLPluginPackage pluginPackage);
}
