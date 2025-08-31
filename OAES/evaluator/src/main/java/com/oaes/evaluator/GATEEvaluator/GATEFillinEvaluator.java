package com.oaes.evaluator.GATEEvaluator;

import com.oaes.evaluator.Evaluator;

public class GATEFillinEvaluator implements Evaluator {
    @Override
    public void evaluate(String response) {
        System.out.println("Evaluated GATE Fill in the blank response " + response);
    }
}
