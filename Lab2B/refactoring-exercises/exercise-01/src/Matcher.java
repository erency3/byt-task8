public class Matcher {
	public Matcher() {
	}

	public boolean match(int[] expected, int[] actual, int clipLimit, int delta) {
		//bad smells: this method is doing too many things we can break it down to smaller methods doing one thing at a time
		// Clip "too-large" values
		clip(actual, clipLimit);


		// Check for length differences
		if (!areArrayLengthsEqual(expected, actual)) {
			return false;
		}
			
		// Check that each entry within expected +/- delta
		if (!istheEntryinExpectedDelta(expected, actual, delta)) {
			return false;
		}

		return true;
	}
	
	private void clip (int [] actual, int clipLimit ) {
		for (int i = 0; i < actual.length; i++)
			if (actual[i] > clipLimit)
				actual[i] = clipLimit;
	}
	
	private boolean areArrayLengthsEqual (int[] expected, int[] actual) {
		if (actual.length != expected.length) {
			return false;
		}
			
		return true;
	}
	
	private boolean istheEntryinExpectedDelta (int[] expected, int[] actual, int delta ) {
		for (int i = 0; i < actual.length; i++) {
			if (Math.abs(expected[i] - actual[i]) > delta)
				return false;
		}
			return true;
	}
	
}