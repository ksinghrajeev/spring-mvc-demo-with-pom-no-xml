<!DOCTYPE html>
<html>
    <head>
        <title>Hello World - Input Form</title>
        <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/style.css">
        <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/add-customer-style.css">
    </head>
    <body>
        <form action="processFormVersionThree" method="GET">
            <input type="text" name="studentName" placeholder="What's your name?" />
            <input type="submit" />
        </form>
    </body>
</html>