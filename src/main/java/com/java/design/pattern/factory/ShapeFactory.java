package com.java.design.pattern.factory;

import com.java.design.pattern.model.Circle;
import com.java.design.pattern.model.Rectangle;
import com.java.design.pattern.model.Shape;
import com.java.design.pattern.model.Square;
import com.java.design.pattern.model.Triangle;

public class ShapeFactory {
	public static Shape getShape(String ShapeType) {
		if (ShapeType == null) {
			return null;
		}
		if (ShapeType.equalsIgnoreCase("CIRCLE")) {
			return new Circle();
		} else if (ShapeType.equalsIgnoreCase("RECTANGLE")) {
			return new Rectangle();

		} else if (ShapeType.equalsIgnoreCase("SQARE")) {
			return new Square();

		} else if (ShapeType.equalsIgnoreCase("TRIANGLE")) {
			return new Triangle();

		}
		return null;
	}

}
