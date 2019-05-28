package com.example.myapplication;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {


        int version = 1;
        DatabaseOpenHelper helper = new DatabaseOpenHelper(LoginActivity.this, DatabaseOpenHelper.tableName, null, version);
        SQLiteDatabase database = helper.getWritableDatabase();

        EditText username;
        EditText password;
        Button btnLogin = (Button) findViewById(R.id.login);
        Button btnJoin = (Button) findViewById(R.id.login);

        String sql;
        Cursor cursor;

        @Override
        public void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_login);

                username = (EditText) findViewById(R.id.username);
                password = (EditText) findViewById(R.id.password);

                btnLogin.setOnClickListener(new View.OnClickListener(){
                        @Override
                        public void onClick(View view) {
                                String id = username.getText().toString();
                                String pw = password.getText().toString();

                                if(id.length() == 0 || pw.length() == 0) {
                                        //아이디와 비밀번호는 필수 입력사항입니다.
                                        Toast toast = Toast.makeText(LoginActivity.this, "아이디와 비밀번호는 필수 입력사항입니다.", Toast.LENGTH_SHORT);
                                        toast.show();
                                        return;
                                }

                                sql = "SELECT id FROM "+ helper.tableName + " WHERE id = '" + id + "'";
                                cursor = database.rawQuery(sql, null);

                                if(cursor.getCount() != 1){
                                        //아이디가 틀렸습니다.
                                        Toast toast = Toast.makeText(LoginActivity.this, "존재하지 않는 아이디입니다.", Toast.LENGTH_SHORT);
                                        toast.show();
                                        return;
                                }

                                sql = "SELECT pw FROM "+ helper.tableName + " WHERE id = '" + id + "'";
                                cursor = database.rawQuery(sql, null);

                                cursor.moveToNext();
                                if(!pw.equals(cursor.getString(0))){
                                        //비밀번호가 틀렸습니다.
                                        Toast toast = Toast.makeText(LoginActivity.this, "비밀번호가 틀렸습니다.", Toast.LENGTH_SHORT);
                                        toast.show();
                                }else{
                                        //로그인성공
                                        Toast toast = Toast.makeText(LoginActivity.this, "로그인성공", Toast.LENGTH_SHORT);
                                        toast.show();
                                        //인텐트 생성 및 호출
                                        Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                                        startActivity(intent);
                                        finish();
                                }
                                cursor.close();
                        }
                });

                btnJoin.setOnClickListener(new View.OnClickListener(){
                        @Override
                        public void onClick(View view) {
                                //회원가입 버튼 클릭
                                Toast toast = Toast.makeText(LoginActivity.this, "회원가입 화면으로 이동", Toast.LENGTH_SHORT);
                                toast.show();
                                Intent intent = new Intent(getApplicationContext(),JoinActivity.class);
                                startActivity(intent);
                                //finish();
                        }
                });

        }




}
