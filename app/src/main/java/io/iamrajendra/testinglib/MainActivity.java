package io.iamrajendra.testinglib;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import io.iamrajendra.mylittlelibrary.MyView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        View v = new MyView(this);
        setContentView(v);
//        f674f9ba8cb161f47cb3217f4fca6588d67bd3ae
   }
}
