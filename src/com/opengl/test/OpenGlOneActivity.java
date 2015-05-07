package com.opengl.test;

import com.opengl.renderer.OpenGLRenderer;

import android.app.Activity;
import android.opengl.GLSurfaceView;
import android.os.Bundle;

public class OpenGlOneActivity extends Activity {
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		GLSurfaceView glView = new GLSurfaceView(this);
		glView.setRenderer(new OpenGLRenderer());
		setContentView(glView);
	}
	
}
