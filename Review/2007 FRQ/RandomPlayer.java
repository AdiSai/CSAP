import java.util.ArrayList;

// Part (a)

class RandomPlayer extends Player
{
	public RandomPlayer(String nm)
	{
		super(nm);
	}
	@Override
	public String getNextMove(GameState state)
	{
		if (state.isGameOver())
		{
			return "game over";
		}
		else if (state.getCurrentMoves().size() > 0)
		{
			int randPos = (int)(Math.random() * state.getCurrentMoves().size());
			return state.getCurrentMoves().get(randPos);
		}
		return "no move";
	}
	public String toString()
	{
		return this.getName();
	}
}
