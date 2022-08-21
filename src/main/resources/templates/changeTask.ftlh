<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>

<form method="post" action="/todo/${task.id}/update">

    <label>
        <input style="display:none" name="id" value="${task.id}">
    </label>
    <label>
        <input name="task" value="${task.task}">
    </label>
    <label>
        <input name="importance" type="number" max="3" min="0" value="${task.importance}">
    </label>
    <label>
        <input name="dayOfWeek" type="date" value="${task.dayOfWeek}">
    </label>
    <label>
        <input name="time" type="time" value="${task.time}">
    </label>

    <input type="submit" value="Добавить">

</form>

</body>
</html>