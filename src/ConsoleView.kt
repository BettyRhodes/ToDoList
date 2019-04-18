import java.util.*

    fun main(args: Array<String>) {

        val sc = Scanner(System.`in`)
        val list = ToDoList()
        list.printCommands()

        while (true) {
            print("\nEnter your command: ")
            val i = sc.nextLine()

            when (i) {
                "0" -> return

                "1" -> list.displayList()

                "2" -> {
                    print("\nEnter task at table 1(Top priority): ")
                    list.addTaskOnTableOne(sc.nextLine())
                }
                "3" -> {
                    print("\nEnter task at table 2(Medium priority): ")
                    list.addTaskOnTableTwo(sc.nextLine())
                }
                "4" -> {
                    print("\nEnter task at table 3(Low priority): ")
                    list.addTaskOnTableThree(sc.nextLine())
                }

                else -> println("Enter correct choice:\n")
            }
        }
    }
