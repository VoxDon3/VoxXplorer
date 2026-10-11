/*
 * Decompiled with CFR 0.152.
 */
package ax.Sa;

import ax.Sa.a;
import ax.Sa.c;
import ax.Sa.d;
import ax.Sa.e;
import ax.Sa.g;
import ax.Sa.j;
import ax.Sa.k;
import ax.Va.b;
import ax.Xd.f;
import ax.ke.E;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import okhttp3.OkHttpClient;

public class i {
    private static final ax.Xd.d g = ax.Xd.f.k(i.class);
    private final a a;
    private final OkHttpClient b;
    private final OkHttpClient c;
    private final String d;
    private final ax.Wa.a e;
    protected final E.b f;

    public i(a a8) {
        this(a8, ax.Sa.c.a());
    }

    public i(a a8, OkHttpClient okHttpClient) {
        this(a8, okHttpClient, "https://cloud-api.yandex.net");
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public i(a object, OkHttpClient object2, String object3) {
        this.a = object;
        this.b = object2;
        this.c = ax.Sa.c.b();
        try {
            Object object4 = new URL((String)object3);
            object3 = object4 = ((URL)object4).toExternalForm();
            if (((String)object4).endsWith("/")) {
                object3 = ((String)object4).substring(0, ((String)object4).length() - 1);
            }
        }
        catch (MalformedURLException malformedURLException) {
            throw new RuntimeException(malformedURLException);
        }
        this.d = object3;
        object = ((OkHttpClient)object2).newBuilder().addInterceptor(new ax.Wa.c(((a)object).a())).build();
        object2 = new E.b().f((OkHttpClient)object);
        object = new StringBuilder();
        ((StringBuilder)object).append(this.j());
        ((StringBuilder)object).append("/");
        this.f = object = ((E.b)object2).b(((StringBuilder)object).toString()).a(ax.le.a.f());
        this.e = ((E.b)object).d().b(ax.Wa.a.class);
    }

    public ax.Va.c a(String string, String string2, boolean bl) throws ax.Ta.d, IOException {
        return ax.Wa.b.d(this.e.a(string, string2, bl));
    }

    public ax.Va.c b(String string, boolean bl) throws ax.Ta.d, IOException {
        j j8 = new j(this.b, this.a.a());
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.j());
        stringBuilder.append("/v1/disk/resources");
        return j8.d(new e(stringBuilder.toString()).b("path", string).a("permanently", bl).c());
    }

    public b c() throws IOException, ax.Ta.d {
        return this.d(null);
    }

    public b d(String string) throws IOException, ax.Ta.d {
        return ax.Wa.b.c(this.e.b(string));
    }

    public InputStream e(String string, long l8) throws IOException, ax.Ta.c {
        return this.f(ax.Wa.b.c(this.e.f(string)).a(), l8);
    }

    public InputStream f(String string, long l8) throws IOException, ax.Ta.c {
        return new j(this.b, this.a.a()).e(string, l8);
    }

    public ax.Va.d g(ax.Va.c object) throws IOException, ax.Ta.e, ax.Ua.g {
        if ("GET".equalsIgnoreCase(((ax.Va.c)object).c())) {
            object = new j(this.b, this.a.a()).f(((ax.Va.c)object).a());
            ax.Xd.d d8 = g;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("getOperation: ");
            stringBuilder.append(object);
            d8.n(stringBuilder.toString());
            return object;
        }
        throw new ax.Ta.e("Method in Link object is not GET");
    }

    public ax.Va.e h(g g8) throws IOException, ax.Ta.d {
        ax.Va.e e8 = ax.Wa.b.c(this.e.e(g8.e(), g8.a(), g8.b(), g8.c(), g8.h(), g8.g(), g8.f()));
        g8.d();
        return e8;
    }

    public ax.Va.c i(String object, boolean bl) throws ax.Ta.d, ax.Ta.e, IOException {
        if ("PUT".equalsIgnoreCase(((ax.Va.c)(object = ax.Wa.b.c(this.e.d((String)object, bl)))).c())) {
            return object;
        }
        throw new ax.Ta.e("Method in Link object is not PUT");
    }

    String j() {
        return this.d;
    }

    public ax.Va.c k(String string) throws ax.Ta.d, IOException {
        return ax.Wa.b.d(this.e.g(string));
    }

    public ax.Va.c l(String string, String string2, boolean bl) throws ax.Ta.d, IOException {
        return ax.Wa.b.d(this.e.c(string, string2, bl));
    }

    public void m(ax.Va.c c8, k k8, d d8) throws IOException, ax.Ta.c, ax.Ta.e {
        if ("PUT".equalsIgnoreCase(c8.c())) {
            new j(this.c, this.a.a()).j(c8.a(), k8, d8);
            return;
        }
        throw new ax.Ta.e("Method in Link object is not PUT");
    }
}

