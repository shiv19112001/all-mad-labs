class Bharatvanshi{
    public void fight(){
        System.out.println("Fighter");
    };
}

class Pandav extends Bharatvanshi{
    public void obey(){
        System.out.println("Obedient");
    }
    public void kind(){
        System.out.println("Kind");
    }
}

class Kaurav extends Bharatvanshi{

}

class Arjun extends Pandav{
    void desc(){
        fight();
        obey();
        kind();
    }
}

class Bheem extends Pandav{
    void desc(){
        fight();
        obey();
        kind(){
            System.out.println("Not so kind");
        }
    }
}

class Main{
    public static void main(String[] args){
        Arjun A = new Arjun();
        Bheem B = new Bheem();
        A.desc();
        B.desc();
    }
}