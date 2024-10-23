package cow.graphicState;

import cow.Scene;

public abstract class State {
	
	protected Scene context ;
	
	protected static CowState cow;
	protected static HeadState head ;
	protected static GhostState body ;
	
	public abstract State drawCow();
	public abstract State drawHead(); 
	public abstract State drawghost();

}
