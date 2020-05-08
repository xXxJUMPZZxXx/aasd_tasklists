package org.ual.aas.tasklists;

import org.ual.aas.tasklists.models.Task;
import org.ual.aas.tasklists.models.TaskList;

public class App  {
	public static void printTaskList(TaskList taskList) {
		System.out.println(taskList.getName());
		for(Task task : taskList.getTasks()) {
			System.out.println(task.getDescription());
		}
	}
    public static void main( String[] args ) {
        TaskList taskList = new TaskList("Sample Task List");
        taskList.getTasks().add(new Task("1st task", "doing"));
        taskList.getTasks().add(new Task("2nd task", "doing"));
        taskList.getTasks().add(new Task("3rd task", "doing"));
        
        printTaskList(taskList);
    }
}
