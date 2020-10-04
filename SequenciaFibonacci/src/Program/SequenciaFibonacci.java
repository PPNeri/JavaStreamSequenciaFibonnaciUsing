package Program;

import java.util.Arrays;
import java.util.stream.Stream;

public class SequenciaFibonacci {

	public static void main(String[] args) {
		Stream<Long> limit = Stream.iterate(new Long[] { 0L, 1L }, par -> new Long[] { par[1], par[0] + par[1] })
				.map(par -> par[0]).limit(10);

		System.out.println(Arrays.toString(limit.toArray()));
	}

}
