// Does not need editing
public class FDA{

  //Instance vars
  private boolean hasEcoli;
  public String name;
  
  // Constructor
  public FDA{
    hasEcoli = false;
    name = "Inspector Cruso";

  }
  
  // Methods
  public void setPassedInspection(boolean b){
    hasEcoli = b;}
  public boolean getPassedInspection(){
    return hasEcoli;
  }

  public String getName() {
    return name;
  }
  
}
