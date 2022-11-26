/* Створити клас, який представляє навчальний клас ClassRoom.
Створіть клас учень Pupil. У тілі класу створіть методи void study(),
void read(), void write(), void relax().
Створіть 3 похідні класу ExcelentPupil, GoodPupil, BadPupil від класу базового класу Pupil
і перевизначте кожен із методів, залежно від успішності учня.
Конструктор класу ClassRoom приймає аргументи типу Pupil, клас має складатися із 4 учнів.
Передбачте можливість, що користувач може передати 2 або 3 аргументи.
Виведіть інформацію про те, як усі учні екземпляра класу ClassRoom вміють навчатися, читати, писати, відпочивати. */

package hw3.task1;

class ClassRoom {
    Pupil excellentPupil = new ExcellentPupil();
    Pupil goodPupil = new GoodPupil();
    Pupil badPupil = new BadPupil();

    public ClassRoom(Pupil excellentPupil, Pupil goodPupil, Pupil badPupil) {
        this.excellentPupil = excellentPupil;
        this.goodPupil = goodPupil;
        this.badPupil = badPupil;
    }

    public ClassRoom() {

    }

    public static void main(String[] args) {
    ClassRoom classRoom = new ClassRoom();
        System.out.println("----------------------------");
        System.out.println("----Bad Pupil: ");
        classRoom.badPupil.read();
        classRoom.badPupil.relax();
        classRoom.badPupil.study();
        classRoom.badPupil.write();
        System.out.println("----------------------------");
        System.out.println("----Good pupil: ");
        classRoom.goodPupil.write();
        classRoom.goodPupil.study();
        classRoom.goodPupil.read();
        classRoom.goodPupil.relax();
        System.out.println("----------------------------");
        System.out.println("----Excellent pupil");
        classRoom.excellentPupil.relax();
        classRoom.excellentPupil.read();
        classRoom.excellentPupil.study();
        classRoom.excellentPupil.write();
        System.out.println("----------------------------");
    }
}
