package Lab7;

import java.util.Scanner;

public class Test2
{
    public static void main(String[] args)
    {
        MathCal MathFunc = new MathFunc();
        Scanner input = new Scanner(System.in);
        System.out.println("Введите радиус окружности: ");
        int radious = input.nextInt();
        int lengthOfCircle =  (int)(2 *radious * MathFunc.getPI());

        System.out.println(String.format("Длина круга: %s", lengthOfCircle));
    }
}
