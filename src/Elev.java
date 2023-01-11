public class Elev {
    //individual pt fiecare elev
    public String nume;
    //comun pentru toti elevii; de aia ii static
    public static String diriginte;

    public Elev(String nume) {
        this.nume = nume;
    }
    public void afisazaElevDiriginte(){
        System.out.println(this.nume+" are ca diriginte pe "+diriginte);
    }
}
