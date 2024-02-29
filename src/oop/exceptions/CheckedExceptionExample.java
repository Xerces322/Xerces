package oop.exceptions;

public class CheckedExceptionExample {
    public static void main(String[] args) throws Exception{
        System.out.println(1/0);
        throw new Exception("ой это ошибка");
    }
}
