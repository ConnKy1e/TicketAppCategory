package com.example.ticketproject.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.ticketproject.Activity.Adaptor.CategoryAdaptor;
import com.example.ticketproject.Activity.Domain.CategoryDomain;
import com.example.ticketproject.R;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView.Adapter adapter;
    private RecyclerView recyclerViewCategoryList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerViewCategory();

    }

    private void recyclerViewCategory() {
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL, false);
        recyclerViewCategoryList=findViewById(R.id.recyclerView);
        recyclerViewCategoryList.setLayoutManager(linearLayoutManager);

        ArrayList<CategoryDomain> category= new ArrayList<>();
        category.add(new CategoryDomain("Adult","cat_1"));
        category.add(new CategoryDomain("Child","cat_2"));
        category.add(new CategoryDomain("Member", "cat_3"));

        adapter= new CategoryAdaptor(category);
        recyclerViewCategoryList.setAdapter(adapter);
    }
}
