package com.example.usuario.radiobutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    //private RadioButton rdb_Particular;
    //private RadioButton rdb_Bussines;
    private RadioGroup rdg_Grupo1;
    private View contrainParticular;
    private View contrainBussiness;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //this.rdb_Particular = (RadioButton)findViewById(R.id.rdb_Particular);
        //this.rdb_Bussines = (RadioButton)findViewById(R.id.rdb_Bussiness);
        this.rdg_Grupo1 = (RadioGroup)findViewById(R.id.rdg_Grupo1);
        this.contrainBussiness = findViewById(R.id.inc_bussiness);
        this.contrainParticular = findViewById(R.id.inc_particular);


        //this.rdb_Particular.setOnClickListener(this);
        //this.rdb_Bussines.setOnClickListener(this);
        this.rdg_Grupo1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId){
                    case R.id.rdb_Bussiness:
                        ViewParticular(true);
                        break;
                    case R.id.rdb_Particular:
                        ViewParticular(false);
                        break;
                }
            }
        });
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.rdb_Bussiness:
                ViewParticular(true);
                break;
            case R.id.rdb_Particular:
                ViewParticular(false);
                break;
        }
    }

    private void ViewParticular(boolean b){
        this.contrainParticular.setVisibility(!b?View.VISIBLE:View.GONE);
        this.contrainBussiness.setVisibility(b?View.VISIBLE:View.GONE);
    }


}
