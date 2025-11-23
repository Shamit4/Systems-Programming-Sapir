// 204328611_207845611

public class Player extends Character
  { 
    private Item[] inventory; 
    public Player(Item[] inv)
    {
      super(); 
      this.inventory=inv;
    } 
    public void addItem(Item i)
    { 
      for(int x=0;x<inventory.length;x++)
        {
          if(inventory[x]==null) 
            inventory[x]=i;
          return;       
        }
    }
    public int calculateInventoryValue()
    {
      int s=0;
      for (Item it:inventory)
        if(it!=null) s+=it.getValue();
      return s;
    } 
    public boolean hasMagicalItem()
    { 
      for(Item it:inventory)       
          if(it!=null && it.isMagical()) return true;
      return false;
    }
    public String toString()
    { 
      String b=super.toString();
      String inv="Inventory: ";
      for (Item it:inventory)
      {
        if(it!=null) inv+=it.getName()+" | "; 
      } 
      return b+"\n"+inv;
    } 
  }
