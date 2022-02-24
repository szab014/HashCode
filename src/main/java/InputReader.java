import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class InputReader {

	public Input readInput(String fileName) throws IOException {
		Path path = Paths.get(fileName);
		List<String> linesOfFile = Files.readAllLines(path);
		return new Input(linesOfFile);
	}

}
