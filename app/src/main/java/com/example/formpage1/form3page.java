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

public class form3page extends AppCompatActivity {
    Button shareButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form3page);
        final EditText firstNameField = (EditText)findViewById(R.id.EditTextFirstName);
        final EditText lastNameField = (EditText)findViewById(R.id.EditTextLastName);
        final EditText phoneNumberField = (EditText) findViewById(R.id.EditTextPhone);
        final EditText emailField = (EditText)findViewById(R.id.EditTextEmail);
        final EditText feedbackField = (EditText)findViewById(R.id.EditTextFeedbackBody);
        shareButton = (Button)findViewById(R.id.shareButton);
        shareButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("text/plain");
                String firstName = firstNameField.getText().toString();
                String lastName = lastNameField.getText().toString();
                String phone = phoneNumberField.getText().toString();
                String email = emailField.getText().toString();
                String feedback = feedbackField.getText().toString();
                String shareBody = firstName + "\n" + lastName + "\n" + phone  + "\n" + email + "\n" + feedback;

                intent.putExtra(Intent.EXTRA_SUBJECT, "Contact Us Form:");
                intent.putExtra(Intent.EXTRA_TEXT, shareBody);

                startActivity(Intent.createChooser(intent, "Share Contact Us"));
            }
        });
    }


    public void sendFeedback(View button) {
        final EditText firstNameField = (EditText)findViewById(R.id.EditTextFirstName);
        String firstName = firstNameField.getText().toString();

        final EditText lastNameField = (EditText)findViewById(R.id.EditTextLastName);
        String lastName = lastNameField.getText().toString();

        final EditText phoneNumberField = (EditText) findViewById(R.id.EditTextPhone);
        String phone = phoneNumberField.getText().toString();

        final EditText emailField = (EditText)findViewById(R.id.EditTextEmail);
        String email = emailField.getText().toString();

        final EditText feedbackField = (EditText)findViewById(R.id.EditTextFeedbackBody);
        String feedback = feedbackField.getText().toString();
    }
}
