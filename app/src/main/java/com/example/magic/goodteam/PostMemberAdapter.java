package com.example.magic.goodteam;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;


public class PostMemberAdapter extends RecyclerView.Adapter<PostMemberAdapter.PostsHolder>{

    List<PostMemberTeam> teamList ;

    public PostMemberAdapter(List<PostMemberTeam> teamList) {
        this.teamList = teamList;
    }

    @Override
    public PostsHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycleview,parent,false);
        PostsHolder holder = new PostsHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(PostsHolder holder, int position) {
      PostMemberTeam memberTeam = teamList.get(position);
      holder.Title.setText(memberTeam.getTitle());
      holder.Desc.setText(memberTeam.getDesc());
    }

    @Override
    public int getItemCount() {
        return teamList.size();
    }

    class PostsHolder extends RecyclerView.ViewHolder{
        TextView Title , Desc ;
        public PostsHolder(View itemView) {
            super(itemView);
            Title = (TextView) itemView.findViewById(R.id.TitleMemberTeam);
            Desc  = (TextView) itemView.findViewById(R.id.DescMemberTeam);


        }
    }
}
