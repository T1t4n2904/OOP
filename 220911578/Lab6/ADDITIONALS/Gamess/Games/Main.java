package Gamess.Games;
class Game{
    public void type(){
        System.out.println("Indoor and outdoor games");
    }
}

class Cricket extends Game{
    public void type(){
        System.out.println("Cricket is an outdoor game");
    }
}

class Chess extends Game{
    public void type(){
        System.out.println("Chess is an indoor game");
    }
}

public class Main{
    public static void main(String args[]){
        Game game = new Game();
        Game cricket = new Cricket();
        Game chess = new Chess();
        game.type();
        cricket.type();
        chess.type();
    }
}