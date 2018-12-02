package edu.neu.Algorithms6205;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Crossover {
	public static List<GeneticAlgorithms> crossover(List<GeneticAlgorithms> father , Double probility){
		//TODO;
		List<GeneticAlgorithms> son = new ArrayList<>();
		son.addAll(father);
		Random r = new Random();
		for(int i=0; i<father.size()/2; i++) {
			if(probility > r.nextDouble()) {
				int a =0;
				int b = 0;
				do {
					a = r.nextInt(father.size());
					b = r.nextInt(father.size());
				}while(a == b);
				int position = r.nextInt(GeneticAlgorithms.GeneLength);
				String parent1 = father.get(a).getGene();
				String parent2 = father.get(b).getGene();
				String son1 = parent1.substring(0,position)+ parent2.substring(position);
				String son2 = parent2.substring(0,position)+ parent1.substring(position);
				son.add(new GeneticAlgorithms(son1));
				son.add(new GeneticAlgorithms(son2));
			}
		}
		
		return son;
	}
}
