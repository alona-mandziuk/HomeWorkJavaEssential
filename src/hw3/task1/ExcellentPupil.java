package hw3.task1;

class ExcellentPupil extends Pupil {
    @Override
    void study() {
        super.study();
        System.out.println("Excellent!");
    }

    @Override
    void read() {
        super.read();
        System.out.println("Excellent!");
    }

    @Override
    void write() {
        super.write();
        System.out.println("Excellent!");
    }

    @Override
    void relax() {
        super.relax();
        System.out.println("Not enough.");
    }
}
