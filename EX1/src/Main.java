// 204328611_207845611

public class Main 
{
  public static void main(String[] args)
    { 
      Item sword=new Item();
      sword.setValue(50); 
      Item shield=new Item(); 
      shield.setValue(30); 
      Item potion=new Item();
      potion.setValue(20); 
      Item[] inv1=new Item[5]; 
      Item[] inv2=new Item[5]; 
      Player p1=new Player(inv1);
      p1.heal(10); 
      p1.addItem(sword);
      p1.addItem(potion);
      Player p2=new Player(inv2);
      p2.heal(10); 
      p2.addItem(shield); 
      Enemy goblin=new Enemy(2);
      Player[] players=new Player[5]; 
      Enemy[] enemies=new Enemy[5]; 
      GameWorld world=new GameWorld(players,enemies,1); 
      world.addPlayer(p1); 
      world.addPlayer(p2); 
      System.out.println("=== All Players ==="); 
      world.printAllPlayers();
      int total=world.getTotalValueOfWorld(); 
      System.out.println("\nTotal inventory value in the world: "+total);
      System.out.println("\n=== Battle Simulation ==="); 
      simulateBattle(p1,goblin);
    } 
  public static void simulateBattle(Player p, Enemy e)
  { 
    System.out.println(p.getName()+" - level : "+p.getLevel()+" VS "+e.getName()+" - level : "+e.getLevel()); 
    if(p.getLevel()>e.getLevel()) System.out.println(p.getName()+" wins!"); 
    else 
      if(p.getLevel()<e.getLevel()) System.out.println(e.getName()+" wins!"); 
      else System.out.println("It's a tie!"); System.out.println();
  }
}
