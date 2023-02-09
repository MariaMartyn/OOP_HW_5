package org.example.Service.impls;

import org.example.Model.MathResult;

public interface MathOperations {
    MathResult sum(int a, int b);
    MathResult difference(int a, int b);
    MathResult multiplication(int a, int b);
    MathResult division(int a, int b);
}
