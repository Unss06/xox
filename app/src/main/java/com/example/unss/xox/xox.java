package com.example.unss.xox;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextClock;
import android.widget.TextView;
import android.content.Intent;


public class xox extends AppCompatActivity implements View.OnClickListener {
    Button b21;
    Button b22;
    Button b23;
    Button b31;
    Button b32;
    Button b33;
    Button b41;
    Button b42;
    Button b43;
    TextView tw;
    int timer = 0;
    int x=0;
    int o=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Intent X=getIntent();
        Intent O=getIntent();
        x=X.getIntExtra("X",x);
        o=O.getIntExtra("O",o);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_xox);
        b21 = (Button) findViewById(R.id.B21);
        b22 = (Button) findViewById(R.id.B22);
        b23 = (Button) findViewById(R.id.B23);
        b31 = (Button) findViewById(R.id.B31);
        b32 = (Button) findViewById(R.id.B32);
        b33 = (Button) findViewById(R.id.B33);
        b41 = (Button) findViewById(R.id.B41);
        b42 = (Button) findViewById(R.id.B42);
        b43 = (Button) findViewById(R.id.B43);
        tw = (TextView) findViewById(R.id.textView);
        b21.setOnClickListener(this);
        b22.setOnClickListener(this);
        b23.setOnClickListener(this);
        b31.setOnClickListener(this);
        b32.setOnClickListener(this);
        b33.setOnClickListener(this);
        b41.setOnClickListener(this);
        b42.setOnClickListener(this);
        b43.setOnClickListener(this);
        tw.setText("X="+x+" || O="+o);


    }

    public void onClick(View v) {
        if (v.getId() == b21.getId()) {
            if (b21.getText() == "X") {
                timer--;
                }
                 else if (b21.getText() == "O") {
                timer--;
                } else if (timer % 2 == 0){
                b21.setText("X");
            }
                else {
                b21.setText("O");


            }
            }
        else if (v.getId() == b22.getId()) {
            if (b22.getText() == "X"){
                timer--;
               }

            else if (b22.getText() == "O") {
                timer--;}

            else if (timer % 2 == 0){
                b22.setText("X");

            }
            else {b22.setText("O");

        }}

        else if (v.getId() == b23.getId()) {
            if (b23.getText() == "X"){
                timer--;
                }

            else if (b23.getText() == "O") {
                timer--;}

            else if (timer % 2 == 0){
                b23.setText("X");
               }
            else {b23.setText("O");
               }
        } else if (v.getId() == b31.getId()) {
            if (b31.getText() == "X"){
                timer--;
                }

            else if (b31.getText() == "O") {

                timer--;}

            else if (timer % 2 == 0){
                b31.setText("X");
                }
            else {b31.setText("O");
                }
        } else if (v.getId() == b32.getId()) {
            if (b32.getText() == "X")
                timer--;


            else if (b32.getText() == "O") {

                timer--;}

            else if (timer % 2 == 0){
                b32.setText("X");
              }
            else {b32.setText("O");
               }
        }else if (v.getId() == b33.getId()) {
            if (b33.getText() == "X"){
                timer--;
                }

            else if (b33.getText() == "O") {

                timer--;}

            else if (timer % 2 == 0){
                b33.setText("X");
                }
            else {
                b33.setText("O");
                }
        } else if (v.getId() == b41.getId()) {
            if (b41.getText() == "X"){
                timer--;
             }

            else if (b41.getText() == "O") {

                timer--;}

            else if (timer % 2 == 0){
                ;
                b41.setText("X");}
            else {b41.setText("O");
                ;
            }
        } else if (v.getId() == b42.getId()) {
            if (b42.getText() == "X"){
                timer--;
                }

            else if (b42.getText() == "O") {

                timer--;}

            else if (timer % 2 == 0){
                ;
                b42.setText("X");}
            else {
                ;
                b42.setText("O");
        }}
        else if (v.getId() == b43.getId())
        {
            if (b43.getText() == "X"){
                timer--;
                }

            else if (b43.getText() == "O") {
                timer--;}

            else if (timer % 2 == 0){
                b43.setText("X");
                }
            else {b43.setText("O");
                }
        }
        if (b21.getText()==b32.getText()&&b32.getText()==b43.getText()&&(b21.getText()=="X"||b21.getText()=="O")){
            if(b21.getText()=="X"){
                x++;
                tw.setText("X="+x+" || O="+o);
                Intent Result=new Intent(xox.this, com.example.unss.xox.Result.class);
                Result.putExtra("winner","X".toString());
                Result.putExtra("X",x);
                Result.putExtra("O",o);
                startActivity(Result);}
            else {o++;
            tw.setText("X="+x+" || O="+o);
                Intent Result=new Intent(xox.this, com.example.unss.xox.Result.class);
                Result.putExtra("winner","O".toString());
                Result.putExtra("X",x);
                Result.putExtra("O",o);
                startActivity(Result);}
        }
        else if (b21.getText()==b22.getText()&&b22.getText()==b23.getText()&&(b21.getText()=="X"||b21.getText()=="O")){
            if(b21.getText()=="X"){ x++;
                Intent Result=new Intent(xox.this, com.example.unss.xox.Result.class);
                Result.putExtra("winner","X".toString());
                Result.putExtra("X",x);
                Result.putExtra("O",o);
                startActivity(Result);}
            else {o++;
            Intent Result=new Intent(xox.this, com.example.unss.xox.Result.class);
            Result.putExtra("winner","O".toString());
            Result.putExtra("X",x);
            Result.putExtra("O",o);
            startActivity(Result);}
        }
        else if (b31.getText()==b32.getText()&&b32.getText()==b33.getText()&&(b31.getText()=="X"||b31.getText()=="O")){
            if(b31.getText()=="X"){ x++;
                Intent Result=new Intent(xox.this, com.example.unss.xox.Result.class);
                Result.putExtra("winner","X".toString());
                Result.putExtra("X",x);
                Result.putExtra("O",o);
                startActivity(Result);}
            else {o++;
            tw.setText("X="+x+" || O="+o);
            Intent Result=new Intent(xox.this, com.example.unss.xox.Result.class);
            Result.putExtra("winner","O".toString());
            Result.putExtra("X",x);
            Result.putExtra("O",o);
            startActivity(Result);}
        }
        else if (b41.getText()==b42.getText()&&b42.getText()==b43.getText()&&(b41.getText()=="X"||b41.getText()=="O")){
            if(b41.getText()=="X"){ x++;
                Intent Result=new Intent(xox.this, com.example.unss.xox.Result.class);
                Result.putExtra("winner","X".toString());
                Result.putExtra("X",x);
                Result.putExtra("O",o);
                startActivity(Result);}
            else {o++;
            tw.setText("X="+x+" || O="+o);
            Intent Result=new Intent(xox.this, com.example.unss.xox.Result.class);
            Result.putExtra("winner","O".toString());
            Result.putExtra("X",x);
            Result.putExtra("O",o);
            startActivity(Result);}
    }
        else if (b41.getText()==b32.getText()&&b32.getText()==b23.getText()&&(b41.getText()=="X"||b41.getText()=="O")){

            if(b41.getText()=="X"){ x++;
                Intent Result=new Intent(xox.this, com.example.unss.xox.Result.class);
                Result.putExtra("winner","X".toString());
                Result.putExtra("X",x);
                Result.putExtra("O",o);
                startActivity(Result);}
            else {o++;
            tw.setText("X="+x+" || O="+o);
            Intent Result=new Intent(xox.this, com.example.unss.xox.Result.class);
            Result.putExtra("winner","O".toString());
            Result.putExtra("X",x);
            Result.putExtra("O",o);
            startActivity(Result);}
        }
        else if (b21.getText()==b31.getText()&&b31.getText()==b41.getText()&&(b41.getText()=="X"||b41.getText()=="O")){

            if(b21.getText()=="X"){ x++;
                Intent Result=new Intent(xox.this, com.example.unss.xox.Result.class);
                Result.putExtra("winner","X".toString());
                Result.putExtra("X",x);
                Result.putExtra("O",o);
                startActivity(Result);}
            else {o++;
            tw.setText("X="+x+" || O="+o);
            Intent Result=new Intent(xox.this, com.example.unss.xox.Result.class);
            Result.putExtra("winner","O".toString());
            Result.putExtra("X",x);
            Result.putExtra("O",o);
            startActivity(Result);}
        }
        else if (b22.getText()==b32.getText()&&b32.getText()==b42.getText()&&(b22.getText()=="X"||b22.getText()=="O")){

            if(b22.getText()=="X"){ x++;
                Intent Result=new Intent(xox.this, com.example.unss.xox.Result.class);
                Result.putExtra("winner","X".toString());
                Result.putExtra("X",x);
                Result.putExtra("O",o);
                startActivity(Result);}
            else {o++;
            tw.setText("X="+x+" || O="+o);
            Intent Result=new Intent(xox.this, com.example.unss.xox.Result.class);
            Result.putExtra("winner","O".toString());
            Result.putExtra("X",x);
            Result.putExtra("O",o);
            startActivity(Result);}
        }
        else if (b23.getText()==b33.getText()&&b33.getText()==b43.getText()&&(b23.getText()=="X"||b23.getText()=="O")){

            if(b23.getText()=="X"){ x++;
                Intent Result=new Intent(xox.this, com.example.unss.xox.Result.class);
                Result.putExtra("winner","X".toString());
                Result.putExtra("X",x);
                Result.putExtra("O",o);
                startActivity(Result);}
            else {o++;
            tw.setText("X="+x+" || O="+o);
            Intent Result=new Intent(xox.this, com.example.unss.xox.Result.class);
            Result.putExtra("winner","O".toString());
            Result.putExtra("X",x);
            Result.putExtra("O",o);
            startActivity(Result);}
        }
        else if((b21.getText()=="X"||b21.getText()=="O")&&(b22.getText()=="X"||b22.getText()=="O")&&(b23.getText()=="X"||b23.getText()=="O")&&(b31.getText()=="X"||b31.getText()=="O")&&(b32.getText()=="X"||b32.getText()=="O")&&(b33.getText()=="X"||b33.getText()=="O")&&(b41.getText()=="X"||b41.getText()=="O")&&(b42.getText()=="X"||b42.getText()=="O")&&(b43.getText()=="X"||b43.getText()=="O")) {

            Intent Result=new Intent(xox.this, com.example.unss.xox.Result.class);
            Result.putExtra("winner","none".toString());
            Result.putExtra("X",x);
            Result.putExtra("O",o);
            startActivity(Result);
        }

         timer++;

    }


    public void recreate(){

        b21.setText("");
        b31.setText("");
        b41.setText("");
        b22.setText("");
        b32.setText("");
        b42.setText("");
        b23.setText("");
        b33.setText("");
        b43.setText("");
        timer=0;


    }


}
