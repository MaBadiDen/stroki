public class Main {
    public static void main(String[] args) {
        String firstName, middleName, lastName, fullName;
        firstName = "Ivanov";
        middleName = "Ivan";
        lastName = "Ivanovich";
        fullName = firstName + " " + middleName + " " + lastName;
        System.out.println("ФИО сотрудника - " + fullName);

        String dlyaOtcheta = fullName.toUpperCase();

        System.out.println("ФИО сотрудника для отчета - " + dlyaOtcheta);
        String test = "Иванов Семён Семёнович";
        if(test.contains("ё")) {
            String newStr = test.replace('ё', 'е');
            System.out.println("Новая строка - " + newStr);
        }

    }
}