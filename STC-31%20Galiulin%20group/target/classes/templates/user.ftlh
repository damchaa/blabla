<#import "index.ftlh" as index>

<@index.page>
    This is list of users:
    <table class="standard_table user_container">
        <tr class="standard_table">
            <td class="standard_table">ID</td>
            <td class="standard_table">LOGIN</td>
            <td class="standard_table">PASSWORD</td>
            <td class="standard_table">ROLE_ID</td>
        </tr>
        <#list users as user>
            <tr class="standard_table">
                <td class="standard_table">${user.id}</td>
                <td class="standard_table">${user.login}</td>
                <td class="standard_table">${user.password}</td>
                <td class="standard_table">${user.roleId}</td>
            </tr>
        <#else>
            <tr class="standard_table">
                <td class="standard_table" colspan="4">No user</td>
            </tr>
        </#list>
    </table>
</@index.page>
