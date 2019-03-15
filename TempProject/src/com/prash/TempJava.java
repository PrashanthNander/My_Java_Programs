package com.prash;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;

public class TempJava {

    public static void main(String[] args) {

            System.out.println("=====================>>>========");
        try
        {
            Client client = Client.create();
            WebResource webResource = client.resource("http://staging.ecomexpress.in/apiv2/pincode/"); // Web Service URL
            MultivaluedMap queryParams = new MultivaluedMapImpl();
            queryParams.add("username", "ecomexpress");// parameter name and value
            queryParams.add("password", "Ke$3c@4oT5m6h#$");// parameter name and value
            queryParams.add("pincode", "560030");// parameter name and value
            //             ClientResponse response = webResource.queryParams(queryParams).put(ClientResponse.class); // for get method
            ClientResponse response = webResource.type("application/x-www-form-urlencoded").post(ClientResponse.class, queryParams);

            System.out.println("response.getStatus()response.getStatus()= " + response.getStatus());
            if (response.getStatus() != 200)
            {
                throw new RuntimeException("Failed : HTTP error code : " + response.getStatus());
            }
            String output = response.getEntity(String.class);
            System.out.println("Output from Web Servicve: " + output);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }
}
