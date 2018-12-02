package edu.neu.Algorithms6205;

import java.util.List;
import java.util.Random;

public class Mutation {
	public void selfMutation(String gene) {
		
	}
	public static void mutation(List<GeneticAlgorithms> fatherGroup , Double probability) {
		//TODO;
		Random r = new Random();
		GeneticAlgorithms bestOne = GeneticAlgorithms.best(fatherGroup);
		fatherGroup.add(new GeneticAlgorithms(bestOne.getGene()));
		for(GeneticAlgorithms G: fatherGroup) {
			String newGene = G.getGene();
			for(int i = 0; i<newGene.length();i++) {
				if(probability > r.nextDouble()) {
					String replace = newGene.charAt(i) == '0' ? "1" : "0";
					newGene = newGene.substring(0, i) + replace + newGene.substring(i+1);
				}
			}
			G.selfMutation(newGene);
		}
	}
}
