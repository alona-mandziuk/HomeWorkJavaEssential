package hw6.task1;

enum Animal {
    LION(2), FOX(3), WOLF(1), PARROT(12);
    int age;

    Animal(int age) {
        this.age = age;
    }

@Override
    public String toString() {
        return "Animal: " + super.toString() + ", age: " + age + '.';
    }
}

class Main {


    public static void main(String[] args) {
        Animal animal1 = Animal.FOX;
        Animal animal2 = Animal.LION;
        Animal animal3 = Animal.WOLF;
        Animal animal4 = Animal.PARROT;
        System.out.println("------------------------");
        System.out.println("1-- " + animal1);
        System.out.println("2-- " + animal2);
        System.out.println("3-- " + animal3);
        System.out.println("4-- " + animal4);
        System.out.println("------------------------");
    }
}

