package org.javabrain.annotation;

import org.javabrain.enums.JsonStructure;
import org.javabrain.enums.JsonAccess;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
public @interface Json {
    String load() default "";
    JsonAccess access();
    JsonStructure structure() default JsonStructure.JSON_ARRAY;
}
