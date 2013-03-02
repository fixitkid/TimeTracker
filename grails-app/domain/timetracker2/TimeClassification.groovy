package timetracker2

class TimeClassification {
	
	static belongsTo = Project
	static hasMany = [projects: Project]

	int id
	String code
	String classificationName
	String description
	
	String toString() {
		return classificationName
	}
	
	static constraints = {
    }
	
	static mapping = {
		table 'Time_Classification'
						cache true
		id column: 'TC_id'
		code column: 'TC_Code'
		classificationName column: 'TC_Name'
		description column: 'TC_Description'
	}
}
