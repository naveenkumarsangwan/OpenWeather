package com.myweather.fragment.settings;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.myweather.R;

import java.util.logging.Logger;



public class SettingsFragment extends Fragment {

    private static final String TAG = SettingsFragment.class.getSimpleName();
    private final Logger logger = Logger.getLogger(TAG);

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        View root = inflater.inflate(R.layout.fragment_settings, container, false);

        getChildFragmentManager().beginTransaction()
                .replace(R.id.settings_container, new CustomPreferenceFragment())
                .commit();

        return root;
    }
}

