import java.util.*

object Todo {

    @JvmStatic
    fun main(args: Array<String>) {

        val sc = Scanner(System.`in`)
        val task = ToDoList()
        task.printCommands()
        var i = -1
        while (i != 0) {
            print("\nEnter your command: ")
            i = sc.nextInt()
            sc.nextLine()

            when (i) {
                0 -> {
                }

                1 -> task.displayList()

                2 -> {
                    print("\nEnter task at table 1(Top priority): ")
                    task.addTaskOnTableOne(sc.nextLine())
                }
                3 -> {
                    print("\nEnter task at table 2(Medium priority): ")
                    task.addTaskOnTableTwo(sc.nextLine())
                }
                4 -> {
                    print("\nEnter task at table 3(Low priority): ")
                    task.addTaskOnTableThree(sc.nextLine())
                }

                else -> println("Enter correct choice:\n")
            }
        }
        sc.close()
    }
}