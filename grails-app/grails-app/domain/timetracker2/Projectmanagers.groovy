package timetracker2

class Projectmanagers {
	
	int id
	String fullName
	
	String toString() {
		return fullName
	}
	
    static constraints = {
		
    }
	
	static mapping = {
		table 'Project_Managers'
						cache true
		id column: 'PM_id'
		fullName column: 'PM_Name'
		}
}
