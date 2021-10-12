package com.javapractice;

import com.javapractice.factorytype.BananaFactory;

public class Main {


    public static void main(String[] args) {
        JuiceFactory factory;
	factory = new BananaFactory();
	factory.createGrapeJuice();
    }
}

