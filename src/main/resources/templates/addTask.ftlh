<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>

<form method="post" action="/todo/saveTask">
    <label>
        <input name="task" placeholder="Задача">
    </label>
    <label>
        <input name="importance" type="number" max="3" min="0" placeholder="Приоритет">
    </label>
    <label>
        <input name="dayOfWeek" type="week" placeholder="День">
    </label>
    <label>
        <input name="time" type="time" placeholder="Время">
    </label>
    <input type="submit" value="Добавить">

</form>

</body>
</html>