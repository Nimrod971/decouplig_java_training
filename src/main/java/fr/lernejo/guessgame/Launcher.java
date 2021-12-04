package fr.lernejo.guessgame;

import java.security.SecureRandom;

public class Launcher {
    public static void main(String[] args) {

        Player Humanplayer = new HumanPlayer();
        Simulation simulation = new Simulation(Humanplayer);
        SecureRandom random = new SecureRandom();// long randomNumber = random.nextLong(); // génère un nombre entre Long.MIN_VALUE et Long.MAX_VALUE
        long RandomNumber = random.nextInt(100); // génère un nombre entre 0 (inclus) et 100 (exclus)

        simulation.initialize(RandomNumber);
        int MAXRound=10;
        simulation.loopUntilPlayerSucceed(MAXRound);

    }
}
