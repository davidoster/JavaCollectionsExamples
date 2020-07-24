/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacollectionsexamples.abstracts;

/**
 *
 * @author mac
 */
public abstract class Human {
    public String xyz;
    private String name;
    private float age;
    
    protected Human() {
        this.name = "NO NAME";
        this.age = 0.0f;
    }
    
    public void walks() {
        System.out.println("");   
    }
    
    public abstract void talks(String message);

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getAge() {
        return age;
    }

    public void setAge(float age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Human{" + "name=" + name + ", age=" + age + '}';
    }
    
    
}
