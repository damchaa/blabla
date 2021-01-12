<#import "index.ftlh" as index>

<@index.page>
    This is list of users:
    <table class="standard_table user_container">
        <tr class="standard_table">
            <td class="standard_table">ID</td>
            <td class="standard_table">NAME</td>
            <td class="standard_table">PRICE</td>
            <td class="standard_table">MEASURE</td>
            <td class="standard_table">STORE</td>
        </tr>
        <#list products_5ka_for_promo as item>
            <tr class="standard_table">
                <td class="standard_table">${item.productWindowId}</td>
                <td class="standard_table">${item.name}</td>
                <td class="standard_table">${item.product.price}</td>
                <td class="standard_table">${item.measure.value}</td>
                <td class="standard_table">Магазин "${item.product.store.name}" по
                    адресу "${item.product.store.address}"</td>
            </tr>
        <#else>
            <tr class="standard_table">
                <td class="standard_table" colspan="100%">No products</td>
            </tr>
        </#list>
    </table>
</@index.page>
