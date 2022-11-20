/* Використовуючи IDEA, створіть проект із пакетом. Потрібно: Створити клас із ім'ям Address.
У тілі класу потрібно створити поля: index, country, city, street, house, apartment.
Для кожного поля створити метод з двома методами доступу (get, set) Створити екземпляр класу Address.
У поля екземпляра записати інформацію про поштову адресу. Виведіть на екран значення полів, що описують адресу.
 */

package hw1.task4;

public class Adress {
    int index;
    String country;
    String city;
    String street;
    String house;
    String apartment;

    public Adress(int index, String country, String city, String street, String house, String apartment) {
        this.index = index;
        this.country = country;
        this.city = city;
        this.street = street;
        this.house = house;
        this.apartment = apartment;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getHouse() {
        return house;
    }

    public void setHouse(String house) {
        this.house = house;
    }

    public String getApartment() {
        return apartment;
    }

    public void setApartment(String apartment) {
        this.apartment = apartment;
    }

    public static void main(String[] args) {
        Adress adress = new Adress(32301, "Ukraine", "Kamianets-Podolskyi",
                "Druzhbu narodiv", "7b", "57");
        System.out.println("------------------------------");
        System.out.println("Index: " + adress.getIndex());
        System.out.println("Coutry: " + adress.getCountry());
        System.out.println("City: " + adress.getCity());
        System.out.println("Street: " + adress.getStreet());
        System.out.println("House: " + adress.getHouse());
        System.out.println("Apartment: " + adress.getApartment());
        System.out.println("------------------------------");

    }
}
