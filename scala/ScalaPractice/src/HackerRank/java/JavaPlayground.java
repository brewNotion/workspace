package HackerRank.java;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.*;
import java.io.*;

class T1 extends Thread{

    public void run() {
        System.out.println("T1");
    }
    public void start() {
        System.out.println("T2");
    }
}
public class JavaPlayground {

    public static void main(String[] args) throws InterruptedException {

        System.out.println("a is a good boy".split(" ",1));
        Thread t = new Thread();
        t.start();
        t.join();
        t.wait();
        t.start();
//        t.start();

    }
}
