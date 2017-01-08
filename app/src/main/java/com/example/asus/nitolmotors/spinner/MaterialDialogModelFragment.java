package com.example.asus.nitolmotors.spinner;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;

import com.example.asus.nitolmotors.PrimaryInformationActivity;
import com.example.asus.nitolmotors.R;

import java.util.ArrayList;
import java.util.List;



public class MaterialDialogModelFragment extends android.app.DialogFragment {

    private static boolean mCheckCallers = false;
    private RecyclerView mRecyclerViewDistrict;
    private ModelAdapterForCars mModelAdapterForCars;
    private List<Model_Cars> mDataSetdistricId;
    private int mDistrictId = -1;
    private int mDeliveryCharge = 0;
    private String mDistrictName = "";
    private StaticModelInformations mStaticModelInformations;




    public MaterialDialogModelFragment() {
        // Required empty public constructor
    }

    public static MaterialDialogModelFragment newInstance(boolean checkCallers) {
        MaterialDialogModelFragment fragment = new MaterialDialogModelFragment();
        mCheckCallers = checkCallers;
        return fragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_material_dailog_district, container, false);

        mStaticModelInformations = StaticModelInformations.getInstance();

        mDataSetdistricId = new ArrayList<>();
        mDataSetdistricId = mStaticModelInformations.getStaticDistricts();

        getDialog().requestWindowFeature(Window.FEATURE_NO_TITLE);
        mRecyclerViewDistrict = (RecyclerView) view.findViewById(R.id.districtSelection);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getActivity());
        mRecyclerViewDistrict.setLayoutManager(mLayoutManager);


        retrieveDistrictsInformation();

        return view;
    }


    private void retrieveDistrictsInformation() {

        if (mDataSetdistricId != null) {
            mModelAdapterForCars = new ModelAdapterForCars(mDataSetdistricId, getActivity());
            mRecyclerViewDistrict.setAdapter(mModelAdapterForCars);
            mModelAdapterForCars.setOnItemClickListener(
                    new ModelAdapterForCars.MyClickListener() {
                        @Override
                        public void onItemClick(int position, View v) {

                            mDistrictName = mDataSetdistricId.get(position).getDistrictBng();
                            mDistrictId = mDataSetdistricId.get(position).getDistrictId();



                            PrimaryInformationActivity.textViewModels.setText(mDistrictName);

                            dismiss();


                        }
                    }
            );
        }

    }


}
