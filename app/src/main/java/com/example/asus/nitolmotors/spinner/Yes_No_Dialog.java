package com.example.asus.nitolmotors.spinner;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;

import com.example.asus.nitolmotors.AssessmentActivity;
import com.example.asus.nitolmotors.R;


public class Yes_No_Dialog extends android.app.DialogFragment {


    int trackId;


    public Yes_No_Dialog() {
        // Required empty public constructor
    }

    public static Yes_No_Dialog newInstance(int id) {
        Yes_No_Dialog fragment = new Yes_No_Dialog();
        fragment.trackId = id;
        return fragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        getDialog().getWindow().requestFeature(Window.FEATURE_NO_TITLE);
        View view = inflater.inflate(R.layout.fragment_yes_no, container, false);
        TextView textViewYes = (TextView) view.findViewById(R.id.tv_yes);
        TextView textViewNo = (TextView) view.findViewById(R.id.tv_no);
        TextView textViewSix = (TextView) view.findViewById(R.id.tv_six);
        TextView textViewEight = (TextView) view.findViewById(R.id.tv_eight);
        TextView textViewTen = (TextView) view.findViewById(R.id.tv_ten);


        textViewYes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (trackId == 1) {
                    AssessmentActivity.textViewOne.setText("0");

                } else if (trackId == 2) {
                    AssessmentActivity.textViewTwo.setText("0");
                } else if (trackId == 3) {
                    AssessmentActivity.textViewThree.setText("0");
                } else if (trackId == 4) {
                    AssessmentActivity.textViewFour.setText("0");
                } else if (trackId == 5) {
                    AssessmentActivity.textViewFive.setText("0");
                } else if (trackId == 6) {
                    AssessmentActivity.textViewSix.setText("0");
                } else if (trackId == 7) {
                    AssessmentActivity.textViewSeven.setText("0");
                } else if (trackId == 8) {
                    AssessmentActivity.textViewEight.setText("0");
                } else if (trackId == 9) {
                    AssessmentActivity.textViewNine.setText("0");
                } else if (trackId == 10) {
                    AssessmentActivity.textViewTen.setText("0");
                }

                dismiss();

            }
        });
        textViewNo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (trackId == 1) {
                    AssessmentActivity.textViewOne.setText("2");

                } else if (trackId == 2) {
                    AssessmentActivity.textViewTwo.setText("2");
                } else if (trackId == 3) {
                    AssessmentActivity.textViewThree.setText("2");
                } else if (trackId == 4) {
                    AssessmentActivity.textViewFour.setText("2");
                } else if (trackId == 5) {
                    AssessmentActivity.textViewFive.setText("2");
                } else if (trackId == 6) {
                    AssessmentActivity.textViewSix.setText("2");
                } else if (trackId == 7) {
                    AssessmentActivity.textViewSeven.setText("2");
                } else if (trackId == 8) {
                    AssessmentActivity.textViewEight.setText("2");
                } else if (trackId == 9) {
                    AssessmentActivity.textViewNine.setText("2");
                } else if (trackId == 10) {
                    AssessmentActivity.textViewTen.setText("2");
                }
                dismiss();
            }
        });

        textViewSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if (trackId == 1) {
                    AssessmentActivity.textViewOne.setText("6");

                } else if (trackId == 2) {
                    AssessmentActivity.textViewTwo.setText("6");
                } else if (trackId == 3) {
                    AssessmentActivity.textViewThree.setText("6");
                } else if (trackId == 4) {
                    AssessmentActivity.textViewFour.setText("6");
                } else if (trackId == 5) {
                    AssessmentActivity.textViewFive.setText("6");
                } else if (trackId == 6) {
                    AssessmentActivity.textViewSix.setText("6");
                } else if (trackId == 7) {
                    AssessmentActivity.textViewSeven.setText("6");
                } else if (trackId == 8) {
                    AssessmentActivity.textViewEight.setText("6");
                } else if (trackId == 9) {
                    AssessmentActivity.textViewNine.setText("6");
                } else if (trackId == 10) {
                    AssessmentActivity.textViewTen.setText("6");
                }
                dismiss();

            }
        });
        textViewEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (trackId == 1) {
                    AssessmentActivity.textViewOne.setText("8");

                } else if (trackId == 2) {
                    AssessmentActivity.textViewTwo.setText("8");
                } else if (trackId == 3) {
                    AssessmentActivity.textViewThree.setText("8");
                } else if (trackId == 4) {
                    AssessmentActivity.textViewFour.setText("8");
                } else if (trackId == 5) {
                    AssessmentActivity.textViewFive.setText("8");
                } else if (trackId == 6) {
                    AssessmentActivity.textViewSix.setText("8");
                } else if (trackId == 7) {
                    AssessmentActivity.textViewSeven.setText("8");
                } else if (trackId == 8) {
                    AssessmentActivity.textViewEight.setText("8");
                } else if (trackId == 9) {
                    AssessmentActivity.textViewNine.setText("8");
                } else if (trackId == 10) {
                    AssessmentActivity.textViewTen.setText("8");
                }
                dismiss();

            }
        });
        textViewTen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (trackId == 1) {
                    AssessmentActivity.textViewOne.setText("10");

                } else if (trackId == 2) {
                    AssessmentActivity.textViewTwo.setText("10");
                } else if (trackId == 3) {
                    AssessmentActivity.textViewThree.setText("10");
                } else if (trackId == 4) {
                    AssessmentActivity.textViewFour.setText("10");
                } else if (trackId == 5) {
                    AssessmentActivity.textViewFive.setText("10");
                } else if (trackId == 6) {
                    AssessmentActivity.textViewSix.setText("10");
                } else if (trackId == 7) {
                    AssessmentActivity.textViewSeven.setText("10");
                } else if (trackId == 8) {
                    AssessmentActivity.textViewEight.setText("10");
                } else if (trackId == 9) {
                    AssessmentActivity.textViewNine.setText("10");
                } else if (trackId == 10) {
                    AssessmentActivity.textViewTen.setText("10");
                }
                dismiss();
            }
        });

        return view;
    }

}


