<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<script>
            function calculateTotal() {
               var sub1 = parseInt(document.getElementById('subject1').value);
               var sub2 = parseInt(document.getElementById('subject2').value);
               var sub3 = parseInt(document.getElementById('subject3').value);
               var sub4 = parseInt(document.getElementById('subject4').value);
               var total_marks = sub1+sub2+sub3+sub4;
               document.getElementById('total').value = total_marks;
               var avg = total_marks/4;
               if(avg >= 75)
            	   document.getElementById('grade').value = "A";
               else if(avg >= 65)
            	   document.getElementById('grade').value = "B";
               else if(avg >= 55)
            	   document.getElementById('grade').value = "C";
               else if(avg >=45)
            	   document.getElementById('grade').value = "D";
               else if(avg <=45)
            	   document.getElementById('grade').value = "E Fail";
               
            	   
            	   
            }
        </script> 

		<h1>Add New Employee</h1>
       <form:form method="post" action="save">  
      	<table>  
         <tr>  
          <td>Name : </td> 
          <td><form:input path="sname"  /></td>
         </tr>  
         <tr>  
          <td>Maths :</td>  
          <td><form:input path="subject1" onclick = "calculateTotal();" onchange = "calculateTotal();"/></td>
         </tr> 
         <tr>  
          <td>Physics :</td>  
          <td><form:input path="subject2" onclick = "calculateTotal();" onchange = "calculateTotal();"/></td>
         </tr> 
         <tr>  
          <td>Chemistry :</td>  
          <td><form:input path="subject3" onclick = "calculateTotal();" onchange = "calculateTotal();"/></td>
         </tr>
         <tr>  
          <td>English :</td>  
          <td><form:input path="subject4" onclick = "calculateTotal();" onchange = "calculateTotal();"/></td>
         </tr>
         <tr>  
          <td>Total :</td>  
          <td><form:input path="total"  onclick = "calculateTotal();" onchange = "calculateTotal();"/></td>
         </tr>
         <tr>  
          <td>Grade :</td>  
          <td><form:input path="grade" /></td>
         </tr>
          
         <tr>  
          <td> </td>  
          <td><input type="submit" value="Save"/></td>  
         </tr>  
        </table>  
       </form:form>  
