package timetracker2
import grails.timesecurity.*
import timetracker2.TimeController
class Time {
	
	def springSecurityService
	
	
	int id
	Project projectname
	Date dateCreated
	Date dateWorked
	Double timeSpent
	TimeClassification Classification
		
//	String findUser = {
//		def auth = springSecurityService.authentication
//		String username = auth.username
//		return username
//		}
	
	
//	String projectName = {
//		def project = Project.list()
//	}
	
	String currentUser = {
		def user = springSecurityService.getCurrentUser()
		String username = user
		return username
	}
	
	static constraints = {
		timeSpent blank: false
	}
	static mapping = {
		table 'Time'
						cache true
		id column: 'Time_id'
		dateCreated column: 'Date_created'
		dateWorked column: 'Date_Worked'
		timeSpent column: 'Time_Spent'
		currentUser column: 'Username'
		}
}
