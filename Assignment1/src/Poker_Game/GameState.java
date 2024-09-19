/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Poker_Game;

/**
 *
 * @author user
 */
import java.io.Serializable;
import java.util.List;

public class GameState implements Serializable {
    
    // variable are encapsulated to ensure modifications are controlled
    private List<Player> players;           // List of players in the game
    private List<Card> communityCards;      // List of community cards on the table
    private int pot;                        // The total amount of chips in the pot
    private int currentBet;                 // The current bet amount in the game
    private Player winner;                  // The player who won the game
    private String announcement;
    
    public GameState(List<Player> players, List<Card> communityCards, int pot, int currentBet) {
        this.players = players;
        this.communityCards = communityCards;
        this.pot = pot;
        this.currentBet = currentBet;
    
    }

    public List<Player> getPlayers() {
        return players;
    }

    public List<Card> getCommunityCards() {
        return communityCards;
    }

    public int getPot() {
        return pot;
    }

    public void setPot(int pot) {
        this.pot = pot;
    }

    public int getCurrentBet() {
        return currentBet;
    }

    public void setCurrentBet(int currentBet) {
        this.currentBet = currentBet;
    }
    
    public Player getWinner() {
        return winner;
    }

    public void setWinner(Player winner) {
        this.winner = winner;
    }
    public boolean isEmpty(){
        return getPlayers().isEmpty();
            
    }

    /**
     * @param players the players to set
     */
    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    /**
     * @return the announcement
     */
    public String getAnnouncement() {
        return announcement + " \n";
    }

    /**
     * @param announcement the announcement to set
     */
    public void setAnnouncement(String announcement) {
        this.announcement = announcement;
    }
}
