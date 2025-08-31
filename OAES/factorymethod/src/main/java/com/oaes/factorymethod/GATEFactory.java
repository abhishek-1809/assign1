package com.oaes.factorymethod;

import com.oaes.evaluator.Evaluator;
import com.oaes.evaluator.GATEEvaluator.GATEEssayEvaluator;
import com.oaes.evaluator.GATEEvaluator.GATEFillinEvaluator;
import com.oaes.evaluator.GATEEvaluator.GATEMCQEvaluator;
import com.oaes.evaluator.GATEEvaluator.GATETrueFalseEvaluator;

public class GATEFactory implements ExamFactory {

    @Override
    public Evaluator createEvaluator(String queType) {
        if(queType.equalsIgnoreCase("MCQ")) {
            return new GATEMCQEvaluator();
        }   else if (queType.equalsIgnoreCase("Fillin")) {
            return new GATEFillinEvaluator();
        }   else if(queType.equalsIgnoreCase("Essay")) {
            return new GATEEssayEvaluator();
        }   else if(queType.equalsIgnoreCase("TrueFalse")) {
            return new GATETrueFalseEvaluator();
        }   else {
            System.out.println("Invalid queType");
            return null;
        }
    }
}
