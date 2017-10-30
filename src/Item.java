
public abstract class Item {
	protected boolean[] features;
	protected int classification;
	
	public Item(boolean[] features,int classification) {
		this.features = features;
		this.classification = classification;
	}
	public Item(boolean[] features) {
		this(features,-1);
	}
	public boolean[] getFeatures() {
		return features;
	}
	public int getClassification() {
		return classification;
	}
	public void setClassification(int classification) {
		this.classification = classification;
	}
	public int[] getFeaturesAsInt() {
		int[] result = new int[features.length];
		for(int i = 0; i < features.length; i++) {
			if(features[i])
				result[i] = 1;
			else
				result[i] = 0;
		}
		return result;
	}

}
