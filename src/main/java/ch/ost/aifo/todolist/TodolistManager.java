package ch.ost.aifo.todolist;

import java.util.Hashtable;

public class TodolistManager {
	private Hashtable<String, Todolist> todolists;
	
	public TodolistManager(){
		todolists = new Hashtable<String, Todolist>();
		createTodolist("default");
	}
	
	public Todolist createTodolist(String name) {
		// TODO: handle name already exists
		return todolists.put(name, new Todolist());
	}
	
	
	public Todolist getTodolist(String name) {
		// TODO: handle name not found
		return todolists.get(name);
	}
}
