package timetracker2

import grails.converters.*


class ProjectController {
	static scaffold = Project
	
	def ajaxGetClassifications = {
		def project = Project.get(params.name)
		println project
		render project?.classiffications as JSON
	}
    
}
