package com.example.asus.nitolmotors;

import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.asus.nitolmotors.spinner.Yes_No_Dialog;

public class AssessmentActivity extends AppCompatActivity {

    public static TextView textViewOne;
    public static TextView textViewTwo;
    public static TextView textViewThree;
    public static TextView textViewFour;
    public static TextView textViewFive;
    public static TextView textViewSix;
    public static TextView textViewSeven;
    public static TextView textViewEight;
    public static TextView textViewNine;
    public static TextView textViewTen;


    RelativeLayout spinnerOne;
    RelativeLayout spinnerTwo;
    RelativeLayout spinnerThree;
    RelativeLayout spinnerFour;
    RelativeLayout spinnerFive;
    RelativeLayout spinnerSix;
    RelativeLayout spinnerSeven;
    RelativeLayout spinnerEight;
    RelativeLayout spinnerNine;
    RelativeLayout spinnerTen;
    private String clientName;
    private String branchName;
    private String eoid;
    private String modelName;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_assessment);
        TextView tv_branchName = (TextView) findViewById(R.id.branchName);
        TextView tv_clientName=(TextView)findViewById(R.id.clientName);
        TextView tv_model=(TextView)findViewById(R.id.model);


        clientName = getIntent().getStringExtra("clientName");  // intentAssessment.putExtra("clientName", clientName);
        branchName = getIntent().getStringExtra("branchName");//  intentAssessment.putExtra("branchName", branchName);
        eoid = getIntent().getStringExtra("eoid"); //intentAssessment.putExtra("eoid", eoid);
        modelName = getIntent().getStringExtra("model"); //intentAssessment.putExtra("model", textViewModels.getText().toString());

        tv_branchName.setText("Branch: " + branchName);
        tv_clientName.setText("Client: "+ clientName);
        tv_model.setText("Veh. Model: "+ modelName);



        spinnerOne = (RelativeLayout) findViewById(R.id.spinner_first);

        spinnerTwo = (RelativeLayout) findViewById(R.id.spinner_second);
        spinnerThree = (RelativeLayout) findViewById(R.id.spinner_third);
        spinnerFour = (RelativeLayout) findViewById(R.id.spinner_four);
        spinnerFive = (RelativeLayout) findViewById(R.id.spinner_five);
        spinnerSix = (RelativeLayout) findViewById(R.id.spinner_six);
        spinnerSeven = (RelativeLayout) findViewById(R.id.spinner_seven);
        spinnerEight = (RelativeLayout) findViewById(R.id.spinner_eight);
        spinnerNine = (RelativeLayout) findViewById(R.id.spinner_nine);
        spinnerTen = (RelativeLayout) findViewById(R.id.spinner_ten);

        textViewOne = (TextView) findViewById(R.id.text_first);
        textViewTwo = (TextView) findViewById(R.id.text_second);
        textViewThree = (TextView) findViewById(R.id.text_third);
        textViewFour = (TextView) findViewById(R.id.text_four);
        textViewFive = (TextView) findViewById(R.id.text_five);
        textViewSix = (TextView) findViewById(R.id.text_six);
        textViewSeven = (TextView) findViewById(R.id.text_seven);
        textViewEight = (TextView) findViewById(R.id.text_eight);
        textViewNine = (TextView) findViewById(R.id.text_nine);
        textViewTen = (TextView) findViewById(R.id.text_ten);


        TextView textViewLogIn = (TextView) findViewById(R.id.textView_report);
        textViewLogIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int sum = Integer.parseInt(textViewOne.getText().toString()) +
                        Integer.parseInt(textViewTwo.getText().toString()) +
                        Integer.parseInt(textViewThree.getText().toString()) +
                        Integer.parseInt(textViewFour.getText().toString()) +
                        Integer.parseInt(textViewFive.getText().toString()) +
                        Integer.parseInt(textViewSix.getText().toString()) +
                        Integer.parseInt(textViewSeven.getText().toString()) +
                        Integer.parseInt(textViewEight.getText().toString()) +
                        Integer.parseInt(textViewNine.getText().toString()) +
                        Integer.parseInt(textViewTen.getText().toString());


                //  Toast.makeText(view.getContext(), String.valueOf(sum), Toast.LENGTH_LONG).show();

                Intent intentReport = new Intent(getApplicationContext(), ReportActivity.class);
                intentReport.putExtra("clientName", clientName);
                intentReport.putExtra("branchName", branchName);
                intentReport.putExtra("eoid", eoid);
                intentReport.putExtra("model",modelName);


                intentReport.putExtra("totalMark", sum);
                startActivity(intentReport);
            }
        });

        spinnerOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction ft = getFragmentManager().beginTransaction();
                Yes_No_Dialog fm = Yes_No_Dialog.newInstance(1);
                fm.show(ft, "Yes_No");
            }
        });
        spinnerTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction ft = getFragmentManager().beginTransaction();
                Yes_No_Dialog fm = Yes_No_Dialog.newInstance(2);
                fm.show(ft, "Yes_No");
            }
        });
        spinnerThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction ft = getFragmentManager().beginTransaction();
                Yes_No_Dialog fm = Yes_No_Dialog.newInstance(3);
                fm.show(ft, "Yes_No");
            }
        });
        spinnerFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction ft = getFragmentManager().beginTransaction();
                Yes_No_Dialog fm = Yes_No_Dialog.newInstance(4);
                fm.show(ft, "Yes_No");
            }
        });
        spinnerFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction ft = getFragmentManager().beginTransaction();
                Yes_No_Dialog fm = Yes_No_Dialog.newInstance(5);
                fm.show(ft, "Yes_No");
            }
        });
        spinnerSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction ft = getFragmentManager().beginTransaction();
                Yes_No_Dialog fm = Yes_No_Dialog.newInstance(6);
                fm.show(ft, "Yes_No");
            }
        });


        spinnerSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction ft = getFragmentManager().beginTransaction();
                Yes_No_Dialog fm = Yes_No_Dialog.newInstance(7);
                fm.show(ft, "Yes_No");
            }
        });

        spinnerEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction ft = getFragmentManager().beginTransaction();
                Yes_No_Dialog fm = Yes_No_Dialog.newInstance(8);
                fm.show(ft, "Yes_No");
            }
        });

        spinnerNine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction ft = getFragmentManager().beginTransaction();
                Yes_No_Dialog fm = Yes_No_Dialog.newInstance(9);
                fm.show(ft, "Yes_No");
            }
        });

        spinnerTen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction ft = getFragmentManager().beginTransaction();
                Yes_No_Dialog fm = Yes_No_Dialog.newInstance(10);
                fm.show(ft, "Yes_No");
            }
        });


    }
}
