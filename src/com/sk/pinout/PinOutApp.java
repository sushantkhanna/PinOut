package com.sk.pinout;

import org.opencv.android.BaseLoaderCallback;
import org.opencv.android.LoaderCallbackInterface;
import org.opencv.android.OpenCVLoader;

import com.sk.pinout.utils.Constants;

import android.app.Application;
import android.content.res.Configuration;
import android.util.Log;

public class PinOutApp extends Application {

	
	
	@Override
	public void onCreate() {
		// TODO All probable Init's should go here
		OpenCVLoader.initAsync(OpenCVLoader.OPENCV_VERSION_2_4_8, this, mLoaderCallback);
		super.onCreate();
	}

	@Override
	public void onConfigurationChanged(Configuration newConfig) {
		// TODO All configuration changes should go via this function
		super.onConfigurationChanged(newConfig);
	}
	
	private BaseLoaderCallback mLoaderCallback  = new BaseLoaderCallback(this) {

		@Override
		public void onManagerConnected(int status) {
			switch(status) {
				case LoaderCallbackInterface.SUCCESS:
					Log.i(Constants.LOGTAG1,"OpenCV Manager Connected");
					break;
				case LoaderCallbackInterface.INIT_FAILED:
					Log.i(Constants.LOGTAG1,"OpenCV Manager Init Failed");
					break;
				case LoaderCallbackInterface.INSTALL_CANCELED:
					Log.i(Constants.LOGTAG1,"OpenCV Manager Install Cancelled");
					break;
				case LoaderCallbackInterface.INCOMPATIBLE_MANAGER_VERSION:
					Log.i(Constants.LOGTAG1,"OpenCV Manager Incompatible Manager Version");
					break;
				case LoaderCallbackInterface.MARKET_ERROR:
					Log.i(Constants.LOGTAG1,"OpenCV Manager Market Error");
					break;
				default:
					super.onManagerConnected(status);
					break;
			}			
		}		
		
	};

}