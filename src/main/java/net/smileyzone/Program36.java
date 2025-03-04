package net.smileyzone;

class Program36 {
    public static void main(String[] args) {

        Student one = new Student("Warren", 12345);
        Student two = new Student("Peace", 67890);
        Student three = new Student("Peace", 67890);

        System.out.println(one.toString(two));

        System.out.println(two.toString(three));


    }
}

