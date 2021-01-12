//@author wycliffe
package com.wycliffe.codility;

//Implement Stack
/*
class StackClass{
iniatalize top =0;
initialize max of stack = 10;
int size [] = new int [MAX]

instantiate push(int x);
instantiate pop();
instantiate peek(){
 int v = a[top];
 return v;
boolean isEmpty(){
 return (top<0);   
}
i
instatiate main()
display results
}

*/


public class StackClass {

    int top;
    int MAX = 10;
    int arrayStack [] = new int[MAX];
    
    //Initialize Constructor
    StackClass(){
        top = -1;
    }
    
    //check if the stack id empty
    boolean isEmpty(){
        if(top < 0){
            return true;
        }
        return false;
    }
    public int peek(){
        if(top<0){
            System.out.println("Stack Underflow");
            return 0;
        }else{
            return arrayStack[top];
        }
    }
    boolean push(int x){
        if(top>=MAX){
            System.out.println("Stack Overflow");
            return false;
        }
        else{
            arrayStack[++top] = x;
            System.out.println(x+"Item pushed into stack");
            return true;
        }
        
    }
    int pop(){
        if(top<0){
            System.out.println("Stack underflow");
            return 0;
        }
        else{
            int x = arrayStack[top--];
            System.out.println(x+"Removed form stack");
            return x;
        }
    }
    
    public static void main(String args[]){
        StackClass classObject = new StackClass();
        classObject.push(50);
        classObject.push(20);
        classObject.push(55);
        classObject.push(57);
        classObject.push(505);
        
        System.out.println(classObject.pop());
        System.out.println("Top object is:"+classObject.peek());
        
    }
}

