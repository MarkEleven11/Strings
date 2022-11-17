public class Main {
    public static void main(String[] args) {
        ///Task 1
        System.out.println("Task 1");
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("ФИО сотрудника - " + fullName);

        ///Task 2
        System.out.println("Task 2");
        String fullname = fullName.toUpperCase();
        System.out.println("ФИО сотрудника - " + fullname);

        ///Task 3
        System.out.println("Task 3");
        String naming = "Иванов Семён Семёнович";
        naming = naming.replace("ё", "е");
        System.out.println(naming);


    }
}