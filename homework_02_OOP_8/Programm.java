public class Programm {
    public static void main(String[] args) {
        Building building = new Building(1000);
        Person person = new Person(200, 300);
        String string = new String("Tram Pam Pam");

        Render.printStatus(string);
        Render.printStatus(building);
        Render.printStatus(person);
        System.out.println();
        
        building.setHealthPoints(444);
        person.setHealthPoints(100);
        person.setTirednessPoints(111);
        Render.printStatus(building);
        Render.printStatus(person);
        System.out.println();

        building.setHealthPoints(222);
        person.setHealthPoints(10);
        person.setTirednessPoints(11);
        Render.printStatus(building);
        Render.printStatus(person);
        System.out.println();
    }
}