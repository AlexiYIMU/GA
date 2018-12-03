package UnitTest;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

import edu.neu.Algorithms6205.GeneticAlgorithms;
import edu.neu.Algorithms6205.Selection;

class SelectionTest {

	@Test
	void test() {
		final int GROUP_SIZE = 20;
		Double probility = 0.01;
		List<GeneticAlgorithms> fatherGroup = GeneticAlgorithms.initGroup(GROUP_SIZE);
		List<GeneticAlgorithms> sonGroup = Selection.select(fatherGroup, GROUP_SIZE);
		System.out.println(fatherGroup);
		System.out.println(sonGroup);
		for(int i=0; i<sonGroup.size();i++) {
			if(fatherGroup.get(i)!= sonGroup.get(i)) {
				assertFalse(fatherGroup.get(i)==sonGroup.get(i));
			}
		}
	}

}
