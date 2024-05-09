public class PortaCD {
    private CD dischi[];
    private int max_num_cd;

    public PortaCD() {
    }

    public PortaCD(int n) {
        max_num_cd = n;
        dischi = new CD[max_num_cd];
    }

    public CD getCD(int posizione) {
        if (posizione >= 0 && posizione < max_num_cd) {
            return dischi[posizione];
        } else {
            System.out.println("Posizione non valida.");
            return null;
        }
    }

    public void setCD(int posizione, CD cd) {
        if (posizione >= 0 && posizione < max_num_cd) {
            dischi[posizione] = cd;
        } else {
            System.out.println("Posizione non valida.");
        }
    }

    public void killCD(int posizione) {
        if (posizione >= 0 && posizione < max_num_cd) {
            dischi[posizione] = null;
        } else {
            System.out.println("Posizione non valida.");
        }
    }

    public int getNumMaxDischi() {
        return max_num_cd;
    }

    public int getN() {
        int count = 0;
        for (int i = 0; i < dischi.length; i++) {
            if (dischi[i] != null) {
                count++;
            }
        }
        return count;
    }

    public int cercaCDPerTitolo(String titolo) {
        for (int i = 0; i < dischi.length; i++) {
            if (dischi[i] != null && dischi[i].getTitolo().equals(titolo)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public String toString() {
        String s = "";
        for (int i = 0; i < dischi.length; i++) {
            if (dischi[i] != null) {
                s += dischi[i].getTitolo() + "\n";
            }
        }
        return s;
    }

    public int confrontaCollezioneDischi(PortaCD altraCollezione) {
        int conteggio = 0;
        for (int i = 0; i < dischi.length; i++) {
            if (dischi[i] != null && altraCollezione.cercaCDPerTitolo(dischi[i].getTitolo()) != -1) {
                conteggio++;
            }
        }
        return conteggio;

        /*
         * public int confrontaCollezione(PortaCD altraCollezione){
         * int conteggio = 0;
         * for(int i=0; i<max_num_cd;i++){
         * for(int j=0;j<altraCollezione.getNumMaxDischi(); j++){
         * if(dischi[i] != null && altraCollezione.getCD(j)!=null){
         * if(dischi[i].equals(altraCollezione.getCD(j))){
         * conteggio++;
         * }
         * }
         * }
         * }
         * return conteggio;
         * }
         */

    }

    public String confrontaInteraCollezione(PortaCD altraCollezione) {
        if (dischi.length != altraCollezione.dischi.length) {
            return "Sono diverse";
        }
    
        int i = 0;
        while (i < dischi.length) {
            if ((dischi[i] == null && altraCollezione.dischi[i] != null) ||
                (dischi[i] != null && !dischi[i].equals(altraCollezione.dischi[i]))) {
                return "Sono diverse";
            }
            i++;
        }
    
        return "Sono uguali";
    }
}
