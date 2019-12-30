<%@ page contentType="text/html; charset=GBK" language="java" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>人力资源管理系统</title>
<meta http-equiv="Content-Type" content="text/html; charset=GBK">
<link href="css/css.css" rel="stylesheet" type="text/css">
<style type="text/css">
<!--
.style2 {color: #BD1700}
table{
    background-repeat:repeat;
}
-->
</style>
</head>
<body >
<table width="100%" height="600" border="0" cellpadding="0" cellspacing="0">
  <tr>
    <td align="center" class="text20" ><table width="432" height="257" border="0" cellpadding="0" cellspacing="0" background="images/login.gif">
        <tr align="center">
          <td height="124" colspan="2" >&nbsp;</td>
        </tr>
        <tr align="center">
          <td height="20" colspan="2" ><strong class="text13 style2">登陆失败</strong></td>
        </tr>
	    <form name="usersForm" method="post" action="logon.do?action=logon">
        <tr>
          <td width="175" height="33" align="center" >用户名：</td>
          <td width="257" height="33" >
            <input name="username" type="text" class="input">        </td>
        </tr>
        <tr>
          <td height="31" align="center">密&nbsp;&nbsp;码：</td>
          <td height="31" ><input name="password" type="password" class="input" ></td>
        </tr>
        <tr valign="top">
          <td height="40" colspan="2" align="center" ><input type="submit" name="Submit" value="提交" class="button">
          &nbsp;
            <input type="reset" name="Submit2" value="重置"class="button"></td>
          </tr>
	    </form>
      </table></td>
  </tr>
</table>
</body>
</html>
