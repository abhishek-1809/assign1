package com.oaes.evaluator.JEEEvaluator;

import com.oaes.evaluator.Evaluator;

public class JEEFillinEvaluator implements Evaluator {
    @Override
    public void evaluate(String response) {
        System.out.println("Evaluated JEE Fill in the blank response " + response);
    }
}
