package com.example.skunivproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SignUp extends AppCompatActivity {

    EditText Name,ID,PW;
    Button Login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        Name=(EditText)findViewById(R.id.Name);
        ID=(EditText)findViewById(R.id.ID);
        PW=(EditText)findViewById(R.id.PW);
        Login=(Button)findViewById(R.id.Login);

        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Name.getText().toString();
                ID.getText().toString();
                PW.getText().toString();

                //서버로 받은 이름&아이디&비밀번호 넘겨주기
                //아이디 중복인 경우 & 아이디가 있는 경우 & 셋중 하나라도 널값인 경우 ->각각 오류메세지 넘겨주기
                //넘겨서 서버의 디비에 저장

                Intent Login=new Intent(getApplicationContext(),Login.class);
                startActivity(Login);

            }
        });
    }
}