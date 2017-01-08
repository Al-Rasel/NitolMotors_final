package com.example.asus.nitolmotors.spinner;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


import com.example.asus.nitolmotors.R;
import java.util.List;



public class ModelAdapterForCars extends RecyclerView.Adapter<ModelAdapterForCars.DataObjectHolder> {

    private List<Model_Cars> mDataset;
    private Context mContext;
    private static MyClickListener sMyclickListener;


    //  private int mCheckbanglaenglish;
    private int mDistrictId;


    public ModelAdapterForCars(List<Model_Cars> dataSet, Context applicationContext) {
        mDataset = dataSet;
        mContext = applicationContext;

    }


    @Override
    public ModelAdapterForCars.DataObjectHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.custom_layout_disricts, parent, false);

        return new DataObjectHolder(view);
    }

    @Override
    public void onBindViewHolder(ModelAdapterForCars.DataObjectHolder holder, int position) {

        final Model_Cars modelCars = mDataset.get(position);
        mDistrictId = modelCars.getDistrictId();

        String districtbangla = modelCars.getDistrictBng().replace("\r\n$", "");
        districtbangla = districtbangla.replace("\n", "");
        districtbangla = districtbangla.trim();

        holder.mTextViewDistrict.setText(districtbangla);
    }

    @Override
    public int getItemCount() {
        return mDataset.size();
    }

    public class DataObjectHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        private TextView mTextViewDistrict;
        public DataObjectHolder(View itemView) {
            super(itemView);
            mTextViewDistrict = (TextView) itemView.findViewById(R.id.districttexView);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {

            sMyclickListener.onItemClick(getAdapterPosition(),v);

        }
    }

    public void setOnItemClickListener(MyClickListener myClickListener) {
        this.sMyclickListener = myClickListener;
    }


    public interface MyClickListener {
        void onItemClick(int position, View v);
    }




}
