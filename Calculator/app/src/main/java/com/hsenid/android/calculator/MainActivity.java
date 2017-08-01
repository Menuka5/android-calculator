package com.hsenid.android.calculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.fathzer.soft.javaluator.DoubleEvaluator;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final String calcContent;

        Button oneBtn = (Button) findViewById(R.id.oneBtn);
        Button twoBtn = (Button) findViewById(R.id.twoBtn);
        Button threeBtn = (Button) findViewById(R.id.threeBtn);
        Button fourBtn = (Button) findViewById(R.id.fourBtn);
        Button fiveBtn = (Button) findViewById(R.id.fiveBtn);
        Button sixBtn = (Button) findViewById(R.id.sixBtn);
        Button sevenBtn = (Button) findViewById(R.id.sevenBtn);
        Button eightBtn = (Button) findViewById(R.id.eightBtn);
        final Button nineBtn = (Button) findViewById(R.id.nineBtn);
        Button zeroBtn = (Button) findViewById(R.id.zeroBtn);

        Button clearBtn = (Button) findViewById(R.id.clearBtn);
        Button plusBtn = (Button) findViewById(R.id.plusBtn);
        Button minusBtn = (Button) findViewById(R.id.minusBtn);
        Button divideBtn = (Button) findViewById(R.id.divideBtn);
        Button multiBtn = (Button) findViewById(R.id.multiBtn);
        Button sumBtn = (Button) findViewById(R.id.sumBtn);

        final EditText calcText = (EditText) findViewById(R.id.calcText);

        assert oneBtn != null;
        oneBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                String calcContent = calcText.getText().toString();
                calcText.setText(calcContent+"1");
            }
        });

        twoBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String calcContent = calcText.getText().toString();
                calcText.setText(calcContent+"2");

            }
        });

        threeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String calcContent = calcText.getText().toString();
                calcText.setText(calcContent+"3");

            }
        });

        fourBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String calcContent = calcText.getText().toString();
                calcText.setText(calcContent+"4");

            }
        });

        fiveBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String calcContent = calcText.getText().toString();
                calcText.setText(calcContent+"5");

            }
        });

        sixBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String calcContent = calcText.getText().toString();
                calcText.setText(calcContent+"6");

            }
        });

        sevenBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String calcContent = calcText.getText().toString();
                calcText.setText(calcContent+"7");

            }
        });

        eightBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String calcContent = calcText.getText().toString();
                calcText.setText(calcContent+"8");

            }
        });

        nineBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String calcContent = calcText.getText().toString();
                calcText.setText(calcContent+"9");

            }
        });

        zeroBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String calcContent = calcText.getText().toString();
                calcText.setText(calcContent+"0");

            }
        });

        clearBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                calcText.getText().clear();

            }
        });

        plusBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String calcContent = calcText.getText().toString();
                calcText.setText(calcContent+"+");

            }
        });

        minusBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String calcContent = calcText.getText().toString();
                calcText.setText(calcContent+"-");

            }
        });

        multiBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String calcContent = calcText.getText().toString();
                calcText.setText(calcContent+"*");

            }
        });

        divideBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String calcContent = calcText.getText().toString();
                calcText.setText(calcContent+"/");

            }
        });


        sumBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println(calcText.getText().toString());

                Double result = null;
                try {
                    result = new DoubleEvaluator().evaluate(calcText.getText().toString());
                } catch (Exception e) {

                }

                calcText.setText(Double.toString(result));
            }
        });

        /*sumBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String calcContent = calcText.getText().toString();

                if (!calcContent.matches("")){

                    Double result = new DoubleEvaluator().evaluate(calcContent);
                    calcText.setText(result.toString());
                    *//*String[] inputArr = calcContent.split(" ");
                    if(inputArr != null){


                        calcText.setText(inputArr.length);
                    }*//*

                }


            }
        });*/


    }
}
