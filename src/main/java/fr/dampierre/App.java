package fr.dampierre;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * 
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {

        int victoireg1 = 0;
        int victoireg2 = 0;
        int nbDeCombats = 10000;
        for (int i = 0; i < nbDeCombats; i++) {
            Guerrier g1 = new Guerrier();
            g1.initGuerrier("eca", 8, 10);
            Guerrier g2 = new Guerrier();
            g2.initGuerrier("iop", 8, 10);
            while (g1.estEnVie() && g2.estEnVie()) {
                g1.attaquer(g2);
                // System.out.println(g1.getPv()+" "+g2.getPv());
                // g1.afficherPv();
                // g2.afficherPv();
                // System.out.println();
            }
            if (g1.estEnVie()) {
                victoireg1 = victoireg1 + 1;
            } else if (g2.estEnVie()) {
                victoireg2 = victoireg2 + 1;
            }

        }
        System.out.println("Le guerrier 1 a gagné : " + victoireg1 + " fois.");
        System.out.println("Le guerrier 2 a gagné : " + victoireg2 + " fois.");
    }
}
