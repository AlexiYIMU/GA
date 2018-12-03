package UnitTest;

import static org.junit.jupiter.api.Assertions.assertFalse;

import java.io.IOException;
import java.util.List;

import org.junit.jupiter.api.Test;

import Util.DeepCopy;
import edu.neu.Algorithms6205.GeneticAlgorithms;
import edu.neu.Algorithms6205.Mutation;

class MutationTest{

	@Test
	void Mutationtest() throws ClassNotFoundException, IOException {
		final int GROUP_SIZE = 20;
		Double probility = 0.01;
		List<GeneticAlgorithms> fatherGroup = GeneticAlgorithms.initGroup(GROUP_SIZE);
		List<GeneticAlgorithms> sonGroup = DeepCopy.depCopy(fatherGroup);
		Mutation.mutation(sonGroup, probility);
		System.out.println(fatherGroup);
		System.out.println(sonGroup);
		for(int i=0; i<fatherGroup.size();i++) {
			if(fatherGroup.get(i)!=sonGroup.get(i)) {
				assertFalse(fatherGroup.get(i)==sonGroup.get(i));
				return;
			}
		}
	}
	
}
