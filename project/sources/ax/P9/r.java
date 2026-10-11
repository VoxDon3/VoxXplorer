package ax.P9;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public class r implements l {
    private final HttpURLConnection a;
    private HashMap<String, String> b;

    public r(o oVar) throws IOException {
        this.a = (HttpURLConnection) oVar.d().openConnection();
        for (ax.S9.b bVar : oVar.a()) {
            this.a.addRequestProperty(bVar.a(), bVar.b().toString());
        }
        this.a.setUseCaches(oVar.g());
        try {
            this.a.setRequestMethod(oVar.h().toString());
        } catch (ProtocolException unused) {
            this.a.setRequestMethod(k.POST.toString());
            this.a.addRequestProperty("X-HTTP-Method-Override", oVar.h().toString());
            this.a.addRequestProperty("X-HTTP-Method", oVar.h().toString());
        }
    }

    private static HashMap<String, String> i(HttpURLConnection httpURLConnection) {
        HashMap<String, String> hashMap = new HashMap<>();
        int i = 0;
        while (true) {
            String headerFieldKey = httpURLConnection.getHeaderFieldKey(i);
            String headerField = httpURLConnection.getHeaderField(i);
            if (headerFieldKey == null && headerField == null) {
                return hashMap;
            }
            hashMap.put(headerFieldKey, headerField);
            i++;
        }
    }

    @Override // ax.P9.l
    public Map<String, String> a() {
        if (this.b == null) {
            this.b = i(this.a);
        }
        return this.b;
    }

    @Override // ax.P9.l
    public OutputStream b() throws IOException {
        this.a.setDoOutput(true);
        return this.a.getOutputStream();
    }

    @Override // ax.P9.l
    public InputStream c() throws IOException {
        return this.a.getResponseCode() >= 400 ? this.a.getErrorStream() : this.a.getInputStream();
    }

    @Override // ax.P9.l
    public void close() {
        this.a.disconnect();
    }

    @Override // ax.P9.l
    public String d() {
        return this.a.getRequestMethod();
    }

    @Override // ax.P9.l
    public void e(String str, String str2) {
        this.a.addRequestProperty(str, str2);
    }

    @Override // ax.P9.l
    public int f() throws IOException {
        return this.a.getResponseCode();
    }

    @Override // ax.P9.l
    public String g() throws IOException {
        return this.a.getResponseMessage();
    }

    @Override // ax.P9.l
    public void h(int i) {
        this.a.setFixedLengthStreamingMode(i);
    }
}
