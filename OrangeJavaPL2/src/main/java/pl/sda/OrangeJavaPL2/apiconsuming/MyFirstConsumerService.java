package pl.sda.OrangeJavaPL2.apiconsuming;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

@Service
@Slf4j // żeby działał log.info

public class
MyFirstConsumerService {

    @PostConstruct
    void callApi() throws IOException, InterruptedException {

        HttpClient httpClient = HttpClient.newHttpClient(); // odpowiedzialne za "strzelanie" do endpoint
        HttpRequest request = HttpRequest.newBuilder()
                .GET()
                .uri(URI.create("https://www.boredapi.com/api/activity"))
                .build();
        HttpResponse httpResponse = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
//JSON -> Java Object (POJO) (model class)

        ObjectMapper objectMapper = new ObjectMapper();
        MyFirstConsumerResponse response = objectMapper
                .readValue(httpResponse.body().toString(),
                        MyFirstConsumerResponse.class);

        log.info(response.getActivity());
    }

}


/*

//    {  TO JEST Z JASONA
//        "activity": "Take a caffeine nap",
//            "type": "relaxation",
//            "participants": 1,
//            "price": 0.1,
//            "link": "",
//            "key": "5092652",
//            "accessibility": 0.08
//
PRZETŁUMACZONE Z JASONA NA JEZYK JAVA

----> MyFirstConsumerResponse

 */