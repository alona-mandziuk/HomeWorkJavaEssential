package hw3.task1;

class GoodPupil extends Pupil {
    @Override
    void study() {
        super.study();
        System.out.println("Good.");
    }

    @Override
    void read() {
        super.study();
        System.out.println("Good.");
    }

    @Override
    void write() {
        super.write();
        System.out.println("Good.");
    }

    @Override
    void relax() {
        super.relax();
        System.out.println("Good.");
    }
}
