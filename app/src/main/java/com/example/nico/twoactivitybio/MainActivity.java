package com.example.nico.twoactivitybio;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent callingIntent = getIntent();
        Spinner jour = (Spinner) findViewById(R.id.jour);
        ArrayAdapter<CharSequence> adapter=ArrayAdapter.createFromResource(this,R.array.jour,android.R.layout.simple_spinner_item);
        jour.setAdapter(adapter);

        Spinner mois = (Spinner) findViewById(R.id.mois);
        ArrayAdapter<CharSequence> adapter1=ArrayAdapter.createFromResource(this,R.array.mois,android.R.layout.simple_spinner_item);
        mois.setAdapter(adapter1);

        Spinner annee = (Spinner) findViewById(R.id.annee);
        ArrayAdapter<CharSequence> adapter2=ArrayAdapter.createFromResource(this,R.array.annee,android.R.layout.simple_spinner_item);
        annee.setAdapter(adapter2);

        String first = callingIntent.getStringExtra("First");
        String last = callingIntent.getStringExtra("Last");
        String school = callingIntent.getStringExtra("School");
        String year = callingIntent.getStringExtra("Year");
        String degree = callingIntent.getStringExtra("Degree");
        String major = callingIntent.getStringExtra("Major");
        String activities = callingIntent.getStringExtra("Activities");

        EditText editFirst = (EditText) findViewById(R.id.firstname);
        EditText editLast = (EditText) findViewById(R.id.lastname);
        EditText editSchool = (EditText) findViewById(R.id.school);
        EditText editYear = (EditText) findViewById(R.id.yearofgraduation);
        EditText editDegree = (EditText) findViewById(R.id.degree);
        EditText editMajor = (EditText) findViewById(R.id.major);
        EditText editActivities = (EditText) findViewById(R.id.activities);

        editFirst.setText(first);
        editLast.setText(last);
        editSchool.setText(school);
        editYear.setText(year);
        editDegree.setText(degree);
        editMajor.setText(major);
        editActivities.setText(activities);
    }

    public void onClickBuild (View view) {

        EditText editFirst = (EditText) findViewById(R.id.firstname);
        EditText editLast = (EditText) findViewById(R.id.lastname);
        EditText editSchool = (EditText) findViewById(R.id.school);
        EditText editYear = (EditText) findViewById(R.id.yearofgraduation);
        EditText editDegree = (EditText) findViewById(R.id.degree);
        EditText editMajor = (EditText) findViewById(R.id.major);
        EditText editActivities = (EditText) findViewById(R.id.activities);
        Spinner editJour = (Spinner) findViewById(R.id.jour);
        Spinner editMois = (Spinner) findViewById(R.id.mois);
        Spinner editAnnee = (Spinner) findViewById(R.id.annee);

        String stringfirst = editFirst.getText().toString();
        String stringlast = editLast.getText().toString();
        String stringschool = editSchool.getText().toString();
        String stringyear = editYear.getText().toString();
        String stringdegree = editDegree.getText().toString();
        String stringmajor = editMajor.getText().toString();
        String stringactivities = editActivities.getText().toString();
        String stringjour = editJour.getSelectedItem().toString();
        String stringmois = editMois.getSelectedItem().toString();
        String stringannee = editAnnee.getSelectedItem().toString();

        Intent intent = new Intent(this, Biography.class);
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
        Intent intent = new Intent(this, Biography.class);
        startActivity(intent);
    }
}
