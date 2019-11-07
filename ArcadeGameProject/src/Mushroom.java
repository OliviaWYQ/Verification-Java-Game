import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.geom.Rectangle2D;
import java.util.Random;


public class Mushroom extends Instance implements Collidable {
	
	private final Color NORMAL_COLOR = Color.GREEN;
	private final Color POISONED_COLOR = Color.MAGENTA;
	private int life;
	private boolean isPoisoned;
	

	public Mushroom(int x, int y,CentipedeComponent comp) {
		super(x, y,comp);
		this.isPoisoned = false;
		this.life=4;
	}
	
	public boolean getPoisonedStatus(){
		return this.isPoisoned;
	}
	
	@Override
	public Image getImage(){
		if(this.isPoisoned && this.life != 0){
			String fileName = LocalResources.ImgPoisonedMushroom.substring(0, LocalResources.ImgPoisonedMushroom.length()-5) + this.life + ".png";
			return Toolkit.getDefaultToolkit().getImage(fileName);
		}
		if(this.isPoisoned && this.life == 0){
			return Toolkit.getDefaultToolkit().getImage(LocalResources.ImgPoisonedMushroom);
		}
		if(!this.isPoisoned && this.life != 0){
			String fileName = LocalResources.ImgRegularMushroom.substring(0, LocalResources.ImgRegularMushroom.length()-5) + this.life + ".png";
			return Toolkit.getDefaultToolkit().getImage(fileName);
		}
		return Toolkit.getDefaultToolkit().getImage(LocalResources.ImgRegularMushroom);
	}
	
	@Override
	public String toString(){
		return "Mushroom";
	}
	
	@Override
	public void update(){
		this.sprite=new Rectangle2D.Double(x, y, this.BlockSIZE, this.BlockSIZE-(4-this.life)*5);
	}
	
	@Override
	public Color getColor(){
		if(!this.isPoisoned){
			return NORMAL_COLOR;
		}
		return POISONED_COLOR;
	}

	@Override
	public void collide(Collidable collidable) {
		collidable.collideWithMushroom(this);
		
	}

	@Override
	public void collideWithMushroom(Mushroom m) {
		// Cannot collide with a mushroom
		
	}

	@Override
	public void collideWithCharacter(PlayerCharacter c) {
		c.stop();
		
	}

	@Override
	public void collideWithBullet(Bullet b) {
		b.die();
		if(this.life>0){
			this.life--;	
		}
		if(this.life==0){
			this.die();
			this.comp.getCharacter().addScore(2);
		}
	}
	
	@Override
	public void collideWithBoomerang(Boomerang b){
		b.die();
		if(this.life>0){
			this.life--;	
		}
		if(this.life==0){
			this.die();
			this.comp.getCharacter().addScore(2);
		}
	}
	
	@Override
	public void collideWithShotgunShell(ShotgunShell s) {
		s.die();
		if(this.life>0){
			this.life--;	
		}
		if(this.life==0){
			this.die();
			this.comp.getCharacter().addScore(2);
		}
	}
	
	@Override
	public void collideWithCentipede(LinkedCentipede c){
		c.dropAndTurn();
	}
	
	@Override
	public void collideWithSpider(Spider s){
		Random rand = new Random();
		if(rand.nextInt(120) == 1){
			this.die();
		}
	}
	
	@Override
	public void collideWithScorpion(Scorpion s){
		this.isPoisoned = true;
	}

}
