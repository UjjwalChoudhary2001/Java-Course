package advjava.others;

abstract class Car{
    public abstract void drive();
    public abstract void fly();

    public void playMusic()
    {
        System.out.println("Playing music..");
    }
}

// class WagonR extends Car{

//     public void drive()
//     {
//         System.out.println("Driving..");
//     }
// }


abstract class WagonR extends Car{

    public void drive()
    {
        System.out.println("Driving..");
    }
}

class UpdatedWagonR extends WagonR{

    public void fly() {
        System.out.println("Flying..");
    }
    
}

public class AbstractKywrd {
    public static void main(String[] args) {
        //WagonR obj = new WagonR();
        UpdatedWagonR obj = new UpdatedWagonR();
        obj.playMusic();
        obj.drive();
        obj.fly();
    }
}
