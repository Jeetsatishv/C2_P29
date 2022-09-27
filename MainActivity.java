package com.example.c2_p29;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView totalText, quantityText;
    int total = 0;
    int quantity = 0;
    int result = 0;
    int cals[] = {380, 410, 326, 59, 57, 222, 312, 172, 44, 24};
    Boolean selected[] = new Boolean[cals.length];


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CheckBox burrito = findViewById(R.id.burrito);
        CheckBox cheeseburger = findViewById(R.id.burger);
        CheckBox fajita = findViewById(R.id.fajita);
        CheckBox nuggets = findViewById(R.id.nuggets);
        CheckBox falafel = findViewById(R.id.falafel);
        CheckBox fries = findViewById(R.id.fries);
        CheckBox hotdog = findViewById(R.id.hotdog);
        CheckBox lasagna = findViewById(R.id.lasagna);
        CheckBox salmon = findViewById(R.id.salmon);
        CheckBox tuna = findViewById(R.id.tuna);

        Button plus = findViewById(R.id.plus);
        Button minus = findViewById(R.id.minus);
        Button enter = findViewById(R.id.enter);
        Button clear = findViewById(R.id.clear);

        totalText = (TextView)findViewById(R.id.total);
        quantityText = (TextView)findViewById(R.id.quantity);

        enter.setBackgroundColor(-16711936);
        clear.setBackgroundColor(-65536);

        for (int i=0; i< selected.length; i++){
            selected[i] = false;
        }

        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                quantity++;
                quantityText.setText(quantity+"");
            }
        });
        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (quantity ==0){
                    quantityText.setText("No Selection made");
                }else{
                    quantity --;
                    quantityText.setText(quantity+"");
                }
            }
        });
        enter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                for (int i=0; i< cals.length; i++){
                    if(selected[i] == true){
                        total += cals[i];
                        selected[i] =false;
                    }
                }
                int finalAnswer=0;
                finalAnswer+=total * quantity;
                total =0;
                result += finalAnswer;

                totalText.setText(result+"");

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
                for(int i=0; i<selected.length; i++){
                    selected[i]=false;
                }
                total = 0;
                quantity = 0;
                result = 0;
            }
        });

    }

    public void onCheckBoxClicked(View view){
        boolean checked = ((CheckBox) view).isChecked();
        switch(view.getId()) {
            case R.id.burrito:
                if (checked == true) {
                    selected[0]=true;
                }
                else {
                    selected[0]=false;
                }
                break;

            case R.id.burger:
                if (checked == true) {
                    selected[1]=true;
                }
                else {
                    selected[1]=false;
                }
                break;
            case R.id.fajita:
                if (checked == true) {
                    selected[2]=true;
                }
                else {
                    selected[2]=false;
                }
                break;
            case R.id.nuggets:
                if (checked == true) {
                    selected[3]=true;
                }
                else {
                    selected[3]=false;
                }

                break;
            case R.id.falafel:
                if (checked == true) {
                    selected[4]=true;
                }
                else {
                    selected[4]=false;
                }

                break;
            case R.id.fries:
                if (checked == true) {
                    selected[5]=true;
                }
                else {
                    selected[5]=false;
                }
                break;
            case R.id.hotdog:
                if (checked == true) {
                    selected[6]=true;
                }
                else {
                    selected[6]=false;
                }
                break;
            case R.id.lasagna:
                if (checked == true) {
                    selected[7]=true;
                }
                else {
                    selected[7]=false;
                }

                break;
            case R.id.salmon:
                if (checked == true) {
                    selected[8]=true;
                }
                else {
                    selected[8]=false;
                }

                break;
            case R.id.tuna:
                if (checked == true) {
                    selected[9] = true;
                }
                else {
                    selected[9]=false;
                }
                break;

        }
    }
}