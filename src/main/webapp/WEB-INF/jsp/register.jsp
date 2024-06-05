<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Register User</title>
</head>
<body>
<h1>Register User</h1>
<form:form action="${pageContext.request.contextPath}/user/register" modelAttribute="user" method="post">
    <div>
        <label for="name">Name:</label>
        <form:input path="name" id="name" required="true" />
    </div>
    <div>
        <label for="email">Email:</label>
        <form:input path="email" id="email" type="email" required="true" />
    </div>
    <div>
        <label for="password">Password:</label>
        <form:input path="password" id="password" type="password" required="true" />
    </div>
    <div>
        <label for="weight">Weight:</label>
        <form:input path="weight" id="weight" type="number" step="0.1" />
    </div>
    <div>
        <label for="height">Height:</label>
        <form:input path="height" id="height" type="number" step="0.01" />
    </div>
    <div>
        <label for="bloodType">Blood Type:</label>
        <form:input path="bloodType" id="bloodType" />
    </div>
    <div>
        <label for="allergies">Allergies:</label>
        <form:input path="allergies" id="allergies" />
    </div>
    <div>
        <label for="chronicDiseases">Chronic Diseases:</label>
        <form:input path="chronicDiseases" id="chronicDiseases" />
    </div>
    <div>
        <button type="submit">Register</button>
    </div>
</form:form>
</body>
</html>
