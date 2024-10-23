package cow.graphicState;

import cow.Scene;

public class CowState extends State {	
private static final CowState INSTANCE = new CowState();
	
	private CowState() {
		context = Scene.getInstance();
	}
	
	public static CowState getInstance() {
		return INSTANCE;
	}

	@Override
	public State drawghost() {
		return GhostState.getInstance();
	}

	@Override
	public State drawHead() {
		return HeadState.getInstance();
	}

	@Override
	public State drawCow() {
		return INSTANCE;
	}

}
