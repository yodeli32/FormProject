package com.example.formpage1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;

public class formpage2 extends AppCompatActivity {
    Button shareButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formpage2);
        final EditText firstNameField = (EditText) findViewById(R.id.EditTextFirstName);
        final EditText lastNameField = (EditText) findViewById(R.id.EditTextLastName);
        final EditText phoneNumberField = (EditText) findViewById(R.id.EditTextPhone);
        final EditText emailField = (EditText) findViewById(R.id.EditTextEmail);
        final EditText ticketAmount = (EditText) findViewById(R.id.amountOfTickets);
        final CheckBox dietaryCheckBox = (CheckBox) findViewById(R.id.checkDietaryRestrictions);
        final EditText dietaryFeedback = (EditText) findViewById(R.id.DietaryRestrictionsComments);
        final CheckBox transportationCheckBox = (CheckBox) findViewById(R.id.CheckTransportation);
        shareButton = (Button)findViewById(R.id.shareButton);
        shareButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("text/plain");
                String firstName = firstNameField.getText().toString();
                String lastName = lastNameField.getText().toString();
                String phone = phoneNumberField.getText().toString();
                String ticketNumber = ticketAmount.getText().toString();
                boolean bRequiresResponse = dietaryCheckBox.isChecked();
                String feedback = dietaryFeedback.getText().toString();
                boolean RequiresResponse2 = transportationCheckBox.isChecked();
                String shareBody = firstName + "\n" + lastName + "\n" + phone  + "\n" + ticketNumber
                        + " tickets" + "\n" + bRequiresResponse + " I have dietary restrictions" + "\n" +
                        feedback + "\n" + RequiresResponse2 + " requires transportation accomodations";

                intent.putExtra(Intent.EXTRA_SUBJECT, "Event Registration For:");
                intent.putExtra(Intent.EXTRA_TEXT, shareBody);

                startActivity(Intent.createChooser(intent, "Share Event Registration"));
            }
        });
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
