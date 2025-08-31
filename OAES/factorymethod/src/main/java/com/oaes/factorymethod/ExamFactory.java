package com.oaes.factorymethod;

import com.oaes.evaluator.Evaluator;

public interface ExamFactory {
    Evaluator createEvaluator(String queType);
}
