package com.thrift.provider;

import com.thrift.api.Classes;
import com.thrift.api.Recall;
import com.thrift.api.Student;
import org.apache.thrift.TException;

import java.util.List;

public class RecallImpl implements Recall.Iface {
    public List<Student> hello(Classes arg0) throws TException {
        return arg0.getStudents();
    }
}
