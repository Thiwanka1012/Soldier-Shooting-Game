class Soldier{
    public void shoot(Ak47 ak47){
        System.out.println("Shooting....");
        ak47.fire();
    }
}

class Ak47{
    public void fire(){
        System.out.println("(AK47) Round 580 for min");
    }
}

class MG3{
    public void fire(){
        System.out.println("(MG3) Round 450 for min");
    }
}



public class Game {
    public static void main(String[] args) {
        Soldier s1 = new Soldier();

        s1.shoot(new Ak47());
    }
}
