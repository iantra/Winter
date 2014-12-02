package lwjglgame;

import org.newdawn.slick.opengl.Texture;

public class BackgroundChunk extends GameObject{
	private final int index;
	private Collectible item;
	public BackgroundChunk(int x, int y, int i, int index){
		super(x, y, Assets.backgrounds[i]);
		item = new Collectible(x, Globals.screenHeight*15/20, index);
		this.index = index;
	}
	
	public int getIndex(){
		return index;
	}
	
	public void render(){
		super.render();
		if(!item.wasCollected)
		item.render();
	}
	
	public void update(float _dt){
		super.update(_dt);
		if(!item.wasCollected)
		item.update(_dt);
	}
}
