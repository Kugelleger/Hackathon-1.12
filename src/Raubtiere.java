public class Raubtiere extends Tiere {
    String fellfarbe;

    public Raubtiere(String fellfarbe, String name, int groesse, boolean essbar){
    super(name, groesse, essbar);
    setFellfarbe(fellfarbe);


    }

    public void werBinich(){
        System.out.println(getName()+ "" + getGroesse()+ "" + getFellfarbe()+ "" + essbar);
    }
    public void setFellfarbe(String fellfarbe) {
        this.fellfarbe = fellfarbe;
    }
    public String getFellfarbe() {
        return fellfarbe;
    }

}
