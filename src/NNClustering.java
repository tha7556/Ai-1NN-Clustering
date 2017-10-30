
public class NNClustering {
	private Item[] knownSamples;
	private String[] classifications;
	
	public NNClustering(Item[] knownSamples,String[] classifications) {
		this.knownSamples = knownSamples;
		this.classifications = classifications;
	}
	public String evaluateSample(Item unknown) {
		if(unknown.getClassification() == -1) {
			double min = 100000000.0;
			for(Item known : knownSamples) {
				double distance = calcDistance(known,unknown);
				if(distance < min) {
					min = distance;
					unknown.setClassification(known.getClassification());
				}
			}
		}
		return classifications[unknown.getClassification()];
	}
	private double calcDistance(Item known, Item unknown) {
		double distance = 0.0;
		for(int i = 0; i < known.getFeatures().length; i++) {
			distance += Math.pow((known.getFeaturesAsInt()[i] - unknown.getFeaturesAsInt()[i]),2);
		}
		return Math.sqrt(distance);
	}
	public static void main(String[] args) {
		String[] classes = {"Mammal","Reptile","Bird"};
		Animal human = new Animal(0, false, true, false, true, false, false, true, true, false);
		Animal dog = new Animal(0, false, true, false, true, false, false, true, true, false);
		Animal eagle = new Animal(2,true, false, false, false, true, false, false, false, true);
		Animal chicken = new Animal(2, true, false, false, false, true, false, false, false, false);
		Animal chameleon = new Animal(1, true, false, true, false, false, true, false, true, false);
		Animal snake = new Animal(1, true, false, true, false, false, true, false, true, false);
		Animal[] samples = {human,dog,eagle,chicken,chameleon,snake};
		
		Animal cat = new Animal(false, true, false, true, false, false, true, true, false);
		NNClustering nn = new NNClustering(samples,classes);
		
		System.out.println("The sample is a: "+nn.evaluateSample(cat));
	}
}
