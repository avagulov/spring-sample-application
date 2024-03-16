<html>
    <body>
        <form action="/view" method="post">
            <input name="text">
            <button type="submit">Post it!</button>
        </form>
    </body>

    <table>
        <thead>
            <tr>
                <th>Posted Text</th>
            </tr>
        </thead>
        <tbody>
        <#if texts??>
            <#list texts as item>
            <tr>
                <th>${item}</tr>
            </tr>
            </#list>
        </#if>
        </tbody>
    </table>
</html>