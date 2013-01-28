<%=packageName%>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="\${domainClass.propertyName}" />
		<title>Create Time</title>
	</head>
	<body>
		<a href="#create-{domainClass.propertyName}" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="/TimeTracker2"><g:message code="default.home.label"/></a></li>
				<li><g:link class="list" action="list"><!--g:message code="default.list.label" args="[entityName]" /-->Time List</g:link></li>
			</ul>
		</div>
		<div id="create-{domainClass.propertyName}" class="content scaffold-create" role="main">
			<h1><!--g:message code="default.create.label" args="[entityName]" /-->Create Time</h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<g:hasErrors bean="\${propertyName}">
			<ul class="errors" role="alert">
				<g:eachError bean="\${propertyName}" var="error">
				<li <g:if test="\${error in org.springframework.validation.FieldError}">data-field-id="\${error.field}"</g:if>><g:message error="\${error}"/></li>
				</g:eachError>
			</ul>
			</g:hasErrors>
			<g:form action="save" method="post" enctype="multipart/form-data" >
				<fieldset class="form">
					<g:render template="form"/>
				</fieldset>
				<fieldset class="buttons">
					<g:submitButton name="create" class="save" value="Create" />
				</fieldset>
			</g:form>
		</div>
	</body>
</html>
