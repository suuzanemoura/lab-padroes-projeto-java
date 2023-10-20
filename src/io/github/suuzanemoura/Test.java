package io.github.suuzanemoura;

import io.github.suuzanemoura.singleton.SingletonEager;
import io.github.suuzanemoura.singleton.SingletonLazy;
import io.github.suuzanemoura.singleton.SingletonLazyHolder;
import io.github.suuzanemoura.strategy.AggressiveBehavior;
import io.github.suuzanemoura.strategy.Behavior;
import io.github.suuzanemoura.strategy.DefensiveBehavior;
import io.github.suuzanemoura.strategy.NormalBehavior;
import io.github.suuzanemoura.strategy.Robot;

public class Test {

    public static void main(String[] args) {

        // Singleton

        SingletonLazy lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);

        SingletonEager eager = SingletonEager.getInstancia();
        System.out.println(eager);
        eager = SingletonEager.getInstancia();
        System.out.println(eager);

        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);
        lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);

        // Strategy

        Behavior defensive = new DefensiveBehavior();
        Behavior normal = new NormalBehavior();
        Behavior aggressive = new AggressiveBehavior();

        Robot robot = new Robot();
        robot.setBehavior(normal);
        robot.move();
        robot.move();
        robot.setBehavior(defensive);
        robot.move();
        robot.setBehavior(aggressive);
        robot.move();
        robot.move();
        robot.move();
    }
}
