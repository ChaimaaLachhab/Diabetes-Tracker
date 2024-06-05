<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Add Glycemia Reading</title>
</head>
<body>
<h1>Add Glycemia Reading</h1>
<form:form action="${pageContext.request.contextPath}/add" modelAttribute="reading" method="post">
    <div>
        <label for="date">Date:</label>
        <form:input path="date" id="date" type="date" required="true" />
        <form:errors path="date" cssClass="error" />
    </div>
    <div>
        <label for="time">Time:</label>
        <form:input path="time" id="time" type="time" required="true" />
        <form:errors path="time" cssClass="error" />
    </div>
    <div>
        <label for="level">Glycemia Level:</label>
        <form:input path="level" id="level" type="number" step="0.1" required="true" />
        <form:errors path="level" cssClass="error" />
    </div>
    <div>
        <label for="user">User ID:</label>
        <form:input path="user.id" id="user" type="number" required="true" />
        <form:errors path="user.id" cssClass="error" />
    </div>
    <div>
        <button type="submit">Add Reading</button>
    </div>
</form:form>
</body>
</html>
