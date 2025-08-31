package com.oaes.evaluator.JEEEvaluator;

import com.oaes.evaluator.Evaluator;

public class JEETrueFalseEvaluator implements Evaluator {
    @Override
    public void evaluate(String response) {
        System.out.println("Evaluated JEE True/False response " + response);
    }
}
