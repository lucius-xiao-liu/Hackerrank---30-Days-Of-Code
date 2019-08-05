// Hashmap may be better

    Difference(int[] elements) {
        this.elements = elements;
    }

    void computeDifference() {
        for (int i = 0; i < elements.length; i++) {
            for (int j = i + 1; j < elements.length; j++) {
                maximumDifference = Math.max(maximumDifference, Math.abs(elements[i] - elements[j]));
            }
        }
    }
}
