package caveExplorer;

public interface KhalidSupporter {

	/**
	 * 
	 * @return the total value of all collected treasure
	 */
	int getTotalTreasure();

	/**
	 * 
	 * @return the 2D playing field
	 */
			
	LubnaKhalidPlot[][] getPlots();

	/**
	 * 
	 * @return int[] of length 2 containing coordinates parsed from user input
	 */
	int[] getCoordInput();

	/**
	 * called whenever a plot is digged up
	 * 
	 * @param p the Plot that was just dug up
	 */
	void reveal(LubnaKhalidPlot p);

}
