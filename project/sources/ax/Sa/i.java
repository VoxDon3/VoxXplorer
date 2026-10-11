package ax.Sa;

import ax.ke.E;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import okhttp3.OkHttpClient;

/* loaded from: classes3.dex */
public class i {
    private static final ax.Xd.d g = ax.Xd.f.k(i.class);
    private final a a;
    private final OkHttpClient b;
    private final OkHttpClient c;
    private final String d;
    private final ax.Wa.a e;
    protected final E.b f;

    public i(a aVar) {
        this(aVar, c.a());
    }

    public ax.Va.c a(String str, String str2, boolean z) throws ax.Ta.d, IOException {
        return ax.Wa.b.d(this.e.a(str, str2, Boolean.valueOf(z)));
    }

    public ax.Va.c b(String str, boolean z) throws ax.Ta.d, IOException {
        return new j(this.b, this.a.a()).d(new e(j() + "/v1/disk/resources").b("path", str).a("permanently", Boolean.valueOf(z)).c());
    }

    public ax.Va.b c() throws IOException, ax.Ta.d {
        return d(null);
    }

    public ax.Va.b d(String str) throws IOException, ax.Ta.d {
        return (ax.Va.b) ax.Wa.b.c(this.e.b(str));
    }

    public InputStream e(String str, long j) throws IOException, ax.Ta.c {
        return f(((ax.Va.c) ax.Wa.b.c(this.e.f(str))).a(), j);
    }

    public InputStream f(String str, long j) throws IOException, ax.Ta.c {
        return new j(this.b, this.a.a()).e(str, j);
    }

    public ax.Va.d g(ax.Va.c cVar) throws IOException, ax.Ta.e, ax.Ua.g {
        if (!"GET".equalsIgnoreCase(cVar.c())) {
            throw new ax.Ta.e("Method in Link object is not GET");
        }
        ax.Va.d f = new j(this.b, this.a.a()).f(cVar.a());
        g.n("getOperation: " + f);
        return f;
    }

    public ax.Va.e h(g gVar) throws IOException, ax.Ta.d {
        ax.Va.e eVar = (ax.Va.e) ax.Wa.b.c(this.e.e(gVar.e(), gVar.a(), gVar.b(), gVar.c(), gVar.h(), gVar.g(), gVar.f()));
        gVar.d();
        return eVar;
    }

    public ax.Va.c i(String str, boolean z) throws ax.Ta.d, ax.Ta.e, IOException {
        ax.Va.c cVar = (ax.Va.c) ax.Wa.b.c(this.e.d(str, Boolean.valueOf(z)));
        if ("PUT".equalsIgnoreCase(cVar.c())) {
            return cVar;
        }
        throw new ax.Ta.e("Method in Link object is not PUT");
    }

    String j() {
        return this.d;
    }

    public ax.Va.c k(String str) throws ax.Ta.d, IOException {
        return ax.Wa.b.d(this.e.g(str));
    }

    public ax.Va.c l(String str, String str2, boolean z) throws ax.Ta.d, IOException {
        return ax.Wa.b.d(this.e.c(str, str2, Boolean.valueOf(z)));
    }

    public void m(ax.Va.c cVar, k kVar, d dVar) throws IOException, ax.Ta.c, ax.Ta.e {
        if (!"PUT".equalsIgnoreCase(cVar.c())) {
            throw new ax.Ta.e("Method in Link object is not PUT");
        }
        new j(this.c, this.a.a()).j(cVar.a(), kVar, dVar);
    }

    public i(a aVar, OkHttpClient okHttpClient) {
        this(aVar, okHttpClient, "https://cloud-api.yandex.net");
    }

    public i(a aVar, OkHttpClient okHttpClient, String str) {
        this.a = aVar;
        this.b = okHttpClient;
        this.c = c.b();
        try {
            String externalForm = new URL(str).toExternalForm();
            this.d = externalForm.endsWith("/") ? externalForm.substring(0, externalForm.length() - 1) : externalForm;
            E.b a = new E.b().f(okHttpClient.newBuilder().addInterceptor(new ax.Wa.c(aVar.a())).build()).b(j() + "/").a(ax.le.a.f());
            this.f = a;
            this.e = (ax.Wa.a) a.d().b(ax.Wa.a.class);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }
}
