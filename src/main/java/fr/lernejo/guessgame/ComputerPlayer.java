package fr.lernejo.guessgame;

import fr.lernejo.logger.Logger;
import fr.lernejo.logger.LoggerFactory;

import java.security.SecureRandom;




import java.util.Scanner;


public class ComputerPlayer implements Player {
    long min=0;
    long max=1000;
    long moit;
    Logger logger = LoggerFactory.getLogger("Computer");



    public long askNextGuess() {
        moit = (max + min) / 2;
        logger.log(""+moit+"");
        return moit;

    }

    public void respond(boolean lowerOrGreater) {
        /*if(lowerOrGreater) logger.log("Le nombre doit être plus grand");
        else logger.log("Le nombre doit être plus petit");*/
        if (lowerOrGreater) {
            logger.log("Plus Grand");
            min=(max + min) / 2;

        } else {
            logger.log("Plus PETIT");
            max=(max + min) / 2;
        }


    }
}
