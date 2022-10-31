/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package company.polymorphism;
class Shape{
 public void draw(){
     System.out.println("shape is drawn");
 }
 public void erase(){
     System.out.println("shape is erased");
 }
}
class Circle extends Shape{
 @Override
 public void draw(){
     System.out.println("Circle is drawn");
 }
 @Override
 public void erase(){
     System.out.println("Circle is erased");
 }
}
class Triangle extends Shape{
 @Override
 public void draw(){
     System.out.println("Triangle is drawn");
 }
 @Override
 public void erase(){
     System.out.println("triangle is erased");
 }

}
class Square extends Shape{
 @Override
 public void draw(){
     System.out.println("Square is drawn");
 }
 @Override
 public void erase(){
     System.out.println("square is erased");
 }

}
/**
 *
 * @author seher
 */
public class Polymorphism {

    public static void main(String[] args) {
        System.out.println("""
                           1 Write a program to create a class named shape. In this class we have three
                           sub classes circle, triangle and square each class has two member function
                           named draw () and erase (). Create these using polymorphism concepts.""");
        // Creating obj of these classes to call their fns
        Shape shape = new Shape();
        shape.draw();
        shape.erase();
        Circle circle = new Circle();
        circle.draw();
        circle.erase();
        
        
    }
}
