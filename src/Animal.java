public class Animal {
    String nume = "veverita";
    String culoare = "mov";
    boolean vegetarian = false;
    int nrPicioare = 2;

    public Animal() {
        this.nume = "unknown";
        this.culoare = "unknown";
        this.vegetarian = false;
    }

    public Animal(String nume) {
        this.nume = nume;
    }

    public Animal(String nume, String culoare) {
        this.nume = nume;
        this.culoare = culoare;
    }

    public Animal(String nume, String culoare, boolean vegetarian, int nrPicioare) {
        this.nume = nume;
        this.culoare = culoare;
        this.vegetarian = vegetarian;
        this.nrPicioare = nrPicioare;
    }

    public void mananca() {
        System.out.println(nume + " mananca");
    }

    public void doarme() {
        System.out.println(nume + " doarme");
    }


    public String afiseaza() {
        return (nume + " are culoarea " + culoare);
    }

    public void afiseazaNrPicioare() {
        if (nrPicioare == 0) {
            System.out.println(this.nume + " nu are picioare");
        } else if (nrPicioare == 2) {
            System.out.println(this.nume + " are 2 picioare");
        } else if (nrPicioare == 4) {
            System.out.println(this.nume + " are 4 picioare");
        } else {
            System.out.println(this.nume + " are o gramada de picioare");
        }
    }
    private String undeTraieste;

    public String getUndeTraieste() {
        return undeTraieste;
    }


    public void setUndeTraieste(String undeTraieste) {
        this.undeTraieste = undeTraieste;
    }
}




