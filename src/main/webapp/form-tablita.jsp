<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table id="libraryEditionTbl">
    <thead>
    <tr>
        <th>Id</th>
        <th>Description</th>
        <th>Release year</th>
        <th>Author Id</th>
        <th>BookId</th>
        <th>Actions</th>
    </tr>
    </thead>
    <tbody>
    </tbody>
</table>
<script>
    function printTable(elementId, servlet, columns, actions = []) {

        var xhr = new XMLHttpRequest();
        xhr.onreadystatechange = function () {
            if (xhr.readyState == 4) {
                var data = JSON.parse(xhr.responseText);

                var tbodyRef = document.getElementById(elementId).getElementsByTagName('tbody')[0];

                data.map(d => {

                    var newRow = tbodyRef.insertRow();

                    columns.map(c => {
                        var cell = newRow.insertCell();
                        var text = document.createTextNode(d[c]);
                        cell.appendChild(text);
                    });

                    //--------------------------------------------------Edition--------------------------------------------

                    if (actions.includes('create-editionLibrary')) {
                        var cell = newRow.insertCell();
                        var action = document.createElement('button');
                        var libraryId = "<%= request.getParameter("libraryId") %>";
                        action.setAttribute('onclick', 'location.href="./create-libraryEdition?editionId=' + d['editionId'] + '&libraryId=' + libraryId +'";');
                        var text = document.createTextNode('create library edition');
                        action.appendChild(text);
                        cell.appendChild(action);
                    }
                    if (actions.includes('delete-editionLibrary')) {
                        var cell = newRow.insertCell();
                        var action = document.createElement('button');
                        var libraryId = "<%= request.getParameter("libraryId") %>";
                        action.setAttribute('onclick', 'location.href="./delete-libraryEdition?editionId=' + d['16'] +'";');
                        var text = document.createTextNode('delete library edition');
                        action.appendChild(text);
                        cell.appendChild(action);
                    }

                });

            }
        }
        xhr.open('GET', '${pageContext.request.contextPath}/' + servlet, true);
        xhr.send(null);

    }

    // Printing editions
    printTable(elementId = 'libraryEditionTbl', servlet = 'list-librariesMulti', columns = ['editionId', 'description', 'releaseyear', 'authorId', 'bookId'], actions = ['create-editionLibrary', 'delete-editionLibrary']);
</script>
</body>
</html>
