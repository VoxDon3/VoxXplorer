/*
 * Decompiled with CFR 0.152.
 */
package com.pcloud.sdk.internal;

import ax.la.a;
import ax.la.x;
import ax.ma.d;
import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;
import com.pcloud.sdk.internal.A;
import com.pcloud.sdk.internal.B;
import com.pcloud.sdk.internal.E;
import com.pcloud.sdk.internal.RealRemoteEntry;
import com.pcloud.sdk.internal.b;
import com.pcloud.sdk.internal.c;
import com.pcloud.sdk.internal.e;
import com.pcloud.sdk.internal.f;
import com.pcloud.sdk.internal.g;
import com.pcloud.sdk.internal.h;
import com.pcloud.sdk.internal.i;
import com.pcloud.sdk.internal.j;
import com.pcloud.sdk.internal.k;
import com.pcloud.sdk.internal.l;
import com.pcloud.sdk.internal.m;
import com.pcloud.sdk.internal.n;
import com.pcloud.sdk.internal.networking.serialization.ByteStringTypeAdapter;
import com.pcloud.sdk.internal.networking.serialization.DateTypeAdapter;
import com.pcloud.sdk.internal.networking.serialization.ResolutionDeserializer;
import com.pcloud.sdk.internal.networking.serialization.UnmodifiableListTypeFactory;
import com.pcloud.sdk.internal.o;
import com.pcloud.sdk.internal.p;
import com.pcloud.sdk.internal.q;
import com.pcloud.sdk.internal.r;
import com.pcloud.sdk.internal.s;
import com.pcloud.sdk.internal.t;
import com.pcloud.sdk.internal.v;
import com.pcloud.sdk.internal.w;
import com.pcloud.sdk.internal.y;
import com.pcloud.sdk.internal.z;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.lang.reflect.Type;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;
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

class u
implements a {
    private static final String g;
    private final long a;
    private final ax.la.c b;
    private final Gson c;
    private final OkHttpClient d;
    private final Executor e;
    private final HttpUrl f;

    static {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("----pCloud-SDK-1.11.0-");
        stringBuilder.append(UUID.randomUUID());
        stringBuilder.append("----");
        g = stringBuilder.toString();
    }

    u(v v8) {
        Object object = new TreeMap<String, String>();
        object.put("timeformat", "timestamp");
        String string = String.format(Locale.US, "pCloud SDK Java %s", "1.11.0");
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        long l8 = v8.l();
        Object object2 = TimeUnit.MILLISECONDS;
        object = builder.readTimeout(l8, (TimeUnit)((Object)object2)).writeTimeout(v8.m(), (TimeUnit)((Object)object2)).connectTimeout(v8.h(), (TimeUnit)((Object)object2)).protocols(Collections.singletonList(Protocol.HTTP_1_1)).addInterceptor(new c(string, (Map<String, String>)object));
        if (v8.j() != null) {
            ((OkHttpClient.Builder)object).dispatcher(v8.j());
        }
        if (v8.i() != null) {
            ((OkHttpClient.Builder)object).connectionPool(v8.i());
        }
        if (v8.f() != null) {
            ((OkHttpClient.Builder)object).cache(v8.f());
        }
        ((OkHttpClient.Builder)object).authenticator(Authenticator.NONE);
        object2 = v8.e();
        this.b = object2;
        if (object2 != null) {
            ((OkHttpClient.Builder)object).addInterceptor((w)v8.e());
        }
        this.d = ((OkHttpClient.Builder)object).build();
        this.e = v8.g();
        this.a = v8.k();
        this.c = new com.google.gson.a().c().e(new RealRemoteEntry.TypeAdapterFactory()).e(new UnmodifiableListTypeFactory()).d((Type)((Object)ax.la.u.class), new RealRemoteEntry.FileEntryDeserializer()).d((Type)((Object)Date.class), new DateTypeAdapter()).d((Type)((Object)z.class), new z.a(this)).d((Type)((Object)A.class), new A.a(this)).d((Type)((Object)ax.xc.h.class), new ByteStringTypeAdapter()).d((Type)((Object)x.class), ResolutionDeserializer.a).b();
        this.f = v8.d();
    }

    public static /* synthetic */ Boolean A(u u8, Response response) {
        return u8.S(response);
    }

    public static /* synthetic */ ax.la.v B(u u8, Response response) {
        return u8.Z(response);
    }

    private static void E(HttpUrl.Builder builder, Long l8, x x8, boolean bl) {
        builder.addQueryParameter("fileid", String.valueOf(l8));
        builder.addQueryParameter("size", String.format(Locale.US, "%dx%d", x8.b(), x8.a()));
        if (bl) {
            builder.addQueryParameter("crop", String.valueOf(1));
        }
    }

    private static List<URL> F(List<String> object, String string) throws MalformedURLException {
        ArrayList<URL> arrayList = new ArrayList<URL>(object.size());
        object = object.iterator();
        while (object.hasNext()) {
            arrayList.add(new URL("https", (String)object.next(), string));
        }
        return arrayList;
    }

    private ax.la.i<ax.la.v> G(Long l8, String string, String object, ax.la.m object2, Date date, ax.la.r r8, ax.la.y y8) {
        if (object != null) {
            if (object2 != null) {
                if (y8 != null) {
                    object2 = new RequestBody(this, r8, (ax.la.m)object2){
                        final ax.la.r a;
                        final ax.la.m b;
                        final u c;
                        {
                            this.c = u8;
                            this.a = r8;
                            this.b = m8;
                        }

                        @Override
                        public long contentLength() {
                            long l8 = this.b.a();
                            if (l8 >= 0L) {
                                return l8;
                            }
                            throw new IllegalArgumentException("Content length must be >= 0.");
                        }

                        @Override
                        public MediaType contentType() {
                            return MediaType.parse("multipart/form-data");
                        }

                        @Override
                        public void writeTo(ax.xc.f f8) throws IOException {
                            ax.la.r r8 = this.a;
                            if (r8 != null) {
                                if (this.c.e != null) {
                                    r8 = new b(this.a, this.c.e);
                                }
                                f8 = ax.xc.p.c(new f(f8, this.b.a(), r8, this.c.a));
                                this.b.b(f8);
                                f8.G();
                                return;
                            }
                            this.b.b(f8);
                        }
                    };
                    object = new MultipartBody.Builder(g).setType(MultipartBody.FORM).addFormDataPart("file", (String)object, (RequestBody)object2).build();
                    object2 = this.f.newBuilder().addPathSegment("uploadfile").addQueryParameter("renameifexists", String.valueOf(y8.c() ^ 1)).addQueryParameter("nopartial", String.valueOf(y8.d() ^ 1));
                    if (l8 != null) {
                        ((HttpUrl.Builder)object2).addQueryParameter("folderid", String.valueOf(l8));
                    }
                    if (string != null) {
                        ((HttpUrl.Builder)object2).addEncodedQueryParameter("path", string);
                    }
                    if (date != null) {
                        ((HttpUrl.Builder)object2).addQueryParameter("mtime", String.valueOf(TimeUnit.MILLISECONDS.toSeconds(date.getTime())));
                    }
                    return this.c0(new Request.Builder().url(((HttpUrl.Builder)object2).build()).method("POST", (RequestBody)object).build(), new j(this));
                }
                throw new IllegalArgumentException("Upload options cannot be null.");
            }
            throw new IllegalArgumentException("File data cannot be null.");
        }
        throw new IllegalArgumentException("Filename cannot be null.");
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private <T> T K(Response var1_1, Class<? extends T> var2_2) throws IOException {
        block10: {
            block9: {
                try {
                    if (!var1_1.isSuccessful()) ** GOTO lbl-1000
                    var6_9 = var1_1.body();
                    j.Objects.requireNonNull((Object)var6_9);
                    var4_8 = new InputStreamReader(var6_9.byteStream());
                    var5_7 = new BufferedReader((Reader)var4_8);
                    var3_6 = new JsonReader(var5_7);
                }
                catch (Throwable var2_3) {}
                ** try [egrp 1[TRYBLOCK] [2, 1 : 56->66)] { 
lbl-1000:
                // 1 sources

                {
                    catch (ax.r8.r var2_5) {}
                    {
                        var4_8 = new IOException("Malformed JSON response.", var2_5);
                        throw var4_8;
                    }
                }
lbl14:
                // 1 sources

                finally {
                    break block9;
                }
                break block10;
            }
            var2_2 /* !! */  = this.c.h(var3_6, var2_2 /* !! */ );
            {
                ax.ma.a.a(var3_6);
            }
            ax.ma.a.a(var1_1);
            return (T)var2_2 /* !! */ ;
lbl-1000:
            // 1 sources

            {
                var2_2 /* !! */  = new Class<T>(var1_1.code(), var1_1.message());
                throw var2_2 /* !! */ ;
            }
        }
        ax.ma.a.a(var1_1);
        throw var2_3;
    }

    private <T extends ax.na.b> T L(Response object, Class<? extends T> clazz) throws IOException, ax.la.b {
        if ((object = (ax.na.b)this.K((Response)object, clazz)) != null) {
            if (((ax.na.b)object).c()) {
                return (T)object;
            }
            throw new ax.la.b(((ax.na.b)object).b(), ((ax.na.b)object).a());
        }
        throw new IOException("API returned an empty response body.");
    }

    private ax.la.p M(Response object) throws IOException, ax.la.b {
        object = this.L((Response)object, ax.na.d.class);
        List<URL> list = u.F(((ax.na.c)object).e(), ((ax.na.c)object).f());
        return new y(this, ((ax.na.c)object).d(), list, ((ax.na.d)object).g());
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private ax.xc.g N(Response response) throws ax.na.a {
        Throwable throwable2;
        boolean bl;
        block4: {
            boolean bl2;
            bl = bl2 = false;
            try {
                if (response.isSuccessful()) {
                    bl = bl2 = true;
                    ResponseBody responseBody = response.body();
                    bl = bl2;
                    j.Objects.requireNonNull((Object)responseBody);
                    bl = bl2;
                    return responseBody.source();
                }
            }
            catch (Throwable throwable2) {
                break block4;
            }
            bl = bl2;
            bl = bl2;
            ax.na.a a8 = new ax.na.a(response.code(), response.message());
            bl = bl2;
            throw a8;
        }
        if (!bl) {
            ax.ma.a.a(response);
        }
        throw throwable2;
    }

    private boolean O(String string) {
        return string != null && !string.isEmpty();
    }

    private /* synthetic */ ax.la.v P(Response response) throws IOException, ax.la.b {
        return this.L(response, ax.na.e.class).d();
    }

    private /* synthetic */ ax.la.v Q(Response object) throws IOException, ax.la.b {
        if (!((ax.na.g)(object = this.L((Response)object, ax.na.g.class))).d().isEmpty()) {
            return ((ax.na.g)object).d().get(0);
        }
        throw new IOException("API uploaded file but did not return remote file data.");
    }

    private /* synthetic */ ax.la.w R(Response response) throws IOException, ax.la.b {
        return this.L(response, ax.na.f.class).d();
    }

    private /* synthetic */ Boolean S(Response object) throws IOException, ax.la.b {
        boolean bl = ((ax.na.b)(object = this.K((Response)object, ax.na.e.class))).c() && ((ax.na.e)object).d() != null;
        return bl;
    }

    private /* synthetic */ Boolean T(Response object) throws IOException, ax.la.b {
        boolean bl = ((ax.na.b)(object = this.K((Response)object, ax.na.e.class))).c() && ((ax.na.e)object).d() != null;
        return bl;
    }

    private /* synthetic */ Boolean U(Response response) throws IOException, ax.la.b {
        this.L(response, ax.na.b.class);
        return Boolean.TRUE;
    }

    private /* synthetic */ Boolean V(Response response) throws IOException, ax.la.b {
        this.L(response, ax.na.b.class);
        return Boolean.TRUE;
    }

    private /* synthetic */ ax.la.A W(Response object) throws IOException, ax.la.b {
        object = this.L((Response)object, ax.na.h.class);
        return new B(((ax.na.h)object).g(), ((ax.na.h)object).d(), ((ax.na.h)object).h(), ((ax.na.h)object).e(), ((ax.na.h)object).f());
    }

    private /* synthetic */ ax.la.w X(Response response) throws IOException, ax.la.b {
        return this.L(response, ax.na.f.class).d();
    }

    private /* synthetic */ ax.la.v Y(Response response) throws IOException, ax.la.b {
        return this.L(response, ax.na.e.class).d();
    }

    private /* synthetic */ ax.la.v Z(Response response) throws IOException, ax.la.b {
        return this.L(response, ax.na.e.class).d();
    }

    private /* synthetic */ ax.la.w a0(Response response) throws IOException, ax.la.b {
        return this.L(response, ax.na.f.class).d();
    }

    private <T> ax.la.i<T> c0(Request object, ax.ma.b<T> object2) {
        object = new e<T>(this.d.newCall((Request)object), object2);
        object2 = this.e;
        if (object2 != null) {
            return new E(object, (Executor)object2);
        }
        return object;
    }

    private Request d0(Long object, String string, ax.la.n n8) {
        HttpUrl.Builder builder = this.f.newBuilder().addPathSegment("getfilelink");
        if (object != null) {
            builder.addQueryParameter("fileid", String.valueOf(object));
        }
        if (string != null) {
            builder.addEncodedQueryParameter("path", string);
        }
        if (n8.c()) {
            builder.addQueryParameter("forcedownload", String.valueOf(1));
        }
        if (n8.e()) {
            builder.addQueryParameter("skipfilename", String.valueOf(1));
        }
        if (n8.a() != null) {
            object = MediaType.parse(n8.a());
            if (object != null) {
                builder.addQueryParameter("contenttype", ((MediaType)object).toString());
            } else {
                throw new IllegalArgumentException("Invalid or not well-formatted content type DownloadOptions argument");
            }
        }
        return new Request.Builder().url(builder.build()).get().build();
    }

    private Request.Builder e0() {
        return new Request.Builder().url(this.f);
    }

    private Request f0(Long l8, x x8, boolean bl) {
        HttpUrl.Builder builder = this.f.newBuilder().addPathSegment("getthumb");
        u.E(builder, l8, x8, bl);
        return new Request.Builder().url(builder.build()).get().build();
    }

    private void g0(String string) {
        this.h0(string, null);
    }

    private void h0(String charSequence, String string) {
        if (!this.O((String)charSequence)) {
            if (string != null && !string.isEmpty()) {
                charSequence = new StringBuilder();
                ((StringBuilder)charSequence).append("Path argument `");
                ((StringBuilder)charSequence).append(string);
                ((StringBuilder)charSequence).append("` cannot be null or empty.");
                throw new IllegalArgumentException(((StringBuilder)charSequence).toString());
            }
            throw new IllegalArgumentException("Path argument cannot be null or empty.");
        }
    }

    private static void i0(x x8) {
        j.Objects.requireNonNull((Object)x8);
        u.j0(x8.b(), "Width");
        u.j0(x8.a(), "Height");
    }

    private static void j0(int n8, String string) {
        if (ax.ma.c.d0.k(n8)) {
            return;
        }
        throw new IllegalArgumentException(String.format(Locale.US, "%s must be in the range [16,2048].", string));
    }

    public static /* synthetic */ Boolean o(u u8, Response response) {
        return u8.T(response);
    }

    public static /* synthetic */ ax.la.v p(u u8, Response response) {
        return u8.P(response);
    }

    public static /* synthetic */ ax.la.v q(u u8, Response response) {
        return u8.Q(response);
    }

    public static /* synthetic */ Boolean r(u u8, Response response) {
        return u8.U(response);
    }

    public static /* synthetic */ ax.la.v s(u u8, Response response) {
        return u8.Y(response);
    }

    public static /* synthetic */ ax.la.w t(u u8, Response response) {
        return u8.X(response);
    }

    public static /* synthetic */ ax.xc.g u(u u8, Response response) {
        return u8.N(response);
    }

    public static /* synthetic */ ax.la.w v(u u8, Response response) {
        return u8.a0(response);
    }

    public static /* synthetic */ ax.la.p w(u u8, Response response) {
        return u8.M(response);
    }

    public static /* synthetic */ Boolean x(u u8, Response response) {
        return u8.V(response);
    }

    public static /* synthetic */ ax.la.A y(u u8, Response response) {
        return u8.W(response);
    }

    public static /* synthetic */ ax.la.w z(u u8, Response response) {
        return u8.R(response);
    }

    public ax.la.i<Boolean> H(long l8) {
        return this.c0(new Request.Builder().url(this.f.newBuilder().addPathSegment("deletefile").build()).get().post(new FormBody.Builder().add("fileid", String.valueOf(l8)).build()).build(), new r(this));
    }

    public ax.la.i<Boolean> I(long l8) {
        return this.J(l8, false);
    }

    public ax.la.i<Boolean> J(long l8, boolean bl) {
        FormBody formBody = new FormBody.Builder().add("folderid", String.valueOf(l8)).build();
        Request.Builder builder = this.e0();
        HttpUrl.Builder builder2 = this.f.newBuilder();
        String string = bl ? "deletefolderrecursive" : "deletefolder";
        return this.c0(builder.url(builder2.addPathSegment(string).build()).post(formBody).build(), new k(this));
    }

    @Override
    public ax.la.i<ax.la.w> a(String object, String string) {
        this.h0((String)object, "path");
        this.h0(string, "toPath");
        object = new FormBody.Builder().addEncoded("path", (String)object).addEncoded("topath", string).build();
        return this.c0(this.e0().url(this.f.newBuilder().addPathSegment("renamefolder").build()).post((RequestBody)object).build(), new o(this));
    }

    @Override
    public ax.la.i<ax.la.v> b(String string, String string2, ax.la.m m8, Date date, ax.la.r r8, ax.la.y y8) {
        this.g0(string);
        return this.G(null, string, string2, m8, date, r8, y8);
    }

    public ax.la.i<ax.la.w> b0(String object, boolean bl) {
        this.g0((String)object);
        object = this.f.newBuilder().addPathSegment("listfolder").addEncodedQueryParameter("path", (String)object);
        if (bl) {
            ((HttpUrl.Builder)object).addEncodedQueryParameter("recursive", String.valueOf(1));
        }
        return this.c0(this.e0().url(((HttpUrl.Builder)object).build()).get().build(), new h(this));
    }

    @Override
    public ax.la.i<Boolean> c(ax.la.u u8) {
        if (u8 != null) {
            if (u8.f()) {
                return this.I(u8.c().l());
            }
            return this.H(u8.j().n());
        }
        throw new IllegalArgumentException("RemoteEntry argument cannot be null.");
    }

    @Override
    public ax.la.i<ax.la.v> d(String object, String string, boolean bl) {
        this.h0((String)object, "path");
        this.h0(string, "toPath");
        object = new FormBody.Builder().addEncoded("path", (String)object).addEncoded("topath", string);
        if (!bl) {
            ((FormBody.Builder)object).add("noover", String.valueOf(1));
        }
        object = ((FormBody.Builder)object).build();
        return this.c0(this.e0().url(this.f.newBuilder().addPathSegment("copyfile").build()).post((RequestBody)object).build(), new p(this));
    }

    @Override
    public ax.la.i<ax.la.v> e(String string, String string2, ax.la.m m8, ax.la.y y8) {
        return this.b(string, string2, m8, null, null, y8);
    }

    @Override
    public ax.la.i<ax.xc.g> f(long l8, x x8, boolean bl) {
        u.i0(x8);
        return this.c0(this.f0(l8, ax.ma.d.g(ax.ma.c.d0, x8), bl), new n(this));
    }

    @Override
    public ax.la.i<ax.la.p> g(String string, ax.la.n n8) {
        this.g0(string);
        if (n8 != null) {
            return this.c0(this.d0(null, string, n8), new l(this));
        }
        throw new IllegalArgumentException("DownloadOptions parameter cannot be null.");
    }

    @Override
    public ax.la.i<Boolean> h(String string) {
        this.g0(string);
        return this.c0(new Request.Builder().url(this.f.newBuilder().addPathSegment("deletefile").build()).get().post(new FormBody.Builder().addEncoded("path", string).build()).build(), new s(this));
    }

    @Override
    public ax.la.i<ax.la.v> i(String object, String string) {
        this.h0((String)object, "path");
        this.h0(string, "toPath");
        object = new FormBody.Builder().addEncoded("path", (String)object).addEncoded("topath", string).build();
        return this.c0(this.e0().url(this.f.newBuilder().addPathSegment("renamefile").build()).post((RequestBody)object).build(), new t(this));
    }

    @Override
    public ax.la.i<ax.la.A> j() {
        return this.c0(this.e0().url(this.f.newBuilder().addPathSegment("userinfo").build()).get().build(), new q(this));
    }

    @Override
    public ax.la.i<Boolean> k(String string, boolean bl) {
        this.g0(string);
        FormBody formBody = new FormBody.Builder().addEncoded("path", string).build();
        Request.Builder builder = this.e0();
        HttpUrl.Builder builder2 = this.f.newBuilder();
        string = bl ? "deletefolderrecursive" : "deletefolder";
        return this.c0(builder.url(builder2.addPathSegment(string).build()).post(formBody).build(), new i(this));
    }

    @Override
    public ax.la.i<ax.la.w> l(String string) {
        return this.b0(string, false);
    }

    @Override
    public ax.la.i<ax.la.v> m(String object) {
        this.g0((String)object);
        object = this.f.newBuilder().addPathSegment("stat").addEncodedQueryParameter("path", String.valueOf(object));
        return this.c0(this.e0().url(((HttpUrl.Builder)object).build()).get().build(), new g(this));
    }

    @Override
    public ax.la.i<ax.la.w> n(String object) {
        this.g0((String)object);
        object = new FormBody.Builder().addEncoded("path", (String)object).build();
        return this.c0(this.e0().url(this.f.newBuilder().addPathSegment("createfolder").build()).post((RequestBody)object).build(), new m(this));
    }
}

