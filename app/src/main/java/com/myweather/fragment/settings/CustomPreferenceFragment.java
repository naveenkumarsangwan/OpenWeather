package com.myweather.fragment.settings;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.preference.PreferenceFragmentCompat;
import androidx.recyclerview.widget.RecyclerView;

import com.myweather.R;


public class CustomPreferenceFragment extends PreferenceFragmentCompat {

	@Override
	public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
		View root = super.onCreateView(inflater, container, savedInstanceState);
		RecyclerView recyclerView = new RecyclerView(root.getContext());
		RecyclerView.LayoutParams params = new
				RecyclerView.LayoutParams(
				RecyclerView.LayoutParams.MATCH_PARENT,
				RecyclerView.LayoutParams.WRAP_CONTENT
		);
		recyclerView.setLayoutParams(params);
		//RecyclerView recyclerView = root.findViewById(R.id.recycler_view);

		recyclerView.setPadding(0, 0, 0, getResources().getDimensionPixelSize(R.dimen.recycler_view_bottom_padding));
		recyclerView.setClipToPadding(false);

		return root;
	}

	@Override
	public void onCreatePreferences(Bundle savedInstanceState, String rootKey) {
		addPreferencesFromResource(R.xml.settings_preferences);
	}
}
