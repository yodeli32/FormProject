package com.example.formpage1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RatingBar;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendFeedback(View button) {
        final EditText firstNameField = (EditText)findViewById(R.id.EditTextFirstName);
        String firstName = firstNameField.getText().toString();

        final EditText lastNameField = (EditText)findViewById(R.id.EditTextLastName);
        String lastName = lastNameField.getText().toString();

        final EditText emailField = (EditText)findViewById(R.id.EditTextEmail);
        String email = emailField.getText().toString();

        final EditText feedbackField = (EditText)findViewById(R.id.EditTextFeedbackBody);
        String feedback = feedbackField.getText().toString();

        final Spinner feedbackSpinner = (Spinner)findViewById(R.id.SpinnerFeedbackType);
        String feedbackType = feedbackSpinner.getSelectedItem().toString();

        final RatingBar ratingBar = (RatingBar)findViewById(R.id.ratingBar);
        ratingBar.getRating();

        final CheckBox responseCheckbox = (CheckBox)findViewById(R.id.CheckBoxResponse);
        boolean bRequiresResponse = responseCheckbox.isChecked();
    }
}
