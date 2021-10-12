package com.javapractice;

import com.javapractice.interfeces.Grape;
import com.javapractice.interfeces.Strawberry;

public interface JuiceFactory {
    Strawberry createStrawberryJuice();
    Grape createGrapeJuice();
}
