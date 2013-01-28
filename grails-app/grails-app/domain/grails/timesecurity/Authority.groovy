package grails.timesecurity

class Authority {
	
		
	int id
	String authority

	static mapping = {
		table 'Authority'
		cache true
		id column: 'Id'
		authority column: 'Auth_Name'
	}

	static constraints = {
		authority blank: false, unique: true
	}
}
