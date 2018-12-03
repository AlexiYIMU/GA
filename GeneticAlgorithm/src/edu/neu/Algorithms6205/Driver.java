package edu.neu.Algorithms6205;

import java.util.List;

public class Driver {

	public static void main(String[] args) {
		final int GROUP_SIZE = 20;
		final double CORSSOVER_P = 0.6;
		final double MUTATION_P = 0.01;
		final int EXPR_TIME = 50;
		GeneticAlgorithms theBest;
		for(int count = 0; count < EXPR_TIME; count++) {
			int geCount = 0;
			List<GeneticAlgorithms> group = GeneticAlgorithms.initGroup(GROUP_SIZE);
			do{
				geCount++;
				group = GeneticAlgorithms.crossover(group, CORSSOVER_P);
				GeneticAlgorithms.mutation(group, MUTATION_P);
				group = GeneticAlgorithms.selection(group, GROUP_SIZE);
				theBest = GeneticAlgorithms.best(group);
				//System.out.println(theBest.fitness());
			}while(theBest.fitness() < 80639);
			System.out.println(geCount);
		}
	}
	
}


