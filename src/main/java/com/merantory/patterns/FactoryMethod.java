package com.merantory.patterns;

import java.util.Date;

public class FactoryMethod {
    public static void main(String[] args) {
        WatchCreator watchCreator = new DigitalWatchFactory();
        Watch watch = watchCreator.createWatch();
        watch.showTime();
    }
}

interface Watch {
    void showTime();
}

class DigitalWatch implements Watch {

    @Override
    public void showTime() {
        System.out.println(new Date());
    }
}

class RomeWatch implements Watch {

    @Override
    public void showTime() {
        System.out.println("XI-VI");
    }
}

interface WatchCreator {
    Watch createWatch();
}

class DigitalWatchFactory implements WatchCreator {

    @Override
    public Watch createWatch() {
        return new DigitalWatch();
    }
}

class RomeWatchFactory implements WatchCreator {

    @Override
    public Watch createWatch() {
        return new RomeWatch();
    }
}