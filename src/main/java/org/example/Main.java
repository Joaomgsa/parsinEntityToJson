package org.example;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import okhttp3.*;
import org.example.model.entities.BodyResponse;
import org.example.model.entities.Sources;
import org.example.model.entities.SourcesToTargets;
import org.example.model.entities.Targets;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        BodyResponse bodyResponse = new BodyResponse(new Sources(9.2365,9.2365),
                new Targets(9.04929,9.04929),
                new SourcesToTargets(36533,30561,0,1),
                "metric","meters","walk");

        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();
        String jsonString = gson.toJson(bodyResponse);

        FileWriter file = new FileWriter("output.txt");

        BufferedWriter bufferedWriter = new BufferedWriter(file);

        bufferedWriter.write(bodyResponse.toString());

        bufferedWriter.close();


        System.out.println(jsonString);

    }
}