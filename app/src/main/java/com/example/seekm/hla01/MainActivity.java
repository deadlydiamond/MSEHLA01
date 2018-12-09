package com.example.seekm.hla01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText userName;
    private EditText Password;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        userName = (EditText) findViewById(R.id.username);
        Password = (EditText) findViewById(R.id.password);
        button = (Button) findViewById(R.id.buttonLogin);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                validate(userName.getText().toString(), Password.getText().toString());
            }
        });
    }

    private void validate(String userName, String password){
        if (userName.equals("admin")&& password.equals("admin")){
            Intent intent = new Intent(MainActivity.this,Welcome.class);
            startActivity(intent);
        }
        else{
//            Intent e = new Intent(MainActivity.this, );
//            startActivity(e);
        }
    }
}
