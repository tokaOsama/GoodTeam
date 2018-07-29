package com.example.magic.goodteam;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class Posts_Teams extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_posts__teams);

        List<PostMemberTeam> teamList = new ArrayList<>();
        String [] Title = {"Ahmed" , "Nihal" , "Gehad" , "Amr" , "Aly" , "Toka" ,"Nadeen" ,"Esraa"};
        String [] Descr = {"55" , "88" , "99" , "22" , "33" , "77", "33" , "66"};

        for (int i = 0 ; i<Title.length ; i++){
            PostMemberTeam memberTeam = new PostMemberTeam(Title[i] ,Descr[i]) ;
            teamList.add(memberTeam);
        }

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.Member_Posts);
        recyclerView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));
        PostMemberAdapter adapter = new PostMemberAdapter(teamList);
        recyclerView.setAdapter(adapter);


    }
}



























