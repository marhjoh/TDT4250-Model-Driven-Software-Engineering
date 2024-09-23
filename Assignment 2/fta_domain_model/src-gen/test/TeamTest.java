package test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import fta_domain_model.Player;
import fta_domain_model.PlayerStatistics;
import fta_domain_model.impl.Fta_domain_modelFactoryImpl;
import fta_domain_model.Team;

import fta_domain_model.impl.PlayerImpl;
import fta_domain_model.impl.PlayerStatisticsImpl;
import fta_domain_model.impl.TeamImpl;
import fta_domain_model.impl.Fta_domain_modelFactoryImpl;

public class TeamTest {

    private Team team;
    
    @BeforeEach
    public void setUp() {
        team = Fta_domain_modelFactoryImpl.init().createTeam(); // Use the factory to create the team object

        // Create player 1 with 5 goals
        Player player1 = Fta_domain_modelFactoryImpl.init().createPlayer();
        PlayerStatistics stats1 = Fta_domain_modelFactoryImpl.init().createPlayerStatistics();
        stats1.setGoals(5);
        player1.setPlayerstatistics(stats1);
        
        // Create player 2 with 3 goals
        Player player2 = Fta_domain_modelFactoryImpl.init().createPlayer();
        PlayerStatistics stats2 = Fta_domain_modelFactoryImpl.init().createPlayerStatistics();
        stats2.setGoals(3);
        player2.setPlayerstatistics(stats2);
        
        team.getPlayers().add(player1);
        team.getPlayers().add(player2);
    }
    
    @Test
    public void testTotalGoals() {
        assertEquals(8, team.getTotalGoals(), "The total goals should be 8");
    }
    
    @Test
    public void testMinimumPlayersInTeam() {
        team.getPlayers().clear();  // Remove all players from the team
        assertEquals(0, team.getPlayers().size(), "The team should have 0 players after clearing.");
        
        team.getPlayers().add(Fta_domain_modelFactoryImpl.init().createPlayer());
        assertTrue(team.getPlayers().size() >= 2, "A team must have at least 2 players.");
    }
}

