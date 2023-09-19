package me.gleeming.command;

import org.bukkit.command.CommandSender;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.function.BiConsumer;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface Command {
    /**
     * Root command names
     */
    String[] names();

    /**
     * Command's permission
     */
    String permission() default "";

    /**
     * Whether or not the command is ran asynchronously
     */
    boolean async() default false;

    /**
     * Gets the description of the command
     */
    String description() default "This command doesn't have a description.";


    /**
     * Checks if command is console only
     */
    boolean consoleOnly() default false;

    /**
     * Checks if command is player only
     */
    boolean playerOnly() default false;

    /**
     * Gets the method to run if the sender doesn't have permission
     * Method is required to have a CommandSender parameter
     */
    String noPermissionMethod() default "";

    /**
     * Gets the method to run if the sender is a console
     * Method is required to have a CommandSender parameter
     */
    String playerOnlyMethod() default "";

    /**
     * Gets the method to run if the sender is a player
     * Method is required to have a CommandSender parameter
     */
    String consoleOnlyMethod() default "";
}
