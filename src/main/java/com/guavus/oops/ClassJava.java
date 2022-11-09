package com.guavus.oops;

public class ClassJava {
    /*
    class declarations can include these components in order:

Modifiers: A class can be public or have default access (Refer to this for details).
Class name: The class name should begin with the initial letter capitalized by convention.
Superclass (if any): The name of the class’s parent (superclass), if any, preceded by the keyword extends. A class can only extend (subclass) one parent.
Interfaces (if any): A comma-separated list of interfaces implemented by the class, if any, preceded by the keyword implements. A class can implement more than one interface.
Body: The class body is surrounded by braces, { }.
     */
    public static void main(String[] args) {
        Box b1 = new Box(10, 20);
        Box b2 = b1;
        //Same object assigned to both the references.

        System.out.println("Height of b1 : "+b1.height);
        System.out.println("Weight of b1 : "+b1.weight);
        System.out.println("Height of b2 : "+b2.height);
        System.out.println("Weight of b2 : "+b2.weight);
        b1 = null;
        // Only b1 is set to null
        // b2 still points to the original reference
        System.out.println("After assigning null to b1");
        System.out.println("Height of b2 : "+b2.height);
        System.out.println("Weight of b2 : "+b2.weight);

        Box b3 = new Box(10, 20);
        Box b4 = new Box(30, 40);
        Box b5 = b3;
        System.out.println("Height and weight total : "+b3.totalHeightWeight());
        System.out.println("Height and weight total : "+b4.totalHeightWeight());

        increamentInHeightWeight(b3);
        //Change in b3 will affect b5 also
        System.out.println("height b5 : "+b5.height);
        System.out.println("weight b5 : "+b5.weight);

    }

    public static void increamentInHeightWeight(Box b) {
        b.height = b.height + 1;
        b.weight = b.weight + 1;
    }
}

class Box {
    int height;
    int weight;

    Box(int height, int weight) {
        this.height = height;
        this.weight = weight;
    }

    public int totalHeightWeight() {
        return this.height + this.weight;
    }
}