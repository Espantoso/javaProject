package com.company;

/**
 * @author Alexander 29.06.2015.
 */

interface CheckeredPlaneFilledWithRectangles
{
	char Wall = '#', Free = ' ';
	public CheckeredPlaneFilledWithRectangles clone();
	boolean checkTheBorders();

	void setTheCell(int x, int y, char inputSymbol);
	char checkTheCell(int x, int y);

	Coordinates getTheStartPoint();

	void showThePlane();
	void outfileThePlane();

	int getThePlaneHeight();
	int getThePlaneWidth();
	char [][] getLab();
	void setLab(char [][] l);
	int getWidth();
	void setWidth(int x);
	int getHeight();
	void setHeight(int x);
}
