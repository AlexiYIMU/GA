package edu.neu.Algorithms6205;

import java.util.List;

public class Driver {

	public static void main(String[] args) {
		final int GROUP_SIZE = 20;
		final double CORSSOVER_P = 0.6;
		final double MUTATION_P = 0.01;
		List<GeneticAlgorithms> group = GeneticAlgorithms.initGroup(GROUP_SIZE);
		GeneticAlgorithms theBest;
		do{
			group = GeneticAlgorithms.crossover(group, CORSSOVER_P);
			GeneticAlgorithms.mutation(group, MUTATION_P);
			group = GeneticAlgorithms.selection(group, GROUP_SIZE);
			theBest = GeneticAlgorithms.best(group);
			System.out.println(theBest.fitness());
		}while(theBest.fitness() <32258);
	}
}


