package chapter10;

public interface Printable2 {
	void print(String doc);
	default void printCMYK(String doc) {}
}
