package fr.dampierre;

import java.util.Random;

//Diagramme uml important 
public class Guerrier {
    // attribut toujours en private
    private int pv = 100;
    private double force = 10.0;
    // private Armure armure;
    private int vitesse = 5;
    private String nom = "Bernard";

    public void attaquer(Guerrier autre) {
        Random rand = new Random();
        int puissMoi = rand.nextInt((int) (force * vitesse));
        int puissAutre = rand.nextInt((int) (autre.force * autre.vitesse));
        if (puissMoi > puissAutre) {
            autre.pv = autre.pv - 10;
        } else {
            pv -= 10;
        }
    }

    public boolean estEnVie() {
        // if(pv > 0){
        // return true;
        // }
        // else{
        // return false;
        // }
        return pv > 0;
    }

    // public int getPv(){
    // return pv;
    // }
    // methode getPV est un getter à eviter!!

    public void afficherPv() {
        System.out.print(pv + " ");
    }

    public void initGuerrier(String leNom, double force, int vitesse) {
        nom   = leNom;
        //  ces lignes font la meme chose de maniere differrente priviligié this.
        this.force   = force;
        this.vitesse   = vitesse;
    }

}