package com.example.myapplication;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.support.annotation.NonNull;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import android.support.v7.widget.Toolbar;
import android.widget.Toast;

import com.example.myapplication.ui.fragment.Fragment1;
import com.example.myapplication.ui.fragment.Fragment2;
import com.example.myapplication.ui.fragment.Fragment3;
import com.example.myapplication.ui.notice.Favorite;
import com.example.myapplication.ui.notice.FavoriteAdapter;

//import android.view.View;
//import android.support.design.widget.FloatingActionButton;
//import android.support.design.widget.Snackbar;
//import android.widget.TextView;
//import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Fragment1 fragment1;
    Fragment2 fragment2;
    Fragment3 fragment3;
    private ArrayAdapter adapter;
    private Spinner spinner;

    private TextView mTextMessage;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    mTextMessage.setText(R.string.title_home);
                    return true;
                case R.id.navigation_dashboard:
                    mTextMessage.setText(R.string.title_dashboard);
                    return true;
                case R.id.navigation_notifications:
                    mTextMessage.setText(R.string.title_notifications);
                    return true;
            }
            return false;
        }
    };

    //toolbar
    Toolbar myToolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_main);
        BottomNavigationView navView = findViewById(R.id.nav_view);
        mTextMessage = findViewById(R.id.message);
        navView.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

        myToolbar = findViewById(R.id.my_toolbar);
        setSupportActionBar(myToolbar);
        getSupportActionBar().setTitle("성균 프렌즈");//툴바의 제목

        fragment1 = new Fragment1();
        fragment2 = new Fragment2();
        fragment3 = new Fragment3();






        getSupportFragmentManager().beginTransaction().replace(R.id.container, fragment1).commit();

        BottomNavigationView bottomNavigation = findViewById(R.id.nav_view);
        bottomNavigation.setOnNavigationItemSelectedListener(
                new BottomNavigationView.OnNavigationItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                        switch(menuItem.getItemId()){

                            case R.id.navigation_home:
                                //Toast.makeText(getApplicationContext(), "공지사항으로 이동", Toast.LENGTH_LONG).show();
                                getSupportFragmentManager().beginTransaction().replace(R.id.container, fragment1).commit();
                                return true;

                            case R.id.navigation_dashboard:
                                //Toast.makeText(getApplicationContext(), "그룹 친구 찾기로 이동", Toast.LENGTH_LONG).show();
                                getSupportFragmentManager().beginTransaction().replace(R.id.container, fragment2).commit();
                                return true;

                            case R.id.navigation_notifications:
                                //Toast.makeText(getApplicationContext(), "개별 친구 찾기로 이동", Toast.LENGTH_LONG).show();

                                getSupportFragmentManager().beginTransaction().replace(R.id.container, fragment3).commit();



                                return true;

                        }
                        return false;
                    }
                }


        );



    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //return super.onCreateOptionsMenu(menu);
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        //return super.onOptionsItemSelected(item);
        switch (item.getItemId()) {
            case R.id.action_settings:
                // User chose the "Settings" item, show the app settings UI...
                //Toast.makeText(getApplicationContext(), "환경설정", Toast.LENGTH_LONG).show();
                Intent intent = new Intent(this, tabActivity.class);//tabAct열기
                startActivity(intent);//tabAct
                return true;

            case R.id.action_logout:
                finish();//delete screen
                //Intent intent2 = new Intent(this, LoginActivity.class);//초기페이지열기
                //startActivity(intent2);//tabAct
                return true;

            default:
                // If we got here, the user's action was not recognized.
                // Invoke the superclass to handle it.
                //Toast.makeText(getApplicationContext(), "나머지 버튼 클릭됨", Toast.LENGTH_LONG).show();
                return super.onOptionsItemSelected(item);
        }
    }
    public void onButtonbob(View v)
    {
        Intent bobIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://open.kakao.com/o/gqcIWRqb"));
        startActivity(bobIntent);
    }
    public void onButttonbeer(View v)
    {
        Intent beerIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://open.kakao.com/o/gsl3WRqb"));
        startActivity(beerIntent);
    }
    public void onButttonex(View v)
    {
        Intent exIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://open.kakao.com/o/gWPAXRqb"));
        startActivity(exIntent);
    }
    public void onButttongame(View v)
    {
        Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://open.kakao.com/o/gIb6XRqb"));
        startActivity(myIntent);

    }
    public void onButttoncafe(View v)
    {
        Intent cafeIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://open.kakao.com/o/gFPVXRqb"));
        startActivity(cafeIntent);

    }
    public void onButttonlove(View v)
    {
        Intent loveIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://open.kakao.com/o/g5sLXRqb"));
        startActivity(loveIntent);

    }




}
