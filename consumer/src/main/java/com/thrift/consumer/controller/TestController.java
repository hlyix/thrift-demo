package com.thrift.consumer.controller;

import com.thrift.api.Classes;
import com.thrift.api.Recall;
import com.thrift.api.Student;
import org.apache.thrift.protocol.TCompactProtocol;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.transport.TFastFramedTransport;
import org.apache.thrift.transport.TSocket;
import org.apache.thrift.transport.TTransport;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.LinkedList;
import java.util.List;

@Controller
public class TestController {

    @RequestMapping("/test")
    @ResponseBody
    public String test(){

        Classes classes = new Classes();
        List<Student> students = new LinkedList<Student>();
        for (int i = 0; i < 5; i++) {
            Student demo = new Student();
            demo.setAge(i);
            students.add(demo);
        }
        classes.setStudents(students);
        TTransport tTransport = new TFastFramedTransport(new TSocket("localhost", 8899), 600);
        TProtocol tProtocol = new TCompactProtocol(tTransport);
        Recall.Client client = new Recall.Client(tProtocol);

        try {
            tTransport.open();
            List remoteList = client.hello(classes);
            for (int i = 0; i < remoteList.size(); i++) {
                System.out.println(remoteList.get(i));
            }
            System.out.println();
        } catch (Exception ex) {
            ex.printStackTrace();
            return "500";
        } finally {
            tTransport.close();
        }

        return "200";
    }

}
