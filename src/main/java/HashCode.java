import java.io.IOException;

public class HashCode {

	public static void main(String[] args) {
		try {
			System.out.println("Started!");
			new HashCode().process();
			System.out.println("Finished!");
		} catch (IOException e) {
			System.out.println("Exception!");
			e.printStackTrace();
		}
	}

	private void process() throws IOException {
		System.out.println("Reading Input!");
		Input input = new InputReader().readInput("inputFileName");
		System.out.println("Processing!");
		Output output = new ProblemSolver().solveInput(input);
		System.out.println("Writing Output!");
		new OutPutWriter().writeOutPut(output, "outputFileName");
	}
}
