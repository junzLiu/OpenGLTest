package com.opengl.test;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

import javax.microedition.khronos.opengles.GL10;

import com.opengl.renderer.SimpleRenderer;
import com.opengl.renderer.SimpleRenderer.SimpleDraw;

import android.app.Activity;
import android.opengl.GLSurfaceView;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

public class PointLineActivity extends Activity implements SimpleDraw,
		OnClickListener {

	private GLSurfaceView sv = null;
	private int changeId = 0;
	private int displayState = GL10.GL_VERTEX_ARRAY;
	private float[] vertexes = new float[] { -0.8f, -0.4f * 1.732f, 0.0f, 0.8f,
			-0.4f * 1.732f, 0.0f, 0.0f, 0.4f * 1.732f, 0.0f, };

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);

		sv = new GLSurfaceView(this);
		SimpleRenderer render = new SimpleRenderer(this);
//		render.setiDraw(this);
		sv.setRenderer(render);
		setContentView(sv);
	}

	@Override
	protected void onResume() {
		// TODO Auto-generated method stub
		super.onResume();
		sv.onResume();
	}

	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		sv.onPause();
	}

	@Override
	public void draw(GL10 gl) {
		// TODO Auto-generated method stub
		gl.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);	
		// Clears the screen and depth buffer.
		gl.glClear(GL10.GL_COLOR_BUFFER_BIT | GL10.GL_DEPTH_BUFFER_BIT);
		
		ByteBuffer vbb = ByteBuffer.allocateDirect(vertexes.length * 4);
		vbb.order(ByteOrder.nativeOrder());
		FloatBuffer vertrex = vbb.asFloatBuffer();
		vertrex.put(vertexes);
		vertrex.position(0);

		gl.glColor4f(1.0f, 0.0f, 0.0f, 1.0f);
		gl.glPointSize(8f);
		gl.glLoadIdentity();
		gl.glTranslatef(0, 0, -4f);
		
		gl.glEnableClientState(GL10.GL_VERTEX_ARRAY);
		
		gl.glVertexPointer(3, GL10.GL_FLOAT, 0, vertrex);
		gl.glDrawArrays(GL10.GL_POINTS, 0, 3);
//		gl.glDrawArrays(GL10.GL_LINES, 0, 3);
		gl.glDisableClientState(GL10.GL_VERTEX_ARRAY);
		
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch (changeId % 4) {
		case 0:
			break;
		case 1:
			break;
		case 2:
			break;
		case 3:
			break;
		}
		changeId++;
	}

}
