package com.example.user.dartsplayers;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * Created by user on 12/12/2016.
 */
public class PlayerTest {

    Player player;

    @Before
    public void before(){
        player = new Player("Bob", "Magic", 1);
    }

    @Test
    public void testGetName(){
        assertEquals("Bob", player.getName());
    }

    @Test
    public void testGetNickname(){
        assertEquals("Magic", player.getNickname());
    }

    @Test
    public void testGetRanking(){
        assertEquals(1, player.getRanking());
    }

    @Test
    public void testToString(){
        assertEquals("Name: Bob, Nickname: Magic, Ranking: 1", player.toString());
    }

}
