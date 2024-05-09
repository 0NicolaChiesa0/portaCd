public class App {
    public static void main(String[] args) {
        PortaCD PortaCD1 = new PortaCD(5);

        CD cd1 = new CD("Album 1", "Artista 1", 12, 60);
        CD cd2 = new CD("Album 2", "Artista 2", 10, 50);
        CD cd3 = new CD("Album 3", "Artista 3", 8, 45);

        PortaCD PortaCD2 = new PortaCD(3);
        CD cd4 = new CD("Album 1", "Artista 1", 12, 60);
        CD cd5 = new CD("Album 3", "Artista 3", 8, 45);
        CD cd6 = new CD("Album 5", "Artista 23", 12, 620); 

        PortaCD2.setCD(0, cd4);
        PortaCD2.setCD(1, cd5);
        PortaCD2.setCD(2, cd6);

        String confrontoDurate1 = cd1.confrontaDurata(cd2);
        System.out.println(confrontoDurate1);

        String confrontoDurate2 = cd2.confrontaDurata(cd3);
        System.out.println(confrontoDurate2);

        String confrontoDurate3 = cd1.confrontaDurata(cd3);
        System.out.println(confrontoDurate3);

        if (cd2.compareDurata(cd3) == 0) {
            System.out.println("I CD " + cd2.getTitolo() + " e " + cd3.getTitolo() + " hanno la stessa durata.");
        }

        PortaCD1.setCD(0, cd1);
        PortaCD1.setCD(1, cd2);
        PortaCD1.setCD(2, cd3);

        System.out.println("CD presenti nella collezione:");
        System.out.println(PortaCD1);

        String titoloDaCercare = "Album 2";
        int posizione = PortaCD1.cercaCDPerTitolo(titoloDaCercare);
        if (posizione != -1) {
            System.out.println("Il CD '" + titoloDaCercare + "' si trova all'indice " + posizione + " della collezione.");
        } else {
            System.out.println("Il CD '" + titoloDaCercare + "' non è presente nella collezione.");
        }

        PortaCD PortaCD3 = new PortaCD(3);
        CD cd7 = new CD("Album 1", "Artista 1", 12, 60);
        CD cd8 = new CD("Album 3", "Artista 3", 8, 45);
        CD cd9 = new CD("Album 5", "Artista 23", 12, 620); 
        PortaCD3.setCD(0, cd7);
        PortaCD3.setCD(1, cd8);
        PortaCD3.setCD(2, cd9);

        int cdInComune = PortaCD1.confrontaCollezioneDischi(PortaCD2);
        System.out.println("Numero di CD in comune tra portaCD1 e portaCD2: " + cdInComune);

        String portaCDUguali = PortaCD1.confrontaInteraCollezione(PortaCD2);
        System.out.println(portaCDUguali);

        String portaCDUguali2 = PortaCD2.confrontaInteraCollezione(PortaCD3);
        System.out.println(portaCDUguali2);
    }
}
