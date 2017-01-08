package com.example.asus.nitolmotors;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import android.widget.Toast;



public class ReportActivity extends AppCompatActivity {

    private String clientName;
    private String branchName;
    private String eoid;
    private String modelName;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_report);
        int totalMark = getIntent().getIntExtra("totalMark", 0);
        TextView tv_branchName = (TextView) findViewById(R.id.branchName);
        TextView tv_clientName=(TextView)findViewById(R.id.clientName);
        TextView tv_model=(TextView)findViewById(R.id.model);



        /*   intentReport.putExtra("clientName", clientName);
                intentReport.putExtra("branchName", branchName);
                intentReport.putExtra("eoid", eoid);
                intentReport.putExtra("model",modelName);
*/

        clientName = getIntent().getStringExtra("clientName");  // intentAssessment.putExtra("clientName", clientName);
        branchName = getIntent().getStringExtra("branchName");//  intentAssessment.putExtra("branchName", branchName);
        eoid = getIntent().getStringExtra("eoid"); //intentAssessment.putExtra("eoid", eoid);
        modelName = getIntent().getStringExtra("model"); //intentAssessment.putExtra("model", textViewModels.getText().toString());

        tv_branchName.setText("Branch: " + branchName);
        tv_clientName.setText("Client: "+ clientName);
        tv_model.setText("Veh. Model: "+ modelName);
        Toast.makeText(this, String.valueOf(totalMark), Toast.LENGTH_LONG).show();
        TextView textViewTotalMark = (TextView) findViewById(R.id.totalMark);
        TextView textViewReport = (TextView) findViewById(R.id.textView_report);

        textViewTotalMark.setText(String.valueOf(totalMark));

        if (totalMark <= 65) {
            textViewReport.setText("The client got " + String.valueOf(totalMark) + " mark out of 100 which is identified as RED MARK. You CAN NOT proceed for further steps");

        } else if (totalMark <= 80&& totalMark>65) {
            textViewReport.setText("The client got " + String.valueOf(totalMark) + " mark out of 100 which is identified as YELLLOW MARK. You may proceed for further steps under SPECIAL CONSIDERATION");

        } else if (totalMark <= 100&& totalMark>80) {
            textViewReport.setText("The client got " + String.valueOf(totalMark) + " mark out of 100 which is identified as GREEN MARK. You can proceed for further steps.");

        }


    }
}
