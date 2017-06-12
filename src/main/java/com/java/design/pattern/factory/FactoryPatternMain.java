package com.java.design.pattern.factory;

import com.java.design.pattern.model.Shape;

/*This example represents Factory design pattern.Which comes under creational design pattern.*/

public class FactoryPatternMain {
	public static void main(String[] args) {
		Shape cShape = ShapeFactory.getShape("circle");
		cShape.drawShape();
		Shape rShape = ShapeFactory.getShape("Rectangle");
		rShape.drawShape();
		Shape sShape = ShapeFactory.getShape("SQARE");
		sShape.drawShape();
		Shape tShape = ShapeFactory.getShape("Triangle");
		tShape.drawShape();
	}

}
