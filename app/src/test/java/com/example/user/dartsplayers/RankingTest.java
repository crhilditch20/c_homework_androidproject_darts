package com.example.user.dartsplayers;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * Created by user on 12/12/2016.
 */
public class RankingTest {

    Ranking ranking;
    Player player;

    @Before
    public void before(){
        ranking = new Ranking();
        player = new Player("Bob", "Magic", 1);
    }

    @Test
    public void testCountPlayers(){
        assertEquals(0, ranking.countPlayers());
    }

    @Test
    public void testAddPlayerByIndex(){
        ranking.addPlayerByIndex(player);
        assertEquals(1, ranking.countPlayers());
    }

    @Test
    public void testGetPlayerByIndex(){
        ranking.addPlayerByIndex(player);
        Player player2 = new Player("Jen", "Ace", 2);
        ranking.addPlayerByIndex(player2);
        assertEquals("Name: Jen, Nickname: Ace, Ranking: 2",ranking.getPlayerByRanking(2));
    }

    @Test
    public void testReplaceLastPlayer(){
        Player player2 = new Player("Jen", "Ace", 2);
        Player player3 = new Player("Dick", "Dastardly", 3);
        Player player4 = new Player("Liz", "Lady", 4);
        Player player5 = new Player("Betty", "Boo", 5);
        ranking.addPlayerByIndex(player);
        ranking.addPlayerByIndex(player2);
        ranking.addPlayerByIndex(player3);
        ranking.addPlayerByIndex(player4);
        ranking.addPlayerByIndex(player5);
        Player player6 = new Player("Harry", "Wizard", 5);
        ranking.replaceLastPlayer(player6);
        assertEquals("Name: Harry, Nickname: Wizard, Ranking: 5", ranking.getPlayerByRanking(5));
    }

    @Test
    public void testGetPlayerByName(){
        Player player2 = new Player("Jen", "Ace", 2);
        ranking.addPlayerByIndex(player);
        ranking.addPlayerByIndex(player2);
        assertEquals("Name: Jen, Nickname: Ace, Ranking: 2", ranking.getPlayerByName("Jen"));
    }
}
