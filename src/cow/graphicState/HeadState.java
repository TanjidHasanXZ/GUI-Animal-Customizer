package cow.graphicState;

public class HeadState extends State{
private static final HeadState INSTANCE = new HeadState();
	
	private HeadState() {}
	
	public static HeadState getInstance() {
		return INSTANCE;
	}

	@Override
	public State drawghost() {
		return GhostState.getInstance();
	}

	@Override
	public State drawHead() {
		return INSTANCE;
	}

	@Override
	public State drawCow() {
		return CowState.getInstance();
	}
}
