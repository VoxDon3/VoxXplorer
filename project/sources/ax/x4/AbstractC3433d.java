package ax.x4;

import ax.T4.g;
import ax.T4.k;
import ax.p4.C2768e;
import ax.p4.C2772i;
import ax.p4.C2773j;
import ax.p4.C2774k;
import ax.p4.m;
import ax.p4.n;
import ax.p4.p;
import ax.p4.r;
import ax.p4.t;
import ax.p4.x;
import ax.s4.AbstractC3046a;
import ax.u4.C3208c;
import ax.v4.AbstractC3276c;
import ax.w4.C3344d;
import ax.z4.C3545b;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import okhttp3.HttpUrl;

/* renamed from: ax.x4.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3433d {
    private static final ax.T4.e e = new ax.T4.e();
    private static final Random f = new Random();
    private final m a;
    private final C2774k b;
    private final String c;
    private final ax.C4.a d;

    /* JADX INFO: Add missing generic type declarations: [ResT] */
    /* renamed from: ax.x4.d$a */
    class a<ResT> implements c<ResT> {
        private String a;
        final /* synthetic */ boolean b;
        final /* synthetic */ List c;
        final /* synthetic */ String d;
        final /* synthetic */ String e;
        final /* synthetic */ byte[] f;
        final /* synthetic */ AbstractC3276c g;
        final /* synthetic */ AbstractC3276c h;

        a(boolean z, List list, String str, String str2, byte[] bArr, AbstractC3276c abstractC3276c, AbstractC3276c abstractC3276c2) {
            this.b = z;
            this.c = list;
            this.d = str;
            this.e = str2;
            this.f = bArr;
            this.g = abstractC3276c;
            this.h = abstractC3276c2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public c<ResT> b(String str) {
            this.a = str;
            return this;
        }

        @Override // ax.x4.AbstractC3433d.c
        public ResT execute() throws p, C2773j {
            if (!this.b) {
                AbstractC3433d.this.b(this.c);
            }
            AbstractC3046a.b y = n.y(AbstractC3433d.this.a, "OfficialDropboxJavaSDKv2", this.d, this.e, this.f, this.c);
            try {
                int d = y.d();
                if (d == 200) {
                    return (ResT) this.g.b(y.b());
                }
                if (d != 409) {
                    throw n.B(y, this.a);
                }
                throw p.c(this.h, y, this.a);
            } catch (k e) {
                throw new C2768e(n.q(y), "Bad JSON: " + e.getMessage(), e);
            } catch (IOException e2) {
                throw new t(e2);
            }
        }
    }

    /* JADX INFO: Add missing generic type declarations: [ResT] */
    /* renamed from: ax.x4.d$b */
    class b<ResT> implements c<C2772i<ResT>> {
        private String a;
        final /* synthetic */ boolean b;
        final /* synthetic */ List c;
        final /* synthetic */ String d;
        final /* synthetic */ String e;
        final /* synthetic */ byte[] f;
        final /* synthetic */ AbstractC3276c g;
        final /* synthetic */ AbstractC3276c h;

        b(boolean z, List list, String str, String str2, byte[] bArr, AbstractC3276c abstractC3276c, AbstractC3276c abstractC3276c2) {
            this.b = z;
            this.c = list;
            this.d = str;
            this.e = str2;
            this.f = bArr;
            this.g = abstractC3276c;
            this.h = abstractC3276c2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public c<C2772i<ResT>> c(String str) {
            this.a = str;
            return this;
        }

        @Override // ax.x4.AbstractC3433d.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C2772i<ResT> execute() throws p, C2773j {
            if (!this.b) {
                AbstractC3433d.this.b(this.c);
            }
            AbstractC3046a.b y = n.y(AbstractC3433d.this.a, "OfficialDropboxJavaSDKv2", this.d, this.e, this.f, this.c);
            String q = n.q(y);
            String n = n.n(y);
            try {
                int d = y.d();
                if (d != 200 && d != 206) {
                    if (d != 409) {
                        throw n.B(y, this.a);
                    }
                    throw p.c(this.h, y, this.a);
                }
                List<String> list = y.c().get("dropbox-api-result");
                if (list == null) {
                    throw new C2768e(q, "Missing Dropbox-API-Result header; " + y.c());
                }
                if (list.size() == 0) {
                    throw new C2768e(q, "No Dropbox-API-Result header; " + y.c());
                }
                String str = list.get(0);
                if (str != null) {
                    return new C2772i<>(this.g.c(str), y.b(), n);
                }
                throw new C2768e(q, "Null Dropbox-API-Result header; " + y.c());
            } catch (k e) {
                throw new C2768e(q, "Bad JSON: " + e.getMessage(), e);
            } catch (IOException e2) {
                throw new t(e2);
            }
        }
    }

    /* renamed from: ax.x4.d$c */
    private interface c<T> {
        T execute() throws p, C2773j;
    }

    protected AbstractC3433d(m mVar, C2774k c2774k, String str, ax.C4.a aVar) {
        if (mVar == null) {
            throw new NullPointerException("requestConfig");
        }
        if (c2774k == null) {
            throw new NullPointerException("host");
        }
        this.a = mVar;
        this.b = c2774k;
        this.c = str;
        this.d = aVar;
    }

    private static <T> T e(int i, c<T> cVar) throws p, C2773j {
        if (i == 0) {
            return cVar.execute();
        }
        int i2 = 0;
        while (true) {
            try {
                return cVar.execute();
            } catch (x e2) {
                if (i2 >= i) {
                    throw e2;
                }
                i2++;
                o(e2.a());
            }
        }
    }

    private <T> T f(int i, c<T> cVar) throws p, C2773j {
        try {
            return (T) e(i, cVar);
        } catch (r e2) {
            if (e2.getMessage() == null) {
                throw e2;
            }
            if (!C3545b.g.equals(e2.a()) || !c()) {
                throw e2;
            }
            l();
            return (T) e(i, cVar);
        }
    }

    private static <T> String j(AbstractC3276c<T> abstractC3276c, T t) {
        StringWriter stringWriter = new StringWriter();
        try {
            g r = e.r(stringWriter);
            r.d(126);
            abstractC3276c.k(t, r);
            r.flush();
            return stringWriter.toString();
        } catch (IOException e2) {
            throw C3344d.a("Impossible", e2);
        }
    }

    private void m() throws C2773j {
        if (k()) {
            try {
                l();
            } catch (C3208c e2) {
                if (!"invalid_grant".equals(e2.a().a())) {
                    throw e2;
                }
            }
        }
    }

    private static void o(long j) {
        long nextInt = j + f.nextInt(1000);
        if (nextInt <= 0) {
            return;
        }
        try {
            Thread.sleep(nextInt);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }

    private static <T> byte[] r(AbstractC3276c<T> abstractC3276c, T t) throws C2773j {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            abstractC3276c.l(t, byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e2) {
            throw C3344d.a("Impossible", e2);
        }
    }

    protected abstract void b(List<AbstractC3046a.C0448a> list);

    protected abstract boolean c();

    public <ArgT, ResT, ErrT> C2772i<ResT> d(String str, String str2, ArgT argt, boolean z, List<AbstractC3046a.C0448a> list, AbstractC3276c<ArgT> abstractC3276c, AbstractC3276c<ResT> abstractC3276c2, AbstractC3276c<ErrT> abstractC3276c3) throws p, C2773j {
        ArrayList arrayList = new ArrayList(list);
        if (!z) {
            m();
        }
        n.e(arrayList, this.a);
        n.c(arrayList, this.d);
        arrayList.add(new AbstractC3046a.C0448a("Dropbox-API-Arg", j(abstractC3276c, argt)));
        arrayList.add(new AbstractC3046a.C0448a("Content-Type", HttpUrl.FRAGMENT_ENCODE_SET));
        return (C2772i) f(this.a.c(), new b(z, arrayList, str, str2, new byte[0], abstractC3276c2, abstractC3276c3).c(this.c));
    }

    public C2774k g() {
        return this.b;
    }

    public m h() {
        return this.a;
    }

    public String i() {
        return this.c;
    }

    protected abstract boolean k();

    public abstract ax.u4.d l() throws C2773j;

    public <ArgT, ResT, ErrT> ResT n(String str, String str2, ArgT argt, boolean z, AbstractC3276c<ArgT> abstractC3276c, AbstractC3276c<ResT> abstractC3276c2, AbstractC3276c<ErrT> abstractC3276c3) throws p, C2773j {
        byte[] r = r(abstractC3276c, argt);
        ArrayList arrayList = new ArrayList();
        if (!z) {
            m();
        }
        if (!this.b.j().equals(str)) {
            n.e(arrayList, this.a);
            n.c(arrayList, this.d);
        }
        arrayList.add(new AbstractC3046a.C0448a("Content-Type", "application/json; charset=utf-8"));
        return (ResT) f(this.a.c(), new a(z, arrayList, str, str2, r, abstractC3276c2, abstractC3276c3).b(this.c));
    }

    public <ArgT> AbstractC3046a.c p(String str, String str2, ArgT argt, boolean z, AbstractC3276c<ArgT> abstractC3276c) throws C2773j {
        String f2 = n.f(str, str2);
        ArrayList arrayList = new ArrayList();
        if (!z) {
            m();
            b(arrayList);
        }
        n.e(arrayList, this.a);
        n.c(arrayList, this.d);
        arrayList.add(new AbstractC3046a.C0448a("Content-Type", "application/octet-stream"));
        List<AbstractC3046a.C0448a> d = n.d(arrayList, this.a, "OfficialDropboxJavaSDKv2");
        d.add(new AbstractC3046a.C0448a("Dropbox-API-Arg", j(abstractC3276c, argt)));
        try {
            return this.a.b().b(f2, d);
        } catch (IOException e2) {
            throw new t(e2);
        }
    }

    protected abstract AbstractC3433d q(ax.C4.a aVar);
}
