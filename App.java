import java.util.Scanner;

import Toy_shop.ToyShop;

public class App {
    public static void main(String[] args) {
        ToyShop toyShop = new ToyShop();

        toyShop.addToy(1, "мяч", 10, 15);
        toyShop.addToy(2, "кукла", 25, 25);
        toyShop.addToy(3, "машинка", 20, 25);
        toyShop.addToy(4, "зайчик", 15, 20);
        toyShop.addToy(5, "конструктор", 10, 10);
    
        Scanner scanner = new Scanner(System.in);
        int option;
        do {
            System.out.println("Выберете опцию: ");
            System.out.println("1. Добавить игрушку");
            System.out.println("2. Изменить вес игрушки");
            System.out.println("3. Розыгрыш игрушек");
            System.out.println("4. Выйти");

            option = scanner.nextInt();
            switch (option) {
                case 1:
                    System.out.println("Введите ID игрушки: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Введите название игрушки: ");
                    String name = scanner.nextLine();
                    System.out.println("Введите количество игрушек: ");
                    int quantity = scanner.nextInt();
                    System.err.println("Введите вес игрушки (в % от 100): ");
                    double weight = scanner.nextDouble();
                    toyShop.addToy(id, name, quantity, weight);
                    break;
                case 2:
                    System.out.println("Введите ID игрушки, у которой хотите изменить вес: ");
                    int toyId = scanner.nextInt();
                    System.out.println("Введите новый вес (в % от 100): ");
                    double newWeight = scanner.nextDouble();
                    toyShop.changeToyWeight(toyId, newWeight);
                    break;
                case 3:
                    toyShop.drawToys();
                    break;
                case 4:
                    System.out.println("Программа завершена.");
                    break;
                default:
                    System.out.println("Неверный ввод. Пожалуйста, выберете опцию из предложенных.");
                    break;
            }
        } while (option != 4);
        scanner.close();
    } 
}
