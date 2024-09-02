package chapter5;

import java.util.Scanner;

public class Greetings_Method {
    public static void main(String... args) {
        System.out.println("Hi please enter the name");
        Scanner sc= new Scanner(System.in);
        String name= sc.next();
        greetUser(name);

    }

    public static void greetUser(String pudar) {
        System.out.println("Hi "+pudar+" ");

    }
}

/* Methods are used to break a complex problem into small, manageable pieces.

What are Methods?

In Java, methods are subtasks within a class.

Other programming languages have different names for these, such as functions or modules, but in Java, they're known as methods.

We've already created one method in every single program that we've written, and that's the main method. We've also been making calls to other methods, such as the Scanner ones, to input data, and the System one to output data.

Methods should perform a specific task and can help eliminate redundancy in code.

 */
/*
The very first line of the method is called the header.


The first word in a method header is the access modifier.

Access modifiers indicate who is allowed access to use this method. public means any code from any class can use this method. Other access modifiers include private and protected.

We'll talk about these in greater detail later in the course. Having an access modifier is not required. If one is not specified, then it means that this method is only accessible by classes within the same package.


The next part of the header is a non-access modifier.

This includes static, final, abstract, and synchronized. All are pretty advanced, so we won't go into detail, but we'll talk about some of these later in the course.

For now, just know that not every method requires one of these modifiers.


Next is the return type.

This indicates the data type of the value that this method will return back to the code that calls it.

This particular method's job is to calculate two numbers. It has to specify that the sum will be returned, and it will be of data type int. That way, any method that happens to use this method, knows exactly what to expect.

Every method is required to specify a return type. If you look back to the programs that we've worked on in this course, we have the main method, which specifies its return type of void. Meaning, it is not going to return any value. So, even if your method returns nothing, you still have to specify a return type.

It's also important to note that a method can only return one value.


Next in the method header is the name.

Every method is required to have a name, and you should name your methods to reflect the task that they are designed to do. By convention, they should begin with a verb, like we see here, “calculate”, and optionally, adjectives or nouns can follow, such as “Sum”.

One deviation from this convention is for methods that return a boolean data type. By convention, their method names typically ask a question, such as: isSumNegative.

Remember that by convention, all method names should begin with a lower case.


After the method names comes a set of parentheses.

This is required. Although the parentheses can be empty, if no external data is needed for the task that the method needs to complete.

Alternatively, the parentheses are used to hold a list of all the data that should be supplied to this method, if it were to be called. This is known as the parameter list, and it's formatted as a comma-delimited list of input into the method.

In this example, we need two numbers in order to be able to calculate a sum, so we specify that in the header. So, if any program were to call us to calculate the sum of two numbers, they'd have to give us the two numbers as parameters.


Every method has a signature.

The signature consists of the name of the method and the method’s parameter list.

A method signature must be unique within a class.This is how it is identified.


After the method's header, comes the method's body, which is contained within a set of curly braces: {}

The body consists of 0 or more statements that are to be executed should this method be called.

If the body has specified a return type as anything other than void, the method must include a return statement, that returns a value that matches the return type specified in the header.
* */
