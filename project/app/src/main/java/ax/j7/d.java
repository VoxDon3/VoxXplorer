/*
 * Decompiled with CFR 0.152.
 */
package ax.j7;

import ax.i7.A;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

final class d
extends A {
    private final HttpURLConnection a;
    private final int b;
    private final String c;
    private final ArrayList<String> d;
    private final ArrayList<String> e;

    d(HttpURLConnection object) throws IOException {
        int n8;
        ArrayList<String> arrayList = new ArrayList<String>();
        this.d = arrayList;
        ArrayList<String> arrayList2 = new ArrayList<String>();
        this.e = arrayList2;
        this.a = object;
        int n9 = n8 = ((HttpURLConnection)((Object)object)).getResponseCode();
        if (n8 == -1) {
            n9 = 0;
        }
        this.b = n9;
        this.c = ((HttpURLConnection)((Object)object)).getResponseMessage();
        for (Map.Entry<String, List<String>> entry : ((URLConnection)((Object)object)).getHeaderFields().entrySet()) {
            String string = entry.getKey();
            if (string == null) continue;
            for (String string2 : entry.getValue()) {
                if (string2 == null) continue;
                arrayList.add(string);
                arrayList2.add(string2);
            }
        }
    }

    @Override
    public void a() {
        this.a.disconnect();
    }

    @Override
    public InputStream b() throws IOException {
        InputStream inputStream;
        try {
            inputStream = this.a.getInputStream();
        }
        catch (IOException iOException) {
            inputStream = this.a.getErrorStream();
        }
        inputStream = inputStream == null ? null : new a(this, inputStream);
        return inputStream;
    }

    @Override
    public String c() {
        return this.a.getContentEncoding();
    }

    @Override
    public long d() {
        String string = this.a.getHeaderField("Content-Length");
        if (string == null) {
            return -1L;
        }
        return Long.parseLong(string);
    }

    @Override
    public String e() {
        return this.a.getHeaderField("Content-Type");
    }

    @Override
    public int f() {
        return this.d.size();
    }

    @Override
    public String g(int n8) {
        return this.d.get(n8);
    }

    @Override
    public String h(int n8) {
        return this.e.get(n8);
    }

    @Override
    public String i() {
        return this.c;
    }

    @Override
    public int j() {
        return this.b;
    }

    @Override
    public String k() {
        String string = this.a.getHeaderField(0);
        if (string != null && string.startsWith("HTTP/1.")) {
            return string;
        }
        return null;
    }

    private final class a
    extends FilterInputStream
    implements j.InputStreamRetargetInterface {
        final d c0;
        private long q;

        public a(d d8, InputStream inputStream) {
            this.c0 = d8;
            super(inputStream);
            this.q = 0L;
        }

        private void a() throws IOException {
            long l8;
            long l9 = this.c0.d();
            if (l9 != -1L && (l8 = this.q) != 0L && l8 < l9) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Connection closed prematurely: bytesRead = ");
                stringBuilder.append(this.q);
                stringBuilder.append(", Content-Length = ");
                stringBuilder.append(l9);
                throw new IOException(stringBuilder.toString());
            }
        }

        @Override
        public int read() throws IOException {
            int n8 = this.in.read();
            if (n8 == -1) {
                this.a();
                return n8;
            }
            ++this.q;
            return n8;
        }

        @Override
        public int read(byte[] byArray, int n8, int n9) throws IOException {
            if ((n8 = this.in.read(byArray, n8, n9)) == -1) {
                this.a();
                return n8;
            }
            this.q += (long)n8;
            return n8;
        }

        @Override
        public long skip(long l8) throws IOException {
            l8 = this.in.skip(l8);
            this.q += l8;
            return l8;
        }

        @Override
        public /* synthetic */ long transferTo(OutputStream outputStream) {
            return java.io.DesugarInputStream.transferTo((InputStream)this, (OutputStream)outputStream);
        }
    }
}

