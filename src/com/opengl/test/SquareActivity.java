package com.opengl.test;

import com.opengl.renderer.SquareGLRenderer;

import android.app.Activity;
import android.opengl.GLSurfaceView;
import android.os.Bundle;
import android.util.Log;

public class SquareActivity extends Activity {
	private static final String TAG = SquareActivity.class.getSimpleName();

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub

		super.onCreate(savedInstanceState);
		Log.i(TAG, "onCreate");
		GLSurfaceView sv = new GLSurfaceView(this);
		sv.setRenderer(new SquareGLRenderer());
		setContentView(sv);
	}

}
