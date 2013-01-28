package timetracker2

import java.util.Date;
import grails.timesecurity.*
import timetracker2.*

class Project {
	
	
	static hasMany = [persons: Person, classiffications: TimeClassification]
	
	int id
	String name
	int pmgNumber
	Projectmanagers projectManager
	String description
	Date estimatedCompletionDate
	int estimatedDuration
	Date dateCreated
	
	String toString() {
		return name
	}
	
	private Project(name, pmgNumber, projectManager, description, estimatedCompletionDate, estimatedDuration, dateCreated) {
		this.name = name
		this.pmgNumber = pmgNumber
		this.projectManager = projectManager
		this.description = description
		this.estimatedCompletionDate = estimatedCompletionDate
		this.estimatedDuration = estimatedDuration
		this.dateCreated = dateCreated
	}
	private static List _list;
	public static List getList() {
		Project._list
	}
    static constraints = {
		name blank: false
		description blank: false
		estimatedCompletionDate blank: false
		
    }
	static mapping = {
		table 'Project'
						cache true
		id column: 'Project_id'
		name column: 'Project_Name'
		pmgNumber column: 'PMG_No'
		description column: 'Description'
		estimatedCompletionDate column: 'Estimated_Completion'
		estimatedDuration column: 'Estimated_duration'
		dateCreated column: 'Date_Created'
	}
}
