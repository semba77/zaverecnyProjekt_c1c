public class Postava {
    private String jmeno;
    private int zivoty;
    private int level;
    private int damadge;
    private int xp;

    public String getJmeno() {
        return jmeno;
    }

    public void setJmeno(String jmeno) {
        this.jmeno = jmeno;
    }

    public int getZivoty() {
        return zivoty;
    }

    public void setZivoty(int zivoty) {
        this.zivoty = zivoty;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getDamadge() {
        return damadge;
    }

    public void setDamadge(int damadge) {
        this.damadge = damadge;
    }

    public int getXp() {
        return xp;
    }
    public void addXp(int xp) { this.xp += xp; }
    public void addLevel(int level) { this.level += level; }
    public void addDamadge(int damadge) { this.damadge += damadge; }

    public void setXp(int xp) {
        this.xp = xp;
    }

    public Postava(String jmeno, int zivoty, int level, int damadge, int xp) {
        this.jmeno = jmeno;
        this.zivoty = zivoty;
        this.level = level;
        this.damadge = damadge;
        this.xp = xp;
    }

    public boolean souboj(Postava nepritel){
        do {
            this.zivoty-= nepritel.getDamadge();
            nepritel.setZivoty(getZivoty()-this.damadge);
            if (nepritel.getZivoty()<0){
                nepritel.setZivoty(0);
        }

       }while(nepritel.getZivoty()>0 && this.zivoty>0);
       return this.zivoty>0;

    }

    @Override
    public String toString() {
        return "Postava{" +
                "jmeno='" + jmeno + '\'' +
                ", zivoty=" + zivoty +
                ", level=" + level +
                ", damadge=" + damadge +
                ", xp=" + xp +
                '}';
    }
}
