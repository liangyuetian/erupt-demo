package com.example.dashed.annotation;


import java.lang.annotation.*;

@Target(value = ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface CreatedTimeFormat {
    String value() default "";

}
