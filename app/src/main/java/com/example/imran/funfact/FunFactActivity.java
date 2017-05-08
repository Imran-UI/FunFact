package com.example.imran.funfact;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class FunFactActivity extends AppCompatActivity {

     private  TextView mFactText;
     private Button mNewFact;
     private String Fact;
     private int color;
     private RelativeLayout mRelativeLayout;

    private FactBook factbook = new FactBook();
    private FactColor factcolor = new FactColor();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun_fact);

        mFactText = (TextView) findViewById(R.id.facttext);
        mNewFact = (Button) findViewById(R.id.btn_newfact);
        mRelativeLayout = (RelativeLayout) findViewById(R.id.activity_fun_fact);
        mFactText.setText(factbook.getFact());

        mNewFact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              Fact = factbook.getFact();
              color = factcolor.getColor();
                mRelativeLayout.setBackgroundColor(color);
                mFactText.setText(Fact);
            }
        });
    }
}
