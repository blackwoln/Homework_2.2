public class RavenclawFaculty extends Hogwarts{
    private int smart;
    private int wise;
    private int witty;
    private int creativity;

    public RavenclawFaculty(String name, String surname, int levelWitchcraft, int levelTransgress, int smart,
                            int wise, int witty, int creativity) {
        super(name, surname, levelWitchcraft, levelTransgress);

        this.smart = smart;
        this.wise = wise;
        this.witty = witty;
        this.creativity = creativity;
    }

    public int getSmart() {
        return smart;
    }

    public int getWise() {
        return wise;
    }

    public int getWitty() {
        return witty;
    }

    public int getCreativity() {
        return creativity;
    }

    public void setSmart(int smart) {
        this.smart = smart;
    }

    public void setWise(int wise) {
        this.wise = wise;
    }

    public void setWitty(int witty) {
        this.witty = witty;
    }

    public void setCreativity(int creativity) {
        this.creativity = creativity;
    }

    // Метод, который выводит на экран описание студентов Когтеврана
    public static void print(RavenclawFaculty student) {
        System.out.println("Студент: " +student.getName()+ " " +student.getSurname() +
                " колдовство - " +student.getLevelWitchcraft()+ "; трансгрессия - "
                + student.getLevelTransgress()+ "; ум - " +student.getSmart() +
                "; мудрость - " +student.getWise()+ "; остроумие - " +student.getWitty() +
                "; творчество - " + student.getCreativity() + ".");
    }

    // Метод сравнения учеников Когтеврана
    public void compareRavenclaw(RavenclawFaculty student2) {
        int totalPoints1 = this.getSmart() + this.getWise() + this.getWitty() + this.getCreativity();
        int totalPoints2 = student2.getSmart() + student2.getWise() + student2.getWitty() + student2.getCreativity();

        if (totalPoints1 > totalPoints2) {
            System.out.println(this.getName() + " " + this.getSurname() + " является лучшим учеником.");
        } else if (totalPoints1 < totalPoints2) {
            System.out.println(student2.getName() + " " + student2.getSurname() + " является лучшим учеником.");
        } else {
            System.out.println("У обоих учеников одинаковое количество баллов.");
        }
    }
}
