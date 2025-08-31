package com.oaes.abstractfactory;

import com.oaes.evaluator.Evaluator;

public class Main {
    public static void main(String[] args) {
        ExamFactory factory;
        Evaluator evaluator;

        //for JEE
        factory = new JEEFactory();

        evaluator = factory.createMCQEvaluator("MCQ");
        evaluator.evaluate("MCQ Rsponse");

        evaluator = factory.createFillinEvaluator("Fillin");
        evaluator.evaluate("Fillin Rsponse");

        evaluator = factory.createEssayEvaluator("Essay");
        evaluator.evaluate("Essay Rsponse");

        evaluator = factory.createTrueFalseEvaluator("TrueFalse");
        evaluator.evaluate("True/False Rsponse");


        //for Gate
        factory = new GATEFactory();

        evaluator = factory.createMCQEvaluator("MCQ");
        evaluator.evaluate("MCQ Rsponse");

        evaluator = factory.createFillinEvaluator("Fillin");
        evaluator.evaluate("Fillin Rsponse");

        evaluator = factory.createEssayEvaluator("Essay");
        evaluator.evaluate("Essay Rsponse");

        evaluator = factory.createTrueFalseEvaluator("TrueFalse");
        evaluator.evaluate("True/False Rsponse");
    }
}