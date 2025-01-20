package ru.otus.java.basic.homeworks.homework4.box;

public class Box {
    private int size;
    private String color;
    private String[] sizeBox;
    private boolean openOrClosed;

    public Box(int size, String color) {
        this.size = size;
        this.color = color;
        sizeBox = new String[size];
    }

    public void openBox() {
        System.out.println("Коробка открыта");
        openOrClosed = true;
    }

    public void closeBox() {
        System.out.println("Коробка закрыта");
        openOrClosed = false;
    }

    public void colorBox() {
        System.out.println("цвет коробки: " + color);
    }

    public void setColor(String color) {
        this.color = color;
        System.out.println("Меням цвет коробки на " + color);
    }

    @Override
    public String toString() {
        return "Box{" + "Size Box = " + size + ", color='" + color + '\'' + ", Open Or Closed Box = " + openOrClosed + '}';
    }

    public void putTheItemInTheBox(String item) {
        if (openOrClosed == false) {
            System.out.println("Коробка закрыта, для того что бы добавить в неё элемент для начала вам нужно открыть " + "коробку, воспользуйтесь методом: openBox()");
            return;
        }

        for (int i = 0; i < sizeBox.length; i++) {
            if (sizeBox[i] == null) {
                sizeBox[i] = item;
                System.out.println("Предмет успешно добавлен в коробку");
                return;
            }
        }

        System.out.println("Коробка переполненна для того что бы положить в неё предмет для начала выкините что нибудь.");
    }

    public void deleteTheItemInTheBox(String item) {
        if (openOrClosed == false) {
            System.out.println("Коробка закрыта, для того что бы удалить из неё элемент для начала вам нужно открыть " + "коробку, воспользуйтесь методом: openBox()");
            return;
        }

        for (int i = 0; i < sizeBox.length; i++) {
            if (sizeBox[i].equals(item)) {
                sizeBox[i] = null;
                System.out.println("Предмет успешно удален из коробку");
                return;
            }
        }
    }
}