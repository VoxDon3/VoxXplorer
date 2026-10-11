package ax.Wa;

import ax.Ua.e;
import ax.Ua.g;
import ax.Ua.h;
import ax.Ua.i;
import ax.Ua.j;
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
import ax.Va.c;
import ax.Xd.d;
import ax.Xd.f;
import ax.ke.D;
import ax.ke.InterfaceC2430b;
import ax.r8.C3001j;
import ax.r8.C3009r;
import com.google.gson.Gson;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import okhttp3.ResponseBody;

/* loaded from: classes3.dex */
public class b {
    private static final d a = f.k(b.class);

    private static g a(int i, ax.Va.a aVar) {
        a.n("getStatus=" + i);
        if (i == 400) {
            return new ax.Ua.b(i, aVar);
        }
        if (i == 401) {
            return new r(i, aVar);
        }
        if (i == 409) {
            return new ax.Ua.c(i, aVar);
        }
        if (i == 410) {
            return new ax.Ua.f(i, aVar);
        }
        if (i == 412) {
            return new o(i, aVar);
        }
        if (i == 413) {
            return new ax.Ua.d(i, aVar);
        }
        if (i == 415) {
            return new t(i, aVar);
        }
        if (i == 429) {
            return new q(i, aVar);
        }
        if (i == 507) {
            return new h(i, aVar);
        }
        if (i == 422) {
            return new s(i, aVar);
        }
        if (i == 423) {
            return new j(i, aVar);
        }
        switch (i) {
            case 403:
                return new e(i, aVar);
            case 404:
                return new m(i, aVar);
            case 405:
                return new k(i, aVar);
            case 406:
                return new l(i, aVar);
            default:
                switch (i) {
                    case 500:
                        return new i(i, aVar);
                    case 501:
                        return new n(i, aVar);
                    case 502:
                        return new ax.Ua.a(i, aVar);
                    case 503:
                        return new p(i, aVar);
                    default:
                        return new g(i, aVar);
                }
        }
    }

    public static g b(int i, InputStream inputStream) {
        return a(i, e(inputStream));
    }

    public static <T> T c(InterfaceC2430b<T> interfaceC2430b) throws IOException, ax.Ta.d {
        try {
            D<T> execute = interfaceC2430b.execute();
            if (execute.e()) {
                return execute.a();
            }
            ResponseBody d = execute.d();
            if (d == null) {
                throw a(execute.b(), null);
            }
            try {
                throw b(execute.b(), d.byteStream());
            } catch (Throwable th) {
                try {
                    d.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (C3001j e) {
            throw new ax.Ta.b(e);
        } catch (C3009r e2) {
            throw new ax.Ta.b(e2);
        } catch (RuntimeException e3) {
            throw new ax.Ta.b(e3);
        }
    }

    public static ax.Va.c d(InterfaceC2430b<ResponseBody> interfaceC2430b) throws IOException, ax.Ta.d {
        try {
            D<ResponseBody> execute = interfaceC2430b.execute();
            ax.Va.c cVar = null;
            if (!execute.e()) {
                ResponseBody d = execute.d();
                if (d == null) {
                    throw a(execute.b(), null);
                }
                try {
                    throw b(execute.b(), d.byteStream());
                } catch (Throwable th) {
                    try {
                        d.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
            ResponseBody a2 = execute.a();
            try {
                if (a2 == null) {
                    return null;
                }
                try {
                    if (a2.contentLength() != 0 && !a2.source().P()) {
                        cVar = (ax.Va.c) new Gson().i(a2.charStream(), ax.Va.c.class);
                        int b = execute.b();
                        if (b == 201) {
                            cVar.d(c.b.done);
                        } else if (b == 202) {
                            cVar.d(c.b.inProgress);
                        }
                    }
                    a2.close();
                    return cVar;
                } finally {
                }
            } catch (RuntimeException e) {
                throw new ax.Ta.b(e);
            }
        } catch (C3001j e2) {
            throw new ax.Ta.b(e2);
        } catch (C3009r e3) {
            throw new ax.Ta.b(e3);
        } catch (RuntimeException e4) {
            throw new ax.Ta.b(e4);
        }
    }

    private static ax.Va.a e(InputStream inputStream) {
        try {
            return (ax.Va.a) new Gson().i(new InputStreamReader(inputStream), ax.Va.a.class);
        } catch (RuntimeException unused) {
            return null;
        }
    }
}
