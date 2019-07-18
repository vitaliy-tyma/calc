<#import "ui.ftl" as ui/>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Hello ${name}!</title>
</head>
<body>

<@ui.textInput id="name" placeholder="Enter name" value="${name}"/>
<@ui.table id="table1" rows=persons/>

</body>
</html>