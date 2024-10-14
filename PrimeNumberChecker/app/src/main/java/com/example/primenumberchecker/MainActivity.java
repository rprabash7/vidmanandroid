package com.example.primenumberchecker;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    EditText inputNumber;  // Input field reference
    Button checkButton;    // Button reference
    TextView resultMessage;  // Result display

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Link XML UI elements with Java
        inputNumber = findViewById(R.id.inputNumber);
        checkButton = findViewById(R.id.checkButton);
        resultMessage = findViewById(R.id.resultMessage);

        // Button click listener
        checkButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String input = inputNumber.getText().toString();

                int number = input.isEmpty() ? -1 : Integer.parseInt(input);

                if (isPrime(number)) {
                    resultMessage.setText("It is a prime number.");
                } else {
                    resultMessage.setText("It is not a prime number.");
                }
            }
        });
    }

    // Method to check if a number is prime
    private boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
