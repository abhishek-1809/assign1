package com.oaes.evaluator.JEEEvaluator;

import com.oaes.evaluator.Evaluator;

public class JEEEssayEvaluator implements Evaluator {
    @Override
    public void evaluate(String response) {
        System.out.println("Evaluated JEE Essay response " + response);
    }
}
