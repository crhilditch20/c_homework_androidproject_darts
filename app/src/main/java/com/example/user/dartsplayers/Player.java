package com.example.user.dartsplayers;

/**
 * Created by user on 12/12/2016.
 */
public class Player {

    private String name;
    private String nickname;
    private int ranking;

    public Player(String name, String nickname, int ranking) {
        this.name = name;
        this.nickname = nickname;
        this.ranking = ranking;
    }

    public String getName(){
        return this.name;
    }

    public String getNickname(){
        return this.nickname;
    }

    public int getRanking(){
        return this.ranking;
    }

    @Override
    public String toString(){
        return "Name: " + getName() + ", Nickname: " + getNickname() + ", Ranking: " + getRanking();
    }


}
