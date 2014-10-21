import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

public class GeneratePage {

	public static void main(String[] args) throws IOException {
		File currentDir = new File("./");
		File[] files = currentDir.listFiles();
		PrintWriter pw = new PrintWriter(new FileOutputStream("output"));
		Map<String, List<File>> groups = new HashMap<String, List<File>>();
		for (File file : files) {
			String prefix = file.getName().split("\\-")[0];
			if (!groups.containsKey(prefix)) {
				groups.put(prefix, new ArrayList<File>());
			}
			groups.get(prefix).add(file);
		}
		PriorityQueue<String> pq = new PriorityQueue<String>();
		pq.addAll(groups.keySet());
		while (!pq.isEmpty()) {
			String key = pq.poll();
			List<File> element = groups.get(key);
			List<File> reactions = new ArrayList<File>();
			List<File> originals = new ArrayList<File>();
			for (File f : element) {
				if (f.getName().contains("Reaction"))
					reactions.add(f);
				else
					originals.add(f);
			}
			pw.println("<tr>");
			pw.print("<td>");
			pw.print(key);
			pw.println("</td>");
			pw.print("<td>");
			for (File origin : originals) {
				pw.println(MessageFormat.format(
						"<a href=\"document/{0}\">{0}</a>", origin.getName()));
			}
			pw.println("</td>");
			pw.print("<td>");
			for (File reaction : reactions) {
				pw.println(MessageFormat.format(
						"<a href=\"document/{0}\">{0}</a>", reaction.getName()));
			}
			pw.println("</td>");
			pw.println("</tr>");
		}

		pw.close();
	}
}

