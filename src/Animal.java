
public class Animal extends Item {
	/**
	 * 
	 * @param classification
	 * @param laysEggs
	 * @param givesBirth
	 * @param isColdBlooded
	 * @param hasHair
	 * @param hasFeathers
	 * @param hasScales
	 * @param sweats
	 * @param hasTeeth
	 * @param canFly
	 */
	public Animal(int classification,  boolean laysEggs, boolean givesBirth,boolean isColdBlooded, boolean hasHair, boolean hasFeathers, boolean hasScales, boolean sweats, boolean hasTeeth,boolean canFly) {
		super(new boolean[]{laysEggs,givesBirth,isColdBlooded,hasHair,hasFeathers,hasScales,sweats,hasTeeth,canFly},classification);
	}
	/**
	 * 
	 * @param laysEggs
	 * @param givesBirth
	 * @param isColdBlooded
	 * @param hasHair
	 * @param hasFeathers
	 * @param hasScales
	 * @param sweats
	 * @param hasTeeth
	 * @param canFly
	 */
	public Animal(boolean laysEggs, boolean givesBirth,boolean isColdBlooded, boolean hasHair, boolean hasFeathers, boolean hasScales, boolean sweats, boolean hasTeeth,boolean canFly) {
		super(new boolean[]{laysEggs,givesBirth,isColdBlooded,hasHair,hasFeathers,hasScales,sweats,hasTeeth,canFly});
	}

}
