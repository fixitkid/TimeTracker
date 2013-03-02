package grails.timesecurity
import timetracker2.*

class Person {
	
	static hasMany = [persons: Person]
		
	
	transient springSecurityService
	
	int id
	String username
	String password
	boolean enabled
	boolean accountExpired
	boolean accountLocked
	boolean passwordExpired
	
	String toString() {
		return username
	}
	
	static constraints = {
		username blank: false, unique: true
		password blank: false
	}

	static mapping = {
		//password column: '`password`'
		
			table 'Person'
							cache true
			id column: 'Id'
			username column: 'Username'
			password column: 'Password'
			enabled column: 'Enabled'
			accountExpired column: 'Account_Expired'
			accountLocked column: 'Account_Locked'
			passwordExpired column: 'Password_Expired'			
	}

	Set<Authority> getAuthorities() {
		PersonAuthority.findAllByPerson(this).collect { it.authority } as Set
	}

	def beforeInsert() {
		encodePassword()
	}

	def beforeUpdate() {
		if (isDirty('password')) {
			encodePassword()
		}
	}

	protected void encodePassword() {
//		password = springSecurityService.encodePassword(password)
	}
	
	
}
