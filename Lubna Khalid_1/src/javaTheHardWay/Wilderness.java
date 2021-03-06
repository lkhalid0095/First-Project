package javaTheHardWay;

public class Wilderness extends Habitat{

	private String description;
	
	public Wilderness(String description, int livingCapacity){
		super(livingCapacity);
		this.description = description;
	}
	public static void main(String[] args) {
		Wilderness w = new Wilderness("An empty desert", 10);
		w.stimulate(3);
	}
	public String toString() {
		return this.description + "\n" + animalReport();
		}
	public void stimulate(int rounds) {
		// make all animals act combining ReproductionAnimal, and RoamingAnimal.
		for(int i=0; i < rounds; i++) {
			for(Animal a: getAnimals()) {
				if(a instanceof ReproductionAnimal)((ReproductionAnimal)a).reset();
			}
			int predatorCount = 0;
			int preyCount = 0;
			for(Animal a: getAnimals()) {
				if(a instanceof Predator) {
					predatorCount++;
				}
				else if(a instanceof Prey) {
					preyCount++;
				}
			}
			String s = "\nROUND " +(i+1)+ "\nPREDATORS: "+predatorCount+", PREY: "+preyCount+"\n"+animalReport();
			System.out.println(s);
			for(Animal a :getAnimals()) {
				if(a != null)a.act();
			}
			growPlants();
					
		}
	}

}
