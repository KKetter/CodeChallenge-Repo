package DSA.JAVA.fifoAnimalShelter;

import DSA.JAVA.stacksandqueues.Node;
import DSA.JAVA.stacksandqueues.Queue;

public class AnimalShelter<T> {
    public Queue<T> dog;
    public Queue<T> cat;

    public AnimalShelter(){
       this.dog = new Queue();
       this.cat = new Queue();
    }


    public void enqAnimal(T animal){
        if(animal.equals("dog")){
            this.dog.enqueue(animal);
        }else{
            this.cat.enqueue(animal);
        }
    }

    public T deqAnimal(T pref) {
        T animal = null;
        if (pref.equals("dog")) {
            animal = this.dog.dequeue();
            //
        } else if (pref.equals("cat")) {
            animal = this.cat.dequeue();
        } else {
            return null;
        }
        return animal;
    }
    }