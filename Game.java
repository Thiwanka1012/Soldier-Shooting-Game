class Gun{
    public void fire(){
        System.out.println("Firing....");
    }
}

class Soldier{
    public void shoot(Gun gun){
        System.out.println("Shooting....");
        gun.fire();
    }
}

class Ak47 extends Gun{
    public void fire(){
        System.out.println("(AK47) Round 580 for min");
    }
}

class MG3 extends Gun{
    public void fire(){
        System.out.println("(MG3) Round 450 for min");
    }
}



public class Game {
    public static void main(String[] args) {
        Soldier s1 = new Soldier();

        s1.shoot(new Ak47());
        s1.shoot(new MG3());
    }
}
