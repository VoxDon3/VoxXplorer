/*
 * Decompiled with CFR 0.152.
 */
package ax.P9;

import ax.P9.k;
import ax.P9.l;
import ax.P9.o;
import ax.S9.b;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.util.HashMap;
import java.util.Map;

public class r
implements l {
    private final HttpURLConnection a;
    private HashMap<String, String> b;

    public r(o o8) throws IOException {
        this.a = (HttpURLConnection)o8.d().openConnection();
        for (b b8 : o8.a()) {
            this.a.addRequestProperty(b8.a(), b8.b().toString());
        }
        this.a.setUseCaches(o8.g());
        try {
            this.a.setRequestMethod(((Object)((Object)o8.h())).toString());
            return;
        }
        catch (ProtocolException protocolException) {
            this.a.setRequestMethod(((Object)((Object)k.c0)).toString());
            this.a.addRequestProperty("X-HTTP-Method-Override", ((Object)((Object)o8.h())).toString());
            this.a.addRequestProperty("X-HTTP-Method", ((Object)((Object)o8.h())).toString());
            return;
        }
    }

    private static HashMap<String, String> i(HttpURLConnection httpURLConnection) {
        HashMap<String, String> hashMap = new HashMap<String, String>();
        int n8 = 0;
        while (true) {
            String string = httpURLConnection.getHeaderFieldKey(n8);
            String string2 = httpURLConnection.getHeaderField(n8);
            if (string == null && string2 == null) {
                return hashMap;
            }
            hashMap.put(string, string2);
            ++n8;
        }
    }

    @Override
    public Map<String, String> a() {
        if (this.b == null) {
            this.b = r.i(this.a);
        }
        return this.b;
    }

    @Override
    public OutputStream b() throws IOException {
        this.a.setDoOutput(true);
        return this.a.getOutputStream();
    }

    @Override
    public InputStream c() throws IOException {
        if (this.a.getResponseCode() >= 400) {
            return this.a.getErrorStream();
        }
        return this.a.getInputStream();
    }

    @Override
    public void close() {
        this.a.disconnect();
    }

    @Override
    public String d() {
        return this.a.getRequestMethod();
    }

    @Override
    public void e(String string, String string2) {
        this.a.addRequestProperty(string, string2);
    }

    @Override
    public int f() throws IOException {
        return this.a.getResponseCode();
    }

    @Override
    public String g() throws IOException {
        return this.a.getResponseMessage();
    }

    @Override
    public void h(int n8) {
        this.a.setFixedLengthStreamingMode(n8);
    }
}

