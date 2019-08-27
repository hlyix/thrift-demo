package com.thrift.api;

import com.sohu.thrift.generator.builder.ThriftFileBuilder;

public class ThriftStructBuilderTest {

    private ThriftFileBuilder fileBuilder = new ThriftFileBuilder();


    public static void main(String[] args) throws Exception {
        ThriftStructBuilderTest thriftStructBuilderTest = new ThriftStructBuilderTest();
        thriftStructBuilderTest.fileBuilder.buildToOutputStream(com.thrift.api.Recall.class,System.out);
    }
}
