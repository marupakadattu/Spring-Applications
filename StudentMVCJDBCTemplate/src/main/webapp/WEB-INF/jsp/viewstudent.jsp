    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  

	<h1>Student List</h1>
	<table border="2" width="70%" cellpadding="2">
	<tr><th>Id</th><th>Name</th><th>Maths</th><th>Physics</th><th>Chemistry</th><th>English</th><th>Total</th><th>Grade</th><th>Edit</th><th>Delete</th></tr>
    <c:forEach var="student" items="${list}"> 
    <tr>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td>${student.subject4}</td>
    <td>${student.total}</td>
    <td>${student.grade}</td>
    <td><a href="editstudent/${student.sid}">Edit</a></td>
    <td><a href="deletestudent/${student.sid}">Delete</a></td>
    </tr>
    </c:forEach>
    </table>
    <br/>
    <a href="studentform">Add New Student</a>