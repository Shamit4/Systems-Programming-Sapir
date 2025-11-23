// 204328611_207845611
public class Character 
{ 
  private String name="Unknown"; 
  private int health=0; 
  private int level=0; 
  public Character(){} 
  public String getName(){return name;} 
  public int getHealth(){return health;} 
  public int getLevel(){return level;} 
  public void levelUp(){level++;} 
  public void heal(int a){ if(a>0)health+=a;} 
  public String toString(){return "Name: "+name+"\nHealth: "+health+"\nLevel: "+level;}
}
