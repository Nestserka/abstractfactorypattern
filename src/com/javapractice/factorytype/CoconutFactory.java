package com.javapractice.factorytype;

import com.javapractice.JuiceFactory;
import com.javapractice.interfeces.Grape;
import com.javapractice.interfeces.Strawberry;
import com.javapractice.realization.CoconutGrape;
import com.javapractice.realization.CoconutStrawberry;

public class CoconutFactory implements JuiceFactory {
    @Override
    public Strawberry createStrawberryJuice() {
        return new CoconutStrawberry();
    }

    @Override
    public Grape createGrapeJuice() {
        return new CoconutGrape();
    }
}
