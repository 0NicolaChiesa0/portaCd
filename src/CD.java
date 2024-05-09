public class CD {
    private String titolo;
    private String autore;
    private int brani;
    private int durata;

    public CD(String titolo, String autore, int brani, int durata) {
        this.titolo = titolo;
        this.autore = autore;
        this.brani = brani;
        this.durata = durata;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public String getAutore() {
        return autore;
    }

    public void setAutore(String autore) {
        this.autore = autore;
    }

    public int getBrani() {
        return brani;
    }

    public void setBrani(int brani) {
        this.brani = brani;
    }

    public int getDurata() {
        return durata;
    }

    public void setDurata(int durata) {
        this.durata = durata;
    }

    @Override
    public String toString() {
        String s = "Titolo: " + titolo + " Autore: " + autore + " Brani: " + brani + " Durata: " + durata;
        return s;
    }

    public int compareDurata(CD cd) {
        if (this.durata > cd.getDurata()) {
            return 1;
        } else if (this.durata < cd.getDurata()) {
            return -1;
        } else {
            return 0;
        }
    }

    public String confrontaDurata(CD altroCD) {
        int confronto = this.compareDurata(altroCD);
        if (confronto > 0) {
            return this.titolo + " ha una durata maggiore di " + altroCD.getTitolo();
        } else if (confronto < 0) {
            return altroCD.getTitolo() + " ha una durata maggiore di " + this.titolo;
        } else {
            return this.titolo + " e " + altroCD.getTitolo() + " hanno la stessa durata.";
        }
    }

    public boolean equals(CD altroCd){
        return this.titolo.equals(altroCd.getTitolo())&&
        this.autore.equals(altroCd.getAutore())&&
        this.brani==altroCd.getBrani()&&
        this.durata==altroCd.getDurata();
    }
}
