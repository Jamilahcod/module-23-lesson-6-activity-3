class animal{
    String name="animal";
    void sound(){
        System.out.println("animal make sound");
    }
}

class dog extends animal{
    String name="dog";
    void sound(){
        System.out.println("dog barks");
        super.sound();

    }
    void display(){
        System.out.println(name);
        System.out.println(super.name);
    }

}

class cat extends animal{
    void sound(){
        System.out.println("cat mewous");
        
    }
}

class Main{
    public static void main(String[] args){
        dog d=new dog();
        d.sound();    
        cat c=new cat();
        c.sound();
        d.display();
    }
}