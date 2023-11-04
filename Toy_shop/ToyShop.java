package Toy_shop;

import java.util.ArrayList;
import java.util.List;

public class ToyShop {
    private List<Toys> toys = new ArrayList<>();

    public void addToy(int id, String name, int quantity, double weight) {
        toys.add(new Toys(id, name, quantity, weight));
    }

    public void changeToyWeight(int toyId, double newWeight) {
        for (Toys toy : toys) {
            if (toy.getId() == toyId) {
                toy.setWeight(newWeight);
                return;
            }
        }
        System.out.println("Игрушка с ID " + toyId + " не найдена.");
    }

    public void drawToys() {
        double totalWeight = 0;
        for (Toys toy : toys) {
            totalWeight += toy.getWeight();
        }

        double randomValue = Math.random() * totalWeight;
        double currentWeight = 0;

        for (Toys toy : toys) {
            currentWeight += toy.getWeight();
            if (randomValue <= currentWeight) {
                System.out.println("Поздравляем! Вы выиграли игрушку: " + toy.getName());
                return;
            }
        }
    }
}
