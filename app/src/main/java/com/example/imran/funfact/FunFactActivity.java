package com.example.imran.funfact;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class FunFactActivity extends AppCompatActivity {

     private  TextView mFactText;
     private Button mNewFact;
     private String Fact;

    private FactBook factbook = new FactBook();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun_fact);

        mFactText = (TextView) findViewById(R.id.facttext);
        mNewFact = (Button) findViewById(R.id.btn_newfact);

        mNewFact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              Fact = factbook.getFact();
                mFactText.setText(Fact);
            }
        });
    }
}
