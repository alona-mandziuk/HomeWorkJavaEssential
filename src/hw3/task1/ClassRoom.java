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
    Pupil pupil = new Pupil();

    ClassRoom(Pupil excellentPupil, Pupil goodPupil, Pupil badPupil) {
        this.excellentPupil = excellentPupil;
        this.goodPupil = goodPupil;
        this.badPupil = badPupil;
    }


    ClassRoom(Pupil excellentPupil, Pupil goodPupil, Pupil badPupil, Pupil pupil) {
        this.excellentPupil = excellentPupil;
        this.goodPupil = goodPupil;
        this.badPupil = badPupil;
        this.pupil = pupil;
    }

    ClassRoom(Pupil excellentPupil, Pupil goodPupil) {
        this.excellentPupil = excellentPupil;
        this.goodPupil = goodPupil;
    }

    public ClassRoom() {

    }

    public static void main(String[] args) {
        ClassRoom classRoom = new ClassRoom();
        System.out.println("----------------------------");
        System.out.println("----ClassRoom 1------");
        ClassRoom classRoom1 = new ClassRoom(classRoom.excellentPupil, classRoom.goodPupil, classRoom.goodPupil, classRoom.badPupil);
        System.out.println("----Excellent pupil");
        classRoom1.excellentPupil.relax();
        classRoom1.excellentPupil.read();
        classRoom1.excellentPupil.study();
        classRoom1.excellentPupil.write();
        System.out.println("----Good pupil: ");
        classRoom1.goodPupil.write();
        classRoom1.goodPupil.study();
        classRoom1.goodPupil.read();
        classRoom1.goodPupil.relax();
        System.out.println("----Bad Pupil: ");
        classRoom1.badPupil.read();
        classRoom1.badPupil.relax();
        classRoom1.badPupil.study();
        classRoom1.badPupil.write();
        System.out.println("----------------------------");
        System.out.println("----ClassRoom 2------");
        ClassRoom classRoom2 = new ClassRoom(classRoom.excellentPupil, classRoom.excellentPupil);
        System.out.println("----Excellent pupil");
        classRoom2.excellentPupil.relax();
        classRoom2.excellentPupil.read();
        classRoom2.excellentPupil.study();
        classRoom2.excellentPupil.write();

    }
}
