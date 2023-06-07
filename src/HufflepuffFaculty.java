public class HufflepuffFaculty extends Hogwarts {
    private int diligence;
    private int loyalty;
    private int honesty;


    public HufflepuffFaculty(String name, String surname, int levelWitchcraft, int levelTransgress, int diligence,
                             int loyalty, int honesty) {

        super(name, surname, levelWitchcraft, levelTransgress);

        this.diligence = diligence;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getDiligence() {
        return diligence;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setDiligence(int diligence) {
        this.diligence = diligence;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }

    // Метод, который выводит на экран описание студентов Пуффендуйя
    public static void print(HufflepuffFaculty student) {
        System.out.println("Студент: " +student.getName()+ " " +student.getSurname() +
                " колдовство - " +student.getLevelWitchcraft()+ "; трансгрессия - "
                + student.getLevelTransgress()+ "; трудолюбие - " +student.getDiligence() +
                "; верность - " +student.getLoyalty()+ "; честность - " +student.getHonesty() + "." );
    }

    // Метод сравнения учеников Пуффендуйя
    public void compareHufflepuff(HufflepuffFaculty student2) {
        int totalPoints1 = this.getDiligence() + this.getLoyalty() + this.getHonesty();
        int totalPoints2 = student2.getDiligence() + student2.getLoyalty() + student2.getHonesty();

        if (totalPoints1 > totalPoints2) {
            System.out.println(this.getName() + " " + this.getSurname() + " является лучшим учеником.");
        } else if (totalPoints1 < totalPoints2) {
            System.out.println(student2.getName() + " " + student2.getSurname() + " является лучшим учеником.");
        } else {
            System.out.println("У обоих учеников одинаковое количество баллов.");
        }
    }
}
