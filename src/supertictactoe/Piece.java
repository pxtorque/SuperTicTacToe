package supertictactoe;

import java.awt.Color;

public class Piece {
	private String value;
	private Color color;

	public Piece(String value) {
		setValue(value);
	}

	public boolean isX() {
		if (value.equals("X"))
			return true;
		return false;
	}

	public boolean isO() {
		if (value.equals("O"))
			return true;
		return false;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public Color getColor() {
		return color;
	}

	public String toString() {
		return value;
	}
}