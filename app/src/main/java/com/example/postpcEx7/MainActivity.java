package com.example.postpcEx7;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
//class FirestoneHelper{
//    private final FirebaseFirestone firestone = FirebaseFirestore.getInstance();
//}
class Order{
    String id;
    String customerName;
    int pickles;
    boolean hummus;
    boolean tahini;
    String comment;
    String status;

}

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}