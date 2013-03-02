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
	TimeClassification classification
	String currentUser	

	def beforeInsert() {
		currentUser = springSecurityService.principal.username }
	def beforeUpdate() {
		currentUser = springSecurityService.principal.username }
//  String currentUser = {
//		def user = springSecurityService.getCurrentUser()
//		String username = user
//		return username
//	}
	
	static constraints = {
		timeSpent blank: false
		classification blank: true
		currentUser display: false, nullable: true 
		
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
