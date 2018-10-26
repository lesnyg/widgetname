package com.lesnyg.edu.widgetname;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener,RadioGroup.OnCheckedChangeListener,View.OnKeyListener {

    TextView textView5;
    EditText editText1, editText2;
    String sex, job;
    RadioButton female,male,student,officer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //TextView textView5=(TextView)findViewById(R.id.textView5);
        Button button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(this);
        RadioGroup radioGroupsex = (RadioGroup) findViewById(R.id.radioGroupsex);
        radioGroupsex.setOnCheckedChangeListener(this);
        RadioGroup radioGroupjob = (RadioGroup) findViewById(R.id.radioGroupjob);
        radioGroupjob.setOnCheckedChangeListener(this);
         female = (RadioButton) findViewById(R.id.female);
         male = (RadioButton) findViewById(R.id.male);
         student = (RadioButton) findViewById(R.id.student);
         officer = (RadioButton) findViewById(R.id.officer);
        textView5 = (TextView) findViewById(R.id.textView5);
        editText1 = (EditText) findViewById(R.id.editText1);

        editText2 = (EditText) findViewById(R.id.editText2);



    }

    @Override
    public void onClick(View v) {
        String text = null;
        String name = null;
        String age = null;

        if (v.getId() == R.id.button1) {
            text = ((Button) v).getText().toString();

            name = editText1.getText().toString();
            age = editText2.getText().toString();

        }
        textView5.setText("이름은" + name + ", 나이는" + age+"세, 성별은"+sex+", 직업은"+job+"입니다.");
    }



    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {
         switch (checkedId){
             case R.id.female:
               sex = female.getText().toString();
               break;
             case R.id.male:
                 sex = male.getText().toString();
                 break;
             case R.id.student:
                 job = student.getText().toString();
                 break;
             case R.id.officer:
                 job = officer.getText().toString();
                 break;


         }
    }

    @Override
    public boolean onKey(View v, int keyCode, KeyEvent event) {
        return false;
    }
}
