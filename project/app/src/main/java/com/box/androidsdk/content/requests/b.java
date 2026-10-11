/*
 * Decompiled with CFR 0.152.
 */
package com.box.androidsdk.content.requests;

import ax.H3.e;
import com.box.androidsdk.content.BoxException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.util.zip.GZIPInputStream;

public class b {
    protected final HttpURLConnection a;
    protected int b;
    protected String c;
    private String d;
    private String e;
    private InputStream f;
    private InputStream g;

    public b(HttpURLConnection httpURLConnection) {
        this.a = httpURLConnection;
        this.g = null;
    }

    private static boolean h(int n8) {
        return n8 >= 400;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private String j(InputStream closeable) throws IOException, BoxException {
        if (closeable == null) {
            return null;
        }
        CharSequence charSequence = this.e;
        InputStream inputStream = closeable;
        if (charSequence != null) {
            inputStream = closeable;
            if (((String)charSequence).equalsIgnoreCase("gzip")) {
                inputStream = new GZIPInputStream((InputStream)closeable);
            }
        }
        charSequence = new StringBuilder();
        char[] cArray = new char[8192];
        try {
            closeable = new InputStreamReader(inputStream, "UTF-8");
            int n8 = ((InputStreamReader)closeable).read(cArray, 0, 8192);
            while (true) {
                if (n8 == -1) {
                    ((InputStreamReader)closeable).close();
                    return ((StringBuilder)charSequence).toString();
                }
                ((StringBuilder)charSequence).append(cArray, 0, n8);
                n8 = ((InputStreamReader)closeable).read(cArray, 0, 8192);
            }
        }
        catch (IOException iOException) {
            throw new BoxException("Unable to read stream", iOException);
        }
    }

    public InputStream a() throws BoxException {
        return this.b(null);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public InputStream b(ax.F3.b object) throws BoxException {
        InputStream inputStream = this.g;
        if (inputStream != null) return inputStream;
        String string = this.a.getContentEncoding();
        try {
            if (this.f == null) {
                this.f = this.a.getInputStream();
            }
        }
        catch (IOException iOException) {
            throw new BoxException("Couldn't connect to the Box API due to a network error.", iOException);
        }
        this.g = object == null ? this.f : (inputStream = new e(this.f, (ax.F3.b)object, this.c()));
        if (string == null) return this.g;
        if (!string.equalsIgnoreCase("gzip")) return this.g;
        this.g = object = new GZIPInputStream(this.g);
        return this.g;
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

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public String g() throws BoxException {
        Object object = this.d;
        if (object != null) {
            return object;
        }
        try {
            object = com.box.androidsdk.content.requests.b.h(this.b) ? this.a.getErrorStream() : this.a.getInputStream();
        }
        catch (IOException iOException) {
            throw new BoxException("Unable to get string body", iOException);
        }
        this.d = object = this.j((InputStream)object);
        return object;
    }

    public void i() throws IOException {
        this.a.connect();
        this.c = this.a.getContentType();
        this.b = this.a.getResponseCode();
        this.e = this.a.getContentEncoding();
    }
}

