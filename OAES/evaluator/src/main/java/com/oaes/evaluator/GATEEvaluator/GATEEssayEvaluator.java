package com.oaes.evaluator.GATEEvaluator;

import com.oaes.evaluator.Evaluator;

public class GATEEssayEvaluator implements Evaluator {
    @Override
    public void evaluate(String response) {
        System.out.println("Evaluated GATE essay response " + response);
    }
}
