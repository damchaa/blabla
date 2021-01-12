package com.example.app.service.store;

import com.example.app.model.Measure;
import com.example.app.model.Product;
import com.example.app.model.ProductWindow;
import com.example.app.model.Store;
import com.example.app.model.pojo._5ka.Model5ka;
import com.example.app.model.pojo._5ka.Result;
import com.example.app.service.CustomHttpRequest;
import com.google.gson.Gson;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class _5ka {

    private final String baseHostName = "https://5ka.ru/api/v2/";
    private final Charset charset = StandardCharsets.UTF_8;
    private CustomHttpRequest request;
    private Model5ka _5kaModel;
    private int recordsPerPage = 50;
    private int page = 1;

    public List<ProductWindow> getProductsForPromo() {
        sendRequest(baseHostName +
                "special_offers/?store=&records_per_page=" + recordsPerPage +
                "&page=" + page + "&shopitem_category=");

        _5kaModel = parseJson();

        List<ProductWindow> productWindowList = new ArrayList<>();
        ProductWindow productWindow;
        Product product;
        Store store = new Store("5ka", "Я у 5ки");
        Measure measure;
        for (Result result : _5kaModel.getResults()) {
            product = new Product(store, result.getId(), result.getCurrent_prices().getPrice_reg__min());
            measure = new Measure("Ед. товара");
            productWindow = new ProductWindow(result.getId(),
                    measure,
                    result.getName(),
                    "Пустое описание",
                    product);

            productWindowList.add(productWindow);
        }
        return productWindowList;
    }

    private Model5ka parseJson() {
        Gson gson = new Gson();
        return gson.fromJson(request.getResponseBody(), Model5ka.class);
    }

    private void sendRequest(String hostName) {
        request = new CustomHttpRequest(hostName, charset);
        request.sendGetRequest();
    }

}
