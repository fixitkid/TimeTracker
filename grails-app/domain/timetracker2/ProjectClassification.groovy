package timetracker2

class ProjectClassification {
	
	static belongsTo = Project
	static hasMany = [timeClassifications: TimeClassification]
	
	int id
	Project project
	TimeClassification timeClassification
	
	
	//static mapping = {
		//id composite: ['project', 'timeClassification']
	//	table 'Project_Classifications'
		//	cache true
	//	id column: 'PC_ID'
		
//	}
	
}
