package fr.lernejo.guessgame;

import fr.lernejo.logger.Logger;
import fr.lernejo.logger.LoggerFactory;

import java.util.Scanner;


public class HumanPlayer implements Player {

    private final Logger logger = LoggerFactory.getLogger("player");


    public long askNextGuess() {
        Scanner input = new Scanner(System.in);
        logger.log("VEUILLEZ ENTRER UN NOMBRE: ");

        long nb = input.nextLong();
        return nb;
    }

    public void respond(boolean lowerOrGreater) {
        /*if(lowerOrGreater) logger.log("Le nombre doit être plus grand");
        else logger.log("Le nombre doit être plus petit");*/
        if(lowerOrGreater)
            logger.log("PLUS GRAND ");
        else
            logger.log("PLUS PETIT");
    }
}

