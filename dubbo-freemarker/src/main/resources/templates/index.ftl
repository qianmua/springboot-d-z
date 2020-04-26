<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
    hello,${name}

<#--    ID: <span>${userModel.uId}</span>
    name: <span>${userModel.uName}</span>
    date: <span>${userModel.date}</span>-->

    <#list list as l>
        <tr>

            <#if (l.uId > 40)>
                <span>真好！</span>
            </#if>
            <td>${l.uId?int}</td>
            <td>${l.uName}</td>
            <td>${l.date?time}</td>
        </tr>
    </#list>

</body>
</html>