/**
 *
 * @author Alex Brown
 */
public class NFLPlayerManager {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      /* Define our array for six players */
      NFLPlayer[] playerArray = new NFLPlayer[6];
      
      /* pass in the player information per player and output the results for each player */
      // playerArray[0] = new NFLPlayer("Mayfield, Baker","QB","Senior",23,6,1,215,1497,1026.0,14607,30);
      playerArray[0] = new NFLPlayer();
      playerArray[0].printNFLPlayer();
      playerArray[1] = new NFLPlayer("Manzel, Johnny","QB","Senior",23,6,1,215,1497,1026.0,14607,30);
      playerArray[1].printNFLPlayer();
      playerArray[2] = new NFLPlayer("Hoyer, Bryan","QB","Senior",23,6,1,215,1497,1026.0,14607,30);
      playerArray[2].printNFLPlayer();
      playerArray[3] = new NFLPlayer("Weeden, Brandon","QB","Senior",23,6,1,215,1497,1026.0,14607,30);
      playerArray[3].printNFLPlayer();
      playerArray[4] = new NFLPlayer("McCown, Josh","QB","Senior",23,6,1,215,1497,1026.0,14607,30);
      playerArray[4].printNFLPlayer();
      playerArray[5] = new NFLPlayer("Griffen III, Robert","QB","Senior",23,6,1,215,1497,1026.0,14607,30);
      playerArray[5].printNFLPlayer();
   }
}