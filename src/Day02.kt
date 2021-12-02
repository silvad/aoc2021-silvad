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

        return input.size
    }

    val testInput = readInput("Day02-test")
    check(part1(testInput) == 494)
    check(part2(testInput) == 9)

    val input = readInput("Day02")
    println(part1(input))
    println(part2(input))
}