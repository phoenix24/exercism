class DifferenceOfSquaresCalculator {

    int computeSquareOfSumTo(int input) {
        int total = (input * (input + 1)) >> 1;
	return total * total;
    }

    int computeSumOfSquaresTo(int input) {
	int result = 0;
	for (int i = 1; i < input + 1; i++) {
	    result += (i * i);
	}
        return result;
    }

    int computeDifferenceOfSquares(int input) {
	int x1 = computeSquareOfSumTo(input);
	int x2 = computeSumOfSquaresTo(input);
        return x1 - x2;
    }

}
