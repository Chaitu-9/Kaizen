package com.example.andrei.customlauncherdemo;

import android.app.IntentService;
import android.content.Intent;

import org.json.JSONArray;
import org.json.JSONObject;

public class SaveAppsLog extends IntentService {

    private JSONArray allAppsUsage;
    private JSONObject appUsage;
    private String appJson;

    public SaveAppsLog(String name) {
        super(name);
        allAppsUsage = new JSONArray();
        appUsage = new JSONObject();
    }


    @Override
    protected void onHandleIntent(Intent intent) {

    }
}
