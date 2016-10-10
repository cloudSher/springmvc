package com.springapp.mvc.validator;

import com.springapp.mvc.model.Demo;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

/**
 * Created by Administrator on 2016/8/22.
 */
public class MyValidator implements Validator {

    @Override
    public boolean supports(Class<?> aClass) {
        return Demo.class == aClass;
    }

    @Override
    public void validate(Object o, Errors errors) {
        Demo demo = (Demo)o;
        if(demo.getId()== null){
            errors.reject("id is not null");
        }
        if(demo.getName() == null){
            errors.reject("name is not null");
        }
    }
}
