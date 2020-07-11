package com.example.zakat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;

public class form extends AppCompatActivity {

    /*variables for amount eligible for zakat*/
    private  EditText gold,silver,land,bank_balance,loan_given,currency,bonds,shares,
            saving_certificates,bc,borrow,raw_material,ready_stock,installments,partnership,others;


    /*variables for amount to be deducted*/
    private EditText loan_taken,bills,draw_remaining,salaries;


            TextView total,deduction,pay,amount;
    private  Button add;
    private FloatingActionButton clear;


    //variables for eligible amount for zakat
    int gold1,silver1,land1,bank_balance1,loan_given1,currency1,bonds1,shares1,saving_certificates1,bc1,borrwow1,raw_material1,ready_stock1,installments1,partnership1,others1;


    //variables for amount to be deducted

    int loan_taken1,bills1,draw_remaining1,salaries1;

    //variables for final result
    double total1,deduction1,pay1,amount1;

ArrayList<Double> myData = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);
/*linking with xml variable amount eligible for zakat*/
        final EditText gold = findViewById(R.id.gold);
        final EditText silver = findViewById(R.id.silver);
        final EditText land = findViewById(R.id.land);
        final EditText bank_balance = findViewById(R.id.Bank_Balance);
        final EditText loan_given = findViewById(R.id.loan_given);
        final EditText currency = findViewById(R.id.currency);
        final EditText bonds = findViewById(R.id.bonds);
        final EditText shares = findViewById(R.id.shares);
        final EditText saving_certificates = findViewById(R.id.saving_certificate);
        final EditText bc = findViewById(R.id.bc);
        final EditText borrow = findViewById(R.id.borrow);
        final EditText raw_material = findViewById(R.id.raw_material);
        final EditText ready_stock = findViewById(R.id.ready_stock);
        final EditText installments = findViewById(R.id.instalments);
        final EditText partnership = findViewById(R.id.partnership);
        final EditText others = findViewById(R.id.others);


        /*linking with xml variables ammount to be dedcuted*/

        final EditText loan_taken = findViewById(R.id.loan_taken);
        final EditText bills = findViewById(R.id.utility_bills);
        final EditText draw_remaining = findViewById(R.id.draw_remaining);
        final EditText salaries = findViewById(R.id.salaries);

        //linking with xml final results text views




        Button add= findViewById(R.id.add);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if ((gold.getText().toString().isEmpty())
                        ||(silver.getText().toString().isEmpty())
                        ||(land.getText().toString().isEmpty())
                        ||(bank_balance.getText().toString().isEmpty())
                        ||(loan_given.getText().toString().isEmpty())
                        ||(currency.getText().toString().isEmpty())
                        ||(bonds.getText().toString().isEmpty())
                        ||(shares.getText().toString().isEmpty())
                        ||(saving_certificates.getText().toString().isEmpty())
                        ||(bc.getText().toString().isEmpty())
                        ||(borrow.getText().toString().isEmpty())
                        ||(raw_material.getText().toString().isEmpty())
                        ||(ready_stock.getText().toString().isEmpty())
                        ||(installments.getText().toString().isEmpty())
                        ||(partnership.getText().toString().isEmpty())
                        ||(others.getText().toString().isEmpty())
                        ||(loan_taken.getText().toString().isEmpty())
                        ||(bills.getText().toString().isEmpty())
                        ||(draw_remaining.getText().toString().isEmpty())
                        ||(salaries.getText().toString().isEmpty())


                )

                {
                    Toast.makeText(getApplicationContext(),"Please fill all values",Toast.LENGTH_SHORT).show();
                }
                else {

                gold1= Integer.parseInt(gold.getText().toString());
                land1= Integer.parseInt(land.getText().toString());
                silver1= Integer.parseInt(silver.getText().toString());
                bank_balance1= Integer.parseInt(bank_balance.getText().toString());
                loan_given1= Integer.parseInt(loan_given.getText().toString());
                currency1= Integer.parseInt(currency.getText().toString());
                bonds1= Integer.parseInt(bonds.getText().toString());
                shares1= Integer.parseInt(shares.getText().toString());
                saving_certificates1= Integer.parseInt(saving_certificates.getText().toString());
                bc1= Integer.parseInt(bc.getText().toString());
                borrwow1= Integer.parseInt(borrow.getText().toString());
                raw_material1= Integer.parseInt(raw_material.getText().toString());
                ready_stock1= Integer.parseInt(ready_stock.getText().toString());
                installments1= Integer.parseInt(installments.getText().toString());
                partnership1= Integer.parseInt(partnership.getText().toString());
                others1= Integer.parseInt(others.getText().toString());


                // deducted amount
                loan_taken1= Integer.parseInt(loan_taken.getText().toString());
                bills1= Integer.parseInt(bills.getText().toString());
                draw_remaining1= Integer.parseInt(draw_remaining.getText().toString());
                salaries1= Integer.parseInt(salaries.getText().toString());




                    total1 = gold1 + land1 + silver1 + bank_balance1 + loan_given1 + currency1 + bonds1 + shares1 + saving_certificates1 + bc1 + borrwow1 + raw_material1 + ready_stock1
                            + installments1 + partnership1 + others1;

                    deduction1 = loan_taken1 + bills1 + draw_remaining1 + salaries1;
                    pay1 = (total1 - deduction1) * (0.025);
                    pay1 = Math.ceil(pay1);
                    amount1 = total1 - deduction1;


                    myData.add(total1);
                    myData.add(deduction1);
                    myData.add(amount1);
                    myData.add(pay1);
                    Intent i = new Intent(form.this, Result.class);
                    // I hate using small letter in start of Acivity name
                    i.putExtra("Data", myData);
                    startActivity(i);
                }


        };




    });


        clear = findViewById(R.id.clear_text);
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gold.setText("");
                silver.setText("");
                land.setText("");
                bank_balance.setText("");
                loan_given.setText("");
                currency.setText("");
                bonds.setText("");
                shares.setText("");
                saving_certificates.setText("");
                bc.setText("");
                borrow.setText("");
                raw_material.setText("");
                ready_stock.setText("");
                installments.setText("");
                partnership.setText("");
                others.setText("");
                loan_taken.setText("");
                bills.setText("");
                draw_remaining.setText("");
                draw_remaining.setText("");
                salaries.setText("");
            };


        });




}}
