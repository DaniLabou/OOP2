public class Main {
    public static void main(String[] args) {
        //Book book1 = new Book();
        //System.out.println(book1.showAutorAndTitle());
        //showIloveBooks();

        /*OOP object1 = new OOP();
        OOP object2 = new OOP();
        System.out.println(object1.x);
        object2.x=10;
        System.out.println(object2.x);*/

        /*Car bmw = new Car();
        Car volvo = new Car();
        volvo.culoare = "albastru";
        volvo.anDeFabricatie=2020;
        System.out.println(bmw.culoare+bmw.anDeFabricatie);
        System.out.println(volvo.culoare+volvo.anDeFabricatie);*/

        /*Persoana person1 = new Persoana();
        Persoana person2 = new Persoana("Maria","Ionescu");
        System.out.println("Nume: "+person2.nume+ " "+person2.prenume);
        System.out.println("Age: "+person2.age);
        System.out.println("Gen: "+person2.gen);
        Persoana person3 = new Persoana("Cristina","Barnutiu", 18, "f");
        System.out.println("Nume: "+person3.nume+ " "+person3.prenume);
        System.out.println("Age: "+person3.age);
        System.out.println("Gen: "+person3.gen);*/


        /*Animal animal1 = new Animal();
        System.out.println(animal1.nume);
        System.out.println("Nume: "+animal1.nume+ " "+animal1.culoare);
        animal1.culoare("Maro");

        Animal animal2 = new Animal();
        animal2.nume("Maimuta");*/




        /*Film avatar2 = new Film(false, "Avatar 2");
        Film motanulIncaltat= new Film(true, "Motanul Incaltat");
        Film unFilm = new Film();
        avatar2.afiseazaPentruCopii();
        motanulIncaltat.afiseazaPentruCopii();
        unFilm.afiseazaPentruCopii();*/


        /*Film film1 = new Film();
        film1.setTitlu("Avatar 2");
        film1.getTitlu();
        film1.rating = 7.9;
        film1.potrivitPtCopii = false;
        //Film.unText;

        film1.afiseazaDacaePotrivitPtCopii();
        System.out.println(film1.anProductie);

        Film film2 = new Film("Motanul incaltat 2", 2021,true);
        System.out.println(film2.rating);
        film2.afiseazaDacaePotrivitPtCopii();
        film2.rating = 8.0;

        System.out.println(film1.afiseazaRating());
        System.out.println(film2.afiseazaRating());

        System.out.println(Film.afisazaUnText());
        afiseaza2();



    }
    public static void afiseaza2(){
        System.out.println("Avatar 2");
    }*/
        Animal caine = new Animal("caine", "alb", false, 4);
        System.out.println(caine.nrPicioare);

        Animal papagal= new Animal("Papagal","galben",true,2);
        System.out.println(papagal.nrPicioare);

        Animal caracatita= new Animal("Caracatita","crem",false,8);
        System.out.println(caracatita.nrPicioare);

    }
}
