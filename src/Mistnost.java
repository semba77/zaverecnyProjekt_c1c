public class Mistnost {

    private String jmeno;
    private Mistnost dopredu;
    private Mistnost dozadu;
    private Mistnost doprava;
    private Mistnost doleva;
    private Postava nepritel;

    public String getJmeno() {
        return jmeno;
    }

    public void setJmeno(String jmeno) {
        this.jmeno = jmeno;
    }

    public boolean isDopredu() {
        return dopredu != null;
    }
    public boolean isDozadu() {
        return dozadu != null;
    }
    public boolean isDoprava() {
        return doprava != null;
    }
    public boolean isDoleva() { return doleva != null; }
    public boolean isNepritel() {  return nepritel != null; }

    public Mistnost getDopredu() { return dopredu; }

    public void setDopredu(Mistnost dopredu) {
        this.dopredu = dopredu;
    }

    public Mistnost getDozadu() {
        return dozadu;
    }

    public void setDozadu(Mistnost dozadu) {
        this.dozadu = dozadu;
    }

    public Mistnost getDoprava() { return doprava; }

    public void setDoprava(Mistnost doprava) { this.doprava = doprava; }

    public Mistnost getDoleva() { return doleva; }

    public void setDoleva(Mistnost doleva) { this.doleva = doleva; }

    public Postava getNepritel() {
        return nepritel;
    }

    public void setNepritel(Postava nepritel) {
        this.nepritel = nepritel;
    }

    @Override
    public String toString() {
        return "Mistnost{" +
                "jmeno='" + jmeno + '\'' + "nepritel='" + nepritel + '}';
    }

    public Mistnost(String jmeno) {
        this.jmeno = jmeno;
    }

    public Mistnost() {
        this.dopredu = null;
        this.dozadu = null;
        this.doleva = null;
        this.doprava = null;
        this.nepritel = null;

    }
    public void vytvorNepritele(String jmeno, int zivoty, int damadge,int level, int xp){
        nepritel= new Postava(jmeno, zivoty, damadge, level, xp);

    }
}
