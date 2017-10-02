package com.example.nico.twoactivitybio;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.app.Activity;
import android.widget.Spinner;
import android.widget.TextView;



public class Biography extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_biography);

        Intent callingIntent = getIntent();
        String first = callingIntent.getStringExtra("First");
        String last = callingIntent.getStringExtra("Last");
        String school = callingIntent.getStringExtra("School");
        String year = callingIntent.getStringExtra("Year");
        String degree = callingIntent.getStringExtra("Degree");
        String major = callingIntent.getStringExtra("Major");
        String activities = callingIntent.getStringExtra("Activities");
        String jour = callingIntent.getStringExtra("Jour");
        String mois = callingIntent.getStringExtra("Mois");
        String annee = callingIntent.getStringExtra("Annee");

        TextView textfinal = (TextView) findViewById(R.id.textView);
        textfinal.setText(first + " " + last + " " + "was born on " + mois + "/" + jour + "/" + annee + ". " +"He is studying at " + school + " and will be graduated in " + year + ". He prepares an " + degree + " degree and his major is " + major + ". His favorite activities is " + activities + ".");
    }

    public void onClickBuild (View view) {
        TextView textfinal = (TextView) findViewById(R.id.textView);

        String stringfirst = textfinal.getText().toString();
        String stringlast = textfinal.getText().toString();
        String stringschool = textfinal.getText().toString();
        String stringyear = textfinal.getText().toString();
        String stringdegree = textfinal.getText().toString();
        String stringmajor = textfinal.getText().toString();
        String stringactivities = textfinal.getText().toString();
        String stringjour = textfinal.getText().toString();
        String stringmois = textfinal.getText().toString();
        String stringannee = textfinal.getText().toString();

        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("First", stringfirst);
        intent.putExtra("Last", stringlast);
        intent.putExtra("School", stringschool);
        intent.putExtra("Year", stringyear);
        intent.putExtra("Degree", stringdegree);
        intent.putExtra("Major", stringmajor);
        intent.putExtra("Activities", stringactivities);
        intent.putExtra("Jour", stringjour);
        intent.putExtra("Mois", stringmois);
        intent.putExtra("Annee", stringannee);
        startActivity(intent);
    }

    public void onClickUpdate (View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
