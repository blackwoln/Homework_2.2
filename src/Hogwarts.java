public class Hogwarts {
     private String name;
     private String surname;
     private int levelWitchcraft;
     private int levelTransgress;

    public Hogwarts(String name, String surname, int levelWitchcraft, int levelTransgress) {
        this.name = name;
        this.surname = surname;
        this.levelWitchcraft = levelWitchcraft;
        this.levelTransgress = levelTransgress;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getLevelWitchcraft() {
        return levelWitchcraft;
    }

    public int getLevelTransgress() {
        return levelTransgress;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setLevelWitchcraft(int levelWitchcraft) {
        this.levelWitchcraft = levelWitchcraft;
    }

    public void setLevelTransgress(int levelTransgress) {
        this.levelTransgress = levelTransgress;
    }

    // Метод сравнения учеников Хогвартса
    public void compareHogwartsStudents(Hogwarts student2) {
        int totalPoints1 = this.getLevelWitchcraft() + this.getLevelTransgress();
        int totalPoints2 = student2.getLevelWitchcraft() + student2.getLevelTransgress();

        if (totalPoints1 > totalPoints2) {
            System.out.println(this.getName() + " " + this.getSurname() + " имеет большую сумму показателей, чем " +
                    student2.getName() + " " + student2.getSurname() + ".");
        } else if (totalPoints1 < totalPoints2) {
            System.out.println(student2.getName() + " " + student2.getSurname() + " имеет большую сумму показателей, чем " +
                    this.getName() + " " + this.getSurname() + ".");
        } else {
            System.out.println(this.getName() + " " + this.getSurname() + " и " +
                    student2.getName() + " " + student2.getSurname() + " имеют одинаковую сумму показателей.");
        }
    }
}
