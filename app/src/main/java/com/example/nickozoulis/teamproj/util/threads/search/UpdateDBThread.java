package com.example.nickozoulis.teamproj.util.threads.search;

import com.example.nickozoulis.teamproj.activities.MainActivity;

public class UpdateDBThread implements Runnable {
	
	private MainActivity mainActivity;
	private SearchHelper mDbHelper;

	public UpdateDBThread(MainActivity mainActivity, SearchHelper mDbHelper) {
		this.mainActivity = mainActivity;
		this.mDbHelper = mDbHelper;		
	}

	@Override
	public void run() {
		mainActivity.setmDbHelper(mDbHelper);
	}

}
