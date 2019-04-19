import models.Task
import java.util.*
import kotlin.collections.ArrayList

class ToDoList {

    var topTasks = ArrayList<Task>()
    var mediumTasks = ArrayList<Task>()
    var lowTasks = ArrayList<Task>()
    var id = 0

    fun printCommands() {
        println(
            "Commands: \n 1. Print Todo List \n 2. Add task on table one \n " +
                    "3. Add task on table two \n 4. Add task on table three \n 5. Add comments \n 0. Exit"
        )
    }

    fun addTaskOnTableOne(task: String) {
        topTasks.add(Task(id++, task, ArrayList()))
    }

    fun addTaskOnTableTwo(task: String) {
        mediumTasks.add(Task(id++, task, ArrayList()))
    }

    fun addTaskOnTableThree(task: String) {
        lowTasks.add(Task(id++, task, ArrayList()))
    }

    private fun writeComment(task: Task){
        val sc = Scanner(System.`in`)
        val i = sc.next()
        task.comments.add(i)
    }

    private fun searchTask(listTask: ArrayList<Task>, task: String){
        for (i in 0 until listTask.size) {
            if(listTask[i].title == task){
                println(listTask[i].title)
                println("Comments")

                listTask[i].comments.mapIndexed { index, comment ->
                    "${index + 1}. $comment"
                }.forEach (:: println)

                println("Enter your comment: ")
                writeComment(listTask[i])
            }
        }
    }

    fun addComment(task: String) {
        searchTask(topTasks, task)
        searchTask(mediumTasks, task)
        searchTask(lowTasks, task)
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