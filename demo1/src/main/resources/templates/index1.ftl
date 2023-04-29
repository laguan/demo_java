<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
${name}
<#if sex=='0'>
    男
    <#elseif sex=='1'>
    女
    <#else>
    其他
</#if>

<#-- 在这个页面不能用> 自能用 大于gt  大于等于gte  小于lt    小于等于lte -->
<#if age gt 17>
    已经成年
    <#else>
    为成年
</#if>

<#list userlist as user>
    ${user}
</#list>


</body>
</html>