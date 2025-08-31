package com.oaes.abstractfactory;

import com.oaes.evaluator.Evaluator;
import com.oaes.evaluator.JEEEvaluator.JEEEssayEvaluator;
import com.oaes.evaluator.JEEEvaluator.JEEFillinEvaluator;
import com.oaes.evaluator.JEEEvaluator.JEEMCQEvaluator;
import com.oaes.evaluator.JEEEvaluator.JEETrueFalseEvaluator;

public class JEEFactory implements ExamFactory {
    @Override
    public Evaluator createMCQEvaluator(String queType) {
        return new JEEMCQEvaluator();
    }

    @Override
    public Evaluator createFillinEvaluator(String queType) {
        return new JEEFillinEvaluator();
    }

    @Override
    public Evaluator createEssayEvaluator(String queType) {
        return new JEEEssayEvaluator();
    }

    @Override
    public Evaluator createTrueFalseEvaluator(String queType) {
        return new JEETrueFalseEvaluator();
    }
}
