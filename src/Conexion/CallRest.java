/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Conexion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/**
 *
 * @author josep
 */
public class CallRest {

    public String get(final String url) throws MalformedURLException, IOException {
        URL obj = new URL(url);
        HttpURLConnection httpConnection = (HttpURLConnection) obj.openConnection();
        httpConnection.setRequestMethod("GET");
        httpConnection.setRequestProperty("Content-type", "application/json");
        int responseCode = httpConnection.getResponseCode();
        if (responseCode != 200 && responseCode != 204) {
            System.out.println("Problemas con el servidor" + responseCode);
            return null;
        }
        BufferedReader responseBuffer = new BufferedReader(new InputStreamReader((httpConnection.getInputStream())));
        String respuesta;
        String respuestaCompleta = "";
        while ((respuesta= responseBuffer.readLine())!= null) {            
            respuestaCompleta+= respuesta;
        }
        httpConnection.disconnect();
        return respuestaCompleta;
    }
    public String post(final String url, final String jsonData)throws MalformedURLException, IOException {
        HttpURLConnection httpConnection= (HttpURLConnection)new URL(url).openConnection();
        httpConnection.setDoOutput(true);
        httpConnection.setRequestMethod("POST");
        httpConnection.setRequestProperty("Content-type", "application/json");
        OutputStream outputStream= httpConnection.getOutputStream();
        outputStream.write(jsonData.getBytes());
        outputStream.flush();
        int responseCode= httpConnection.getResponseCode();
        if (responseCode!= 200 && responseCode!= 204) {
            System.out.println("Problemas con el servidor"+ responseCode);
            return null;
        }
        BufferedReader responseBuffer = new BufferedReader(new InputStreamReader((httpConnection.getInputStream())));
        String respuesta;
        String respuestaCompleta = "";
        while ((respuesta= responseBuffer.readLine())!= null) {            
            respuestaCompleta+= respuesta;
        }
        httpConnection.disconnect();
        return respuestaCompleta;
    }
    

}
