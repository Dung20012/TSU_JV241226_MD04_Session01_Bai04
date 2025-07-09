
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
      <h1>Chuyển đổi tiền tệ</h1>
      <form action="convert" method="get">
        <b>Rate</b> <br>
        <input type="" name="rate" min="0" max="100" step="10" value=""> <br>
        <b>USD</b> <br>
        <input type="" name="usd" min="0" max="100" step="10" value=""> <br>
        <button>Convert</button>
      </form>
      <%--Hiển thị kết quả--%>
      <% if (request.getAttribute("vnd") != null){%>
      <p>Rate: <%= request.getAttribute("rate") %></p>
      <p>USD: <%= request.getAttribute("usd") %></p>
      <p>VND: <b><%= request.getAttribute("vnd") %></b></p>
     <% } %>
</body>
</html>
