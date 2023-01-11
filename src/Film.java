public class Film {
    public boolean pentruCopii;
    public String nume;
   private String titlu;
    int anProductie;
    double rating;
    boolean potrivitPtCopii;


    public static String unText = "Toate filmele sunt frumoase";

    /*Film(){
        this.pentruCopii = false;
        this.nume = "unknown";*/
    public String getTitlu(){
        return titlu;
        }

    /*Film(boolean pentruCopii,String nume){
        this.pentruCopii=pentruCopii;
        this.nume = nume;*/
    public void setTitlu(String titlu){
        this.titlu = titlu;
        }



    public Film(){
        this.titlu="unknown";
        this.anProductie = 2000;
        this.rating= 10;
        this.potrivitPtCopii= false;
        System.out.println("Primul constructor e apelat");
    }

    /*public void afiseazaPentruCopii(){
        if (pentruCopii){
            System.out.println(this.nume+" e film potrivit pentru copii");
        }*/

    public Film(String titlu, int anProductie, boolean potrivitPtCopii) {
        this.titlu = titlu;
        this.anProductie = anProductie;
        this.potrivitPtCopii = potrivitPtCopii;
    }

    public void afiseazaDacaePotrivitPtCopii(){
        if (this.potrivitPtCopii){
            System.out.println(this.titlu+" e potrivit pentru copii");
        }
        else {
            System.out.println(this.nume+" nu e potrivit pentru copii");
        }
       /* else {
            System.out.println(this.titlu+" nu e potrivir pentru copii");
        }*/
    }

    public String afiseazaRating(){
        return (this.titlu+" Are rating "+this.rating);
    }

    public static String afisazaUnText(){
        return (unText);
    }

}

