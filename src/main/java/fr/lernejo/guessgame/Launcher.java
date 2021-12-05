package fr.lernejo.guessgame;

import fr.lernejo.logger.Logger;
import fr.lernejo.logger.LoggerFactory;
import java.security.SecureRandom;
import java.util.Scanner;


public class Launcher {
    public static void main(String[] args) {


        if (args.length == 1 && args[0].equals("-interactive")) {
            Player humanplayer = new HumanPlayer();
            Simulation simulation = new Simulation(humanplayer);
            SecureRandom random = new SecureRandom();// long randomNumber = random.nextLong(); // génère un nombre entre Long.MIN_VALUE et Long.MAX_VALUE
            long RandomNumber = random.nextInt(100); // génère un nombre entre 0 (inclus) et 100 (exclus)
            simulation.initialize(RandomNumber);
            simulation.loopUntilPlayerSucceed(Long.MAX_VALUE);


        } else if (args.length == 2 && args[0].equals("-auto") && args[1].matches("[0-9]+")) {
            Player computerplayer = new ComputerPlayer();
            Simulation simulation = new Simulation(computerplayer);
            long RandomNumber = Long.parseLong(args[1]); // génère un nombre entre 0 (inclus) et 100 (exclus)
            simulation.initialize(RandomNumber);

            simulation.initialize(Long.parseLong(args[1]));
            simulation.loopUntilPlayerSucceed(1000);
        } else {






            Logger logger = LoggerFactory.getLogger("launcher");
            logger.log("ERREUR VEILLEZ COMPETER COMVENABLEMENT LE MENU..;");


        }
    }

}
