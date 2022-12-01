import java.util.ArrayList;

public class App {

    static ArrayList<Tiere> tier;
    public static void main(String[] args) throws Exception {
        setTier(new ArrayList<Tiere>());
        createAnimals();
        essbar(true);
        zeigeDaten(); 
        essbar(false);
        zeigeDaten();
    }

    public static void zeigeDaten(){
        //eine Methodenvariable i vom Typ Integer, wird deklariert und mit dem Wert 1 initialisiert (Zeile 13)
        int i = 1;
        for (Tiere tier : getTier()) {
            //System.out.println(tier);
            System.out.print(i+".");//unser Integer i wird verkettet mit der Kette . 
            tier.werBinich();
            i++;
        }
    }
    
    public static void createAnimals(){
        tier.add(new Insekten(2, "Wespe", 5, true));
        tier.add(new Insekten(3, "Fliege", 2, true));

        tier.add(new Raubtiere("Rot", "Fuchs", 10, true));
        tier.add(new Raubtiere("Schwarz", "Milas", 170, true));

        tier.add(new Vogel("Blau", "Spotttoelpel", 10, true));
        tier.add(new Vogel("Rot", "Spatz", 4, true));
    }
    public static void setTier(ArrayList<Tiere> tier) {
        App.tier = tier;
    }
    public static ArrayList<Tiere> getTier() {
        return tier;
    }

    public static void essbar(boolean Wert){
        
        for(Tiere tier : getTier()){
            tier.setEssbar(Wert);
        }        
    }

    
}
