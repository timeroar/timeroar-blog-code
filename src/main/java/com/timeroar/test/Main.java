package com.timeroar.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
//    public static void main(String[] args) throws Exception {
//       /* String CONTENT_HEADER = "<html><head></head><body>";
//        String CONTENT_FOOTER = "</body></html>";
//
//        String test = "这是什么玩意sdfasdfadsfas";
//        PDFUtils.htmlTopdf(CONTENT_HEADER + test + CONTENT_FOOTER,new File("d:/test2.pdf"));
//        PDFUtils.createPDF2(CONTENT_HEADER + test + CONTENT_FOOTER,"d:/test23.pdf");
//        PDFUtils.createPDF(CONTENT_HEADER + test + CONTENT_FOOTER,"d:/test1.pdf");*/
//        String i = "23 * 3 + 5-2*3/3";
//        Scope scope = new Scope();
//        Expression parse = Parser.parse(i, scope);
//        System.out.println(parse.evaluate());
//
//
//        String i1 = "23 * (WXZC + GDZC) * 3";
//        Scope scope2 = new Scope();
//        scope2.getVariable("WXZC").setValue(3);
//        scope2.getVariable("GDZC").setValue(2);
//        Expression parse2 = Parser.parse(i1, scope2);
//        System.out.println(parse2.evaluate());
//
//    }

    public static void main(String[] args) throws Exception {
        ArrayList<TestEntity> test = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            TestEntity testEntity = new TestEntity();
            testEntity.setName("张一");
            testEntity.setTest("test1");
            testEntity.setAge("2" + i);
            TestEntity testEntity1 = new TestEntity();
            testEntity1.setName("张一");
            testEntity1.setTest("test2");
            testEntity1.setAge("2" + i);
            test.add(testEntity);
            test.add(testEntity1);
        }
        for (int i = 0; i < 10; i++) {
            TestEntity testEntity = new TestEntity();
            testEntity.setName("李四");
            testEntity.setTest("test1");
            testEntity.setAge("2" + i);
            TestEntity testEntity1 = new TestEntity();
            testEntity1.setName("李四");
            testEntity1.setTest("test2");
            testEntity1.setAge("2" + i);
            test.add(testEntity);
            test.add(testEntity1);
        }
        Map<String, List<TestEntity>> collect = test.stream().collect(Collectors.groupingBy(TestEntity::getName));
        collect.forEach((s, testEntities) -> {
            Map<String, List<TestEntity>> collect1 = testEntities.stream().collect(Collectors.groupingBy(TestEntity::getTest));
            System.out.println(collect1);
        });
    }
}