package org.example.Service.impls;

import org.example.Model.MathResult;

public interface View {
    void showMathResult(MathResult result);
    Integer enteringNumbers();
    int showMenu();
}