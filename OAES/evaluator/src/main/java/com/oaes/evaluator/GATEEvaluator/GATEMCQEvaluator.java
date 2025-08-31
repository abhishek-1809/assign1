package com.oaes.evaluator.GATEEvaluator;

import com.oaes.evaluator.Evaluator;

public class GATEMCQEvaluator implements Evaluator {
    @Override
    public void evaluate(String response) {
        System.out.println("Evaluated GATE MCQ response " + response);
    }
}
