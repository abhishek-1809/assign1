package com.oaes.evaluator.JEEEvaluator;

import com.oaes.evaluator.Evaluator;

public class JEEMCQEvaluator implements Evaluator {
    @Override
    public void evaluate(String response) {
        System.out.println("Evaluated JEE MCQ response " + response);
    }
}
