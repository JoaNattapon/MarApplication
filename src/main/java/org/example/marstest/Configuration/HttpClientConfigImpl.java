//package org.example.marstest.Configuration;
//
//import org.apache.http.auth.AuthScope;
//import org.apache.http.auth.UsernamePasswordCredentials;
//import org.apache.http.client.CredentialsProvider;
//import org.apache.http.impl.client.BasicCredentialsProvider;
//import org.apache.http.impl.nio.client.HttpAsyncClientBuilder;
//import org.apache.http.ssl.SSLContextBuilder;
//import org.apache.http.ssl.SSLContexts;
//import org.elasticsearch.client.RestClientBuilder.HttpClientConfigCallback;
//import org.springframework.context.annotation.Conditional;
//import org.springframework.context.annotation.Configuration;
//
//import javax.net.ssl.SSLContext;
//import java.io.File;
//
//@Configuration
//public class HttpClientConfigImpl implements HttpClientConfigCallback {
//
//
//    @Override
//    public HttpAsyncClientBuilder customizeHttpClient(HttpAsyncClientBuilder httpClientBuilder) {
//
//        try {
//
//            final CredentialsProvider credentialsProvider = new BasicCredentialsProvider();
//            UsernamePasswordCredentials usernamePasswordCredentials = new UsernamePasswordCredentials("elastic",
//                    "nat6363");
//            credentialsProvider.setCredentials(AuthScope.ANY, usernamePasswordCredentials);
//            httpClientBuilder.setDefaultCredentialsProvider(credentialsProvider);
//
//            String trustLocationStore = "C:\\Users\\joena\\Downloads\\elasticsearch-8.14.1-windows-x86_64\\elasticsearch-8.14.1\\config\\certs\\truststore.p12";
//
//            File trustLocationFile = new File(trustLocationStore);
//
//            SSLContextBuilder sslContextBuilder = SSLContexts.custom().loadTrustMaterial(trustLocationFile,
//                    "nat6363".toCharArray());
//            SSLContext sslContext = sslContextBuilder.build();
//            httpClientBuilder.setSSLContext(sslContext);
//
//        } catch (Exception e) {
//        }
//        return httpClientBuilder;
//    }
//}
