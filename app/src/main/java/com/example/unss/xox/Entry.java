package com.example.unss.xox;

        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.content.Intent;

public class Entry extends AppCompatActivity implements View.OnClickListener{

    Button bstart;
    Button bquit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_entry);
        bstart=(Button)findViewById(R.id.Bstart);
        bquit=(Button)findViewById(R.id.Bquit);
        bstart.setOnClickListener(this);
        bquit.setOnClickListener(this);

    }
    public void onClick(View v){
        if(v.getId()==bstart.getId()){
            Intent start=new Intent(Entry.this,xox.class);
            startActivity(start);
        }
        else if(v.getId()==bquit.getId()){
            this.finishAffinity();

        }

    }


}
