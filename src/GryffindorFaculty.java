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
}
