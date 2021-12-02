fun main() {

    fun part1(input: List<String>): Int {
        var horizontal = 0
        var depth = 0

        for (instruction in input) {
            val direction = instruction.split(" ")[0]
            val value = instruction.split(" ")[1].toInt()

            when (direction) {
                "forward" -> horizontal += value
                "down" -> depth += value
                "up" -> depth -= value
            }
        }

        return horizontal*depth
    }

    fun part2(input: List<String>): Int {
        var horizontal = 0
        var depth = 0
        var aim = 0

        for (instruction in input) {
            val direction = instruction.split(" ")[0]
            val value = instruction.split(" ")[1].toInt()

            when (direction) {
                "forward" -> {
                    horizontal += value
                    depth += aim*value
                }
                "down" -> aim += value
                "up" -> aim -= value
            }
        }

        return horizontal*depth
    }

    // tests using the input file limited to the first 9 entries
    val testInput = readInput("Day02-test")
    check(part1(testInput) == 494)
    check(part2(testInput) == 1248)

    val input = readInput("Day02")
    println(part1(input))
    println(part2(input))
}