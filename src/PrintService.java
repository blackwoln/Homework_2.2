public class PrintService {

    // Метод, который выводит на экран описание студентов Гриффиндора
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

    // Метод сравнения учеников Гриффиндора
    public static void compareGryffindorStudents(GryffindorFaculty[] studentsGryffindor) {
        GryffindorFaculty bestStudent = studentsGryffindor[0];
        int maxPoints = calculatePointsGryffindor(bestStudent);

        for (int i = 1; i < studentsGryffindor.length; i++) {
            GryffindorFaculty student = studentsGryffindor[i];
            int points = calculatePointsGryffindor(student);

            if (points > maxPoints) {
                maxPoints = points;
                bestStudent = student;
            }
        }

        System.out.println("Лучший ученик Гриффиндора: " + bestStudent.getName() + " " + bestStudent.getSurname());
        System.out.println();
    }

    // Метод суммирования баллов ученика Гриффиндора
    private static int calculatePointsGryffindor(GryffindorFaculty student) {
        return student.getNobility() + student.getHonor() + student.getBravery();
    }


    // Метод, который выводит на экран описание студентов Пуффендуйя
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

//    Метод сравнения учеников Пуффендуйя
    public static void compareHufflepuffStudents(HufflepuffFaculty[] studentsHufflepuff) {
        HufflepuffFaculty bestStudent = studentsHufflepuff[0];
        int maxPoints = calculatePointsHufflepuff(bestStudent);

        for (int i = 1; i < studentsHufflepuff.length; i++) {
            HufflepuffFaculty student = studentsHufflepuff[i];
            int points = calculatePointsHufflepuff(student);

            if (points > maxPoints) {
                maxPoints = points;
                bestStudent = student;
            }
        }

        System.out.println("Лучший ученик Пуффендуйа: " + bestStudent.getName() + " " + bestStudent.getSurname());
        System.out.println();
    }

    // Метод суммирования баллов ученика Пуффендуйя
    private static int calculatePointsHufflepuff(HufflepuffFaculty student) {
        return  student.getDiligence() + student.getLoyalty() + student.getHonesty();
    }



    // Метод, который выводит на экран описание студентов Когтеврана
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

    // Метод сравнения учеников Когтеврана
    public static void compareRavenclawStudents(RavenclawFaculty[] studentsRavenclaw) {
        RavenclawFaculty bestStudent = studentsRavenclaw[0];
        int maxPoints = calculatePointsRavenclaw(bestStudent);

        for (int i = 1; i < studentsRavenclaw.length; i++) {
            RavenclawFaculty student = studentsRavenclaw[i];
            int points = calculatePointsRavenclaw(student);

            if (points > maxPoints) {
                maxPoints = points;
                bestStudent = student;
            }
        }

        System.out.println("Лучший ученик Когтеврана: " + bestStudent.getName() + " " + bestStudent.getSurname());
        System.out.println();
    }

    // Метод суммирования баллов ученика Когтеврана
    private static int calculatePointsRavenclaw(RavenclawFaculty student) {
        return student.getSmart() + student.getWise()
                + student.getWitty() + student.getCreativity();
    }

    // Метод, который выводит на экран описание студентов Слизерина
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

    // Метод сравнения учеников Слизерина
    public static void compareSlytherinStudents(SlytherinFaculty[] studentsSlytherin) {
        SlytherinFaculty bestStudent = studentsSlytherin[0];
        int maxPoints = calculatePointsSlytherin(bestStudent);

        for (int i = 1; i < studentsSlytherin.length; i++) {
            SlytherinFaculty student = studentsSlytherin[i];
            int points = calculatePointsSlytherin(student);

            if (points > maxPoints) {
                maxPoints = points;
                bestStudent = student;
            }
        }
        System.out.println("Лучший ученик Слизерина: " + bestStudent.getName() + " " + bestStudent.getSurname());
        System.out.println();
    }

    // Метод суммирования баллов ученика Слизерина
    private static int calculatePointsSlytherin(SlytherinFaculty student) {
        return student.getCunning() + student.getDetermination()
                + student.getAmbition() + student.getResourcefulness() + student.getLustForPower();
    }

    public static void compareHogwartsStudents(Hogwarts[] studentsHogwart) {
        Hogwarts bestStudent = studentsHogwart[0];
        int maxPoints = calculatePointsHogwarts(bestStudent);

        for (int i = 0; i < studentsHogwart.length; i++) {
            Hogwarts student = studentsHogwart[i];
            int points = calculatePointsHogwarts(student);

            if (points > maxPoints) {
                maxPoints = points;
                bestStudent = student;
            }
        }
        System.out.println("Лучший ученик Хогвартса: " + bestStudent.getName() + " " + bestStudent.getSurname());
    }

    private static int calculatePointsHogwarts(Hogwarts student) {
        return student.getLevelTransgress() + student.getLevelWitchcraft();
    }
}
