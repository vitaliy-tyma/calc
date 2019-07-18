package com.luxoft.calc.service;

import freemarker.template.TemplateException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.amqp.RabbitProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.*;

/* NOT IN USE*/
public class CommandLine {
}
/////////////////
/*
@Component
public class CommandLine implements CommandLineRunner {

    @Autowired
    private Configuration configuration;

    public void run(String... args) {
        Map<String, Object> root = new HashMap<>();
        // для ${name}
        root.put("name", "Fremarker");
        // для <#list persons
        List<List> persons = new ArrayList<>();
        persons.add(Arrays.asList("Alexander", "Petrov", 47));
        persons.add(Arrays.asList("Slava", "Petrov", 13));
        root.put("persons", persons);

        try {
            RabbitProperties.Template template = configuration.getTemplate("hello_test.ftl");
            Writer out = new OutputStreamWriter(System.out);
            try {
                template.process(root, out);
            } catch (TemplateException e) {
                e.printStackTrace();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}*/
