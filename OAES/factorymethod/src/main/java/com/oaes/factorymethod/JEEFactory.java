package com.oaes.factorymethod;

import com.oaes.evaluator.Evaluator;
import com.oaes.evaluator.JEEEvaluator.JEEEssayEvaluator;
import com.oaes.evaluator.JEEEvaluator.JEEFillinEvaluator;
import com.oaes.evaluator.JEEEvaluator.JEEMCQEvaluator;
import com.oaes.evaluator.JEEEvaluator.JEETrueFalseEvaluator;

public class JEEFactory implements ExamFactory{
    @Override
    public Evaluator createEvaluator(String queType) {
        if(queType.equalsIgnoreCase("MCQ")) {
            return new JEEMCQEvaluator();
        } else if(queType.equalsIgnoreCase("Fillin")) {
            return new JEEFillinEvaluator();
        } else if(queType.equalsIgnoreCase("Essay")) {
            return new JEEEssayEvaluator();
        } else if(queType.equalsIgnoreCase("TrueFalse")) {
            return new JEETrueFalseEvaluator();
        } else {
            System.out.println("Invalid queType");
            return null;
        }
    }
}
