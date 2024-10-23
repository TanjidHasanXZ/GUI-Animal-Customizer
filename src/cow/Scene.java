package cow;

import java.awt.Color;
import java.util.ArrayList;

import cow.graphicState.CowState;
import cow.graphicState.GhostState;
import cow.graphicState.HeadState;
import cow.graphicState.State;

public class Scene {
	private static final Scene INSTANCE = new Scene();
	private int scale;
	private int n;
	private ArrayList<Cow> cows; // aggregate
	private static State graphicState = CowState.getInstance();


	public void setN(int n) {
		this.n = n;
		cows = new ArrayList<Cow>();
		init(n);

	}

	public Scene() {
		scale = 2;
		cows = new ArrayList<Cow>();
		init(scale);
	}
	public static Scene getInstance() {
		return INSTANCE;
	}

	public void draw() {
		for (Cow i : cows) {
			if(graphicState.getClass() == CowState.class) {
				i.draw();
			}else if(graphicState.getClass() == HeadState.class) {
				i.getHead().draw();
			}else if(graphicState.getClass() == GhostState.class) {
				i.getBody().draw();
			}
			
		}
	}
	public static State getGraphicState() {
		return graphicState;
	}
	public static void setGraphicState(State graphicState) {
		Scene.graphicState = graphicState;
	}


	private void init(int scale) {
		for (int i = 1; i <= 33; i++) {
			boolean intersectFound = false;

			int x = RandomNumber.between(110, 2000);
			int y = RandomNumber.between(60, 300);

			if (cows.isEmpty()) {
				cows.add(new Cow(x, y, scale));
			} else {
				Cow newOne = new Cow(x, y, scale);

				for (Cow check : cows) {
					intersectFound = intersectFound || check.intersects(newOne);
				}

				if (!intersectFound) {
					cows.add(newOne);
				}
			}
		}
	}

	public void changeColorBody(Color c) {
		for (Cow i : cows) {
			i.getBody().setColor(c);
		}
	}

	public void changeColorHead(Color c) {
		for (Cow i : cows) {
			i.getHead().setColor(c);

		}
	}
}
