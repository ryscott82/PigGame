public class Dice {
  private int dice1; 
  private int dice2;

  public Dice () {
    dice1=0;
    dice2=0;
  }

  public void roll() { //rolls two dice
    dice1 = (int)(Math.random()*6)+1;
    dice2 = (int)(Math.random()*6)+1;
  }
  
  public int getRollTotal() {
	  return dice1+dice2;
  }

  public int getDice1() {
    return dice1;
  }

  public int getDice2() {
    return dice2;
  }
}