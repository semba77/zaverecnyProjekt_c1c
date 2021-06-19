public class StavHry {
    private Mistnost prvniMistnost;
    private Mistnost aktualniMistnost;
    private Mistnost konecnaMistnost;
    private Postava hrdina;


    public StavHry(Mistnost prvniMistnost, Mistnost aktualniMistnost, Mistnost konecnaMistnost) {
        this.prvniMistnost = prvniMistnost;
        this.aktualniMistnost = aktualniMistnost;
        this.konecnaMistnost = konecnaMistnost;
    }

    public Mistnost getPrvniMistnost() {
        return prvniMistnost;
    }

    public void setPrvniMistnost(Mistnost prvniMistnost) {
        this.prvniMistnost = prvniMistnost;
    }

    public Mistnost getAktualniMistnost() {
        return aktualniMistnost;
    }

    public void setAktualniMistnost(Mistnost aktualniMistnost) {
        this.aktualniMistnost = aktualniMistnost;
    }

    public Mistnost getKonecnaMistnost() {
        return konecnaMistnost;
    }

    public void setKonecnaMistnost(Mistnost konecnaMistnost) {
        this.konecnaMistnost = konecnaMistnost;
    }

    public Postava getHrdina() {
        return hrdina;
    }

    public void vytvorMapu(){

        prvniMistnost=new Mistnost("prvni mistnost");
        konecnaMistnost= new Mistnost("poslední místnost");
        Mistnost druhaMistnost= new Mistnost("velká hala");
        Mistnost druhaMistnostNapravo= new Mistnost("zbrojnice");
        Mistnost druhaMistnostNalevo= new Mistnost("chodba");
        Mistnost druhaMistnostNalevo2= new Mistnost("chodba");
        Mistnost tretiMistnost= new Mistnost("jidelna");
        Mistnost tretiMistnostNalevo= new Mistnost("jidelna");
        Mistnost tretiMistnostNalevo2= new Mistnost("opuštěná kuchyně");
        Mistnost ctvrtaMistnost= new Mistnost("truní místnost");
        Mistnost ctvrtaMistnostNapravo= new Mistnost("chodba");
        Mistnost ctvrtaMistnostNapravo2= new Mistnost("pokladnice");
        prvniMistnost.setDopredu(druhaMistnost);
        druhaMistnost.setDopredu(tretiMistnost);
        druhaMistnost.setDozadu(prvniMistnost);
        druhaMistnost.setDoprava(druhaMistnostNapravo);
        druhaMistnost.setDoleva(druhaMistnostNalevo);
        druhaMistnostNapravo.setDoleva(druhaMistnost);
        druhaMistnostNalevo.setDoprava(druhaMistnost);
        druhaMistnostNalevo.setDoleva(druhaMistnostNalevo2);
        druhaMistnostNalevo2.setDoprava(druhaMistnostNalevo);
        druhaMistnostNalevo2.setDopredu(tretiMistnostNalevo2);
        tretiMistnost.setDopredu(ctvrtaMistnost);
        tretiMistnost.setDozadu(druhaMistnost);
        tretiMistnost.setDoleva(tretiMistnostNalevo);
        tretiMistnostNalevo.setDoprava(tretiMistnost);
        tretiMistnostNalevo.setDoleva(tretiMistnostNalevo2);
        tretiMistnostNalevo2.setDoprava(tretiMistnostNalevo);
        tretiMistnostNalevo2.setDozadu(druhaMistnostNalevo2);
        ctvrtaMistnost.setDozadu(tretiMistnost);
        ctvrtaMistnost.setDoprava(ctvrtaMistnostNapravo);
        ctvrtaMistnostNapravo.setDoleva(ctvrtaMistnost);
        ctvrtaMistnostNapravo.setDoprava(ctvrtaMistnostNapravo2);
        ctvrtaMistnostNapravo2.setDoleva(ctvrtaMistnostNapravo);
        ctvrtaMistnostNapravo2.setDozadu(konecnaMistnost);
        konecnaMistnost.setDopredu(ctvrtaMistnostNapravo2);
        aktualniMistnost=prvniMistnost;
        druhaMistnost.vytvorNepritele("kostlivec", 10, 1, 1, 0 );
        druhaMistnostNalevo2.vytvorNepritele("zombie", 10, 1, 1, 0);
        tretiMistnostNalevo.vytvorNepritele("zombie", 15, 1, 2, 0);
        ctvrtaMistnost.vytvorNepritele("pavouk", 10, 2, 2, 0);
        ctvrtaMistnostNapravo2.vytvorNepritele("kostlivec", 5, 3, 2, 0);
        vytvorHrdinu("postava1", 1, 30, 1, 0);

    }
    public void vytvorHrdinu(String jmeno, int level, int zivoty, int damadge, int xp){
        hrdina= new Postava(jmeno, zivoty, level, damadge, xp);

    }
    StavHry(){
        prvniMistnost= null;
        aktualniMistnost= null;
        konecnaMistnost= null;
    }

    @Override
    public String toString() {
        return "StavHry{" +
                "prvniMistnost=" + prvniMistnost +
                ", aktualniMistnost=" + aktualniMistnost +
                ", konecnaMistnost=" + konecnaMistnost +
                '}';
    }
}
