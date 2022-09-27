package com.example.c2_p29;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    CheckBox burrito, cheeseburger, fajita, nuggets, falafel, fries, hotdog, lasagna, salmon, tuna;
    Button plus, minus, enter, clear;
    TextView totalText, quantityText;
    int calories[] = {380, 410, 326, 59, 57, 222, 312, 172, 44, 24};
    Boolean flag[] = new Boolean[calories.length];
    int total = 0;
    int quantity = 0;
    int totalScore = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CheckBox burrito = findViewById(R.id.A);
        CheckBox cheeseburger = findViewById(R.id.B);
        CheckBox fajita = findViewById(R.id.C);
        CheckBox nuggets = findViewById(R.id.D);
        CheckBox falafel = findViewById(R.id.E);
        CheckBox fries = findViewById(R.id.F);
        CheckBox hotdog = findViewById(R.id.G);
        CheckBox lasagna = findViewById(R.id.H);
        CheckBox salmon = findViewById(R.id.I);
        CheckBox tuna = findViewById(R.id.J);

        Button plus = findViewById(R.id.plus);
        Button minus = findViewById(R.id.minus);
        Button enter = findViewById(R.id.enter);
        Button clear = findViewById(R.id.clear);

        totalText = (TextView)findViewById(R.id.total);
        quantityText = (TextView)findViewById(R.id.quantity);

        enter.setBackgroundColor(-16711936);
        clear.setBackgroundColor(-65536);

        for (int i=0; i< flag.length; i++){
            flag[i] = false;
        }

        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                quantity+=1;
                quantityText.setText(quantity+"");
            }
        });
        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (quantity ==0){
                    quantityText.setText("Quantity");
                }else{
                    quantity -=1;
                    quantityText.setText(quantity+"");
                }
            }
        });
        enter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                for (int i=0; i< calories.length; i++){
                    if(flag[i] == true){
                        total += calories[i];
                        flag[i] =false;
                    }
                }
                int finalAnswer=0;
                finalAnswer+=total * quantity;
                total =0;
                totalScore += finalAnswer;

                totalText.setText(totalScore+"");


                burrito.setChecked(false);
                cheeseburger.setChecked(false);
                fajita.setChecked(false);
                nuggets.setChecked(false);
                falafel.setChecked(false);
                fries.setChecked(false);
                hotdog.setChecked(false);
                lasagna.setChecked(false);
                salmon.setChecked(false);
                tuna.setChecked(false);


            }
        });

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                total =0;
                quantity=0;
                totalScore=0;
                quantityText.setText("Quantity");
                totalText.setText("Total");
                burrito.setChecked(false);
                cheeseburger.setChecked(false);
                fajita.setChecked(false);
                nuggets.setChecked(false);
                falafel.setChecked(false);
                fries.setChecked(false);
                hotdog.setChecked(false);
                lasagna.setChecked(false);
                salmon.setChecked(false);
                tuna.setChecked(false);
                for(int i=0; i<flag.length; i++){
                    flag[i]=false;
                }
            }
        });

    }

    public void onCheckBoxClicked(View view){
        boolean checked = ((CheckBox) view).isChecked();
        switch(view.getId()) {
            case R.id.A:
                if (checked) {
                    flag[0]=true;
                }
                else {
                    flag[0]=false;
                }
                break;

            case R.id.B:
                if (checked) {
                    flag[1]=true;
                }
                else {
                    flag[1]=false;
                }
                break;
            case R.id.C:
                if (checked) {
                    flag[2]=true;
                }
                else {
                    flag[2]=false;
                }
                break;
            case R.id.D:
                if (checked) {
                    flag[3]=true;
                }
                else {
                    flag[3]=false;
                }

                break;
            case R.id.E:
                if (checked) {
                    flag[4]=true;
                }
                else {
                    flag[4]=false;
                }

                break;
            case R.id.F:
                if (checked) {
                    flag[5]=true;
                }
                else {
                    flag[5]=false;
                }
                break;
            case R.id.G:
                if (checked) {
                    flag[6]=true;
                }
                else {
                    flag[6]=false;
                }
                break;
            case R.id.H:
                if (checked) {
                    flag[7]=true;
                }
                else {
                    flag[7]=false;
                }

                break;
            case R.id.I:
                if (checked) {
                    flag[8]=true;
                }
                else {
                    flag[8]=false;
                }

                break;
            case R.id.J:
                if (checked) {
                    flag[9] = true;
                }
                else {
                    flag[9]=false;
                }
                break;

        }
    }
}