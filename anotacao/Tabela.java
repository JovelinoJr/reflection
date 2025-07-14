package br.com.anotacao;

import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.FIELD})
@Inherited

public @interface Tabela {

    long value();

    String[] nomes();

    RetentionPolicy[] value2();

    RetentionPolicy value3();

    String nomeDeFoult() default "Jovelino";

}
