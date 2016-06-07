package org.main;

import org.controller.Controller;
import org.model.Model;
import org.view.View;

public class Main {
	
	public static void main(String[] args) {
		
		Controller c = new Controller(new View(), new Model());
		c.run();
	}

}