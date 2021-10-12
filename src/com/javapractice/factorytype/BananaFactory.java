package com.javapractice.factorytype;

import com.javapractice.JuiceFactory;
import com.javapractice.interfeces.Grape;
import com.javapractice.interfeces.Strawberry;
import com.javapractice.realization.BananaGrape;
import com.javapractice.realization.BananaStrawberry;

public class BananaFactory implements JuiceFactory {
    @Override
    public Strawberry createStrawberryJuice() {
        return new BananaStrawberry();
    }

    @Override
    public Grape createGrapeJuice() {
        return new BananaGrape();
    }
}
