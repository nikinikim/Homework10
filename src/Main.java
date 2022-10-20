public class Main {
    public static void main(String[] args) {
        task1_2();
        task3();
        task4_5();
        task6();
        task7();

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
    public static void task6(){
          String one = "135";
          String two = "246";
          String oneTwo = one + two;
          StringBuilder sb = new StringBuilder();
          for (int i = 0; i < oneTwo.length(); i++) {
              if (i % 2 == 0){
                  sb.append(one.charAt(i / 2));
              }else{
                  sb.append(two.charAt(i / 2));
              }
          }
        String endingString = sb.toString();
        System.out.println("Данные строки - " + endingString);
    }

    public static void task7() {
        String random = "aabccddefgghiijjkk";
        int count = 1;
        char[] randomString = random.toCharArray();
        for (int i = 0; i < randomString.length; i++) {
            for (int j = i + 1; j < randomString.length; j++) {
                if (randomString[i] == randomString[j]){
                    System.out.print(randomString[j]);
                }
            }
        }
    }
}