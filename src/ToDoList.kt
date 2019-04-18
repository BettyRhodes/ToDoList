import models.Task
import java.util.ArrayList

class ToDoList {

    var topTasks = ArrayList<Task>()
    var mediumTasks = ArrayList<Task>()
    var lowTasks = ArrayList<Task>()
    var id = 0

    fun printCommands() {
        println(
            "Commands: \n" + "1. Print Todo List \n" + "2. Add task on table one \n" +
                    "3. Add task on table two \n" + "4. Add task on table three \n" + "0. Exit"
        )
    }

    fun addTaskOnTableOne(task: String) {
        topTasks.add(Task(id++, task))
    }

    fun addTaskOnTableTwo(task: String) {
        mediumTasks.add(Task(id++, task))
    }

    fun addTaskOnTableThree(task: String) {
        lowTasks.add(Task(id++, task))
    }

    fun displayList() {
        println("Table one")
        for (i in topTasks.indices)
            println((i + 1).toString() + ". " + topTasks[i].title)

        println("Table two")
        for(i in mediumTasks.indices)
            println((i + 1).toString() + ". " + mediumTasks[i].title)

        println("Table three")
        for(i in lowTasks.indices)
            println((i + 1).toString() + ". " + lowTasks[i].title)
    }
}