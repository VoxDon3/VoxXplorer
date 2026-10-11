/*
 * Decompiled with CFR 0.152.
 */
package ax.Sa;

import ax.Sa.b;
import ax.Sa.d;
import ax.Sa.f;
import ax.Sa.k;
import ax.Ua.g;
import ax.Ua.h;
import ax.Ua.m;
import ax.Ua.o;
import ax.Ua.p;
import ax.Va.c;
import com.google.gson.Gson;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.regex.Pattern;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;

class j {
    private static final ax.Xd.d c = ax.Xd.f.k(j.class);
    private static final Pattern d = Pattern.compile("bytes\\D+(\\d+)-\\d+/(\\d+)");
    private OkHttpClient a;
    private List<b> b;

    j(OkHttpClient okHttpClient, List<b> list) {
        this.a = okHttpClient;
        this.b = list;
    }

    private Request.Builder a() {
        Request.Builder builder = new Request.Builder();
        for (b b8 : this.b) {
            builder.addHeader(b8.a(), b8.b());
        }
        return builder;
    }

    private Response b(String object, String string) throws IOException {
        boolean bl = "PUT".equals(object);
        RequestBody requestBody = null;
        if (bl) {
            requestBody = RequestBody.create(new byte[0], null);
        }
        object = this.a().method((String)object, requestBody).url(string).build();
        return this.a.newCall((Request)object).execute();
    }

    private void c(Response closeable) throws IOException {
        if (closeable == null || (closeable = ((Response)closeable).body()) == null) {
            return;
        }
        ((ResponseBody)closeable).close();
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private <T> T g(Response closeable, Class<T> clazz) throws IOException {
        RuntimeException var2_5;
        block5: {
            try {
                closeable = ((Response)closeable).body();
            }
            catch (Throwable throwable) {
                closeable = null;
                break block5;
            }
            try {
                Gson gson = new Gson();
                clazz = gson.i(((ResponseBody)closeable).charStream(), clazz);
                ((ResponseBody)closeable).close();
                return (T)clazz;
            }
            catch (Throwable throwable) {}
        }
        if (closeable == null) throw var2_5;
        ((ResponseBody)closeable).close();
        throw var2_5;
    }

    private static void h(InputStream inputStream, long l8) throws IOException {
        while (l8 > 0L) {
            long l9;
            long l10 = l9 = inputStream.skip(l8);
            if (l9 <= 0L) {
                if (inputStream.read() != -1) {
                    l10 = 1L;
                } else {
                    throw new IOException("Unable to seek response stream");
                }
            }
            l8 -= l10;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void i(String object, long l8, long l9, RequestBody object2) throws IOException, g {
        Throwable throwable2;
        block12: {
            ax.Xd.d d8;
            block11: {
                int n8;
                d8 = c;
                CharSequence charSequence = new StringBuilder();
                charSequence.append("uploadFile: put to url: ");
                charSequence.append((String)object);
                d8.n(charSequence.toString());
                object = this.a().removeHeader("Authorization").url((String)object).put((RequestBody)object2);
                if (l9 > 0L) {
                    object2 = new StringBuilder();
                    ((StringBuilder)object2).append("bytes ");
                    ((StringBuilder)object2).append(l9);
                    ((StringBuilder)object2).append("-");
                    ((StringBuilder)object2).append(l8 - 1L);
                    ((StringBuilder)object2).append("/");
                    ((StringBuilder)object2).append(l8);
                    charSequence = ((StringBuilder)object2).toString();
                    object2 = new StringBuilder();
                    ((StringBuilder)object2).append("Content-Range: ");
                    ((StringBuilder)object2).append((String)charSequence);
                    d8.n(((StringBuilder)object2).toString());
                    ((Request.Builder)object).addHeader("Content-Range", (String)charSequence);
                }
                object = this.a.newCall(((Request.Builder)object).build()).execute();
                try {
                    n8 = ((Response)object).code();
                    if (n8 == 201 || n8 == 202) break block11;
                    if (n8 == 404) {
                        object2 = new m(n8, null);
                        throw object2;
                    }
                    if (n8 == 409) {
                        object2 = new ax.Ua.c(n8, null);
                        throw object2;
                    }
                    if (n8 == 503) {
                        object2 = new p(n8, null);
                        throw object2;
                    }
                    if (n8 == 507) {
                        object2 = new h(n8, null);
                        throw object2;
                    }
                    if (n8 == 412) {
                        object2 = new o(n8, null);
                        throw object2;
                    }
                    if (n8 != 413) {
                        object2 = new g(n8);
                        throw object2;
                    }
                }
                catch (Throwable throwable2) {
                    break block12;
                }
                object2 = new ax.Ua.d(n8, null);
                throw object2;
            }
            d8.n("uploadFile: uploaded successfully");
            ((Response)object).close();
            return;
        }
        if (object == null) throw throwable2;
        try {
            ((Response)object).close();
            throw throwable2;
        }
        catch (Throwable throwable3) {
            throwable2.addSuppressed(throwable3);
        }
        throw throwable2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    c d(String object) throws IOException, ax.Ta.d {
        Throwable throwable2;
        Object object2;
        block5: {
            block3: {
                block4: {
                    c c8;
                    object2 = null;
                    try {
                        object2 = object = this.b("DELETE", (String)object);
                        int n8 = ((Response)object).code();
                        if (n8 == 202) break block3;
                        if (n8 != 204) break block4;
                        object2 = object;
                        this.c((Response)object);
                        object2 = object;
                        c8 = ax.Va.c.e;
                    }
                    catch (Throwable throwable2) {
                        break block5;
                    }
                    this.c((Response)object);
                    return c8;
                }
                object2 = object;
                throw ax.Wa.b.b(((Response)object).code(), ((Response)object).body().byteStream());
            }
            object2 = object;
            c c9 = this.g((Response)object, c.class);
            object2 = object;
            c9.d(c.b.c0);
            this.c((Response)object);
            return c9;
        }
        this.c((Response)object2);
        throw throwable2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    InputStream e(String object, long l8) throws IOException, g {
        int n8;
        long l9 = l8 - 0L;
        long l10 = l9 == 0L ? 0 : (l9 < 0L ? -1 : 1);
        if (l10 < 0) {
            throw new IllegalArgumentException("offset < 0");
        }
        Object object2 = this.a().url((String)object);
        if (l10 > 0) {
            object = new StringBuilder();
            ((StringBuilder)object).append("bytes=");
            ((StringBuilder)object).append(l8);
            ((StringBuilder)object).append("-");
            ((Request.Builder)object2).header("Range", ((StringBuilder)object).toString());
        }
        if ((n8 = ((Response)(object = this.a.newCall(((Request.Builder)object2).build()).execute())).code()) != 200 && n8 != 206) {
            try {
                object2 = ((Response)object).body();
                if (object2 != null) throw ax.Wa.b.b(n8, ((ResponseBody)object2).byteStream());
                object2 = new g(n8);
                throw object2;
            }
            catch (Throwable throwable) {}
            ((Response)object).close();
            throw throwable;
        }
        object2 = ((Response)object).body();
        if (object2 == null) {
            ((Response)object).close();
            throw new IOException("Empty response body");
        }
        object2 = ((ResponseBody)object2).byteStream();
        if (l10 <= 0 || n8 != 200) return object2;
        try {
            j.h((InputStream)object2, l8);
            return object2;
        }
        catch (IOException iOException) {
            ((Response)object).close();
            throw iOException;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    ax.Va.d f(String object) throws IOException, g {
        Throwable throwable2;
        block6: {
            int n8;
            object = this.b("GET", (String)object);
            try {
                n8 = ((Response)object).code();
                if (((Response)object).isSuccessful()) {
                    ax.Va.d d8 = this.g((Response)object, ax.Va.d.class);
                    ((Response)object).close();
                    return d8;
                }
            }
            catch (Throwable throwable2) {
                break block6;
            }
            {
                g g8 = new g(n8);
                throw g8;
            }
        }
        if (object == null) throw throwable2;
        try {
            ((Response)object).close();
            throw throwable2;
        }
        catch (Throwable throwable3) {
            throwable2.addSuppressed(throwable3);
        }
        throw throwable2;
    }

    void j(String string, k k8, d object) throws IOException, g {
        object = f.b(MediaType.get("application/octet-stream"), k8, 0L, (d)object);
        this.i(string, k8.length(), 0L, (RequestBody)object);
    }
}

