public class Main {
    public static void main(String[] args) {

        GryffindorFaculty[] studentsGryffindor = {
                new GryffindorFaculty("Гарри", "Поттер", 12, 14, 15, 10, 11),
                new GryffindorFaculty("Гермиона", "Грейнджер", 15, 11, 18, 7, 14),
                new GryffindorFaculty("Рон", "Уизли", 10, 11, 17, 12, 10)
        };

        HufflepuffFaculty[] studentsHufflepuff = {
                new HufflepuffFaculty("Захария", "Смит", 11, 13, 16, 13, 12),
                new HufflepuffFaculty("Седрик", "Диггори", 14, 12, 16, 9, 13),
                new HufflepuffFaculty("Джастин", "Финч-Флетчли", 11, 12, 15, 12, 14)
        };

        RavenclawFaculty[] studentsRavenclaw = {
                new RavenclawFaculty("Чжоу", "Чанг", 12, 14, 15, 10, 11, 14),
                new RavenclawFaculty("Падма", "Патил", 15, 11, 18, 7, 14, 13),
                new RavenclawFaculty("Маркус", "Белби", 10, 11, 17, 12, 10,12)
        };

        SlytherinFaculty[] studentsSlytherin = {
                new SlytherinFaculty("Драко", "Малфой", 12, 14, 15, 10, 11, 14,11),
                new SlytherinFaculty("Грэхэм", "Монтегю", 15, 11, 18, 7, 14, 13,15),
                new SlytherinFaculty("Грегори", "Гойл", 10, 11, 17, 12, 10,12,13)
        };

        PrintService printService = new PrintService();
        printService.print(studentsGryffindor);
        printService.print(studentsHufflepuff);
        printService.print(studentsRavenclaw);
        printService.print(studentsSlytherin);
    }
}