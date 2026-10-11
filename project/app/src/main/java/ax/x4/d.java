/*
 * Decompiled with CFR 0.152.
 */
package ax.x4;

import ax.C4.a;
import ax.T4.g;
import ax.p4.e;
import ax.p4.i;
import ax.p4.j;
import ax.p4.k;
import ax.p4.m;
import ax.p4.n;
import ax.p4.p;
import ax.p4.r;
import ax.p4.t;
import ax.p4.x;
import ax.s4.a;
import ax.z4.b;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public abstract class d {
    private static final ax.T4.e e = new ax.T4.e();
    private static final Random f = new Random();
    private final m a;
    private final k b;
    private final String c;
    private final a d;

    protected d(m m8, k k8, String string, a a8) {
        if (m8 != null) {
            if (k8 != null) {
                this.a = m8;
                this.b = k8;
                this.c = string;
                this.d = a8;
                return;
            }
            throw new NullPointerException("host");
        }
        throw new NullPointerException("requestConfig");
    }

    private static <T> T e(int n8, c<T> c8) throws p, j {
        if (n8 == 0) {
            return c8.execute();
        }
        int n9 = 0;
        while (true) {
            T t8;
            try {
                t8 = c8.execute();
            }
            catch (x x8) {
                if (n9 < n8) {
                    ++n9;
                    ax.x4.d.o(x8.a());
                    continue;
                }
                throw x8;
            }
            return t8;
        }
    }

    private <T> T f(int n8, c<T> c8) throws p, j {
        T t8;
        try {
            t8 = ax.x4.d.e(n8, c8);
        }
        catch (r r8) {
            if (r8.getMessage() != null) {
                b b8 = r8.a();
                if (ax.z4.b.g.equals(b8) && this.c()) {
                    this.l();
                    return ax.x4.d.e(n8, c8);
                }
                throw r8;
            }
            throw r8;
        }
        return t8;
    }

    private static <T> String j(ax.v4.c<T> c8, T t8) {
        StringWriter stringWriter = new StringWriter();
        try {
            g g8 = e.r(stringWriter);
            g8.d(126);
            c8.k(t8, g8);
            g8.flush();
            return stringWriter.toString();
        }
        catch (IOException iOException) {
            throw ax.w4.d.a("Impossible", iOException);
        }
    }

    private void m() throws j {
        block3: {
            if (this.k()) {
                try {
                    this.l();
                    return;
                }
                catch (ax.u4.c c8) {
                    if ("invalid_grant".equals(c8.a().a())) break block3;
                    throw c8;
                }
            }
        }
    }

    private static void o(long l8) {
        if ((l8 += (long)f.nextInt(1000)) > 0L) {
            try {
                Thread.sleep(l8);
                return;
            }
            catch (InterruptedException interruptedException) {
                Thread.currentThread().interrupt();
            }
        }
    }

    private static <T> byte[] r(ax.v4.c<T> c8, T t8) throws j {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            c8.l(t8, byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        }
        catch (IOException iOException) {
            throw ax.w4.d.a("Impossible", iOException);
        }
    }

    protected abstract void b(List<a.a> var1);

    protected abstract boolean c();

    public <ArgT, ResT, ErrT> i<ResT> d(String string, String string2, ArgT ArgT, boolean bl, List<a.a> list, ax.v4.c<ArgT> c8, ax.v4.c<ResT> c9, ax.v4.c<ErrT> c10) throws p, j {
        list = new ArrayList<a.a>(list);
        if (!bl) {
            this.m();
        }
        n.e(list, this.a);
        n.c(list, this.d);
        list.add(new a.a("Dropbox-API-Arg", ax.x4.d.j(c8, ArgT)));
        list.add(new a.a("Content-Type", ""));
        return (i)this.f(this.a.c(), (new c<i<ResT>>(this, bl, list, string, string2, new byte[0], c9, c10){
            private String a;
            final boolean b;
            final List c;
            final String d;
            final String e;
            final byte[] f;
            final ax.v4.c g;
            final ax.v4.c h;
            final d i;
            {
                this.i = d8;
                this.b = bl;
                this.c = list;
                this.d = string;
                this.e = string2;
                this.f = byArray;
                this.g = c8;
                this.h = c9;
            }

            private c<i<ResT>> c(String string) {
                this.a = string;
                return this;
            }

            /*
             * Enabled aggressive block sorting
             * Enabled unnecessary exception pruning
             * Enabled aggressive exception aggregation
             */
            public i<ResT> b() throws p, j {
                ax.T4.k k82;
                String string;
                Object object;
                block8: {
                    if (!this.b) {
                        this.i.b(this.c);
                    }
                    object = n.y(this.i.a, "OfficialDropboxJavaSDKv2", this.d, this.e, this.f, this.c);
                    string = n.q((a.b)object);
                    Object object2 = n.n((a.b)object);
                    try {
                        int n8 = ((a.b)object).d();
                        if (n8 != 200 && n8 != 206) {
                            if (n8 == 409) throw p.c(this.h, (a.b)object, this.a);
                            throw n.B((a.b)object, this.a);
                        }
                    }
                    catch (IOException iOException) {
                        throw new t(iOException);
                    }
                    catch (ax.T4.k k82) {
                        break block8;
                    }
                    List<String> list = ((a.b)object).c().get("dropbox-api-result");
                    if (list == null) {
                        list = new StringBuilder();
                        ((StringBuilder)((Object)list)).append("Missing Dropbox-API-Result header; ");
                        ((StringBuilder)((Object)list)).append(((a.b)object).c());
                        object2 = new e(string, ((StringBuilder)((Object)list)).toString());
                        throw object2;
                    }
                    if (list.size() == 0) {
                        object2 = new StringBuilder();
                        ((StringBuilder)object2).append("No Dropbox-API-Result header; ");
                        ((StringBuilder)object2).append(((a.b)object).c());
                        list = new e(string, ((StringBuilder)object2).toString());
                        throw list;
                    }
                    if ((list = list.get(0)) != null) {
                        return new i(this.g.c((String)((Object)list)), ((a.b)object).b(), (String)object2);
                    }
                    list = new StringBuilder();
                    ((StringBuilder)((Object)list)).append("Null Dropbox-API-Result header; ");
                    ((StringBuilder)((Object)list)).append(((a.b)object).c());
                    object2 = new e(string, ((StringBuilder)((Object)list)).toString());
                    throw object2;
                }
                object = new StringBuilder();
                ((StringBuilder)object).append("Bad JSON: ");
                ((StringBuilder)object).append(k82.getMessage());
                throw new e(string, ((StringBuilder)object).toString(), k82);
            }
        }).c(this.c));
    }

    public k g() {
        return this.b;
    }

    public m h() {
        return this.a;
    }

    public String i() {
        return this.c;
    }

    protected abstract boolean k();

    public abstract ax.u4.d l() throws j;

    public <ArgT, ResT, ErrT> ResT n(String string, String string2, ArgT object, boolean bl, ax.v4.c<ArgT> object2, ax.v4.c<ResT> c8, ax.v4.c<ErrT> c9) throws p, j {
        object2 = ax.x4.d.r(object2, object);
        object = new ArrayList();
        if (!bl) {
            this.m();
        }
        if (!this.b.j().equals(string)) {
            n.e(object, this.a);
            n.c((List<a.a>)object, this.d);
        }
        object.add((a.a)new a.a("Content-Type", "application/json; charset=utf-8"));
        return (ResT)this.f(this.a.c(), (new c<ResT>(this, bl, (List)object, string, string2, (byte[])object2, c8, c9){
            private String a;
            final boolean b;
            final List c;
            final String d;
            final String e;
            final byte[] f;
            final ax.v4.c g;
            final ax.v4.c h;
            final d i;
            {
                this.i = d8;
                this.b = bl;
                this.c = list;
                this.d = string;
                this.e = string2;
                this.f = byArray;
                this.g = c8;
                this.h = c9;
            }

            private c<ResT> b(String string) {
                this.a = string;
                return this;
            }

            /*
             * Enabled aggressive block sorting
             * Enabled unnecessary exception pruning
             * Enabled aggressive exception aggregation
             */
            @Override
            public ResT execute() throws p, j {
                ax.T4.k k82;
                Object object;
                block5: {
                    if (!this.b) {
                        this.i.b(this.c);
                    }
                    object = n.y(this.i.a, "OfficialDropboxJavaSDKv2", this.d, this.e, this.f, this.c);
                    try {
                        int n8 = ((a.b)object).d();
                        if (n8 != 200) {
                            if (n8 == 409) throw p.c(this.h, (a.b)object, this.a);
                            throw n.B((a.b)object, this.a);
                        }
                    }
                    catch (IOException iOException) {
                        throw new t(iOException);
                    }
                    catch (ax.T4.k k82) {
                        break block5;
                    }
                    Object t8 = this.g.b(((a.b)object).b());
                    return t8;
                }
                String string = n.q((a.b)object);
                object = new StringBuilder();
                ((StringBuilder)object).append("Bad JSON: ");
                ((StringBuilder)object).append(k82.getMessage());
                throw new e(string, ((StringBuilder)object).toString(), k82);
            }
        }).b(this.c));
    }

    public <ArgT> a.c p(String object, String list, ArgT ArgT, boolean bl, ax.v4.c<ArgT> c8) throws j {
        object = n.f((String)object, (String)((Object)list));
        list = new ArrayList();
        if (!bl) {
            this.m();
            this.b(list);
        }
        n.e(list, this.a);
        n.c(list, this.d);
        list.add(new a.a("Content-Type", "application/octet-stream"));
        list = n.d(list, this.a, "OfficialDropboxJavaSDKv2");
        list.add(new a.a("Dropbox-API-Arg", ax.x4.d.j(c8, ArgT)));
        try {
            object = this.a.b().b((String)object, list);
            return object;
        }
        catch (IOException iOException) {
            throw new t(iOException);
        }
    }

    protected abstract d q(a var1);

    private static interface c<T> {
        public T execute() throws p, j;
    }
}

