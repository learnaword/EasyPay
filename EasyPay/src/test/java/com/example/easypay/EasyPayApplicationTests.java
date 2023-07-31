package com.example.easypay;

import com.example.easypay.core.client.alipay.AlipayPayClientConfig;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.w3c.dom.ls.LSResourceResolver;
import org.xml.sax.ErrorHandler;
import org.xml.sax.SAXException;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;


import javax.validation.executable.ExecutableValidator;
import javax.validation.metadata.BeanDescriptor;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import java.io.IOException;
import java.util.Set;

@SpringBootTest
class EasyPayApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    void validateTest(){
        AlipayPayClientConfig payClientConfig = new AlipayPayClientConfig();

        payClientConfig.setMode(111);

        Validator validator = new Validator() {
            @Override
            public <T> Set<ConstraintViolation<T>> validate(T object, Class<?>... groups) {
                return null;
            }

            @Override
            public <T> Set<ConstraintViolation<T>> validateProperty(T object, String propertyName, Class<?>... groups) {
                return null;
            }

            @Override
            public <T> Set<ConstraintViolation<T>> validateValue(Class<T> beanType, String propertyName, Object value, Class<?>... groups) {
                return null;
            }

            @Override
            public BeanDescriptor getConstraintsForClass(Class<?> clazz) {
                return null;
            }

            @Override
            public <T> T unwrap(Class<T> type) {
                return null;
            }

            @Override
            public ExecutableValidator forExecutables() {
                return null;
            }
        };
        payClientConfig.validate(validator);
    }

}
