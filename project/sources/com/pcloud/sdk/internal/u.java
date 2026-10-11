package com.pcloud.sdk.internal;

import ax.la.C2492b;
import ax.la.InterfaceC2490A;
import ax.la.InterfaceC2491a;
import ax.la.InterfaceC2493c;
import ax.ma.C2544a;
import ax.ma.C2546c;
import ax.ma.InterfaceC2545b;
import ax.na.C2630a;
import ax.na.C2631b;
import ax.na.C2633d;
import ax.na.C2634e;
import ax.na.C2635f;
import ax.na.C2636g;
import ax.na.C2637h;
import ax.r8.C3009r;
import ax.xc.InterfaceC3488f;
import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;
import com.pcloud.sdk.internal.A;
import com.pcloud.sdk.internal.RealRemoteEntry;
import com.pcloud.sdk.internal.networking.serialization.ByteStringTypeAdapter;
import com.pcloud.sdk.internal.networking.serialization.DateTypeAdapter;
import com.pcloud.sdk.internal.networking.serialization.ResolutionDeserializer;
import com.pcloud.sdk.internal.networking.serialization.UnmodifiableListTypeFactory;
import com.pcloud.sdk.internal.z;
import j$.util.Objects;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TreeMap;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import okhttp3.Authenticator;
import okhttp3.FormBody;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* loaded from: classes3.dex */
class u implements InterfaceC2491a {
    private static final String g = "----pCloud-SDK-1.11.0-" + UUID.randomUUID() + "----";
    private final long a;
    private final InterfaceC2493c b;
    private final Gson c;
    private final OkHttpClient d;
    private final Executor e;
    private final HttpUrl f;

    class a extends RequestBody {
        final /* synthetic */ ax.la.r a;
        final /* synthetic */ ax.la.m b;

        a(ax.la.r rVar, ax.la.m mVar) {
            this.a = rVar;
            this.b = mVar;
        }

        @Override // okhttp3.RequestBody
        public long contentLength() {
            long a = this.b.a();
            if (a >= 0) {
                return a;
            }
            throw new IllegalArgumentException("Content length must be >= 0.");
        }

        @Override // okhttp3.RequestBody
        public MediaType contentType() {
            return MediaType.parse("multipart/form-data");
        }

        @Override // okhttp3.RequestBody
        public void writeTo(InterfaceC3488f interfaceC3488f) throws IOException {
            ax.la.r rVar = this.a;
            if (rVar == null) {
                this.b.b(interfaceC3488f);
                return;
            }
            if (u.this.e != null) {
                rVar = new RunnableC3783b(this.a, u.this.e);
            }
            InterfaceC3488f c = ax.xc.p.c(new f(interfaceC3488f, this.b.a(), rVar, u.this.a));
            this.b.b(c);
            c.G();
        }
    }

    u(v vVar) {
        TreeMap treeMap = new TreeMap();
        treeMap.put("timeformat", "timestamp");
        String format = String.format(Locale.US, "pCloud SDK Java %s", "1.11.0");
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        long l = vVar.l();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        OkHttpClient.Builder addInterceptor = builder.readTimeout(l, timeUnit).writeTimeout(vVar.m(), timeUnit).connectTimeout(vVar.h(), timeUnit).protocols(Collections.singletonList(Protocol.HTTP_1_1)).addInterceptor(new C3784c(format, treeMap));
        if (vVar.j() != null) {
            addInterceptor.dispatcher(vVar.j());
        }
        if (vVar.i() != null) {
            addInterceptor.connectionPool(vVar.i());
        }
        if (vVar.f() != null) {
            addInterceptor.cache(vVar.f());
        }
        addInterceptor.authenticator(Authenticator.NONE);
        InterfaceC2493c e = vVar.e();
        this.b = e;
        if (e != null) {
            addInterceptor.addInterceptor((w) vVar.e());
        }
        this.d = addInterceptor.build();
        this.e = vVar.g();
        this.a = vVar.k();
        this.c = new com.google.gson.a().c().e(new RealRemoteEntry.TypeAdapterFactory()).e(new UnmodifiableListTypeFactory()).d(ax.la.u.class, new RealRemoteEntry.FileEntryDeserializer()).d(Date.class, new DateTypeAdapter()).d(z.class, new z.a(this)).d(A.class, new A.a(this)).d(ax.xc.h.class, new ByteStringTypeAdapter()).d(ax.la.x.class, ResolutionDeserializer.a).b();
        this.f = vVar.d();
    }

    private static void E(HttpUrl.Builder builder, Long l, ax.la.x xVar, boolean z) {
        builder.addQueryParameter("fileid", String.valueOf(l));
        builder.addQueryParameter("size", String.format(Locale.US, "%dx%d", Integer.valueOf(xVar.b()), Integer.valueOf(xVar.a())));
        if (z) {
            builder.addQueryParameter("crop", String.valueOf(1));
        }
    }

    private static List<URL> F(List<String> list, String str) throws MalformedURLException {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new URL("https", it.next(), str));
        }
        return arrayList;
    }

    private ax.la.i<ax.la.v> G(Long l, String str, String str2, ax.la.m mVar, Date date, ax.la.r rVar, ax.la.y yVar) {
        if (str2 == null) {
            throw new IllegalArgumentException("Filename cannot be null.");
        }
        if (mVar == null) {
            throw new IllegalArgumentException("File data cannot be null.");
        }
        if (yVar == null) {
            throw new IllegalArgumentException("Upload options cannot be null.");
        }
        MultipartBody build = new MultipartBody.Builder(g).setType(MultipartBody.FORM).addFormDataPart("file", str2, new a(rVar, mVar)).build();
        HttpUrl.Builder addQueryParameter = this.f.newBuilder().addPathSegment("uploadfile").addQueryParameter("renameifexists", String.valueOf(!yVar.c() ? 1 : 0)).addQueryParameter("nopartial", String.valueOf(!yVar.d() ? 1 : 0));
        if (l != null) {
            addQueryParameter.addQueryParameter("folderid", String.valueOf(l));
        }
        if (str != null) {
            addQueryParameter.addEncodedQueryParameter("path", str);
        }
        if (date != null) {
            addQueryParameter.addQueryParameter("mtime", String.valueOf(TimeUnit.MILLISECONDS.toSeconds(date.getTime())));
        }
        return c0(new Request.Builder().url(addQueryParameter.build()).method("POST", build).build(), new InterfaceC2545b() { // from class: com.pcloud.sdk.internal.j
            @Override // ax.ma.InterfaceC2545b
            public final Object a(Response response) {
                ax.la.v Q;
                Q = u.this.Q(response);
                return Q;
            }
        });
    }

    private <T> T K(Response response, Class<? extends T> cls) throws IOException {
        try {
            if (!response.isSuccessful()) {
                throw new C2630a(response.code(), response.message());
            }
            ResponseBody body = response.body();
            Objects.requireNonNull(body);
            JsonReader jsonReader = new JsonReader(new BufferedReader(new InputStreamReader(body.byteStream())));
            try {
                try {
                    return (T) this.c.h(jsonReader, cls);
                } catch (C3009r e) {
                    throw new IOException("Malformed JSON response.", e);
                }
            } finally {
                C2544a.a(jsonReader);
            }
        } finally {
            C2544a.a(response);
        }
    }

    private <T extends C2631b> T L(Response response, Class<? extends T> cls) throws IOException, C2492b {
        T t = (T) K(response, cls);
        if (t == null) {
            throw new IOException("API returned an empty response body.");
        }
        if (t.c()) {
            return t;
        }
        throw new C2492b(t.b(), t.a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ax.la.p M(Response response) throws IOException, C2492b {
        C2633d c2633d = (C2633d) L(response, C2633d.class);
        return new y(this, c2633d.d(), F(c2633d.e(), c2633d.f()), c2633d.g());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ax.xc.g N(Response response) throws C2630a {
        try {
            if (!response.isSuccessful()) {
                throw new C2630a(response.code(), response.message());
            }
            ResponseBody body = response.body();
            Objects.requireNonNull(body);
            return body.source();
        } catch (Throwable th) {
            if (0 == 0) {
                C2544a.a(response);
            }
            throw th;
        }
    }

    private boolean O(String str) {
        return (str == null || str.isEmpty()) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ax.la.v P(Response response) throws IOException, C2492b {
        return ((C2634e) L(response, C2634e.class)).d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ax.la.v Q(Response response) throws IOException, C2492b {
        C2636g c2636g = (C2636g) L(response, C2636g.class);
        if (c2636g.d().isEmpty()) {
            throw new IOException("API uploaded file but did not return remote file data.");
        }
        return c2636g.d().get(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ax.la.w R(Response response) throws IOException, C2492b {
        return ((C2635f) L(response, C2635f.class)).d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Boolean S(Response response) throws IOException, C2492b {
        C2634e c2634e = (C2634e) K(response, C2634e.class);
        return Boolean.valueOf(c2634e.c() && c2634e.d() != null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Boolean T(Response response) throws IOException, C2492b {
        C2634e c2634e = (C2634e) K(response, C2634e.class);
        return Boolean.valueOf(c2634e.c() && c2634e.d() != null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Boolean U(Response response) throws IOException, C2492b {
        L(response, C2631b.class);
        return Boolean.TRUE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Boolean V(Response response) throws IOException, C2492b {
        L(response, C2631b.class);
        return Boolean.TRUE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ InterfaceC2490A W(Response response) throws IOException, C2492b {
        C2637h c2637h = (C2637h) L(response, C2637h.class);
        return new B(c2637h.g(), c2637h.d(), c2637h.h(), c2637h.e(), c2637h.f());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ax.la.w X(Response response) throws IOException, C2492b {
        return ((C2635f) L(response, C2635f.class)).d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ax.la.v Y(Response response) throws IOException, C2492b {
        return ((C2634e) L(response, C2634e.class)).d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ax.la.v Z(Response response) throws IOException, C2492b {
        return ((C2634e) L(response, C2634e.class)).d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ax.la.w a0(Response response) throws IOException, C2492b {
        return ((C2635f) L(response, C2635f.class)).d();
    }

    private <T> ax.la.i<T> c0(Request request, InterfaceC2545b<T> interfaceC2545b) {
        C3786e c3786e = new C3786e(this.d.newCall(request), interfaceC2545b);
        Executor executor = this.e;
        return executor != null ? new E(c3786e, executor) : c3786e;
    }

    private Request d0(Long l, String str, ax.la.n nVar) {
        HttpUrl.Builder addPathSegment = this.f.newBuilder().addPathSegment("getfilelink");
        if (l != null) {
            addPathSegment.addQueryParameter("fileid", String.valueOf(l));
        }
        if (str != null) {
            addPathSegment.addEncodedQueryParameter("path", str);
        }
        if (nVar.c()) {
            addPathSegment.addQueryParameter("forcedownload", String.valueOf(1));
        }
        if (nVar.e()) {
            addPathSegment.addQueryParameter("skipfilename", String.valueOf(1));
        }
        if (nVar.a() != null) {
            MediaType parse = MediaType.parse(nVar.a());
            if (parse == null) {
                throw new IllegalArgumentException("Invalid or not well-formatted content type DownloadOptions argument");
            }
            addPathSegment.addQueryParameter("contenttype", parse.toString());
        }
        return new Request.Builder().url(addPathSegment.build()).get().build();
    }

    private Request.Builder e0() {
        return new Request.Builder().url(this.f);
    }

    private Request f0(Long l, ax.la.x xVar, boolean z) {
        HttpUrl.Builder addPathSegment = this.f.newBuilder().addPathSegment("getthumb");
        E(addPathSegment, l, xVar, z);
        return new Request.Builder().url(addPathSegment.build()).get().build();
    }

    private void g0(String str) {
        h0(str, null);
    }

    private void h0(String str, String str2) {
        if (O(str)) {
            return;
        }
        if (str2 == null || str2.isEmpty()) {
            throw new IllegalArgumentException("Path argument cannot be null or empty.");
        }
        throw new IllegalArgumentException("Path argument `" + str2 + "` cannot be null or empty.");
    }

    private static void i0(ax.la.x xVar) {
        Objects.requireNonNull(xVar);
        j0(xVar.b(), "Width");
        j0(xVar.a(), "Height");
    }

    private static void j0(int i, String str) {
        if (!C2546c.d0.k(i)) {
            throw new IllegalArgumentException(String.format(Locale.US, "%s must be in the range [16,2048].", str));
        }
    }

    public ax.la.i<Boolean> H(long j) {
        return c0(new Request.Builder().url(this.f.newBuilder().addPathSegment("deletefile").build()).get().post(new FormBody.Builder().add("fileid", String.valueOf(j)).build()).build(), new InterfaceC2545b() { // from class: com.pcloud.sdk.internal.r
            @Override // ax.ma.InterfaceC2545b
            public final Object a(Response response) {
                Boolean S;
                S = u.this.S(response);
                return S;
            }
        });
    }

    public ax.la.i<Boolean> I(long j) {
        return J(j, false);
    }

    public ax.la.i<Boolean> J(long j, boolean z) {
        return c0(e0().url(this.f.newBuilder().addPathSegment(z ? "deletefolderrecursive" : "deletefolder").build()).post(new FormBody.Builder().add("folderid", String.valueOf(j)).build()).build(), new InterfaceC2545b() { // from class: com.pcloud.sdk.internal.k
            @Override // ax.ma.InterfaceC2545b
            public final Object a(Response response) {
                Boolean U;
                U = u.this.U(response);
                return U;
            }
        });
    }

    @Override // ax.la.InterfaceC2491a
    public ax.la.i<ax.la.w> a(String str, String str2) {
        h0(str, "path");
        h0(str2, "toPath");
        return c0(e0().url(this.f.newBuilder().addPathSegment("renamefolder").build()).post(new FormBody.Builder().addEncoded("path", str).addEncoded("topath", str2).build()).build(), new InterfaceC2545b() { // from class: com.pcloud.sdk.internal.o
            @Override // ax.ma.InterfaceC2545b
            public final Object a(Response response) {
                ax.la.w a0;
                a0 = u.this.a0(response);
                return a0;
            }
        });
    }

    @Override // ax.la.InterfaceC2491a
    public ax.la.i<ax.la.v> b(String str, String str2, ax.la.m mVar, Date date, ax.la.r rVar, ax.la.y yVar) {
        g0(str);
        return G(null, str, str2, mVar, date, rVar, yVar);
    }

    public ax.la.i<ax.la.w> b0(String str, boolean z) {
        g0(str);
        HttpUrl.Builder addEncodedQueryParameter = this.f.newBuilder().addPathSegment("listfolder").addEncodedQueryParameter("path", str);
        if (z) {
            addEncodedQueryParameter.addEncodedQueryParameter("recursive", String.valueOf(1));
        }
        return c0(e0().url(addEncodedQueryParameter.build()).get().build(), new InterfaceC2545b() { // from class: com.pcloud.sdk.internal.h
            @Override // ax.ma.InterfaceC2545b
            public final Object a(Response response) {
                ax.la.w X;
                X = u.this.X(response);
                return X;
            }
        });
    }

    @Override // ax.la.InterfaceC2491a
    public ax.la.i<Boolean> c(ax.la.u uVar) {
        if (uVar != null) {
            return uVar.f() ? I(uVar.c().l()) : H(uVar.j().n());
        }
        throw new IllegalArgumentException("RemoteEntry argument cannot be null.");
    }

    @Override // ax.la.InterfaceC2491a
    public ax.la.i<ax.la.v> d(String str, String str2, boolean z) {
        h0(str, "path");
        h0(str2, "toPath");
        FormBody.Builder addEncoded = new FormBody.Builder().addEncoded("path", str).addEncoded("topath", str2);
        if (!z) {
            addEncoded.add("noover", String.valueOf(1));
        }
        return c0(e0().url(this.f.newBuilder().addPathSegment("copyfile").build()).post(addEncoded.build()).build(), new InterfaceC2545b() { // from class: com.pcloud.sdk.internal.p
            @Override // ax.ma.InterfaceC2545b
            public final Object a(Response response) {
                ax.la.v P;
                P = u.this.P(response);
                return P;
            }
        });
    }

    @Override // ax.la.InterfaceC2491a
    public ax.la.i<ax.la.v> e(String str, String str2, ax.la.m mVar, ax.la.y yVar) {
        return b(str, str2, mVar, null, null, yVar);
    }

    @Override // ax.la.InterfaceC2491a
    public ax.la.i<ax.xc.g> f(long j, ax.la.x xVar, boolean z) {
        i0(xVar);
        return c0(f0(Long.valueOf(j), ax.ma.d.g(C2546c.d0, xVar), z), new InterfaceC2545b() { // from class: com.pcloud.sdk.internal.n
            @Override // ax.ma.InterfaceC2545b
            public final Object a(Response response) {
                ax.xc.g N;
                N = u.this.N(response);
                return N;
            }
        });
    }

    @Override // ax.la.InterfaceC2491a
    public ax.la.i<ax.la.p> g(String str, ax.la.n nVar) {
        g0(str);
        if (nVar != null) {
            return c0(d0(null, str, nVar), new InterfaceC2545b() { // from class: com.pcloud.sdk.internal.l
                @Override // ax.ma.InterfaceC2545b
                public final Object a(Response response) {
                    ax.la.p M;
                    M = u.this.M(response);
                    return M;
                }
            });
        }
        throw new IllegalArgumentException("DownloadOptions parameter cannot be null.");
    }

    @Override // ax.la.InterfaceC2491a
    public ax.la.i<Boolean> h(String str) {
        g0(str);
        return c0(new Request.Builder().url(this.f.newBuilder().addPathSegment("deletefile").build()).get().post(new FormBody.Builder().addEncoded("path", str).build()).build(), new InterfaceC2545b() { // from class: com.pcloud.sdk.internal.s
            @Override // ax.ma.InterfaceC2545b
            public final Object a(Response response) {
                Boolean T;
                T = u.this.T(response);
                return T;
            }
        });
    }

    @Override // ax.la.InterfaceC2491a
    public ax.la.i<ax.la.v> i(String str, String str2) {
        h0(str, "path");
        h0(str2, "toPath");
        return c0(e0().url(this.f.newBuilder().addPathSegment("renamefile").build()).post(new FormBody.Builder().addEncoded("path", str).addEncoded("topath", str2).build()).build(), new InterfaceC2545b() { // from class: com.pcloud.sdk.internal.t
            @Override // ax.ma.InterfaceC2545b
            public final Object a(Response response) {
                ax.la.v Z;
                Z = u.this.Z(response);
                return Z;
            }
        });
    }

    @Override // ax.la.InterfaceC2491a
    public ax.la.i<InterfaceC2490A> j() {
        return c0(e0().url(this.f.newBuilder().addPathSegment("userinfo").build()).get().build(), new InterfaceC2545b() { // from class: com.pcloud.sdk.internal.q
            @Override // ax.ma.InterfaceC2545b
            public final Object a(Response response) {
                InterfaceC2490A W;
                W = u.this.W(response);
                return W;
            }
        });
    }

    @Override // ax.la.InterfaceC2491a
    public ax.la.i<Boolean> k(String str, boolean z) {
        g0(str);
        return c0(e0().url(this.f.newBuilder().addPathSegment(z ? "deletefolderrecursive" : "deletefolder").build()).post(new FormBody.Builder().addEncoded("path", str).build()).build(), new InterfaceC2545b() { // from class: com.pcloud.sdk.internal.i
            @Override // ax.ma.InterfaceC2545b
            public final Object a(Response response) {
                Boolean V;
                V = u.this.V(response);
                return V;
            }
        });
    }

    @Override // ax.la.InterfaceC2491a
    public ax.la.i<ax.la.w> l(String str) {
        return b0(str, false);
    }

    @Override // ax.la.InterfaceC2491a
    public ax.la.i<ax.la.v> m(String str) {
        g0(str);
        return c0(e0().url(this.f.newBuilder().addPathSegment("stat").addEncodedQueryParameter("path", String.valueOf(str)).build()).get().build(), new InterfaceC2545b() { // from class: com.pcloud.sdk.internal.g
            @Override // ax.ma.InterfaceC2545b
            public final Object a(Response response) {
                ax.la.v Y;
                Y = u.this.Y(response);
                return Y;
            }
        });
    }

    @Override // ax.la.InterfaceC2491a
    public ax.la.i<ax.la.w> n(String str) {
        g0(str);
        return c0(e0().url(this.f.newBuilder().addPathSegment("createfolder").build()).post(new FormBody.Builder().addEncoded("path", str).build()).build(), new InterfaceC2545b() { // from class: com.pcloud.sdk.internal.m
            @Override // ax.ma.InterfaceC2545b
            public final Object a(Response response) {
                ax.la.w R;
                R = u.this.R(response);
                return R;
            }
        });
    }
}
