public class Insekten extends Tiere {
    int anzahlFluegel;

    public Insekten(int anzahlFluegel, String name, int groesse, boolean essbar){
        super(name, groesse, essbar);
        setAnzahlFluegel(anzahlFluegel);

       
    }

    public void werBinich(){
        System.out.println(getName()+ "" + getGroesse()+ "" + getAnzahlFluegel()+ "" + essbar);
    }
    public void setAnzahlFluegel(int anzahlFluegel) {
        this.anzahlFluegel = anzahlFluegel;
    }
    public int getAnzahlFluegel() {
        return anzahlFluegel;
    }
    
}
