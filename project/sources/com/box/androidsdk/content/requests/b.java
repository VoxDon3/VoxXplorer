package com.box.androidsdk.content.requests;

import ax.H3.e;
import com.box.androidsdk.content.BoxException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.util.zip.GZIPInputStream;

/* loaded from: classes.dex */
public class b {
    protected final HttpURLConnection a;
    protected int b;
    protected String c;
    private String d;
    private String e;
    private InputStream f;
    private InputStream g = null;

    public b(HttpURLConnection httpURLConnection) {
        this.a = httpURLConnection;
    }

    private static boolean h(int i) {
        return i >= 400;
    }

    private String j(InputStream inputStream) throws IOException, BoxException {
        if (inputStream == null) {
            return null;
        }
        String str = this.e;
        if (str != null && str.equalsIgnoreCase("gzip")) {
            inputStream = new GZIPInputStream(inputStream);
        }
        StringBuilder sb = new StringBuilder();
        char[] cArr = new char[8192];
        try {
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream, "UTF-8");
            for (int read = inputStreamReader.read(cArr, 0, 8192); read != -1; read = inputStreamReader.read(cArr, 0, 8192)) {
                sb.append(cArr, 0, read);
            }
            inputStreamReader.close();
            return sb.toString();
        } catch (IOException e) {
            throw new BoxException("Unable to read stream", e);
        }
    }

    public InputStream a() throws BoxException {
        return b(null);
    }

    public InputStream b(ax.F3.b bVar) throws BoxException {
        InputStream inputStream = this.g;
        if (inputStream != null) {
            return inputStream;
        }
        String contentEncoding = this.a.getContentEncoding();
        try {
            if (this.f == null) {
                this.f = this.a.getInputStream();
            }
            if (bVar == null) {
                this.g = this.f;
            } else {
                this.g = new e(this.f, bVar, c());
            }
            if (contentEncoding != null && contentEncoding.equalsIgnoreCase("gzip")) {
                this.g = new GZIPInputStream(this.g);
            }
            return this.g;
        } catch (IOException e) {
            throw new BoxException("Couldn't connect to the Box API due to a network error.", e);
        }
    }

    public int c() {
        return this.a.getContentLength();
    }

    public String d() {
        return this.c;
    }

    public HttpURLConnection e() {
        return this.a;
    }

    public int f() {
        return this.b;
    }

    public String g() throws BoxException {
        String str = this.d;
        if (str != null) {
            return str;
        }
        try {
            String j = j(h(this.b) ? this.a.getErrorStream() : this.a.getInputStream());
            this.d = j;
            return j;
        } catch (IOException e) {
            throw new BoxException("Unable to get string body", e);
        }
    }

    public void i() throws IOException {
        this.a.connect();
        this.c = this.a.getContentType();
        this.b = this.a.getResponseCode();
        this.e = this.a.getContentEncoding();
    }
}
