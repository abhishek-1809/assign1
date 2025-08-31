package com.oaes.factorymethod;

import com.oaes.evaluator.Evaluator;

public class Main {
    public static void main(String[] args) {
        ExamFactory factory;
        Evaluator evaluator;

        //for JEE
        factory = new JEEFactory();

        evaluator = factory.createEvaluator("MCQ");
        evaluator.evaluate("MCQ Rsponse");

        evaluator = factory.createEvaluator("Fillin");
        evaluator.evaluate("Fillin Rsponse");

        evaluator = factory.createEvaluator("Essay");
        evaluator.evaluate("Essay Rsponse");

        evaluator = factory.createEvaluator("TrueFalse");
        evaluator.evaluate("True/False Rsponse");

        //for Gate
        factory = new GATEFactory();

        evaluator = factory.createEvaluator("MCQ");
        evaluator.evaluate("MCQ Rsponse");

        evaluator = factory.createEvaluator("Fillin");
        evaluator.evaluate("Fillin Rsponse");

        evaluator = factory.createEvaluator("Essay");
        evaluator.evaluate("Essay Rsponse");

        evaluator = factory.createEvaluator("TrueFalse");
        evaluator.evaluate("True/False Rsponse");
    }
}