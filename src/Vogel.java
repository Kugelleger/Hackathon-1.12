public class Vogel extends Tiere {
    String federFarbe;

    public Vogel(String federFarbe, String name, int groesse, boolean essbar){
        super(name, groesse, essbar);
        setFederFarbe(federFarbe);
    }

    public void werBinich(){
        System.out.println(getName()+ "" + getGroesse()+ "" + getFederFarbe()+ "" + essbar);
    }

    public void setFederFarbe(String federFarbe) {
        this.federFarbe = federFarbe;
    }
    public String getFederFarbe() {
        return federFarbe;
    }

    
}
