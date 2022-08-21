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
<br><br>
<form method="get" action="/todo/imp">
    <input type="submit" value="По важности">
</form>
<br><br>
<form method="get" action="/todo/date">
    <input type="submit" value="По Дате">
</form>
<br><br>
    <table>
        <tr>
            <th>Задача</th>
            <th>Приоритет</th>
            <th>День</th>
            <th>Время</th>
        </tr>

        <#list allTasks as task>
            <tr>

                <td style="display:none">${task.id}</td>
                <td>${task.task}</td>
                <td>${task.importance}</td>
                <td>${task.dayOfWeek}</td>
                <td>${task.time}</td>
                <td>
                    <form method="post" action="/todo/${task.id}/delete">
                        <input type="submit" value="Удалить">
                    </form>
                </td>
                <td>
                    <form method="get" action="/todo/${task.id}">
                        <input type="submit" value="Изменить">
                    </form>

                </td>
            </tr>
        </#list>
    </table>

</body>
</html>