package com.sociabuzz.BotomNavigation;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by sociabuzz-mobdev on 09/09/2016.
 */
public class SampleFragment extends Fragment {
    private static final String STARTING_TEXT = "Four Buttons Bottom Navigation";

    public SampleFragment() {

    }

    public static SampleFragment newInstance(String text){
        Bundle args = new Bundle();
        args.putString(STARTING_TEXT, text);

        SampleFragment sampleFragment = new SampleFragment();
        sampleFragment.setArguments(args);

        return sampleFragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        TextView textView = new TextView(getActivity());
        textView.setText(getArguments().getString(STARTING_TEXT));

        return textView;
    }
}
