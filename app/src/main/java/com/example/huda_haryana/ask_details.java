package com.example.huda_haryana;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import java.sql.Ref;

public class ask_details extends AppCompatActivity {

    Button SubmitButton;
    int i = 0;
    TextView t4;
    EditText t1, t2, t5, t6, t7, t8, t9;
    Switch t3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ask_details);

        t3 = findViewById(R.id.switch1);
        t4 = findViewById(R.id.Type);
        t1 = findViewById(R.id.name);
        t2 = findViewById(R.id.searchingat);
        t5 = findViewById(R.id.specifically);
        t6 = findViewById(R.id.cont_no);
        t7 = findViewById(R.id.email_);
        t8 = findViewById(R.id.address);
        t9 = findViewById(R.id.event);


        findViewById(R.id.Type).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog dialog = new Dialog(ask_details.this);

                t3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                        Toast.makeText(ask_details.this, "Dialog will appear", Toast.LENGTH_SHORT).show();
                        if (isChecked) {

                            ((Dialog)dialog).setContentView(R.layout.sg_dialog_commercial);
                            TextView shop = (TextView)((Dialog)dialog).findViewById(R.id.shop_txt);
                            TextView sco = (TextView)((Dialog)dialog).findViewById(R.id.sco_txt);
                            TextView scf = (TextView)((Dialog)dialog).findViewById(R.id.scf_txt);
                            TextView oth = (TextView)((Dialog)dialog).findViewById(R.id.com_others_txt);

                            shop.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    dialog.dismiss();
                                    t4.setText("Shops");
                                }
                            });

                            sco.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    dialog.dismiss();
                                    t4.setText("SCOs");

                                }
                            });

                            scf.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    dialog.dismiss();
                                    t4.setText("SCFs");
                                }
                            });

                            oth.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    dialog.dismiss();
                                    t4.setText("Others");
                                }
                            });
                        } else {

                            ((Dialog)dialog).setContentView(R.layout.residentials);
                            TextView shop = (TextView)((Dialog)dialog).findViewById(R.id.plot_txt);
                            TextView sco = (TextView)((Dialog)dialog).findViewById(R.id.flat_txt);
                            TextView scf = (TextView)((Dialog)dialog).findViewById(R.id.villa_txt);
                            TextView oth = (TextView)((Dialog)dialog).findViewById(R.id.resi_others_txt);

                            shop.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    dialog.dismiss();
                                    t4.setText("Plots");
                                }
                            });

                            sco.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    dialog.dismiss();
                                    t4.setText("Flats");

                                }
                            });

                            scf.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    dialog.dismiss();
                                    t4.setText("Villa");
                                }
                            });

                            oth.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    dialog.dismiss();
                                    t4.setText("Others");
                                }
                            });
                        }
                    }
                });
            }
        });

        SubmitButton = findViewById(R.id.submitbutton);
        SubmitButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if(!t4.getText().toString().equals("--Select--") && !t1.getText().toString().equals("") && !t6.getText().toString().equals("") && !t7.getText().toString().equals(""))
                {
                    String txt = t1.getText().toString()+"+"+t2.getText().toString()+"+"+t4.getText().toString()+"+"+
                            t5.getText().toString()+"+"+t6.getText().toString()+"+"+t7.getText().toString()+"+"+t8.getText().toString()+"+"+
                            t9.getText().toString();
                    Toast.makeText(ask_details.this, "Successfully data stored", Toast.LENGTH_SHORT).show();
                    Toast.makeText(ask_details.this, txt, Toast.LENGTH_LONG).show();
                }
                else{
                    Toast.makeText(ask_details.this, "Sorry! can't store without incomplete details", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}
