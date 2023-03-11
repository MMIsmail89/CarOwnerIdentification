package com.example.caridentification;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.caridentification.databinding.FragmentCarListBinding;

import org.jetbrains.annotations.Nullable;


public class CarListFrag extends Fragment {

    private FragmentCarListBinding binding;
    private RecyclerView recyclerView;

    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;
    private View view;

    public CarListFrag() {
        // Required empty public constructor
    }
    //
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        view = inflater.inflate(R.layout.fragment_car_list, container, false);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        //
        recyclerView = view.findViewById(R.id.FragList_rv_MotorList);
        adapter = new MotorAdapter(this.getActivity(), ApplicationClass.theListMotors);
        recyclerView.setAdapter(adapter);

        recyclerView.setHasFixedSize(true);

        layoutManager = new LinearLayoutManager(this.getActivity());
        recyclerView.setLayoutManager(layoutManager);

    }
    public void notifyDataChanged(){
        adapter.notifyDataSetChanged();
    }


}