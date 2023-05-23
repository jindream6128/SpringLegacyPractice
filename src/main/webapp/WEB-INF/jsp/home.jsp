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
여기는 jsp안에 index <br>
hello! 라고 뜨면 정상 :  <%=request.getAttribute("data")%> <br>
<button id="home">Home</button>
<button id="message">Message</button>
<button id="lesson">lesson</button>
</body>
</html>
