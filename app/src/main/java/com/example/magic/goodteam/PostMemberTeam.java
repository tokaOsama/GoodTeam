package com.example.magic.goodteam;

public class PostMemberTeam {

   private String Title , Desc ;

    public PostMemberTeam(String title, String desc) {
        Title = title;
        Desc  = desc;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getDesc() {
        return Desc;
    }

    public void setDesc(String desc) {
        Desc = desc;
    }


}
