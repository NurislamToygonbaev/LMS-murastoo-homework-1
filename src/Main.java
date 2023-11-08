public class Main {
    public static void main(String[] args) {
        Programmer programmer = new Programmer("Charli", "director", "Peaksoft");
        Dancer dancer = new Dancer("Asel","SMM", "Tik-Tok");
        Singer singer = new Singer("mirbek", "lider", "Biz tobu");

        System.out.println(programmer);
        System.out.println(programmer.learn() + programmer.coding());
        System.out.println(programmer.walk() + " in the park");
        System.out.println(programmer.eat() + " Shashlyk");

        System.out.println(dancer);
        System.out.println(dancer.learn() + dancer.dancing());
        System.out.println(dancer.walk() + " in the garden");
        System.out.println(dancer.eat() + " plov");

        System.out.println(singer);
        System.out.println(singer.learn() + singer.singing());
        System.out.println(singer.learn() + singer.playGitar());
        System.out.println(singer.walk() + " in the Restourant");
        System.out.println(singer.eat() + " Beh Barmak");
    }
}