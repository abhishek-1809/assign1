package com.oaes.abstractfactory;

import com.oaes.evaluator.Evaluator;

public class Main {
    public static void main(String[] args) {
        FactoryProducer factoryProducer = null;
        ExamFactory factory;
        Evaluator evaluator;

        //for JEE
        factory = factoryProducer.getExamFactory("JEE");

        evaluator = factory.createMCQEvaluator("MCQ");
        evaluator.evaluate("MCQ Rsponse");

        evaluator = factory.createFillinEvaluator("Fillin");
        evaluator.evaluate("Fillin Rsponse");

        evaluator = factory.createEssayEvaluator("Essay");
        evaluator.evaluate("Essay Rsponse");

        evaluator = factory.createTrueFalseEvaluator("TrueFalse");
        evaluator.evaluate("True/False Rsponse");


        //for Gate
        factory = factoryProducer.getExamFactory("GATE");

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