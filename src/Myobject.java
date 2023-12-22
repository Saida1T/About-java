public class Myobject {
    public void someMethod () {
        Anotherobject anotherobject = new Anotherobject();
        int sumResult = anotherobject.addNumbers(5,3);
        String greeting = anotherobject.getGreeting();
        System.out.println("Сумма чисел: " + sumResult);
        System.out.println("Приветствие: " + greeting);
}
}
