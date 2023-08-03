public class Person {
    String name ;
    int age;
    String gen;

    public Person(String name, int age, String gen) {
        this.name = name;
        this.age = age;
        this.gen = gen;
    }
    public static String vroslui (Person [] people){
        Person vzro = people[0];

        for (int i = 0; i < people.length; i++) {
            if (people[i].age > vzro.age){
                vzro=people[i];
            }
        }
        return vzro.name+" "+vzro.age +" года";

    }
    public static String mladshe (Person [] people){
        Person mlad = people[0];

        for (int i = 0; i < people.length; i++) {
            if (mlad.age>people[i].age){
                mlad=people[i];
            }
        }
        return mlad.name+" "+mlad.age +" лет";


}}
