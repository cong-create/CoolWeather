package com.zzc.coolweather;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;

import com.zzc.coolweather.gson.Weather;

import org.litepal.LitePalApplication;

import java.util.prefs.PreferenceChangeEvent;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SharedPreferences preferences= PreferenceManager.getDefaultSharedPreferences(this);
        if(preferences.getString("weather",null)!=null){
            Intent intent=new Intent(this, WeatherActivity.class);
            startActivity(intent);
            finish();
        }
    }
}