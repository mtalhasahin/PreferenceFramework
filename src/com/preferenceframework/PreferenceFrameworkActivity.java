package com.preferenceframework;

import java.util.List;

import android.os.Bundle;
import android.preference.PreferenceActivity;
import android.preference.PreferenceActivity.Header;
import android.preference.PreferenceFragment;

public class PreferenceFrameworkActivity extends PreferenceActivity {
   
    
	@Override
	public void onBuildHeaders(List<Header> target) {
		// TODO Auto-generated method stub
		super.onBuildHeaders(target);
		loadHeadersFromResource(R.xml.preferences, target);
	}

	
}
