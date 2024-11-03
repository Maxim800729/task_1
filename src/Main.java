//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

/* Задача 1: Месяц и количество дней
Напишите программу, которая принимает номер месяца (от 1 до 12) и выводит количество дней в этом месяце.
Учитывайте, что февраль может иметь 28 или 29 дней (не обязательно учитывать високосные годы для этой задачи).
Если введённое число не в диапазоне от 1 до 12, программа должна вывести сообщение об ошибке.
*/
                int month = 1;
                int days;
                switch (month){
                    case 1://Январь
                    case 3://март
                    case 5://май
                    case 7://июль
                    case 8://август
                    case 10://октябрь
                    case 12://декабрь
                        days=31;
                        break;
                    case 4://апрель
                    case 6://июнь
                    case 9://сентябрь
                    case 11://ноябрь
                        days = 30;
                        break;
                    case 2: //февраль
                        days=28;//обычный год}
                        break;
                    default:
                        System.out.println("Неправильный номер месяца");
                        return;}
                System.out.println("Количество дней в месяце:"+days);
        /* Задача 2: Перевод чисел в слова
        Напишите программу, которая принимает число от 0 до 9 и выводит его текстовое представление
        (например, 1 — "Один", 2 — "Два", и так далее до 9 — "Девять").
        Если введено число вне диапазона от 0 до 9, программа должна вывести сообщение об ошибке.*/

                int number=99;
                String text;
                switch (number){
                    case 0:
                        text = "Ноль";
                        break;
                    case 1:
                        text ="Один";
                        break;
                    case 2:
                        text = "два";
                        break;
                    case 3:
                        text ="Три";
                        break;
                    case 4:
                        text = "Четыре";
                        break;
                    case 5:
                        text ="пять";
                        break;
                    case 6:
                        text = "Шесть";
                        break;
                    case 7:
                        text ="Семь";
                        break;
                    case 8:
                        text = "Восемь";
                        break;
                    case 9:
                        text ="Девять";
                        break;
                    default:
                        text="Ошибка: число вне диапазона.";}
                System.out.println(text);
        /*Задача 3: Калькулятор для целых чисел
        Создайте программу, которая принимает два целых числа и оператор (+, -, *, /, %).
        В зависимости от введённого оператора программа должна выполнять соответствующую операцию над двумя числами.
        Если оператор неизвестен или деление на ноль, программа должна вывести сообщение об ошибке. */

                int number1 = 10;
                int number2 = 2;
                char operator = '+';
                int result;
                switch (operator) {
                    case '+':
                        result = number1 + number2;
                        break;
                    case '-':
                        result = number1 - number2;
                        break;
                    case '*':
                        result = number1 * number2;
                        break;
                    case '/':
                        result = number1 / number2;
                        if (number2 != 0) {
                            result = number1 / number2;
                        } else {
                            System.out.println("Ошибка деления на ноль.");
                            return;
                        }
                        break;
                    case '%':
                        if (number2 != 0) {
                            result = number1 % number2;
                        } else {
                            System.out.println("Ошибка деления на ноль.");
                            return;
                        }
                        break;
                    default:
                        System.out.println("Ошибка");
                        return;
                }
                System.out.println("Результат:"+ result);

        /* Задача 4: Определение части суток
         Напишите программу, которая принимает час в 24-часовом формате (от 0 до 23)
          и выводит часть суток, к которой относится это время:
          0-5: Ночь
          6-11: Утро
          12-17: День
          18-23: Вечер
        Если введённое число не в диапазоне от 0 до 23, программа должна вывести сообщение об ошибке.*/

                int hour = 2;
                if (hour <0||hour>23){
                    System.out.println("Ошибка");
                }
                else {
                    if (hour>=0 && hour<=5) {
                        System.out.println("Ночь");
                    }else if (hour>=6 && hour<=11) {
                        System.out.println("Утро");
                    }else if (hour>=12 && hour<=17) {
                        System.out.println("День");
                    }else {
                        System.out.println("Вечер");
                    }
                }
        /*Задача 5: Определение типа фигуры
        Напишите программу, которая принимает число от 3 до 6 и выводит название соответствующей геометрической фигуры:

        3 — Треугольник
        4 — Четырёхугольник
        5 — Пятиугольник
        6 — Шестиугольник
        Если введённое число не в диапазоне от 3 до 6, программа должна вывести сообщение об */

                int num = 9;
                switch (num){
                    case 3:
                        System.out.println("Треугольник");
                        break;
                    case 4:
                        System.out.println("Четырёхугольник");
                    case 5:
                        System.out.println("Пятиугольник");
                        break;
                    case 6:
                        System.out.println("Шестиугольник");
                        break;
                    default:
                        System.out.println("Ошибка");
                }

            }}

