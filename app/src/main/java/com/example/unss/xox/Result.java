package com.example.unss.xox;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.content.Intent;


public class Result extends AppCompatActivity  implements View.OnClickListener{
    Button bmain;
    Button bcont;
    TextView twinner;
    int x;
    int o;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        bmain=(Button)findViewById(R.id.Bmain);
        bcont=(Button)findViewById(R.id.Bcont);
        twinner=(TextView)findViewById(R.id.Twinner);
        bmain.setOnClickListener(this);
        bcont.setOnClickListener(this);
        Intent winner=getIntent();
        Intent X=getIntent();
        Intent O=getIntent();
        String W= winner.getStringExtra("winner");
        x= X.getIntExtra("X",x);
        o=O.getIntExtra("O",o);
        if(W.equals("none")){
            twinner.setText("Draw! "+"\nX="+x+"\nO="+o);

        }

        else {twinner.setText("Wınner ıs "+W+"\nX="+x+"\nO="+o);}

    }
public void onClick(View view){
        if(view.getId()==bmain.getId()){
            Intent main=new Intent(Result.this,Entry.class);
            startActivity(main);
        }
        else if (view.getId()==bcont.getId()){
            Intent cont=new Intent(Result.this,xox.class);
            cont.putExtra("X",x);
            cont.putExtra("O",o);
            startActivity(cont);
        }
    }
}
