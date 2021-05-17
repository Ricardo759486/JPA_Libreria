
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>JPA Tutorial</title>
</head>
<body>

<form action="./update-author">
  <input type="hidden" id="authorId" name="authorId" value ="<%= request.getParameter("authorId") %>">
  Author name: <input type="text" id="name" name="name">
  Author country's: <input type="text" id="country" name="country">
  <input type="submit" value="Update author!">
</form>

</body>
</html>