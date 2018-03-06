package com.example.awesomefat.csc300_spring2018_binarytree;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BinaryTree bt = new BinaryTree();
        bt.add(2); //Root
        bt.add(4); //Right
        bt.add(4); //Right Left
        bt.add(2); //Left
        bt.add(2); //Left Left
        bt.add(1); //Left Left Left
    }
}
