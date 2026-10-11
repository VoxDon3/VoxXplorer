/*
 * Decompiled with CFR 0.152.
 */
package ax.l9;

import ax.Q8.A;
import ax.Q8.D;
import ax.Q8.E;
import ax.Q8.F;
import ax.Q8.g;
import ax.Q8.k;
import ax.Q8.q;
import ax.Q8.t;
import ax.R8.l;
import ax.R8.m;
import ax.S8.c;
import ax.S8.f;
import ax.c9.e;
import ax.h9.d;
import ax.l9.h;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

class j {
    private static final ax.Xd.d e = ax.Xd.f.k(j.class);
    private final ax.i9.d a;
    private final ax.l9.b b;
    private ax.l9.a c;
    private b d = new b();

    public j(ax.l9.a a8, ax.i9.d d8, ax.l9.b b8) {
        this.c = a8;
        this.a = d8;
        this.b = b8;
    }

    private byte[] a() {
        ax.d9.e e8;
        Object object = ax.h9.a.a(this.d.a);
        byte[] byArray = ax.h9.a.a(this.d.b);
        String string = this.d.d.h();
        try {
            e8 = this.a.K().b(string);
        }
        catch (ax.d9.f f8) {
            object = new StringBuilder();
            ((StringBuilder)object).append("Cannot get the message digest for ");
            ((StringBuilder)object).append(string);
            throw new ax.k9.d(((StringBuilder)object).toString(), f8);
        }
        return ax.v9.a.a(e8, ax.v9.a.a(e8, new byte[e8.e()], (byte[])object), byArray);
    }

    private void b(ax.S8.a object) {
        if ((object = ((ax.S8.a)object).i()).size() != 0) {
            if (object.size() == 1 && object.get(0) == A.c0) {
                e.z("SMB3CompressionAlgorithm is 'NONE', continuing without compression");
                return;
            }
            ax.l9.j$b.d(this.d, EnumSet.copyOf(object));
            return;
        }
        throw new IllegalStateException("The SMB2CompressionCapabilities NegotiateContext should contain at least 1 algorithm");
    }

    private void c(ax.S8.b object) {
        if ((object = ((ax.S8.b)object).i()).size() == 1) {
            ax.l9.j$b.c(this.d, (D)object.get(0));
            return;
        }
        throw new IllegalStateException("The SMB2EncryptionCapabilities NegotiateContext does not contain exactly 1 cipher");
    }

    private void d(f object) {
        if (((f)object).i().size() == 1) {
            object = ((f)object).i().get(0);
            ax.l9.j$b.f(this.d, (E)object);
            ax.l9.j$b.g(this.d, this.a());
            return;
        }
        throw new IllegalStateException("The SMB2PreauthIntegrityCapabilities NegotiateContext does not contain exactly 1 hash algorithm");
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private void e() {
        g g8 = this.d.b.o();
        if (g8 == g.i0) {
            List<c> list = this.d.b.s();
            if (list == null) throw new IllegalStateException("negotiate context list is null for SMB 3.1.1 dialect");
            Iterator<c> iterator = list.iterator();
            boolean bl = false;
            boolean bl2 = false;
            boolean bl3 = false;
            while (iterator.hasNext()) {
                c c8 = iterator.next();
                int n8 = ax.l9.j$a.a[c8.b().ordinal()];
                if (n8 != 1) {
                    if (n8 != 2) {
                        if (n8 != 3) throw new IllegalStateException("unknown negotiate context type");
                        if (bl3) throw new IllegalStateException("SMB2_COMPRESSION_CAPABILITIES should only appear once in the NegotiateContextList");
                        this.b((ax.S8.a)c8);
                        bl3 = true;
                        continue;
                    }
                    if (bl2) throw new IllegalStateException("SMB2_ENCRYPTION_CAPABILITIES should only appear once in the NegotiateContextList");
                    this.c((ax.S8.b)c8);
                    bl2 = true;
                    continue;
                }
                if (bl) throw new IllegalStateException("SMB2_PREAUTH_INTEGRITY_CAPABILITIES should only appear once in the NegotiateContextList");
                this.d((f)c8);
                bl = true;
            }
            return;
        } else {
            if (!g8.j() || !this.d.b.n().contains(k.i0)) return;
            ax.l9.j$b.c(this.d, D.e0);
        }
    }

    private void f() throws e {
        boolean bl;
        boolean bl2 = false;
        ax.q9.a a8 = this.b.i();
        Object object = this.d.b;
        a8.g(((m)object).u(), ((m)object).o(), ((m)object).t(), ((m)object).n());
        Object object2 = this.c.l0.a(a8.f());
        if (object2 == null) {
            this.c.l0.b(a8);
            ax.l9.j$b.j(this.d, a8);
            return;
        }
        if (a8.h((ax.q9.a)object2)) {
            ax.l9.j$b.j(this.d, (ax.q9.a)object2);
            return;
        }
        object = String.format("Different server found for same hostname '%s', disconnecting...", a8.f());
        boolean bl3 = ((ax.q9.a)object2).e().equals(a8.e());
        boolean bl4 = ((Object)((Object)((ax.q9.a)object2).b())).equals((Object)a8.b());
        boolean bl5 = ((ax.q9.a)object2).d() == a8.d();
        try {
            boolean bl6 = ((ax.q9.a)object2).a().equals(a8.a());
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append((String)object);
            stringBuilder.append(" : ");
            stringBuilder.append(bl3);
            stringBuilder.append("(");
            stringBuilder.append(((ax.q9.a)object2).e());
            stringBuilder.append("!=");
            stringBuilder.append(a8.e());
            stringBuilder.append(",");
            stringBuilder.append(bl4);
            stringBuilder.append(",");
            stringBuilder.append(bl5);
            stringBuilder.append(",");
            stringBuilder.append(bl6);
            object2 = stringBuilder.toString();
            bl = bl2;
            object = object2;
            if (!bl3) {
                bl = bl2;
                object = object2;
                if (bl4) {
                    bl = bl2;
                    object = object2;
                    if (bl5) {
                        bl = bl2;
                        object = object2;
                        if (bl6) {
                            bl = true;
                            object = object2;
                        }
                    }
                }
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
            bl = bl2;
        }
        if (bl) {
            this.c.l0.b(a8);
            ax.l9.j$b.j(this.d, a8);
            return;
        }
        throw new e((String)object);
    }

    private m g() throws e {
        Object object = new ax.P8.a(this.a.O());
        long l8 = this.c.h0.c();
        if (l8 == 0L) {
            Object object2 = new h((d<?, ?>)object, l8, UUID.randomUUID());
            this.c.g0.e((h)object2);
            ax.l9.j$b.i(this.d, (d)object);
            this.c.p0.c((d<?, ?>)object);
            object = (q)ax.a9.d.a(((h)object2).c(null), this.a.Q(), TimeUnit.MILLISECONDS, ax.c9.e.q);
            if (object instanceof m) {
                object = object2 = (m)object;
                if (((m)object2).o() == g.f0) {
                    object = this.i();
                }
                return object;
            }
            object2 = new StringBuilder();
            ((StringBuilder)object2).append("Expected a SMB2 NEGOTIATE Response to our SMB_COM_NEGOTIATE, but got: ");
            ((StringBuilder)object2).append(object);
            throw new IllegalStateException(((StringBuilder)object2).toString());
        }
        throw new IllegalStateException("The SMBv1 SMB_COM_NEGOTIATE packet needs to be the first packet sent.");
    }

    private m i() throws e {
        Object object = new byte[32];
        this.a.H().nextBytes((byte[])object);
        object = new l(this.a.O(), this.b.d(), this.a.X(), this.a.B(), (byte[])object);
        ax.l9.j$b.i(this.d, (d)object);
        return (m)this.c.M0((q)object);
    }

    void h() throws e {
        ax.Xd.d d8 = e;
        d8.s("Negotiating dialects {}", this.a.O());
        m m8 = this.a.Y() ? this.g() : this.i();
        ax.l9.j$b.b(this.d, m8);
        if (ax.K8.a.j(((t)m8.c()).m())) {
            this.e();
            this.f();
            this.b.m(this.d);
            d8.s("Negotiated the following connection settings: {}", this.b);
            return;
        }
        throw new F((t)m8.c(), "Failure during dialect negotiation");
    }

    public static class b {
        private d<?, ?> a;
        private m b;
        private D c;
        private E d;
        private Set<A> e = EnumSet.noneOf(A.class);
        private byte[] f;
        private ax.q9.a g;

        static /* synthetic */ m b(b b8, m m8) {
            b8.b = m8;
            return m8;
        }

        static /* synthetic */ D c(b b8, D d8) {
            b8.c = d8;
            return d8;
        }

        static /* synthetic */ Set d(b b8, Set set) {
            b8.e = set;
            return set;
        }

        static /* synthetic */ E f(b b8, E e8) {
            b8.d = e8;
            return e8;
        }

        static /* synthetic */ byte[] g(b b8, byte[] byArray) {
            b8.f = byArray;
            return byArray;
        }

        static /* synthetic */ d i(b b8, d d8) {
            b8.a = d8;
            return d8;
        }

        static /* synthetic */ ax.q9.a j(b b8, ax.q9.a a8) {
            b8.g = a8;
            return a8;
        }

        public D k() {
            return this.c;
        }

        public Set<A> l() {
            return this.e;
        }

        public m m() {
            return this.b;
        }

        public E n() {
            return this.d;
        }

        public byte[] o() {
            return this.f;
        }

        public ax.q9.a p() {
            return this.g;
        }
    }
}

