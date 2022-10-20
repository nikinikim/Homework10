public class Main {
    public static void main(String[] args) {
        task1_2();
        task3();
        task4_5();

    }
    public static void task1_2(){
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println(fullName);
        String fullNameUpper = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета - " + fullNameUpper);
    }
    public static void task3(){
        String fullName = "Иванов Семён Семёнович";
        String fullNameCorrect = fullName.replace('ё', 'е');
        System.out.println("Данные ФИО сотрудника - " + fullNameCorrect);
    }
    public static void task4_5(){
        String fullName = "ivanov ivan ivanovich";
        int value = fullName.indexOf('i', 2); // Поиск элементов. Чтобы искать с обратной стороны - lastIndexOf
        System.out.println(value); // Проверяем элемент
        String firstName = fullName.substring(7, 8).toUpperCase() + fullName.substring(8,11);
        String middleName = fullName.substring(12, 13).toUpperCase() + fullName.substring(13, 21);
        String lastName = fullName.substring(0, 1).toUpperCase() + fullName.substring(1,6);
        System.out.println("Имя сотрудника - " + firstName);
        System.out.println("Фамилия сотрудника - " + lastName);
        System.out.println("Отчество сотрудника - " + middleName);
    }

}