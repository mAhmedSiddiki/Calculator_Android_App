package com.example.maculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;



public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button one,two,three,four,five,six,seven,eight,nine,zero,point,equal,ac,div,mul,sub,sum,rem,pi;
    private ImageView cut;
    private TextView text,result;
    float number1,number2;
    boolean Add,Sub,Mul,Div,Rem,Pi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findIDxml();
        setOnclick();
    }

    private void setOnclick() {


        one.setOnClickListener(this);
        cut.setOnClickListener(this);
        two.setOnClickListener(this);
        three.setOnClickListener(this);
        four.setOnClickListener(this);
        five.setOnClickListener(this);
        six.setOnClickListener(this);
        seven.setOnClickListener(this);
        eight.setOnClickListener(this);
        nine.setOnClickListener(this);
        zero.setOnClickListener(this);
        sum.setOnClickListener(this);
        sub.setOnClickListener(this);
        mul.setOnClickListener(this);
        div.setOnClickListener(this);
        ac.setOnClickListener(this);
        point.setOnClickListener(this);
        equal.setOnClickListener(this);
        rem.setOnClickListener(this);
        pi.setOnClickListener(this);
    }

    private void findIDxml() {

        one = findViewById(R.id.onebtn);
        two = findViewById(R.id.twobtn);
        three = findViewById(R.id.threebtn);
        four = findViewById(R.id.fourbtn);
        five = findViewById(R.id.fivebtn);
        six = findViewById(R.id.sixbtn);
        seven = findViewById(R.id.sevenbtn);
        eight = findViewById(R.id.eightbtn);
        nine = findViewById(R.id.ninebtn);
        zero = findViewById(R.id.zerobtn);
        ac = findViewById(R.id.acbtn);
        sum = findViewById(R.id.sumbtn);
        sub = findViewById(R.id.subbtn);
        mul = findViewById(R.id.mulbtn);
        div = findViewById(R.id.divbtn);
        text = findViewById(R.id.text);
        point = findViewById(R.id.pointbtn);
        equal = findViewById(R.id.equal);
        result = findViewById(R.id.result);
        rem = findViewById(R.id.rembtn);
        pi = findViewById(R.id.pibtn);
        cut = findViewById(R.id.cutbtn);
    }


    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.acbtn){
            text.setText(null);
            result.setText(null);
        }else if (v.getId()==R.id.onebtn){
            text.setText(text.getText()+"1");
        }else if (v.getId()==R.id.twobtn){
            text.setText(text.getText()+"2");
        }else if (v.getId()==R.id.threebtn){
            text.setText(text.getText()+"3");
        }else if (v.getId()==R.id.fourbtn){
            text.setText(text.getText()+"4");
        }else if (v.getId()==R.id.fivebtn){
            text.setText(text.getText()+"5");
        }else if (v.getId()==R.id.sixbtn){
            text.setText(text.getText()+"6");
        }else if (v.getId()==R.id.sevenbtn){
            text.setText(text.getText()+"7");
        }else if (v.getId()==R.id.eightbtn){
            text.setText(text.getText()+"8");
        }else if (v.getId()==R.id.ninebtn){
            text.setText(text.getText()+"9");
        }else if (v.getId()==R.id.zerobtn){
            text.setText(text.getText()+"0");
        }else if (v.getId()==R.id.pibtn){
            text.setText(text.getText()+"3.14159");
            Pi = true;
        }else if (v.getId()==R.id.sumbtn){
            if(text.getText().toString().isEmpty()){
                Toast.makeText(MainActivity.this, "Please enter a number", Toast.LENGTH_SHORT).show();
            }else{
                number1=Float.parseFloat(text.getText()+"");
                Add=true;
                text.setText(null);
            }
        }else if (v.getId()==R.id.subbtn){
            if(text.getText().toString().isEmpty()){
                Toast.makeText(MainActivity.this, "Please enter a number", Toast.LENGTH_SHORT).show();
            }else{
                number1=Float.parseFloat(text.getText()+"");
                Sub=true;
                text.setText(null);
            }
        }else if (v.getId()==R.id.mulbtn){
            if(text.getText().toString().isEmpty()){
                Toast.makeText(MainActivity.this, "Please enter a number", Toast.LENGTH_SHORT).show();
            }else{
                number1=Float.parseFloat(text.getText()+"");
                Mul=true;
                text.setText(null);
            }
        }else if (v.getId()==R.id.divbtn){
            if(text.getText().toString().isEmpty()){
                Toast.makeText(MainActivity.this, "Please enter a number", Toast.LENGTH_SHORT).show();
            }else{
                number1=Float.parseFloat(text.getText()+"");
                Div=true;
                text.setText(null);
            }
        }else if (v.getId()==R.id.pointbtn){
            text.setText(text.getText()+".");
        }else if(v.getId()==R.id.rembtn){
            if(text.getText().toString().isEmpty()){
                Toast.makeText(MainActivity.this, "Please enter a number", Toast.LENGTH_SHORT).show();
            }else{
                number1=Float.parseFloat(text.getText()+"");
                Rem=true;
                text.setText(null);
            }
        }else if (v.getId()==R.id.equal){
            number2=Float.parseFloat(text.getText()+"");
            if(text.getText().toString().isEmpty()){
                Toast.makeText(MainActivity.this, "Please enter a number", Toast.LENGTH_SHORT).show();
            }else if(Add==true){
                result.setText(number1+"+"+number2);
                Add=false;
                number1=number1+number2;
                text.setText(String.valueOf(number1));
            }else if(Sub==true){
                result.setText(number1+"-"+number2);
                Sub=false;
                number1=number1-number2;
                text.setText(String.valueOf(number1));
            }else if(Mul==true){
                result.setText(number1+"×"+number2);
                Mul=false;
                number1=number1*number2;
                text.setText(String.valueOf(number1));
            }else if(Div==true){
                result.setText(number1+"÷"+number2);
                Add=false;
                number1=number1/number2;
                text.setText(String.valueOf(number1));
            }else if(Rem==true){
                result.setText(number1+"%"+number2);
                Rem=false;
                number1=number1%number2;
                text.setText(String.valueOf(number1));
            }else if(Pi==true){
                result.setText("π");
                Pi=false;
                number1= (float) 3.14159;
                text.setText(String.valueOf(number1));
            }
        }else if(v.getId()==R.id.cutbtn){
            if(text.getText().toString().isEmpty()){
                Toast.makeText(MainActivity.this, "Please enter a number", Toast.LENGTH_SHORT).show();
            }else{
                text.setText(text.getText().toString().substring(0,text.getText().toString().length()-1));
            }
        }
    }
}
