package com.merantory.patterns;

public class AbstractFactory {
    public static void main(String[] args) {
        DeviceFactory deviceFactory = new AnalogFactory();
        deviceFactory.getKeyboard().print();
        deviceFactory = new DigitalFactory();
        deviceFactory.getKeyboard().print();
    }
}

interface Mouse {
    void click();
    void doubleClick();
    void scroll(boolean isUpDirection);
}

interface Keyboard {
    void print();
    void println();
}

interface Touchpad {
    void track(int deltaX, int deltaY);
}

interface DeviceFactory {
    Mouse getMouse();
    Keyboard getKeyboard();
    Touchpad getTouchpad();
}

class AnalogMouse implements Mouse {

    @Override
    public void click() {
        System.out.println("Analog mouse click");
    }

    @Override
    public void doubleClick() {
        System.out.println("Analog mouse double click");
    }

    @Override
    public void scroll(boolean isUpDirection) {
        System.out.println("Analog mouse is scroll " + (isUpDirection ? "up" : "down"));
    }
}

class AnalogKeyboard implements Keyboard {

    @Override
    public void print() {
        System.out.println("Analog keyboard is print without line terminate");
    }

    @Override
    public void println() {
        System.out.println("Analog keyboard is print with line terminate");
    }
}

class AnalogTouchpad implements Touchpad {

    @Override
    public void track(int deltaX, int deltaY) {
        System.out.println("Analog touchpad track: x = " + deltaX + "; y = " + deltaY + ";");
    }
}

class DigitalMouse implements Mouse {

    @Override
    public void click() {
        System.out.println("Digital mouse click");
    }

    @Override
    public void doubleClick() {
        System.out.println("Digital mouse double click");
    }

    @Override
    public void scroll(boolean isUpDirection) {
        System.out.println("Digital mouse is scroll " + (isUpDirection ? "up" : "down"));
    }
}

class DigitalKeyboard implements Keyboard {

    @Override
    public void print() {
        System.out.println("Digital keyboard is print without line terminate");
    }

    @Override
    public void println() {
        System.out.println("Digital keyboard is print with line terminate");
    }
}

class DigitalTouchpad implements Touchpad {

    @Override
    public void track(int deltaX, int deltaY) {
        System.out.println("Digital touchpad track: x = " + deltaX + "; y = " + deltaY + ";");
    }
}

class AnalogFactory implements DeviceFactory {

    @Override
    public Mouse getMouse() {
        return new AnalogMouse();
    }

    @Override
    public Keyboard getKeyboard() {
        return new AnalogKeyboard();
    }

    @Override
    public Touchpad getTouchpad() {
        return new AnalogTouchpad();
    }
}

class DigitalFactory implements DeviceFactory {

    @Override
    public Mouse getMouse() {
        return new DigitalMouse();
    }

    @Override
    public Keyboard getKeyboard() {
        return new DigitalKeyboard();
    }

    @Override
    public Touchpad getTouchpad() {
        return new DigitalTouchpad();
    }
}