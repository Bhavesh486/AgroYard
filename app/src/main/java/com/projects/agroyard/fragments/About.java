package com.projects.agroyard.fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.projects.agroyard.R;

public class About extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_about, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        populateData(view);
    }

    private void populateData(View view) {
        TextView appName = view.findViewById(R.id.appName);
        TextView tagline = view.findViewById(R.id.tagline);
        TextView aboutDescription = view.findViewById(R.id.aboutDescription);
        TextView versionInfo = view.findViewById(R.id.versionInfo);
        TextView developerInfo = view.findViewById(R.id.developerInfo);
        TextView contactInfo = view.findViewById(R.id.contactInfo);

        // Set content dynamically from XML template
        appName.setText(getString(R.string.app_name));
        tagline.setText(getString(R.string.tagline));
        aboutDescription.setText(getString(R.string.app_description));
        versionInfo.setText(getString(R.string.version_info));
        developerInfo.setText(getString(R.string.developer_info));
        contactInfo.setText(getString(R.string.contact_info));

        // Make contact info a clickable link
        contactInfo.setMovementMethod(LinkMovementMethod.getInstance());
    }
}