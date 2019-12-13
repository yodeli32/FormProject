package com.example.formpage1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;

public class formpage2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formpage2);
    }

    public void sendFeedback(View button) {
        final EditText firstNameField = (EditText) findViewById(R.id.EditTextFirstName);
        String firstName = firstNameField.getText().toString();

        final EditText lastNameField = (EditText) findViewById(R.id.EditTextLastName);
        String lastName = lastNameField.getText().toString();

        final EditText phoneNumberField = (EditText) findViewById(R.id.EditTextPhone);
        String phone = phoneNumberField.getText().toString();

        final EditText emailField = (EditText) findViewById(R.id.EditTextEmail);
        String email = emailField.getText().toString();

        final EditText ticketAmount = (EditText) findViewById(R.id.amountOfTickets);
        String ticketNumber = ticketAmount.getText().toString();

        final CheckBox dietaryCheckBox = (CheckBox) findViewById(R.id.checkDietaryRestrictions);
        boolean bRequiresResponse = dietaryCheckBox.isChecked();

        final EditText dietaryFeedback = (EditText) findViewById(R.id.DietaryRestrictionsComments);
        String feedback = dietaryFeedback.getText().toString();

        final CheckBox transportationCheckBox = (CheckBox) findViewById(R.id.CheckTransportation);
        boolean RequiresResponse2 = transportationCheckBox.isChecked();
    }
}
