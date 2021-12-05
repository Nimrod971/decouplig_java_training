package fr.lernejo.guessgame;

import fr.lernejo.logger.Logger;
import fr.lernejo.logger.LoggerFactory;

public class Simulation {

    private final Logger logger = LoggerFactory.getLogger("simulation");
    private final Player player;  //TODO add variable type
    private long numberToGuess; //TODO add variable type

    public Simulation(Player player) {
        //TODO implement me
        this.player = player;
    }

    public void initialize(long numberToGuess) {
        //TODO implement me
        this.numberToGuess = numberToGuess;
    }

    /**
     * @return true if the player have guessed the right number
     */


    private boolean nextRound() {
        //TODO implement me
        long numb = player.askNextGuess();
        if (numb == numberToGuess) {
            return true;
        } else {
            if (numb < numberToGuess) {
                player.respond(true);
                logger.log("\n");

            } else {
                player.respond(false);
                logger.log("\n");
            }
        }
        return false;
    }



    public void loopUntilPlayerSucceed(long RoundMax) {
        //TODO implement me

        long temps = System.currentTimeMillis();
        long round = 1;
        boolean stop = this.nextRound();
        while ((!stop) && (round < RoundMax)) {
            long RoundRestant=RoundMax-round;
            logger.log("IL VOUS RESTE  " + RoundRestant + " ESSAIES.");
            stop = this.nextRound();
            round++;
        }
        long duree = System.currentTimeMillis() - temps;
        if(stop) logger.log("win \nLe joueur a trouvé la solution "+numberToGuess+" ( en "+round+" essaies) avant la limite d'essaies ");
        else logger.log("lost \nLe joueur n' a pas trouvé la solution "+numberToGuess+" avant d'atteindre la limite d'essaies ( "+RoundMax+" essaies)");


        long secondes=duree/1000;
        long microSecondes= duree%1000;

        long minutes=secondes/60;
        secondes =  secondes%60;

        logger.log("\nTEMPS REALISE : "+minutes+" m, "+secondes+" s et "+microSecondes+" ms.");
    }
}
