package com.github.pnowy.various.patterns.behavioral.templateMethod.mypattern;

/**
 * Przemek Nowak <przemek.nowak.pl@gmail.com>
 * Date: 02.06.13 13:47
 */
public abstract class Game
{
	protected int playersCount;

	abstract void initializeGame();

	abstract void makePlay(int player);

	abstract boolean endOfGame();

	abstract void printWinner();

	/* A template method : */
	public final void playOneGame(int playersCount)
	{
		this.playersCount = playersCount;
		initializeGame();
		int j = 0;
		while (!endOfGame())
		{
			makePlay(j);
			j = (j + 1) % playersCount;
		}
		printWinner();
	}
}
