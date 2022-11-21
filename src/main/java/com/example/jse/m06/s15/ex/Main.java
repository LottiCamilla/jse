package com.example.jse.m06.s15.ex;

/**
 * Create a hierarchy of classes based on Actor
 * <p>
 * Warrior: could fight, can't do any magic
 * <p>
 * Wizard: can't fight, could do magic
 * 
 * <p>
 * In the main
 * <p>
 * Create a bunch of actors
 * <p>
 * Let them fight against each others
 * <p>
 * Peer-to-peer fight, the most skilled one wins
 * <p>
 * Wizards always beat warriors
 * <p>
 * In the end, let the user knows who survived
 */
public class Main {
    public static void main(String[] args) {
        // TODO: create actors, both warriors and wizards
        Actor[] actors = { new Warrior("warrior1", 90), new Wizard("wizard1", 150), new Wizard("wizard2", 350), new Warrior("warrior2", 110), new Wizard("wizard3", 300)};

        for (Actor actor : actors) {
            System.out.println(actor);
        }

        System.out.println("\nLet's fight ...");
        Actor winner = actors[0];
        for (Actor actor : actors) {
        	System.out.println(winner + " \tVS\t " + actor);
        	if (!winner.fight(actor)) {
        		winner = actor;
        	}
        }
        
//        for (int i = 1; i < actors.length; i++) {
//        	System.out.println(winner + " VS " + actors[i]);
//        	if (!winner.fight(actors[i])) {
//        		winner = actors[i];
//        	}
//        }
        System.out.println("\nIl vincitore è " + winner);
    }
}
