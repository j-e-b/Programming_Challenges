import java.util.*;

/*
https://open.kattis.com/problems/2048
0, 1, 2, or 3 that denotes a left, up, right, or down
*/

class Tiles
{
	public static final int LEFT = 0;
	public static final int UP = 1;
	public static final int RIGHT = 2;
	public static final int DOWN = 3;

	public static int[][] board = new int[4][4];

	public static void main(String[] args)
	{
		Scanner stdin = new Scanner(System.in);

		// Fill the original state of the board.
		for (int i = 0; i < 4; i++)
		{
			for (int j = 0; j < 4; j++)
			{
				board[i][j] = stdin.nextInt();
			}
		}

		int movement = stdin.nextInt();

		if (movement == LEFT)
		{
			leftMove();
		}
		else if (movement == UP)
		{
			upMove();
		}
		else if (movement == RIGHT)
		{
			rightMove();
		}
		else if (movement == DOWN)
		{
			downMove();
		}

		// Print the board after the given move is made.
		for (int i = 0; i < 4; i++)
		{
			for (int j = 0; j < 4; j++)
			{
				System.out.print(board[i][j]);

				if (j != 3)
				{
					System.out.print(" ");
				}
			}

			System.out.println();
		}
	}

	public static void leftMove()
	{
		// Slide pieces over
		for (int i = 3; i >= 1; i--)
		{
			if (board[0][i] == board[0][i - 1])
			{
				board[0][i - 1] += board[0][i];

				for (int j = 3; j > i - 1; j--)
				{
					
				}
			}
		}
	}

	public static void upMove()
	{

	}

	public static void rightMove()
	{

	}

	public static void downMove()
	{

	}
}
