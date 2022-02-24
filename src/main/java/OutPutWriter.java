import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class OutPutWriter {

	public void writeOutPut(Output output, String fileName) throws IOException {
		Path path = Paths.get(fileName);
		Files.write(path, output.getLinesToWrite());
	}

}
