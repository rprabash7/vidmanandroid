package com.example.datatypes;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText booleanInput, charInput, byteInput, shortInput, intInput, longInput, floatInput, doubleInput;
    private TextView displayText;
    private Button submitButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find the views by their IDs
        booleanInput = findViewById(R.id.booleanInput);
        charInput = findViewById(R.id.charInput);
        byteInput = findViewById(R.id.byteInput);
        shortInput = findViewById(R.id.shortInput);
        intInput = findViewById(R.id.intInput);
        longInput = findViewById(R.id.longInput);
        floatInput = findViewById(R.id.floatInput);
        doubleInput = findViewById(R.id.doubleInput);
        displayText = findViewById(R.id.displayText);
        submitButton = findViewById(R.id.submitButton);

        // Set onClickListener for the button
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    // Get and convert the inputs to respective data types
                    boolean boolValue = Boolean.parseBoolean(booleanInput.getText().toString());
                    char charValue = charInput.getText().toString().charAt(0);
                    byte byteValue = Byte.parseByte(byteInput.getText().toString());
                    short shortValue = Short.parseShort(shortInput.getText().toString());
                    int intValue = Integer.parseInt(intInput.getText().toString());
                    long longValue = Long.parseLong(longInput.getText().toString());
                    float floatValue = Float.parseFloat(floatInput.getText().toString());
                    double doubleValue = Double.parseDouble(doubleInput.getText().toString());

                    // Display the values in the TextView
                    displayText.setText("Boolean: " + boolValue + "\n" +
                            "Char: " + charValue + "\n" +
                            "Byte: " + byteValue + "\n" +
                            "Short: " + shortValue + "\n" +
                            "Int: " + intValue + "\n" +
                            "Long: " + longValue + "\n" +
                            "Float: " + floatValue + "\n" +
                            "Double: " + doubleValue);
                } catch (Exception e) {
                    // Handle potential input errors
                    displayText.setText("Error in input! Please check the values.");
                }
            }
        });
    }
}
