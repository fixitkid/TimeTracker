import grails.timesecurity.*
import timetracker2.*


class BootStrap {
	def springSecurityService

    def init = { servletContext ->
		
		def userRole = Authority.findByAuthority("ROLE_USER") ?: new Authority(authority: "ROLE_USER").save()
		def adminRole = Authority.findByAuthority("ROLE_ADMIN") ?: new Authority(authority: "ROLE_ADMIN").save()

		if (!Person.count()) {

			
				def user = new Person(
				username: "Rob",
				password: "Password",
				enabled: true).save()
				
				PersonAuthority.create user, userRole
				
				
			def user2 = new Person(
				username: "Dave",
				password: "Password",
				enabled: true).save()
				
				PersonAuthority.create user, adminRole
			}
	}
		
    def destroy = {}
	}
