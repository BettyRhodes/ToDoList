import models.Task
import java.util.ArrayList

class ToDoList {

    var topTasks = ArrayList<Task>()
    var mediumTasks = ArrayList<Task>()
    var lowTasks = ArrayList<Task>()
    var id = 0

    fun printCommands() {
        println(
            "Commands: \n 1. Print Todo List \n 2. Add task on table one \n " +
                    "3. Add task on table two \n 4. Add task on table three \n 0. Exit"
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
        topTasks.mapIndexed{i, task ->
            "${i + 1}. ${task.title}"
        }.forEach(:: println)

        println("Table two")
        mediumTasks.mapIndexed{i, task ->
            "${i + 1}. ${task.title}"
        }.forEach(:: println)

        println("Table three")
        lowTasks.mapIndexed{i, task ->
            "${i + 1}. ${task.title}"
        }.forEach(:: println)
    }
}