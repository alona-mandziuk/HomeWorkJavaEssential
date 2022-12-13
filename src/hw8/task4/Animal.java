package hw8.task4;

import java.util.Objects;

class Animal {
    String name;
    int age;
    boolean tale;

    public Animal(String name, int age, boolean tale) {
        this.name = name;
        this.age = age;
        this.tale = tale;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return age == animal.age && tale == animal.tale && Objects.equals(name, animal.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, tale);
    }

    @Override
    public String toString() {
        if (tale == false){
            return "Name: " + name + ", age: " + age + ", tale: no.";
        }else return "Name: " + name + ", age: " + age + ", tale: yes.";
    }

    public static void main(String[] args) {
        Animal cat = new Animal("Vaska", 2, false);
        Animal dog = new Animal("Philip", 11, true);
        System.out.println("------------------------------------------");
        System.out.println("Cat:\n" + cat);
        System.out.println("hashCode: " + cat.hashCode());
        System.out.println("Dog:\n" + dog);
        System.out.println("hashCode: " + dog.hashCode());
        System.out.println("Cat == Dog? : " + cat.equals(dog));
        System.out.println("------------------------------------------");
    }
}
