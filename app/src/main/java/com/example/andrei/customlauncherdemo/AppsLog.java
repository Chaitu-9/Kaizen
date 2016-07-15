package com.example.andrei.customlauncherdemo;

import android.app.IntentService;
import android.content.Intent;
import android.content.Context;
import android.util.Log;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * An {@link IntentService} subclass for handling asynchronous task requests in
 * a service on a separate handler thread.
 * <p/>
 * TODO: Customize class - update intent actions, extra parameters and static
 * helper methods.
 */
public class AppsLog extends IntentService {
    // TODO: Rename actions, choose action names that describe tasks that this
    // IntentService can perform, e.g. ACTION_FETCH_NEW_ITEMS
    private static final String ACTION_FOO = "com.example.andrei.customlauncherdemo.action.FOO";
    private static final String ACTION_BAZ = "com.example.andrei.customlauncherdemo.action.BAZ";

    // TODO: Rename parameters
    private static final String EXTRA_PARAM1 = "com.example.andrei.customlauncherdemo.extra.PARAM1";
    private static final String EXTRA_PARAM2 = "com.example.andrei.customlauncherdemo.extra.PARAM2";

    private JSONArray allAppsUsage;
    private JSONObject appUsage;
    private String appJson;

    public AppsLog() {
        super("AppsLog");
        allAppsUsage = new JSONArray();
        appUsage = new JSONObject();
    }

    @Override
    protected void onHandleIntent(Intent intent) {
        if (intent != null) {
            String appName= intent.getStringExtra("appName");
            String appLabel= intent.getStringExtra("appLabel");
            Log.d("DATA",appLabel);
            Log.d("DATA",appName);
        }
    }
}
