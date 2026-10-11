/*
 * Decompiled with CFR 0.152.
 */
package com.box.androidsdk.content.requests;

import ax.E3.g;
import ax.F3.b;
import com.box.androidsdk.content.requests.BoxRequest;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import javax.net.ssl.HttpsURLConnection;

class a {
    protected final HttpURLConnection a;
    protected final b b;

    public a(URL object, BoxRequest.Methods methods, b b8) throws IOException {
        this.a = object = (HttpURLConnection)((URL)object).openConnection();
        ((HttpURLConnection)object).setRequestMethod(((Object)((Object)methods)).toString());
        this.b = b8;
        if (g.l && object instanceof HttpsURLConnection) {
            ((HttpsURLConnection)object).setSSLSocketFactory(new BoxRequest.c());
        }
    }

    public a a(String string, String string2) {
        this.a.addRequestProperty(string, string2);
        return this;
    }

    public HttpURLConnection b() {
        return this.a;
    }

    public a c(InputStream inputStream) throws IOException {
        this.a.setDoOutput(true);
        OutputStream outputStream = this.a.getOutputStream();
        int n8 = inputStream.read();
        while (n8 != -1) {
            outputStream.write(n8);
            n8 = inputStream.read();
        }
        outputStream.close();
        return this;
    }
}

