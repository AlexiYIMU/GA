package UnitTest;

import static org.junit.Assert.assertFalse;

import java.util.List;

import org.junit.jupiter.api.Test;

import edu.neu.Algorithms6205.Crossover;
import edu.neu.Algorithms6205.GeneticAlgorithms;

class CrossoverTest {

	@Test
	void Crossovertest() {
		final int GROUP_SIZE = 20;
		final double CROSSOVER_P = 0.6;
		List<GeneticAlgorithms> fatherGroup = GeneticAlgorithms.initGroup(GROUP_SIZE);
		List<GeneticAlgorithms> sonGroup = Crossover.crossover(fatherGroup, CROSSOVER_P);
		System.out.println(fatherGroup);
		System.out.println(sonGroup);
		assertFalse(fatherGroup.size()==sonGroup.size());
		
	}

}
