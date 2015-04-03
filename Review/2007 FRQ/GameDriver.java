public class GameDriver
{
  private GameState state;  // the current state of the game

  public GameDriver(GameState initial)
  { state = initial; }

  /*** Part (b) ***/

  /** Plays an entire game, as described in the problem description
   */
  public void play()
  {
	  System.out.println(state);
	  Player curr = new Player("");
	  curr = state.getCurrentPlayer();
	  String nextMove = curr.getNextMove(state);
	  state.makeMove(nextMove);
	  if (state.isGameOver())
	  {
		  if (!(state.getWinner() == null))
		  {
			  System.out.println(state.getWinner() + " won!");
		  }
		  else
		  {
			  System.out.println("Game ends in a draw.");
		  }
	  }
	  else
	  {
		  play();
	  }
  }
}
