package com.example.lab3oldschool;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import com.example.wordcounteroldsch.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        androidx.activity.EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        androidx.core.view.ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            androidx.core.graphics.Insets systemBars = insets.getInsets(androidx.core.view.WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        android.widget.EditText txtInput = findViewById(R.id.txtInput);
        android.widget.Spinner spinnerMetrics = findViewById(R.id.spinnerMetrics);
        android.widget.Button btnCalculate = findViewById(R.id.btnCalculate);
        android.widget.TextView tvResult = findViewById(R.id.tvResult);

        btnCalculate.setOnClickListener(new android.view.View.OnClickListener() {
            @Override
            public void onClick(android.view.View v) {
                String text = txtInput.getText().toString();
                int count = 0;

                if (spinnerMetrics.getSelectedItem() != null && spinnerMetrics.getSelectedItem().toString().contains("Char")) {
                    count = com.example.wordcounteroldsch.TextMetricsCounter.getCharsCount(text);
                } else {
                    count = com.example.wordcounteroldsch.TextMetricsCounter.getWordsCount(text);
                }

                tvResult.setText(String.valueOf(count));
            }
        });
    }
}