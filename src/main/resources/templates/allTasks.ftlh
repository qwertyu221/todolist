<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<form method="get" action="/todo/addTask">
    <input type="submit" value="Добавить задачу">
</form>
    <table>
        <tr>
            <th>Задача</th>
            <th>Приоритет</th>
            <th>День</th>
            <th>Время</th>
        </tr>

        <#list allTasks as task>
            <tr>
                <td>${task.task}</td>
                <td>${task.importance}</td>
                <td>${task.dayOfWeek}</td>
                <td>${task.time}</td>
            </tr>
        </#list>
    </table>

</body>
</html>