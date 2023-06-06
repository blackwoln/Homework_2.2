public class PrintService {

    public void print(GryffindorFaculty[] studentsGryffindor) {
        System.out.println("Кол-во студентов учащихся на факультете Гриффиндор: " + studentsGryffindor.length );
        for (int i = 0; i < studentsGryffindor.length; i++) {
            GryffindorFaculty gryffindorFaculty = studentsGryffindor[i];
            System.out.println("Студент: " +gryffindorFaculty.getName()+ " " +gryffindorFaculty.getSurname() +
                    " колдовство - " +gryffindorFaculty.getLevelWitchcraft()+ "; трансгрессия - "
                    + gryffindorFaculty.getLevelTransgress()+ "; благородство - " +gryffindorFaculty.getNobility() +
                    "; честь - " +gryffindorFaculty.getHonor()+ "; храбрость - " +gryffindorFaculty.getBravery() + "." );
        }
        System.out.println();
    }

    public void print(HufflepuffFaculty[] studentsHufflepuff) {
        System.out.println("Кол-во студентов учащихся на факультете Пуффендуй: " + studentsHufflepuff.length );
        for (int i = 0; i < studentsHufflepuff.length; i++) {
            HufflepuffFaculty hufflepuffFaculty = studentsHufflepuff[i];
            System.out.println("Студент: " +hufflepuffFaculty.getName()+ " " +hufflepuffFaculty.getSurname() +
                    " колдовство - " +hufflepuffFaculty.getLevelWitchcraft()+ "; трансгрессия - "
                    + hufflepuffFaculty.getLevelTransgress()+ "; трудолюбие - " +hufflepuffFaculty.getDiligence() +
                    "; верность - " +hufflepuffFaculty.getLoyalty()+ "; честность - " +hufflepuffFaculty.getHonesty() + "." );
        }
        System.out.println();
    }

    public void print(RavenclawFaculty[] studentsRavenclaw) {
        System.out.println("Кол-во студентов учащихся на факультете Когтевран: " + studentsRavenclaw.length );
        for (int i = 0; i < studentsRavenclaw.length; i++) {
            RavenclawFaculty ravenclawFaculty = studentsRavenclaw[i];
            System.out.println("Студент: " +ravenclawFaculty.getName()+ " " +ravenclawFaculty.getSurname() +
                    " колдовство - " +ravenclawFaculty.getLevelWitchcraft()+ "; трансгрессия - "
                    + ravenclawFaculty.getLevelTransgress()+ "; ум - " +ravenclawFaculty.getSmart() +
                    "; мудрость - " +ravenclawFaculty.getWise()+ "; остроумие - " +ravenclawFaculty.getWitty() +
                    "; творчество - " + ravenclawFaculty.getCreativity() + ".");
        }
        System.out.println();
    }

    public void print(SlytherinFaculty[] studentsSlytherin) {
        System.out.println("Кол-во студентов учащихся на факультете Слизерин: " + studentsSlytherin.length );
        for (int i = 0; i < studentsSlytherin.length; i++) {
            SlytherinFaculty slytherinFaculty = studentsSlytherin[i];
            System.out.println("Студент: " +slytherinFaculty.getName()+ " " +slytherinFaculty.getSurname() +
                    " колдовство - " +slytherinFaculty.getLevelWitchcraft()+ "; трансгрессия - "
                    + slytherinFaculty.getLevelTransgress()+ "; хитрость - " +slytherinFaculty.getCunning() +
                    ";решительность - " +slytherinFaculty.getDetermination()+ "; амбициозность - " +slytherinFaculty.getAmbition() +
                    "; находчивость - " + slytherinFaculty.getResourcefulness() + "; жажда власти - " +slytherinFaculty.getLustForPower());
        }
        System.out.println();
    }
}
