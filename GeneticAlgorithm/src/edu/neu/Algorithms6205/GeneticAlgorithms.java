package edu.neu.Algorithms6205;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/*
 * We use GeneticAlgorithms to solve the maximum of the specific function;
 * our function is f(x) = x^2 + y^2; x ∈[1,127], y∈[1,127]
 * we have six parts in our GeneticAlgorithms,those are Initialization, Fitness calculation,Selection calculation,
 * Crossover, Mutation, test, respectively. 
 */


/*
 *  Design class;
 */
public class GeneticAlgorithms {
	public final static int GeneLength = 17;
	public final static int max_x = 127;
	public final static int max_y = 127;
	
	private int x;
	private int y;
	private String gene;
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public String getGene() {
		return gene;
	}
	public void setGene(String gene) {
		this.gene = gene;
	}
	
	public GeneticAlgorithms(int x, int y) {
		if(x > max_x || y > max_y || x <0 || y < 0) return;
		this.x = x;
		this.y = y;
		String temp = Integer.toBinaryString(x);
		for(int i = 0; i<GeneLength/2; i++) {
			temp = "0" + temp;
		}
		gene = temp;
		temp = Integer.toBinaryString(y);
		for(int i = 0; i<GeneLength/2; i++) {
			temp = "0" + temp;
		}
		
		gene = gene + temp;
	}
	
	public GeneticAlgorithms(String gene) {
		if(gene.length() != GeneLength) return;
		String xPart = gene.substring(0, GeneLength/2);
		String yPart = gene.substring(GeneLength);
		this.x = Integer.parseInt(xPart,2);
		this.y = Integer.parseInt(yPart,2);
	}
	
	@Override
	public String toString() {
		return "GeneticAlgorithms [x=" + x + ", y=" + y + ", gene=" + gene + "]";
	}
	
	/*
	 * Initialization;
	 */
	public static List<GeneticAlgorithms> initGroup(int size){
		List<GeneticAlgorithms> firstGen = new ArrayList<>();
		Random r = new Random();
		for(int i=0; i<size; i++) {
			int x = r.nextInt()% 128;
			int y = r.nextInt()% 128;
			x = x < 0? (-x) : x;
			y = y < 0? (-y) : y;
			firstGen.add(new GeneticAlgorithms(x,y));
		}
		return firstGen;
	}
	/*
	 * Fitness calculation;
	 */
	public static int fitness() {
		//TODO;
		return 0;
	}
	
	/*
	 * Selection calculation;
	 */
	
	public static List<GeneticAlgorithms> selection(){
		//TODO;
		return Selection.select();
	}
	
	/*
	 * CrossOver;
	 */
	
	public static List<GeneticAlgorithms> crossover(){
		//TODO;
		return Crossover.crossover();
	}
	
	/*
	 * Mutation;
	 */
	public static void mutation() {
		//TODO;
		Mutation.mutation();
		return;
	}
	
	
	
	
	
	
	
	
	
	
}
