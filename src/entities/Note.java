package entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Note {
	private String title = "Nova nota";
	private Date initialDate;
	private Date finalDate;
	private String observation;
	private static Integer total = 0;
	//Uso de Composição
	private List<Task> tasks = new ArrayList<>();
	
	//Construtores
	public Note() {
		total +=1;
	}
	
	public Note(String title, Date initialDate, Date finalDate, String observation) {
		this.title = title;
		this.initialDate = initialDate;
		this.finalDate = finalDate;
		this.observation = observation;
		total +=1;
	}
	
	//Getters e Setters
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getObservation() {
		return observation;
	}
	public void setObservation(String observation) {
		this.observation = observation;
	}
	public Date getInitialDate() {
		return initialDate;
	}

	public Date getFinalDate() {
		return finalDate;
	}
	
	public void addTask(Task task) {
		
	}
	
	public void removeTask(Task task) {
		
	}
	
	public void setDates(Date initial_date,Date final_date) {
		//add verificacao
		Boolean verify = true;
		if(verify) {
			this.finalDate = final_date;
			this.initialDate = initial_date;
		}
	}
	
	public Integer total() {
		return total;
	}

}
