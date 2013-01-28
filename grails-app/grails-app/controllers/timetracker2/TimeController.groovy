package timetracker2

import grails.timesecurity.*
import grails.plugins.springsecurity.Secured;

class TimeController {
	
	
	def springSecurityService
	//@Secured(["ROLE_USER", "ROLE_ADMIN"])
	//def validateUser(){
  
	
	static scaffold = true
	
	
	
	
 
	
	def findUser = {
		def auth = springSecurityService.authentication
		String username = auth.username
		return username
		}
	
	 
	
	
	
	//private currentUserListTimes() {
		//def per = lookupPerson()
		//def listTimes = Status.withCriteria {
			//author {
				//eq 'username', per.username
		//	}
			//maxResults 10
		//	order 'dateCreated', 'desc'
		//}
	//	listTimes
//	}
	
	
	//}
	private lookupPerson() {
		Person.get(springSecurityService.principal.username)
	}
}
