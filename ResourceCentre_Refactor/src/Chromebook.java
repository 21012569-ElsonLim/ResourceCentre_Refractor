
public class Chromebook extends Item{
	private String os;

	public Chromebook(String assetTag, String description, String os) {
		super(assetTag, description);
		this.os = os;
	}

	public String getOs() {
		return os;
	}
	
	public String toString(){
<<<<<<< HEAD
=======
		String output = super.toString();
>>>>>>> branch 'master' of https://github.com/21012569-ElsonLim/ResourceCentre_Refractor.git
		// Write your codes here
<<<<<<< HEAD
		String output = super.toString();
		output = String.format("%-63s %-20s", output, os);
=======
		output = String.format("%-63s %-20s", output,os);
>>>>>>> branch 'master' of https://github.com/21012569-ElsonLim/ResourceCentre_Refractor.git
		return output;
	}
}


