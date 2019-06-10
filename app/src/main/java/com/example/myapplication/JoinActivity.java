package com.example.myapplication;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.myapplication.ui.login.LoginActivity;

public class JoinActivity extends AppCompatActivity {
    private ArrayAdapter adapter;
    private Spinner spinner;

    int version = 1;
    DatabaseOpenHelper helper;
    SQLiteDatabase database;

    EditText username;
    EditText password;
    Button btnJoin;

    String sql;
    Cursor cursor;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_join);

        spinner = (Spinner) findViewById(R.id.college);
        adapter = ArrayAdapter.createFromResource(this, R.array.college, android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);


        spinner = (Spinner) findViewById(R.id.major);
        adapter = ArrayAdapter.createFromResource(this, R.array.major, android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        spinner = (Spinner) findViewById(R.id.hobby);
        adapter = ArrayAdapter.createFromResource(this, R.array.hobby, android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        spinner = (Spinner) findViewById(R.id.city);
        adapter = ArrayAdapter.createFromResource(this, R.array.city, android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        spinner = (Spinner) findViewById(R.id.gender);
        adapter = ArrayAdapter.createFromResource(this, R.array.gender, android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);


        username = (EditText) findViewById(R.id.username);
        password = (EditText) findViewById(R.id.password);

        //btnJoin = (Button) findViewById(R.id.button8);

        helper = new DatabaseOpenHelper(JoinActivity.this, DatabaseOpenHelper.tableName, null, version);
        database = helper.getWritableDatabase();


        //btnJoin.setOnClickListener(new View.OnClickListener(){
        //@Override
        //public void onClick(View view) {
                /*String id = username.getText().toString();
                String pw = password.getText().toString();

                if(id.length() == 0 || pw.length() == 0) {
                    //아이디와 비밀번호는 필수 입력사항입니다.
                    Toast toast = Toast.makeText(JoinActivity.this, "아이디와 비밀번호는 필수 입력사항입니다.", Toast.LENGTH_SHORT);
                    toast.show();
                    return;
                }

                sql = "SELECT id FROM "+ helper.tableName + " WHERE id = '" + id + "'";
                cursor = database.rawQuery(sql, null);

                if(cursor.getCount() != 0){
                    //존재하는 아이디입니다.
                    Toast toast = Toast.makeText(JoinActivity.this, "존재하는 아이디입니다.", Toast.LENGTH_SHORT);
                    toast.show();
                }else{
                    helper.insertUser(database,id,pw);
                    Toast toast = Toast.makeText(JoinActivity.this, "가입이 완료되었습니다. 로그인을 해주세요.", Toast.LENGTH_SHORT);
                    toast.show();
                    Intent intent = new Intent(getApplicationContext(), LoginActivity.class);
                    startActivity(intent);
                    finish();
                }
            }
        });*/

    }
        public void onbutton8(View v){
            Toast.makeText(getApplicationContext(), "회원가입이 완료되었습니다.", Toast.LENGTH_LONG).show();
            finish();
    }

    public void onbutton9(View v){
        Toast.makeText(getApplicationContext(), "사용 가능한 아이디 입니다 :)", Toast.LENGTH_LONG).show();

    }

    public void onbutton10(View v){
        Toast.makeText(getApplicationContext(), "사용 가능한 닉네임 입니다 :D", Toast.LENGTH_LONG).show();

    }


    }
