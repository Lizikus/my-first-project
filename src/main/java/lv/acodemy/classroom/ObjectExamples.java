package lv.acodemy.classroom;

public class ObjectExamples {
    public static void main(String[] args) {

        Cat barsik = new Cat("Barsik");
        System.out.println(barsik.getAge());
        barsik.getAge();

        System.out.println(barsik);

        barsik.setAge(4);
        System.out.println(barsik.getAge());

        barsik.speak();
        barsik.feed();

        System.out.println(barsik.getAge());
        barsik.getAge();

        barsik.getWeight();
        System.out.println(barsik);

        barsik.setWeight(2);
        System.out.println(barsik.getWeight());



        Cat teo = new Cat ("Teo", "White", "unknown", "female", true);

        teo.setAge(4);
        teo.setWeight(2);
        System.out.println(teo);


        System.out.printf("My cat name is: %s. My cat is %d years old.\n", teo.getName(), teo.getAge());

        teo.walk();
        teo.walk();
        teo.walk();
        teo.walk();
        teo.walk();
        teo.walk();
        teo.walk();
        System.out.println(teo.getCurrentEnergy());

        teo.feed();
        teo.feed();
        teo.feed();
        teo.feed();
        teo.feed();
        teo.feed();
        teo.feed();
        System.out.println(teo.getCurrentEnergy());


    }
}
