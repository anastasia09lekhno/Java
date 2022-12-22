package Lab13;

public class Main2 {
    public static void main(String[] args)
    {
        Person A = new Person("Туженков");
        System.out.println(A.toString());
        Person B = new Person("Иванов","Дмитрий");
        System.out.println(B.toString());
        Person C = new Person("Дмитриев", "Иванов", "Сергеевич");
        System.out.println(C.toString());
    }
}
