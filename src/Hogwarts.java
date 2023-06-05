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
}
