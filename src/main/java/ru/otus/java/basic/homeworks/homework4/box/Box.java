package ru.otus.java.basic.homeworks.homework4.box;

public class Box {
    private int size;
    private String color;
    private String[] items;
    private boolean isOpened;

    public Box(int size, String color) {
        this.size = size;
        this.color = color;
        items = new String[size];
    }

    public void open() {
        System.out.println("Коробка открыта");
        isOpened = true;
    }

    public void close() {
        System.out.println("Коробка закрыта");
        isOpened = false;
    }

    public void color() {
        System.out.println("цвет коробки: " + color);
    }

    public void setColor(String color) {
        this.color = color;
        System.out.println("Меням цвет коробки на " + color);
    }

    @Override
    public String toString() {
        return "Box{" + "Size Box = " + size + ", color='" + color + '\'' + ", Open Or Closed Box = " + isOpened + '}';
    }

    public void putItem(String item) {
        if (isOpened == false) {
            System.out.println("Коробка закрыта, для того что бы добавить в неё элемент для начала вам нужно открыть " + "коробку, воспользуйтесь методом: open()");
            return;
        }

        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {
                items[i] = item;
                System.out.println("Предмет успешно добавлен в коробку");
                return;
            }
        }

        System.out.println("Коробка переполненна для того что бы положить в неё предмет для начала выкините что нибудь.");
    }

    public void deleteItem(String item) {
        if (isOpened == false) {
            System.out.println("Коробка закрыта, для того что бы удалить из неё элемент для начала вам нужно открыть " + "коробку, воспользуйтесь методом: open()");
            return;
        }

        for (int i = 0; i < items.length; i++) {
            if (items[i].equals(item)) {
                items[i] = null;
                System.out.println("Предмет успешно удален из коробку");
                return;
            }
        }
    }
}