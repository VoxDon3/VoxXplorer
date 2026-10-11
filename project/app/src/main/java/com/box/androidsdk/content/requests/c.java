/*
 * Decompiled with CFR 0.152.
 */
package com.box.androidsdk.content.requests;

import ax.F3.b;
import ax.H3.f;
import com.box.androidsdk.content.BoxException;
import com.box.androidsdk.content.requests.BoxRequest;
import com.box.androidsdk.content.requests.a;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

class c
extends a {
    private static final Logger j = Logger.getLogger(c.class.getName());
    private final StringBuilder c = new StringBuilder();
    private OutputStream d;
    private InputStream e;
    private String f;
    private long g;
    private Map<String, String> h = new HashMap<String, String>();
    private boolean i = true;

    public c(URL uRL, BoxRequest.Methods methods, b b8) throws IOException {
        super(uRL, methods, b8);
        this.a("Content-Type", "multipart/form-data; boundary=da39a3ee5e6b4b0d3255bfef95601890afd80709");
    }

    private void i() throws IOException {
        if (!this.i) {
            this.j("\r\n");
        }
        this.i = false;
        this.j("--");
        this.j("da39a3ee5e6b4b0d3255bfef95601890afd80709");
    }

    private void j(String string) throws IOException {
        this.d.write(string.getBytes(Charset.forName("UTF-8")));
        if (j.isLoggable(Level.FINE)) {
            this.c.append(string);
        }
    }

    private void k(String[][] stringArray) throws IOException {
        this.l(stringArray, null);
    }

    private void l(String[][] stringArray, String string) throws IOException {
        this.i();
        this.j("\r\n");
        this.j("Content-Disposition: form-data");
        for (int i8 = 0; i8 < stringArray.length; ++i8) {
            this.j("; ");
            this.j(stringArray[i8][0]);
            this.j("=\"");
            this.j(stringArray[i8][1]);
            this.j("\"");
        }
        if (string != null) {
            this.j("\r\nContent-Type: ");
            this.j(string);
        }
        this.j("\r\n\r\n");
    }

    @Override
    public a c(InputStream inputStream) throws IOException {
        throw new UnsupportedOperationException();
    }

    public void d(String string, String string2) {
        this.h.put(string, string2);
    }

    public void e(String string, Date date) {
        this.h.put(string, ax.H3.a.a(date));
    }

    public void f(InputStream inputStream, String string) {
        this.e = inputStream;
        this.f = string;
    }

    public void g(InputStream inputStream, String string, long l8) {
        this.f(inputStream, string);
        this.g = l8;
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    protected void h(HttpURLConnection object, b object2) throws BoxException {
        Throwable throwable222;
        block14: {
            IOException iOException222;
            block15: {
                boolean bl;
                ((HttpURLConnection)object).setChunkedStreamingMode(0);
                ((URLConnection)object).setDoOutput(true);
                ((URLConnection)object).setUseCaches(false);
                this.d = ((URLConnection)object).getOutputStream();
                object = this.h.entrySet().iterator();
                while (bl = object.hasNext()) {
                    Map.Entry<String, String> entry = object.next();
                    this.k(new String[][]{{"name", entry.getKey()}});
                    this.j(entry.getValue());
                }
                object = this.f;
                this.l(new String[][]{{"name", "filename"}, {"filename", object}}, "application/octet-stream");
                object = this.d;
                if (object2 != null) {
                    object = new f(this.d, (b)object2, this.g);
                }
                object2 = new byte[8192];
                int n8 = this.e.read((byte[])object2);
                while (n8 != -1) {
                    if (Thread.currentThread().isInterrupted()) {
                        object = new InterruptedException();
                        throw object;
                    }
                    ((OutputStream)object).write((byte[])object2, 0, n8);
                    n8 = this.e.read((byte[])object2);
                }
                if (j.isLoggable(Level.FINE)) {
                    this.c.append("<File Contents Omitted>");
                }
                this.i();
                this.j("--");
                object = this.d;
                if (object == null) return;
                try {
                    ((OutputStream)object).close();
                    return;
                }
                catch (Exception exception) {
                    return;
                }
                catch (Throwable throwable222) {
                    break block14;
                }
                catch (InterruptedException interruptedException) {
                }
                catch (IOException iOException222) {
                    break block15;
                }
                object2 = new BoxException("Thread has been interrupted", interruptedException);
                throw object2;
            }
            object = new BoxException("Couldn't connect to the Box API due to a network error.", iOException222);
            throw object;
        }
        object2 = this.d;
        if (object2 == null) throw throwable222;
        try {
            ((OutputStream)object2).close();
        }
        catch (Exception exception) {
            throw throwable222;
        }
        throw throwable222;
    }
}

