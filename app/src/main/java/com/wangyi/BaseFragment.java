package com.wangyi;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class BaseFragment extends Fragment {

	private String text="";
	@Override
	public void onCreate(Bundle savedInstanceState) {
		Bundle args = getArguments();
		text = args != null ? args.getString("text") : "";
		super.onCreate(savedInstanceState);
	}
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		super.onCreateView(inflater, container, savedInstanceState);
		View view =inflater.inflate(R.layout.layout_1, null); 
		TextView tv_fragment = (TextView) view.findViewById(R.id.tv_fragment);
		tv_fragment.setText(text);
		return view;
	}
}
