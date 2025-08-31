package com.oaes.abstractfactory;

public class FactoryProducer {

    public ExamFactory getExamFactory(String type){
        if(type.equals("JEE")){
            return new JEEFactory();
        } else if(type.equals("GATE")){
            return new GATEFactory();
        } else {
            System.out.println("invalid type");
            return null;
        }
    }
}
