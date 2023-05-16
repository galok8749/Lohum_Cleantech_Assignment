package com.alok.Lohum_Cleantech_Assignment.app;


import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class PriceService {
    public PriceEntity getLatestPrice() throws IOException {
        String url = "https://www.metal.com/Lithium-ion-Battery/202303240001";
        Document doc = Jsoup.connect(url).get();
        Elements element = doc.getElementsByClass("strong___1JlBD priceDown___2TbRQ");
        return new PriceEntity(element.text());
    }
}
