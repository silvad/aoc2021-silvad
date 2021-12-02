fun main() {
    fun part1(input: List<String>): Int {
        var temp = 100000
        var depthIncreases = 0

        for (item in input) {
            if (item.toInt() > temp) {
                depthIncreases += 1
            }
            temp = item.toInt()

        }
        return depthIncreases
    }

    fun part2(input: List<String>): Int {
        return input.size
    }

    // test if implementation meets criteria from the description, like:
    val testInput = readInput("Day01-test")
    check(part1(testInput) == 3)

    val input = readInput("Day01")
    println(part1(input))
    println(part2(input))
}
