package top.shadowless.client.mod.mods.movement.betterfps.transformers.cloner;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import top.shadowless.client.mod.mods.movement.betterfps.tweaker.Naming;

/**
 * @author Guilherme Chaguri
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.METHOD})
public @interface Named {

    Naming value(); // Original name of the method/field

}
