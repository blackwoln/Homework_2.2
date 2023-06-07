public class Main {
    public static void main(String[] args) {

        GryffindorFaculty  harry = new GryffindorFaculty("Гарри", "Поттер", 12, 14, 15, 10, 11);
        GryffindorFaculty hermione = new GryffindorFaculty("Гермиона", "Грейнджер", 15, 11, 18, 7, 14);
        GryffindorFaculty ron = new GryffindorFaculty("Рон", "Уизли", 10, 11, 17, 12, 10);
        HufflepuffFaculty zachariah = new HufflepuffFaculty("Захария", "Смит", 11, 13, 16, 13, 12);
        HufflepuffFaculty cedric = new HufflepuffFaculty("Седрик", "Диггори", 14, 12, 16, 9, 13);
        HufflepuffFaculty justin = new HufflepuffFaculty("Джастин", "Финч-Флетчли", 11, 12, 15, 12, 14);
        RavenclawFaculty zhou = new RavenclawFaculty("Чжоу", "Чанг", 12, 14, 15, 10, 11, 14);
        RavenclawFaculty padma = new RavenclawFaculty("Падма", "Патил", 15, 11, 18, 7, 14, 13);
        RavenclawFaculty marcus = new RavenclawFaculty("Маркус", "Белби", 10, 11, 17, 12, 10,12);
        SlytherinFaculty draco = new SlytherinFaculty("Драко", "Малфой", 12, 14, 15, 10, 11, 14,11);
        SlytherinFaculty graham = new SlytherinFaculty("Грэхэм", "Монтегю", 15, 11, 18, 7, 14, 13,15);
        SlytherinFaculty gregory = new SlytherinFaculty("Грегори", "Гойл", 10, 11, 17, 12, 10,12,13);

        // Вывод в консоль учеников Гриффиндора
        System.out.println("Факультет Гриффиндор");
        GryffindorFaculty.print(harry);
        GryffindorFaculty.print(hermione);
        GryffindorFaculty.print(ron);
        System.out.println();

        // Вывод в консоль сравнения между двумя учениками Гриффиндора
        harry.compareGryffindor(ron);
        System.out.println();

        // Вывод в консоль учеников Пуффендуйя
        System.out.println("Факультет Пуффендуй");
        HufflepuffFaculty.print(zachariah);
        HufflepuffFaculty.print(cedric);
        HufflepuffFaculty.print(justin);
        System.out.println();

        // Вывод в консоль сравнения между двумя учениками Пуффендуйя
        zachariah.compareHufflepuff(cedric);
        System.out.println();

        //Вывод в консоль учеников Когтеврана
        System.out.println("Факультет Когтевран");
        RavenclawFaculty.print(zhou);
        RavenclawFaculty.print(padma);
        RavenclawFaculty.print(marcus);
        System.out.println();

        // Вывод в консоль сравнения между двумя учениками Когтеврана
        zhou.compareRavenclaw(padma);
        System.out.println();

        //Вывод в консоль учеников Слизерина
        System.out.println("Факультет Слизерин");
        SlytherinFaculty.print(draco);
        SlytherinFaculty.print(graham);
        SlytherinFaculty.print(gregory);
        System.out.println();

        // Вывод в консоль сравнения между двумя учениками Слизерина
        draco.compareSlytherin(graham);
        System.out.println();

        //Вывод в консоль сравнения между двумя учениками Хогвартса
        harry.compareHogwartsStudents(marcus);
    }
}