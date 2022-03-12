public class Main {
    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();
        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1,1);
        int c = calc.devide.apply(a, b);
        calc.println.accept(c);

        /*
        Код неработает из-за ArithmeticException: деление на ноль в 6 строке
        Чтоб ошика не возникала нужно переписать строку 8 кода в классе Calculator
        Добавим проверку делителя перед выполнением операции. В случае нулевого делителя возвращаем 0
         */
    }
}
