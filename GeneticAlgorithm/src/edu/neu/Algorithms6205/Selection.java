package edu.neu.Algorithms6205;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Selection {
	public static List<GeneticAlgorithms> select(List<GeneticAlgorithms> fatherGroup,int sonGroupSize){
		List<GeneticAlgorithms> sonGroup = new ArrayList<GeneticAlgorithms>();
		int totalFitness = 0;
		double[] fitness = new double[fatherGroup.size()];
		for(GeneticAlgorithms chrom : fatherGroup) {
			totalFitness += chrom.fitness();
		}
		int index = 0;

		for(GeneticAlgorithms chrom : fatherGroup) {
			fitness[index] = chrom.fitness() / ((double)totalFitness);
			index++;
		}

		for(int i = 1; i < fitness.length; i++) {
			fitness[i] = fitness[i-1]+fitness[i];
		}
		
		for(int i = 0; i < sonGroupSize; i++) {
			Random random = new Random();
			double probability = random.nextDouble();
			int choose;
			for(choose = 1; choose < fitness.length - 1; choose++) {
				if(probability < fitness[choose])
					break;
			}
			sonGroup.add(new GeneticAlgorithms(fatherGroup.get(choose).getGene()));			
		}
		return sonGroup;
	}
}
