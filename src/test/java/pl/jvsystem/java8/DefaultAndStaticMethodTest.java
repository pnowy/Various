package pl.jvsystem.java8;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

import org.junit.Test;
import pl.jvsystem.java8.beans.Formula;
import pl.jvsystem.java8.beans.MagicFormula;
import pl.jvsystem.java8.interfaces.Implementation;
import pl.jvsystem.java8.interfaces.MiddleInterface;
import pl.jvsystem.java8.interfaces.SubInterface;
import pl.jvsystem.java8.interfaces.SuperInterface;

/**
 * Date: 2014-05-03 14:01
 */
public class DefaultAndStaticMethodTest {

	@Test
	public void defaultMethodTest() {
		Formula f = new MagicFormula();
		double calculateResult = f.calculate(100);
		double sqrtResult = f.sqrt(16);
		assertThat(calculateResult).isEqualTo(100);
		assertThat(sqrtResult).isEqualTo(4);
	}

	@Test
	public void testAccessingDefaultMethod() throws Exception {
		Formula f = new MagicFormula();
		assertThat(f.sqrt(16)).isEqualTo(4);
	}

	@Test
	public void testStaticMethod() throws Exception {
		double x = Formula.max(10, 12);
		assertThat(x).isEqualTo(12);
	}

	@Test
	public void testControlFlow() throws Exception {
		List<String> names = Arrays.asList("peter", "anna", "mike", "xenia");
		assertThat(names.stream().anyMatch(Objects::isNull)).isFalse();
	}

	@Test
	public void testAddedForEachAtIterables() {
		List<String> list = Arrays.asList("A", "FirsT", "DefaulT", "LisT");
		list.forEach(it -> System.out.println(it));
		list.forEach(System.out::println);
	}

	@Test
	public void testHierarhyOfDefaultMethods() {
		SubInterface sub = new Implementation();
		sub.printName();

		MiddleInterface middle = new Implementation();
		middle.printName();

		SuperInterface sup = new Implementation();
		sup.printName();
	}

}
