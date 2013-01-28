<!DOCTYPE html>
<html lang="en" class="no-js">
		<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
		<title>Time List</title>
		<meta name="viewport" content="width=device-width, initial-scale=1.0">
		<link rel="shortcut icon" href="/TimeTracker2/static/images/favicon.ico" type="image/x-icon">
		<link rel="apple-touch-icon" href="/TimeTracker2/static/images/apple-touch-icon.png">
		<link rel="apple-touch-icon" sizes="114x114" href="/TimeTracker2/static/images/apple-touch-icon-retina.png">
		<link rel="stylesheet" href="/TimeTracker2/static/css/main.css" type="text/css">
		<link rel="stylesheet" href="/TimeTracker2/static/css/mobile.css" type="text/css">
		
		<meta name="layout" content="main">
		
		
	
		
	</head>
	<body>
		
		
		<a href="#list-project" class="skip" tabindex="-1">Skip to content&hellip;</a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="/TimeTracker2/">Home</a></li>
				<li><a href="/TimeTracker2/time/create" class="create">New Time Entry</a></li>
			</ul>
		</div>
		<div id="list-project" class="content scaffold-list" role="main">
			<h1>Time List</h1>
			
			<table>
				<thead>
					<tr>
					
						<th class="sortable" ><a href="/TimeTracker2/time/list?sort=author&amp;max=10&amp;order=asc">Name</a></th>
					
						<th class="sortable" ><a href="/TimeTracker2/time/list?sort=name&amp;max=10&amp;order=asc">Project</a></th>
					
						<th class="sortable" ><a href="/TimeTracker2/time/list?sort=dateCreated&amp;max=10&amp;order=asc">Date Created</a></th>
					
						<th class="sortable" ><a href="/TimeTracker2/time/list?sort=timeSpent&amp;max=10&amp;order=asc">Time Spent</a></th>

						
					
					</tr>
				</thead>
				<tbody>
				
				</tbody>
			</table>
			<div class="pagination">
				
			</div>
		</div>
	
		<div class="footer" role="contentinfo"></div>
		<div id="spinner" class="spinner" style="display:none;">Loading&hellip;</div>
		
		<script src="/TimeTracker2/static/js/application.js" type="text/javascript" ></script>

	</body>
</html>
</html>
