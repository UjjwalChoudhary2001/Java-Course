package basicjava.basic;

class Computer{
    public void playMusic()
    {
        System.out.println("Playing Music...");
    }

    public String getMeAPen(int cost)
    {
        if(cost>=10)
        {
            return "Pen";
        }

        return "Nothing";
    }
}

public class Method {
    public static void main(String [] args){
        Computer obj = new Computer();
        obj.playMusic();
        String res = obj.getMeAPen(2);
        System.out.println(res);
    }
}
