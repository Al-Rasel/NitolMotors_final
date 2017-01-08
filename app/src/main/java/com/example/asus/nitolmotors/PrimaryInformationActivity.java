package com.example.asus.nitolmotors;

import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.asus.nitolmotors.spinner.MaterialDialogModelFragment;

public class PrimaryInformationActivity extends AppCompatActivity {

    public static TextView textViewModels;
    public String clientName = "not given";
    public String branchName = "not given";
    public String eoid = "not given";

    EditText eclientName;
    EditText ebranchName;
    EditText eeoid;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_primary_infromation);
        final TextView textViewLogIn = (TextView) findViewById(R.id.textView_next);
        RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.layout_models);
        eclientName = (EditText) findViewById(R.id.clientName);
        ebranchName = (EditText) findViewById(R.id.branchName);
        eeoid = (EditText) findViewById(R.id.eoid);


        textViewModels = (TextView) findViewById(R.id.text_model);


        textViewLogIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intentAssessment = new Intent(getApplicationContext(), AssessmentActivity.class);

                if (!String.valueOf(eclientName.getText().toString()).matches("")) {
                    Log.e("check", "onClick: 1");
                    clientName = eclientName.getText().toString();
                }

                if (!String.valueOf(ebranchName.getText().toString()).matches("")) {
                    Log.e("check", "onClick: 2");
                    branchName = ebranchName.getText().toString();
                }
                if (!String.valueOf(eeoid.getText().toString()).matches("")) {
                    Log.e("check", "onClick:3 ");
                    eoid = eeoid.getText().toString();
                }

                intentAssessment.putExtra("clientName", clientName);
                intentAssessment.putExtra("branchName", branchName);
                intentAssessment.putExtra("eoid", eoid);
                intentAssessment.putExtra("model", textViewModels.getText().toString());


                Log.e("viewInfo", "onClick: " + String.valueOf(clientName + " " + branchName + " " + eoid));
                startActivity(intentAssessment);
            }
        });
        relativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction ft = getFragmentManager().beginTransaction();
                MaterialDialogModelFragment fm = MaterialDialogModelFragment.newInstance(true);
                fm.show(ft, "SelectModel");
            }
        });
    }


}