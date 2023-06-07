public class SlytherinFaculty extends Hogwarts{
    int cunning;
    int determination;
    int ambition;
    int resourcefulness;
    int lustForPower;


    public SlytherinFaculty(String name, String surname, int levelWitchcraft, int levelTransgress, int cunning,
                            int determination, int ambition, int resourcefulness, int lustForPower) {

        super(name, surname, levelWitchcraft, levelTransgress);

        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;
    }

    public int getCunning() {
        return cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public int getLustForPower() {
        return lustForPower;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public void setLustForPower(int lustForPower) {
        this.lustForPower = lustForPower;
    }

    // Метод, который выводит на экран описание студентов Слизерина
    public static void print(SlytherinFaculty student) {
        System.out.println("Студент: " +student.getName()+ " " +student.getSurname() +
                " колдовство - " +student.getLevelWitchcraft()+ "; трансгрессия - "
                + student.getLevelTransgress()+ "; хитрость - " +student.getCunning() +
                ";решительность - " +student.getDetermination()+ "; амбициозность - " +student.getAmbition() +
                "; находчивость - " + student.getResourcefulness() + "; жажда власти - " +student.getLustForPower());
    }

    // Метод сравнения учеников Слизерина
    public void compareSlytherin(SlytherinFaculty student2) {
        int totalPoints1 = this.getCunning() + this.getDetermination() + this.getAmbition() + this.getResourcefulness() + this.getLustForPower();
        int totalPoints2 = student2.getCunning() + student2.getDetermination() + student2.getAmbition() + student2.getResourcefulness() + student2.getLustForPower();

        if (totalPoints1 > totalPoints2) {
            System.out.println(this.getName() + " " + this.getSurname() + " является лучшим учеником.");
        } else if (totalPoints1 < totalPoints2) {
            System.out.println(student2.getName() + " " + student2.getSurname() + " является лучшим учеником.");
        } else {
            System.out.println("У обоих учеников одинаковое количество баллов.");
        }
    }
}
