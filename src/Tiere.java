public abstract class Tiere {
    String name;
    int groesse;
    boolean essbar;

    public Tiere(String name, int groesse, boolean essbar){
        setGroesse(groesse);
        setName(name);
        setEssbar(essbar);
    }

    public abstract void werBinich();

    public void setGroesse(int groesse) {
        this.groesse = groesse;
    }
    public int getGroesse() {
        return groesse;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public boolean isEssbar() {
        return essbar;
    }

    public void setEssbar(boolean essbar) {
        this.essbar = essbar;
    }
    

}
