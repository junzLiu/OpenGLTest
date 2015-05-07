package com.opengl.test;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends Activity implements OnItemClickListener {
	private ListView mListView;
	private String[] funcStr = new String[] { "OpenGL one","square","point and line" };
    private Class[] activitys = new Class[]{OpenGlOneActivity.class,SquareActivity.class,PointLineActivity.class};
	// private static final String TEST_IMAGE_URL =
	// "http://img.taopic.com/uploads/allimg/110812/1820-110Q20K24526.jpg";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		mListView = (ListView) findViewById(R.id.list);
		mListView.setOnItemClickListener(this);
		mListView.setAdapter(new MyListAdapter(this, 0, funcStr));

	}

	@Override
	public void onItemClick(AdapterView<?> parent, View view, int position,
			long id) {
		// TODO Auto-generated method stub
		
			Intent intent = new Intent(this, activitys[position]);
			startActivity(intent);
			
		
	}

	class MyListAdapter extends ArrayAdapter<String> {

		public MyListAdapter(Context context, int resource, String[] objects) {
			super(context, resource, objects);
			// TODO Auto-generated constructor stub
		}

		@Override
		public View getView(int position, View convertView, ViewGroup parent) {
			// TODO Auto-generated method stub
			TextView tv = new TextView(MainActivity.this);
			tv.setPadding(32, 32, 32, 32);
			tv.setGravity(Gravity.CENTER);
			tv.setText(getItem(position));
			return tv;
		}

	}
}
