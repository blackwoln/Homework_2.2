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
}
