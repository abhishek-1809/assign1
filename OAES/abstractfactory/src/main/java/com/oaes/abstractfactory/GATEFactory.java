package com.oaes.abstractfactory;

import com.oaes.evaluator.Evaluator;
import com.oaes.evaluator.GATEEvaluator.GATEEssayEvaluator;
import com.oaes.evaluator.GATEEvaluator.GATEFillinEvaluator;
import com.oaes.evaluator.GATEEvaluator.GATEMCQEvaluator;
import com.oaes.evaluator.GATEEvaluator.GATETrueFalseEvaluator;

public class GATEFactory implements ExamFactory {
    @Override
    public Evaluator createMCQEvaluator(String queType) {
        return new GATEMCQEvaluator();
    }

    @Override
    public Evaluator createFillinEvaluator(String queType) {
        return new GATEFillinEvaluator();
    }

    @Override
    public Evaluator createEssayEvaluator(String queType) {
        return new GATEEssayEvaluator();
    }

    @Override
    public Evaluator createTrueFalseEvaluator(String queType) {
        return new  GATETrueFalseEvaluator();
    }
}
