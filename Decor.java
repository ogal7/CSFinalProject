import java.util.ArrayList;


public class Decor {
  //inst vars
  
  protected int lighting;
  protected boolean hasBooths;
  protected boolean hasKaraoke;
  protected boolean hasLiveEnt;
  protected boolean hasCarpets;
  protected int musicVol;
  protected boolean hasBar;
  
  
  //default
  public Decor () {
    lighting = 5;
    hasBooths = false;
    hasKaraoke = false;
    hasLiveEnt = false;
    hasCarpets = true;
    musicVol = 4;
    hasBar = true;
  }
  
  
  public Decor (int l, boolean b, boolean k, boolean le; boolean carp, int vol, boolean bar) {
    lighting = l;
    hasBooths = b;
    hasKaraoke = k;
    hasLiveEnt = le;
    hasCarpets = carp;
    musicVol = vol;
    hasBar = bar;
  }




}
