package com.oaes.abstractfactory;

import com.oaes.evaluator.Evaluator;

public interface ExamFactory {
    Evaluator createMCQEvaluator(String queType);
    Evaluator createFillinEvaluator(String queType);
    Evaluator createEssayEvaluator(String queType);
    Evaluator createTrueFalseEvaluator(String queType);
}
