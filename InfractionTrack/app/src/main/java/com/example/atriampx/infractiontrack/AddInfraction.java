package com.example.atriampx.infractiontrack;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.view.View.OnClickListener;

import java.util.ArrayList;


public class AddInfraction extends Activity {

    ArrayList<Integer> listWWID = new ArrayList<Integer>();
    ArrayList<Integer> listIndvInfrac = new ArrayList<Integer>();

    ArrayList<Integer> listBU = new ArrayList<Integer>();
    ArrayList<Integer> listBUInfrac = new ArrayList<Integer>();


    private Button submit;

    public void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_infraction);

        submit = (Button) findViewById(R.id.submit_button);

        submit.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick (View arg0) {

                Toast.makeText(getApplicationContext(),
                        "Thank you, your infraction has been submitted.", Toast.LENGTH_LONG).show();

            }
        });
    }

    /*public void individualInfractions(ArrayList<Integer> arrayWWID, ArrayList<Integer> arrayIndvInfrac, View text) {

        EditText WWIDtext = (EditText) findViewById(R.id.infractor_name);

        int WWIDnum = Integer.parseInt(text.getText().toString());

        if (arrayWWID.contains(WWIDnum)) {

            int index = arrayWWID.indexOf(WWIDnum);
            int infraCount = arrayIndvInfrac.get(index);
            arrayIndvInfrac.add(index, infraCount);
        }

        else {
            arrayWWID.add(WWIDnum);
            arrayIndvInfrac.add(1);
        }

    }

    public void BUinfractions (ArrayList<Integer> arrayBU, ArrayList<Integer> arrayBUInfrac, View text) {

        EditText WWIDtext = (EditText) findViewById(R.id.BUgroup);

        int WWIDnum = Integer.parseInt(text.getText().toString());

        if (arrayBU.contains(WWIDnum)) {

            int index = arrayBU.indexOf(WWIDnum);
            int infraCount = arrayBUInfrac.get(index);
            arrayBUInfrac.add(index, infraCount);
        }

        else {
            arrayBU.add(WWIDnum);
            arrayBUInfrac.add(1);
        }

    }*/


}
