package ax.j7;

import ax.i7.AbstractC2274A;
import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: ax.j7.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C2333d extends AbstractC2274A {
    private final HttpURLConnection a;
    private final int b;
    private final String c;
    private final ArrayList<String> d;
    private final ArrayList<String> e;

    C2333d(HttpURLConnection httpURLConnection) throws IOException {
        ArrayList<String> arrayList = new ArrayList<>();
        this.d = arrayList;
        ArrayList<String> arrayList2 = new ArrayList<>();
        this.e = arrayList2;
        this.a = httpURLConnection;
        int responseCode = httpURLConnection.getResponseCode();
        this.b = responseCode == -1 ? 0 : responseCode;
        this.c = httpURLConnection.getResponseMessage();
        for (Map.Entry<String, List<String>> entry : httpURLConnection.getHeaderFields().entrySet()) {
            String key = entry.getKey();
            if (key != null) {
                for (String str : entry.getValue()) {
                    if (str != null) {
                        arrayList.add(key);
                        arrayList2.add(str);
                    }
                }
            }
        }
    }

    @Override // ax.i7.AbstractC2274A
    public void a() {
        this.a.disconnect();
    }

    @Override // ax.i7.AbstractC2274A
    public InputStream b() throws IOException {
        InputStream errorStream;
        try {
            errorStream = this.a.getInputStream();
        } catch (IOException unused) {
            errorStream = this.a.getErrorStream();
        }
        if (errorStream == null) {
            return null;
        }
        return new a(errorStream);
    }

    @Override // ax.i7.AbstractC2274A
    public String c() {
        return this.a.getContentEncoding();
    }

    @Override // ax.i7.AbstractC2274A
    public long d() {
        String headerField = this.a.getHeaderField("Content-Length");
        if (headerField == null) {
            return -1L;
        }
        return Long.parseLong(headerField);
    }

    @Override // ax.i7.AbstractC2274A
    public String e() {
        return this.a.getHeaderField("Content-Type");
    }

    @Override // ax.i7.AbstractC2274A
    public int f() {
        return this.d.size();
    }

    @Override // ax.i7.AbstractC2274A
    public String g(int i) {
        return this.d.get(i);
    }

    @Override // ax.i7.AbstractC2274A
    public String h(int i) {
        return this.e.get(i);
    }

    @Override // ax.i7.AbstractC2274A
    public String i() {
        return this.c;
    }

    @Override // ax.i7.AbstractC2274A
    public int j() {
        return this.b;
    }

    @Override // ax.i7.AbstractC2274A
    public String k() {
        String headerField = this.a.getHeaderField(0);
        if (headerField == null || !headerField.startsWith("HTTP/1.")) {
            return null;
        }
        return headerField;
    }

    /* renamed from: ax.j7.d$a */
    private final class a extends FilterInputStream implements InputStreamRetargetInterface {
        private long q;

        public a(InputStream inputStream) {
            super(inputStream);
            this.q = 0L;
        }

        private void a() throws IOException {
            long d = C2333d.this.d();
            if (d == -1) {
                return;
            }
            long j = this.q;
            if (j == 0 || j >= d) {
                return;
            }
            throw new IOException("Connection closed prematurely: bytesRead = " + this.q + ", Content-Length = " + d);
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read(byte[] bArr, int i, int i2) throws IOException {
            int read = ((FilterInputStream) this).in.read(bArr, i, i2);
            if (read == -1) {
                a();
                return read;
            }
            this.q += read;
            return read;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public long skip(long j) throws IOException {
            long skip = ((FilterInputStream) this).in.skip(j);
            this.q += skip;
            return skip;
        }

        @Override // java.io.InputStream, j$.io.InputStreamRetargetInterface
        public /* synthetic */ long transferTo(OutputStream outputStream) {
            return DesugarInputStream.transferTo(this, outputStream);
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read() throws IOException {
            int read = ((FilterInputStream) this).in.read();
            if (read == -1) {
                a();
                return read;
            }
            this.q++;
            return read;
        }
    }
}
