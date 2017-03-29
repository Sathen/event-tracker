<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<html>
<head>
    <title>Event Type</title>
    <style type="text/css">
        .error {
                    color: #ff0000;
        }
        .errorblock {
                    color: #000;
                    background-color: #ffeeee;
                    border: 3px solid #ff0000;
                    padding: 8px;
                    margin: 16px;
        }
    </style>
</head>
<body>

<a href="?lang=en">
English
</a> | <a href="?lang=es"> Spanish</a>
<form:form commandName="attendee">
<form:errors path="*" element="div" cssClass="errorblock"/>
<label for="textinput1"><spring:message code="attendee.name"/>:</label>
 <form:input path="name" cssErrorClass="error"/>
<br>
<label for="textinput2"><spring:message code="attendee.email"/>:</label>
 <form:input path="email" cssErrorClass="error"/>
<br>
<input type="submit" class="btn" value="Enter Attendee"/>
</form:form>
</body>
</html>
