/*
 * Decompiled with CFR 0.152.
 */
package ax.l9;

import ax.Q8.F;
import ax.Q8.g;
import ax.Q8.q;
import ax.R8.t;
import ax.Y8.d;
import ax.Z8.a;
import ax.j9.c;
import ax.j9.e;
import ax.j9.f;
import ax.k9.d;
import ax.l9.m;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

public class k {
    static final byte[] g = ax.x9.a.c("SMBC2SCipherKey");
    static final byte[] h = ax.x9.a.c("SMBS2CCipherKey");
    static final byte[] i = ax.x9.a.c("SMB2AESCCM");
    static final byte[] j = ax.x9.a.c("ServerIn ");
    static final byte[] k = ax.x9.a.c("ServerOut");
    static final byte[] l = ax.x9.a.c("SmbSign");
    static final byte[] m = ax.x9.a.c("SMB2AESCMAC");
    static final byte[] n = ax.x9.a.c("SMBSigningKey");
    static final byte[] o = ax.x9.a.c("SmbRpc");
    static final byte[] p = ax.x9.a.c("SMB2APP");
    static final byte[] q = ax.x9.a.c("SMBAppKey");
    private static final ax.Xd.d r = ax.Xd.f.k(k.class);
    private final ax.i9.d a;
    private final ax.l9.b b;
    private final b c;
    private final m d;
    private final m e;
    private final ax.l9.a f;

    public k(ax.l9.a a8, ax.i9.d d8, b b8) {
        this.f = a8;
        this.a = d8;
        this.b = a8.o0();
        this.d = a8.C0();
        this.e = a8.u0();
        this.c = b8;
    }

    private SecretKey a(SecretKey object, byte[] object2, byte[] object3, String string) {
        Object object4 = new ByteArrayOutputStream(25);
        try {
            ((OutputStream)object4).write((byte[])object2);
            ((ByteArrayOutputStream)object4).write(0);
            ((OutputStream)object4).write((byte[])object3);
            ((OutputStream)object4).write(new byte[]{0, 0, 0, -128});
        }
        catch (IOException iOException) {
            r.h("Unable to format suffix, error occur : ", iOException);
            return null;
        }
        try {
            object2 = this.a.K().e("KDF/Counter/HMACSHA256");
            object4 = ((ByteArrayOutputStream)object4).toByteArray();
            object3 = new ax.f9.a;
            object3(object.getEncoded(), (byte[])object4, 32);
            object2.b((ax.f9.b)object3);
            object = new byte[16];
            object2.a((byte[])object, 0, 16);
            object = new SecretKeySpec((byte[])object, string);
            return object;
        }
        catch (ax.d9.f f8) {
            throw new d(f8);
        }
    }

    private void b(t object, g object2, ax.r9.c c8) {
        if (object2.j() && !((t)object).o().contains(t.b.d0) && !((t)object).o().contains(t.b.c0)) {
            Object object3 = ax.Q8.g.i0;
            if (object2 == object3) {
                c8.p(this.a(c8.e(), n, c8.d(), "AesCmac"));
            } else {
                c8.p(this.a(c8.e(), m, l, "AesCmac"));
            }
            if (this.b.j()) {
                object = this.b.b().h();
                if (object2 == object3) {
                    c8.m(this.a(c8.e(), g, c8.d(), (String)object));
                    c8.k(this.a(c8.e(), h, c8.d(), (String)object));
                    c8.j(this.a(c8.e(), q, c8.d(), (String)object));
                    return;
                }
                object3 = c8.e();
                object2 = i;
                c8.m(this.a((SecretKey)object3, (byte[])object2, j, (String)object));
                c8.k(this.a(c8.e(), (byte[])object2, k, (String)object));
                c8.j(this.a(c8.e(), p, o, (String)object));
            }
        }
    }

    private c d(ax.j9.b b8) throws ax.w9.e {
        Serializable serializable = new ArrayList<d.a<c>>(this.a.N());
        List<Object> list = new ArrayList();
        if (this.b.e().length > 0) {
            list = new ax.w9.a().j(this.b.e()).h();
        }
        serializable = new ArrayList<d.a<c>>((Collection<d.a<c>>)((Object)serializable));
        int n8 = ((ArrayList)serializable).size();
        int n9 = 0;
        while (n9 < n8) {
            Object object = ((ArrayList)serializable).get(n9);
            int n10 = n9 + 1;
            if (!list.isEmpty()) {
                n9 = n10;
                if (!list.contains(new ax.E8.e(object.getName()))) continue;
            }
            object = (c)object.a();
            n9 = n10;
            if (!object.c(b8)) continue;
            return object;
        }
        serializable = new StringBuilder();
        ((StringBuilder)serializable).append("Could not find a configured authenticator for mechtypes: ");
        ((StringBuilder)serializable).append(list);
        ((StringBuilder)serializable).append(" and authentication context: ");
        ((StringBuilder)serializable).append(b8);
        throw new d(((StringBuilder)serializable).toString());
    }

    /*
     * Enabled aggressive block sorting
     */
    private a e(a a8, byte[] byArray) throws ax.c9.e {
        g g8 = this.b.f().a();
        Object object = this.b.k() ? t.a.d0 : t.a.c0;
        object = EnumSet.of(object);
        object = new t(g8, (Set<t.a>)object, this.b.c());
        ((t)object).r(byArray);
        ((ax.Q8.t)((ax.h9.d)object).c()).y(a8.b);
        ax.l9.k$a.l(a8, (t)object);
        ax.l9.k$a.h(a8, (t)this.f.M0((q)object));
        return a8;
    }

    private a f(ax.j9.b b8, c c8) {
        a a8 = new a();
        ax.l9.k$a.b(a8, c8);
        ax.l9.k$a.d(a8, b8);
        return a8;
    }

    private ax.r9.b g(a a8) {
        ax.r9.b b8 = this.c.a(a8.d);
        b8.W(a8.b);
        b8.o().n(this.b.h());
        return b8;
    }

    private void h(a a8, byte[] object) throws IOException {
        object = a8.a.a(a8.d, (byte[])object, this.b);
        if (object == null) {
            return;
        }
        this.b.o(((ax.j9.a)object).e());
        this.b.n(((ax.j9.a)object).c());
        ax.l9.k$a.n(a8, ((ax.j9.a)object).d());
        ax.w9.f f8 = ((ax.j9.a)object).a();
        object = new a.c(ax.Z8.b.b);
        try {
            f8.c((ax.Z8.a<?>)object);
        }
        catch (ax.w9.e e8) {
            throw new IOException(e8);
        }
        ax.l9.k$a.f(a8, ((ax.Z8.a)object).f());
    }

    private ax.r9.b i(a a8) throws IOException {
        this.e(a8, a8.e);
        t t8 = a8.g;
        ax.l9.k$a.j(a8, ((ax.Q8.t)t8.c()).k());
        Object object = this.b.f().a();
        if (((ax.Q8.t)t8.c()).m() == ax.K8.a.r0.getValue()) {
            if (object == ax.Q8.g.i0) {
                Object object2 = object = this.e.b(a8.b);
                if (object == null) {
                    object2 = this.g(a8);
                    this.e.c(a8.b, (ax.r9.b)object2);
                }
                this.j(a8, ((ax.r9.b)object2).o(), a8.f);
                this.j(a8, ((ax.r9.b)object2).o(), a8.g);
            }
            r.d("More processing required for authentication of {} using {}", a8.d.c(), a8.a);
            this.h(a8, t8.n());
            return this.i(a8);
        }
        if (((ax.Q8.t)t8.c()).m() == ax.K8.a.c0.getValue()) {
            ax.r9.b b8 = this.e.b(a8.b);
            g g8 = ax.Q8.g.i0;
            if (object == g8 && b8 != null) {
                this.e.d(b8.p());
            } else {
                b8 = this.g(a8);
            }
            ax.r9.c c8 = b8.o();
            this.h(a8, t8.n());
            if (a8.c != null) {
                c8.o(new SecretKeySpec(a8.c, "HmacSHA256"));
            }
            if (object == g8) {
                this.j(a8, c8, a8.f);
            }
            this.k(a8, c8);
            this.b(t8, (g)((Object)object), c8);
            c8.a(t8);
            return b8;
        }
        throw new F((ax.Q8.t)t8.c(), String.format("Authentication failed for '%s' using %s", a8.d.c(), a8.a));
    }

    private void j(a object, ax.r9.c c8, q q8) {
        if (((a)object).h == null) {
            String string = this.f.o0().g().h();
            try {
                ax.l9.k$a.p((a)object, this.a.K().b(string));
            }
            catch (ax.d9.f f8) {
                object = new StringBuilder();
                ((StringBuilder)object).append("Cannot get the message digest for ");
                ((StringBuilder)object).append(string);
                throw new d(((StringBuilder)object).toString(), f8);
            }
        }
        c8.n(ax.v9.a.a(((a)object).h, c8.d(), ax.h9.a.a(q8)));
    }

    private void k(a a8, ax.r9.c c8) {
        boolean bl = this.a.X();
        boolean bl2 = this.f.o0().k();
        bl2 = bl || bl2;
        c8.q(bl2);
        if (a8.g.o().contains(t.b.d0)) {
            c8.q(false);
        }
        if ((bl2 = a8.g.o().contains(t.b.c0)) && c8.i()) {
            throw new ax.r9.a();
        }
        if (bl2 && !bl) {
            c8.q(false);
        }
        if (this.f.s0().a().j() && this.f.o0().r() && a8.g.o().contains(t.b.e0)) {
            c8.l(true);
            c8.q(false);
        }
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public ax.r9.b c(ax.j9.b b8) {
        Object object;
        Object object2;
        block3: {
            block4: {
                Throwable var1_4;
                try {
                    object = object2 = this.d(b8);
                    if (!(object2 instanceof e)) break block3;
                    object = object2;
                    if (!this.a.G().i()) break block3;
                    if (!b8.d()) break block4;
                    object = object2;
                    if (!b8.e()) break block3;
                }
                catch (IOException iOException) {
                    throw new d((Throwable)var1_4);
                }
                catch (ax.w9.e e8) {
                    throw new d((Throwable)var1_4);
                }
            }
            object = new f((e)object2);
        }
        object2 = this.f(b8, (c)object);
        object.b(this.a);
        this.h((a)object2, this.b.e());
        object = this.i((a)object2);
        r.B("Successfully authenticated {} on {}, session is {}", b8.c(), this.f.A0(), ((ax.r9.b)object).p());
        this.d.c(((ax.r9.b)object).p(), (ax.r9.b)object);
        return object;
    }

    public static class a {
        private c a;
        private long b;
        private byte[] c;
        private ax.j9.b d;
        private byte[] e;
        private t f;
        private t g;
        private ax.d9.e h;

        static /* synthetic */ c b(a a8, c c8) {
            a8.a = c8;
            return c8;
        }

        static /* synthetic */ ax.j9.b d(a a8, ax.j9.b b8) {
            a8.d = b8;
            return b8;
        }

        static /* synthetic */ byte[] f(a a8, byte[] byArray) {
            a8.e = byArray;
            return byArray;
        }

        static /* synthetic */ t h(a a8, t t8) {
            a8.g = t8;
            return t8;
        }

        static /* synthetic */ long j(a a8, long l8) {
            a8.b = l8;
            return l8;
        }

        static /* synthetic */ t l(a a8, t t8) {
            a8.f = t8;
            return t8;
        }

        static /* synthetic */ byte[] n(a a8, byte[] byArray) {
            a8.c = byArray;
            return byArray;
        }

        static /* synthetic */ ax.d9.e p(a a8, ax.d9.e e8) {
            a8.h = e8;
            return e8;
        }
    }

    public static interface b {
        public ax.r9.b a(ax.j9.b var1);
    }
}

