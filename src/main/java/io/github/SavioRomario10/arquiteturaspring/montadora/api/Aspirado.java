package io.github.SavioRomario10.arquiteturaspring.montadora.api;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.springframework.beans.factory.annotation.Qualifier;

@Retention(RetentionPolicy.RUNTIME) //ser lido pelo Spring
@Qualifier("Aspirado")
@Target({ElementType.FIELD, ElementType.METHOD}) //onde pode usar a anotacion
public @interface Aspirado {

}
