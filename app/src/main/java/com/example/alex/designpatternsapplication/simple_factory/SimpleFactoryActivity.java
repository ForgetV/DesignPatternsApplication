package com.example.alex.designpatternsapplication.simple_factory;

import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.alex.designpatternsapplication.R;
import com.example.alex.designpatternsapplication.simple_factory.model.MyOperation;

import java.util.UnknownFormatConversionException;

public class SimpleFactoryActivity extends AppCompatActivity implements View.OnClickListener{

    private EditText inputNumberOneET;
    private EditText inputOperationET;
    private EditText inputNumberTwoET;
    private Button calculateBtn;
    private TextView resultTV;

    private OperationFactory factory;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_factory);
        initViews();
    }


    private void initViews(){
        inputNumberOneET=(EditText)findViewById(R.id.input_item_one);
        inputOperationET=(EditText)findViewById(R.id.input_item_two);
        inputNumberTwoET=(EditText)findViewById(R.id.input_item_three);
        calculateBtn=(Button)findViewById(R.id.btn_calculate);
        resultTV=(TextView)findViewById(R.id.result_tv);
        calculateBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_calculate:
                calculate();
                break;
        }
    }

    private void calculate(){
        if (TextUtils.isEmpty(inputNumberOneET.getText())
                || TextUtils.isEmpty(inputOperationET.getText())
                || TextUtils.isEmpty(inputNumberTwoET.getText())){
            Toast.makeText(SimpleFactoryActivity.this,"input empty",Toast.LENGTH_SHORT).show();
            return;
        }
        String oper=inputOperationET.getText().toString();
        double inputOne=Double.parseDouble(inputNumberOneET.getText().toString());
        double inputTwo=Double.parseDouble(inputNumberTwoET.getText().toString());
        MyOperation operation=factory.createOperation(oper);
        operation.setNumberOne(inputOne);
        operation.setNumberTwo(inputTwo);
        double result=0;
        try{
            result=operation.calculateNumber();
            resultTV.setText(result+"");
        }catch (UnknownFormatConversionException e){
            Toast.makeText(SimpleFactoryActivity.this,e.getMessage(),Toast.LENGTH_SHORT).show();
        }

    }
}
