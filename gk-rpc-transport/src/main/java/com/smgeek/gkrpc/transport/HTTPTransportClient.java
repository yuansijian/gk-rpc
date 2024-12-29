package com.smgeek.gkrpc.transport;

import com.smgeek.gkrpc.Peer;
import org.apache.commons.io.IOUtils;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * @Auther: Defend
 * @Date: 2024/12/29 12:12
 * @Description:
 */
public class HTTPTransportClient implements TransportClient {

    private String url;

    @Override
    public void connect(Peer peer) {
        this.url = "http://" + peer.getHost() + ":" + peer.getPort();
    }

    @Override
    public void close() {

    }

    @Override
    public InputStream write(InputStream data) {
        try {
            HttpURLConnection httpConn = (HttpURLConnection) new URL(url).openConnection();
            httpConn.setDoOutput(Boolean.TRUE);
            httpConn.setDoInput(Boolean.TRUE);
            httpConn.setUseCaches(Boolean.FALSE);
            httpConn.setRequestMethod("POST");

            httpConn.connect();
            IOUtils.copy(data, httpConn.getOutputStream());

            int resultCode = httpConn.getResponseCode();
            if(HttpURLConnection.HTTP_OK == resultCode){
                return httpConn.getInputStream();
            }else {
                return httpConn.getErrorStream();
            }
        } catch (IOException e) {
            e.printStackTrace();
            throw new IllegalStateException(e);
        }
    }
}
