package net.smileyzone;

class Program37 {
    public static void main(String[] args) {

        Employee one = new Employee("Warren", "123-56-9080", 56785.00, 1995);
        Employee two = new Employee("Peace", "098-99-4345", 77987.00, 1987);
        Employee three = new Employee("Peace", "098-99-4345", 77987.00, 1987);

        System.out.println(one.toString(two));
        System.out.println(two.toString(three));

    }
}

