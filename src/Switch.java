import java.util.Scanner;

public class Switch {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введи возраст ");
        int age = scanner.nextInt();
        switch(age){
            case 0:
                System.out.println("Ты родился");
                break;
            case 7:
                System.out.println("Ты пошел в школу");
                break;
            case 18:
                System.out.println("Ты закончил школу");
                break;
            default:
                System.out.println("Ни одно из предыдущих условий не подошло");
        }
    }
}

//        if(age==10){
//            System.out.println("Ты школьник");
//        } else if(age==18){
//            System.out.println("Ты уже не школьник");
//        } else if()