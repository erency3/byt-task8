import java.io.IOException;
import java.io.Writer;

public class Client {
	//bad smell: Shotgun surgery
	//all the methods can be implemented in one class 
	public static void printPerson(Writer out, Person person) throws IOException {
		out.write(person.first);
		out.write(" ");
		if (person.middle != null) {
			out.write(person.middle);
			out.write(" ");
		}
		out.write(person.last);
	}
	public static String formatPerson(Person person) {
		String result = person.last + ", " + person.first;
		if (person.middle != null)
			result += " " + person.middle;
		return result;
	}
	
	public static void display(Writer out, Person person) throws IOException {
		out.write(person.last);
		out.write(", ");
		out.write(person.first);
		if (person.middle != null) {
			out.write(" ");
			out.write(person.middle);
		}
	}
	public static String toString(Person person) {
		return person.last + ", " + person.first
				+ ((person.middle == null) ? "" : " " + person.middle);
	}
	
}
