public class GryffindorFaculty extends Hogwarts {
    private int nobility;
    private int honor;
    private int bravery;

    public GryffindorFaculty(String name, String surname, int levelWitchcraft, int levelTransgress, int nobility,
                             int honor, int bravery) {

        super(name, surname, levelWitchcraft, levelTransgress);

        this.nobility = bravery;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public int getHonor() {
        return honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

    // Метод, который выводит на экран описание студентов Гриффиндора
    public static void print(GryffindorFaculty student) {
        System.out.println("Студент: " +student.getName()+ " " +student.getSurname() +
                " колдовство - " +student.getLevelWitchcraft()+ "; трансгрессия - "
                + student.getLevelTransgress()+ "; благородство - " +student.getNobility() +
                "; честь - " +student.getHonor()+ "; храбрость - " +student.getBravery() + "." );
    }

    // Метод сравнения учеников Гриффиндора
    public void compareGryffindor(GryffindorFaculty student2) {
        int totalPoints1 = this.getHonor() + this.getBravery();
        int totalPoints2 = student2.getHonor() + student2.getBravery();

        if (totalPoints1 > totalPoints2) {
            System.out.println(this.getName() + " " + this.getSurname() + " является лучшим учеником.");
        } else if (totalPoints1 < totalPoints2) {
            System.out.println(student2.getName() + " " + student2.getSurname() + " является лучшим учеником.");
        } else {
            System.out.println("У обоих учеников одинаковое количество баллов.");
        }
    }
}
