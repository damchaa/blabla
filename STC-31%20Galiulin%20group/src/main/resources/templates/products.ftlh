<#import "index.ftlh" as index>
<@index.page>
    This is list of products:
    <table class="standard_table user_container">
        <tr class="standard_table">
            <td class="standard_table">ID</td>
            <td class="standard_table">NAME</td>
            <td class="standard_table">ALL products</td>
        </tr>
        <#list products as product>
            <tr class="standard_table">
                <td class="standard_table">${product.ourId}</td>
                <td class="standard_table">${product.name}</td>
                <td><#list product.allProducts as allProducts>
                        <ul>
                            <li>${allProducts.shop}  ${allProducts.price} <button>Добавить в корзину</button></li>
                        </ul> </#list> </td>


            </tr>

        </#list>
    </table>
</@index.page>
