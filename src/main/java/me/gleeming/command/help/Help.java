package me.gleeming.command.help;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface Help {
    /**
     * The names to catch for help
     */
    String[] names();

    /**
     * The permission to get the help message
     */
    String permission() default "";

    /**
     * Gets the method to run if the sender doesn't have permission
     * Method is required to have a CommandSender parameter
     */
    String noPermissionMethod() default "";
}
