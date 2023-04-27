object Hamming {

    fun compute(leftStrand: String, rightStrand: String): Int {
        var distance: Int = 0
        val leftLength = leftStrand.length
        val rightLength = rightStrand.length
        if (leftLength != rightLength) {
            throw IllegalArgumentException("left and right strands must be of equal length")
        }
        for (i in 0 until leftLength) {
            if (leftStrand[i] != rightStrand[i]) {
                distance++;
            }
        }
        return distance
    }
}
