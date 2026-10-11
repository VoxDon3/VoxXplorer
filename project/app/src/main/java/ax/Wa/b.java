/*
 * Decompiled with CFR 0.152.
 */
package ax.Wa;

import ax.Ta.d;
import ax.Ua.e;
import ax.Ua.g;
import ax.Ua.h;
import ax.Ua.i;
import ax.Ua.k;
import ax.Ua.l;
import ax.Ua.m;
import ax.Ua.n;
import ax.Ua.o;
import ax.Ua.p;
import ax.Ua.q;
import ax.Ua.r;
import ax.Ua.s;
import ax.Ua.t;
import ax.Va.a;
import ax.Va.c;
import ax.Xd.f;
import ax.ke.D;
import ax.r8.j;
import com.google.gson.Gson;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import okhttp3.ResponseBody;

public class b {
    private static final ax.Xd.d a = f.k(b.class);

    private static g a(int n8, a a8) {
        ax.Xd.d d8 = a;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("getStatus=");
        stringBuilder.append(n8);
        d8.n(stringBuilder.toString());
        if (n8 != 400) {
            if (n8 != 401) {
                if (n8 != 409) {
                    if (n8 != 410) {
                        if (n8 != 412) {
                            if (n8 != 413) {
                                if (n8 != 415) {
                                    if (n8 != 429) {
                                        if (n8 != 507) {
                                            if (n8 != 422) {
                                                if (n8 != 423) {
                                                    switch (n8) {
                                                        default: {
                                                            switch (n8) {
                                                                default: {
                                                                    return new g(n8, a8);
                                                                }
                                                                case 503: {
                                                                    return new p(n8, a8);
                                                                }
                                                                case 502: {
                                                                    return new ax.Ua.a(n8, a8);
                                                                }
                                                                case 501: {
                                                                    return new n(n8, a8);
                                                                }
                                                                case 500: 
                                                            }
                                                            return new i(n8, a8);
                                                        }
                                                        case 406: {
                                                            return new l(n8, a8);
                                                        }
                                                        case 405: {
                                                            return new k(n8, a8);
                                                        }
                                                        case 404: {
                                                            return new m(n8, a8);
                                                        }
                                                        case 403: 
                                                    }
                                                    return new e(n8, a8);
                                                }
                                                return new ax.Ua.j(n8, a8);
                                            }
                                            return new s(n8, a8);
                                        }
                                        return new h(n8, a8);
                                    }
                                    return new q(n8, a8);
                                }
                                return new t(n8, a8);
                            }
                            return new ax.Ua.d(n8, a8);
                        }
                        return new o(n8, a8);
                    }
                    return new ax.Ua.f(n8, a8);
                }
                return new ax.Ua.c(n8, a8);
            }
            return new r(n8, a8);
        }
        return new ax.Ua.b(n8, a8);
    }

    public static g b(int n8, InputStream inputStream) {
        return b.a(n8, b.e(inputStream));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static <T> T c(ax.ke.b<T> object) throws IOException, d {
        D d8;
        try {
            d8 = object.execute();
        }
        catch (RuntimeException runtimeException) {
            throw new ax.Ta.b(runtimeException);
        }
        catch (ax.r8.r r8) {
            throw new ax.Ta.b(r8);
        }
        catch (j j8) {
            throw new ax.Ta.b(j8);
        }
        if (d8.e()) {
            return d8.a();
        }
        object = d8.d();
        if (object == null) {
            throw b.a(d8.b(), null);
        }
        try {
            throw b.b(d8.b(), ((ResponseBody)object).byteStream());
        }
        catch (Throwable throwable) {
            try {
                ((ResponseBody)object).close();
                throw throwable;
            }
            catch (Throwable throwable2) {
                throwable.addSuppressed(throwable2);
            }
            throw throwable;
        }
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static c d(ax.ke.b<ResponseBody> object) throws IOException, d {
        Throwable throwable422222;
        ResponseBody responseBody;
        block22: {
            block20: {
                block21: {
                    D d8 = object.execute();
                    boolean bl = d8.e();
                    ResponseBody responseBody2 = null;
                    if (!bl) {
                        responseBody2 = d8.d();
                        if (responseBody2 == null) {
                            throw b.a(d8.b(), null);
                        }
                        try {
                            throw b.b(d8.b(), responseBody2.byteStream());
                        }
                        catch (Throwable throwable2) {
                            try {
                                responseBody2.close();
                                throw throwable2;
                            }
                            catch (Throwable throwable3) {
                                throwable2.addSuppressed(throwable3);
                            }
                            throw throwable2;
                        }
                    }
                    responseBody = (ResponseBody)d8.a();
                    if (responseBody == null) {
                        return null;
                    }
                    object = responseBody2;
                    try {
                        if (responseBody.contentLength() == 0L) break block20;
                        if (responseBody.source().P()) {
                            object = responseBody2;
                            break block20;
                        }
                        object = new Gson();
                        object = ((Gson)object).i(responseBody.charStream(), c.class);
                        int n8 = d8.b();
                        if (n8 == 201) break block21;
                        if (n8 == 202) {
                            ((c)object).d(c.b.c0);
                        }
                        break block20;
                    }
                    catch (Throwable throwable422222) {
                        break block22;
                    }
                }
                ((c)object).d(c.b.q);
            }
            responseBody.close();
            return object;
            {
                catch (RuntimeException runtimeException) {
                    throw new ax.Ta.b(runtimeException);
                }
            }
        }
        try {
            responseBody.close();
            throw throwable422222;
        }
        catch (Throwable throwable5) {
            throwable422222.addSuppressed(throwable5);
            throw throwable422222;
        }
        catch (RuntimeException runtimeException) {
            throw new ax.Ta.b(runtimeException);
        }
        catch (ax.r8.r r8) {
            throw new ax.Ta.b(r8);
        }
        catch (j j8) {
            throw new ax.Ta.b(j8);
        }
    }

    private static a e(InputStream object) {
        try {
            InputStreamReader inputStreamReader = new InputStreamReader((InputStream)object);
            object = new Gson();
            object = ((Gson)object).i(inputStreamReader, a.class);
            return object;
        }
        catch (RuntimeException runtimeException) {
            return null;
        }
    }
}

