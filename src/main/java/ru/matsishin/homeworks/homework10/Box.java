package ru.matsishin.homeworks.homework10;


public class Box {
    private int width;
    private int height;
    private int depth;
    private String color;
    private boolean isOpen;
    private String item;

    public Box(int width, int height, int depth, String color, boolean isOpen, String item) {
        this.width = width;
        this.height = height;
        this.depth = depth;
        this.color = color;
        this.isOpen = isOpen;
        this.item = item;
    }

    public void open() {
        this.isOpen = true;
        System.out.println("Коробка открыта");

    }

    public void close() {
        this.isOpen = false;
        System.out.println("Коробка закрыта");

    }

    public void repaint(String newColor) {
        this.color = newColor;
        System.out.println("Коробка перекрашена в " + newColor + " цвет");

    }

    public void put(String item) {
        if (this.item == null) {
            this.item = item;
            System.out.println("Предмет" + "," + item + "," + "помещен в коробку");
        } else {
            System.out.println("В коробке уже есть предмет");

        }

    }

    public void remove() {

        if (this.item != null) {

            this.item = null;

            System.out.println("Предмет удален из коробки");

        } else {

            System.out.println("В коробке нет предмета");

        }

    }


    public void Info() {

        System.out.println("Коробка:");

        System.out.println("Размеры: " + width + " x " + height + " x " + depth);

        System.out.println("Цвет: " + color);

        System.out.println("Состояние: " + (isOpen ? "открыта" : "закрыта"));

        System.out.println("Предмет: " + (item != null ? item : "отсутствует"));

    }

}


