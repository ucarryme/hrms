<%@ page contentType="text/html; charset=GBK" language="java" %>
<%@ page import="java.util.List"%>
<%@ page import="java.util.Iterator"%>
<%@ page import="com.bOS.bPRO_PersonManage.en.Job"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>人力资源管理系统</title>
<meta http-equiv="Content-Type" content="text/html; charset=GBK">
<link href="css/css.css" rel="stylesheet" type="text/css">
</head>
<script src="Js/js.js"></script>
<body>
<table width="100%"  border="1" align="center" cellpadding="0" cellspacing="1" bordercolorlight="#CCCCCC" bordercolor="#FFFFFF" bordercolordark="#FFFFFF" >
  <tr>
    <td height="22" colspan="4" align="left" ><strong class="text13">修改应聘信息</strong></td>
  </tr>
  <form name="jobForm" method="post" action="modifyjob.do?action=updatejob" onSubmit="return jobValidate();" >
  <%
  Job j=(Job)request.getAttribute("job");
  if(j!=null){
  %>
  <input name="id" value="<%=j.getId()%>" type="hidden">
  <tr align="center">
    <td width="30%" height="22" >姓&nbsp;&nbsp;&nbsp;&nbsp;名：</td>
    <td width="29%" height="22" align="left" ><input name="name" type="text" class="input" value="<%=j.getName()%>"></td>
    <td width="18%" height="22" >性&nbsp;&nbsp;&nbsp;&nbsp;别：</td>
    <td width="23%" height="22" align="left" ><input name="sex" type="radio" value="1" <%=new Byte("1").equals(j.getSex())?"checked":""%>>
      男
        <input name="sex" type="radio" value="0" <%=new Byte("1").equals(j.getSex())?"":"checked"%>>
      女</td>
  </tr>
  <tr align="center">
    <td width="30%" height="22" >年&nbsp;&nbsp;&nbsp;&nbsp;龄：</td>
    <td height="22" align="left" ><input type="text" name="age" class="input" value="<%=j.getAge()%>"></td>
    <td height="22" >职&nbsp;&nbsp;&nbsp;&nbsp;位：</td>
    <td height="22" align="left" ><input name="job" type="text" class="input" value="<%=j.getJob()%>"></td>
  </tr>
  <tr align="center">
    <td width="30%" height="22" >所学专业：</td>
    <td height="22" align="left" ><input name="specialty" type="text" class="input" value="<%=j.getSpecialty()%>"></td>
    <td height="22" >工作经验：</td>
    <td height="22" align="left" ><input name="experience" type="text" class="input" value="<%=j.getExperience()%>"></td>
  </tr>
  <tr align="center">
    <td width="30%" height="22" >学&nbsp;&nbsp;&nbsp;&nbsp;历：</td>
    <td height="22" align="left" ><input name="studyeffort" type="text" class="input" value="<%=j.getStudyeffort()%>"></td>
    <td height="22" >毕业学校：</td>
    <td height="22" align="left" ><input name="school" type="text" class="input" value="<%=j.getSchool()%>"></td>
  </tr>
  <tr>
    <td width="30%" height="22" align="center" >电&nbsp;&nbsp;&nbsp;&nbsp;话：</td>
    <td height="22" align="left" ><input name="tel" type="text" class="input" value="<%=j.getTel()%>"></td>
    <td height="22" align="center" >Email：</td>
    <td height="22" align="left" ><input name="email" type="text" class="input" value="<%=j.getEmail()%>"></td>
  </tr>
  <tr>
    <td width="30%" height="22" align="center" >详细经历：</td>
    <td height="22" colspan="3" align="left" ><textarea name="content" cols="50" rows="6" class="input"><%=j.getContent()%></textarea></td>
    </tr>
  <%}else{ %>
  <tr>
    <td height="22" colspan="4" align="center" >该信息不存在！！！</td>
  </tr>
  <%}%>
  <tr>
    <td height="22" colspan="4" align="center" ><input name="Submit" type="submit" class="button" value="提交">
      &nbsp;&nbsp;
      <input name="Submit2" type="reset" class="button" value="重置"></td>
  </tr>
  </form>
  <tr>
    <td height="100%" colspan="4" align="center" >&nbsp;</td>
  </tr>
</table>
</body>
</html>
