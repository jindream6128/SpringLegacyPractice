<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" %>
<html>
<head>
    <title>Title</title>
</head>
<script src="https://code.jquery.com/jquery-3.6.4.min.js"></script>
<script>
    //버튼을 눌렀을때 해당경로로 이동하도록
$(function(){

    $("button").click(function(){
       //alert(this.id);
        document.location.href = '${pageContext.request.contextPath}/' + this.id;
    });
});
</script>
<body>
hello! 라고 뜨면 정상 :  <%=request.getAttribute("data")%> <br>
<button id="home">Home</button><br>
<button id="message">Message</button><br>
<button id="lesson">lesson</button><br>

<br><br><br><br><br>

<form action="${pageContext.request.contextPath}/empValue" method="post">
    <input type="text" name="job">
    <input type="text" name="sal">
    <input type="submit" value="Send">
</form>
<br>
<form action="${pageContext.request.contextPath}/lessonCheck" method="post">
    <input type="checkbox" name = "lesson" value="java">java
    <input type="checkbox" name = "lesson" value="mysql">mysql
    <input type="checkbox" name = "lesson" value="html">html
    <input type="checkbox" name = "lesson" value="spring">spring
    <input type="submit" value="Send">
</form>
</body>
</html>