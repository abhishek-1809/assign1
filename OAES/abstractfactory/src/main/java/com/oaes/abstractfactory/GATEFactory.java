package com.oaes.abstractfactory;

import com.oaes.evaluator.Evaluator;
import com.oaes.evaluator.GATEEvaluator.GATEEssayEvaluator;
import com.oaes.evaluator.GATEEvaluator.GATEFillinEvaluator;
import com.oaes.evaluator.GATEEvaluator.GATEMCQEvaluator;
import com.oaes.evaluator.GATEEvaluator.GATETrueFalseEvaluator;
import com.oaes.abstractfactory.ExamFactory;

public class GATEFactory implements ExamFactory {

//    @Override
//    public Evaluator createEvaluator(String queType) {
//        if(queType.equalsIgnoreCase("MCQ")) {
//            return new GATEMCQEvaluator();
//        }   else if (queType.equalsIgnoreCase("Fillin")) {
//            return new GATEFillinEvaluator();
//        }   else if(queType.equalsIgnoreCase("Essay")) {
//            return new GATEEssayEvaluator();
//        }   else if(queType.equalsIgnoreCase("TrueFalse")) {
//            return new GATETrueFalseEvaluator();
//        }   else {
//            System.out.println("Invalid queType");
//            return null;
//        }
//    }

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
