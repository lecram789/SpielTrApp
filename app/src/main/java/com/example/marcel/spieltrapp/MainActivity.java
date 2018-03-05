package com.example.marcel.spieltrapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //final TextView participants_dialog =  findViewById(R.id.textView1);
        //final TextView players_dialog =  findViewById(R.id.textView2);
        final TextView result_dialog =  findViewById(R.id.textView3);

        final EditText participants_input =  findViewById(R.id.editText1);
        final EditText players_input = findViewById(R.id.editText2);

        Button solve_action =  findViewById(R.id.button);

        solve_action.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int participants = Integer.parseInt(participants_input.getText().toString());
                int players = Integer.parseInt(players_input.getText().toString());

                result_dialog.setText(participants * players <= 22 ? "Korrekte Eingabe" : "Ungültige Eingabe");
            }
        });

    }
}
