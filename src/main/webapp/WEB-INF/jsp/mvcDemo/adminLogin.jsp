<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>������</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta http-equiv="X-UA-Compatible" content="IE=10" />
<meta http-equiv="imagetoolbar" content="no" />
<meta name="copyright" content="Copyright 2020 @ high1 all rights reserved" />
<link href="${pageContext.request.contextPath}/resources/css/contents.css" rel="stylesheet" type="text/css" />

 <script src="https://code.jquery.com/jquery-3.6.4.min.js"></script>
 <script>
  //��ư�� �������� �ش��η� �̵��ϵ���
  $(function(){
   $("#btnSubmit").click(function(){
      $("form#login").submit();
   });
  });
 </script>

</head>
<body>

<%--form--%>
<form name="login" id = 'login' method="post" action="${pageContext.request.contextPath}/loginchk" >
 <div id="loginWrapper">
  <div class="loginForm">
   <fieldset>
    <legend>������ �ý��� �α���</legend>
    <dl>
     <%--���̵� --%>
     <dt><img src="${pageContext.request.contextPath}/resources/img/common/th_id.gif" alt="���̵�" /></dt>
     <dd><input type="text" name="user_id" class="text" id="user_id" /></dd>

      <%--��й�ȣ--%>
     <dt><img src="${pageContext.request.contextPath}/resources/img/common/th_pw.gif" alt="��й�ȣ" /></dt>
     <dd><input type="password" name="user_passwd" class="text" id="user_passwd" /></dd>
    </dl>

    <%--��ư--%>
    <div class="btn">
     <img id="btnSubmit" src="${pageContext.request.contextPath}/resources/img/button/btn_login.gif" alt="LOGIN" title="LOGIN"  />
    </div>
    
    <div class="saveId"><input type="checkbox" id="checker" name="checker" /> 
     <img src="${pageContext.request.contextPath}/resources/img/common/save_id.gif" alt="���̵� ����" />
    </div>

   </fieldset>
  </div>
 </div>
</form>
</body>
</html>