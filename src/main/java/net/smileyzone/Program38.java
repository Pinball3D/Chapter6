package net.smileyzone;

class Program38 {
    public static void main(String[] args) {

        Truck one = new Truck("Ford", "Jimmy", 6, 3000.0, 7800.0);
        Truck two = new Truck("Honda", "Amel", 4, 2500.0, 2000.0);
        Truck three = new Truck("Ford", "Jimmy", 6, 3000.0, 7800.0);

        System.out.println(one.toString(two));

        System.out.println(one.toString(three));
    }
}

