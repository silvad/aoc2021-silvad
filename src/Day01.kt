fun main() {
    fun part1(input: List<String>): Int {
        var depthIncreases = 0

        for (i in 0..input.size - 2) {
            if (input[i].toInt() < input[i+1].toInt()) {
                depthIncreases += 1
            }
        }
        return depthIncreases
    }

    fun part2(input: List<String>): Int {
        var depthSumIncreases = 0
        var a: Int
        var b: Int

        for (i in 0..input.size - 4) {
            a = input[i].toInt() + input[i+1].toInt() + input[i+2].toInt()
            b = input[i+1].toInt() + input[i+2].toInt() + input[i+3].toInt()

            if (b > a) {
                depthSumIncreases += 1
            }
        }

        return depthSumIncreases
    }

    // test if implementation meets criteria from the description, like:
    val testInput = readInput("Day01-test")
    check(part1(testInput) == 3)
    check(part2(testInput) == 2)

    val input = readInput("Day01")
    println(part1(input))
    println(part2(input))
}
