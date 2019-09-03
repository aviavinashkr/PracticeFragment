package com.example.practicefragment.fragments;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.practicefragment.MainActivity;
import com.example.practicefragment.R;

public class ThirdFragment extends Fragment implements View.OnClickListener {

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View layoutView = View.inflate(getActivity(), R.layout.fragment_third, null);
        layoutView.findViewById(R.id.mttl).setOnClickListener(this);
        return layoutView;
    }

    @Override
    public void onClick(View view) {
        ((MainActivity)getActivity()).loadFragment(R.id.Third,new SecondFragment());
    }
}
