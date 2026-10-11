/*
 * Decompiled with CFR 0.152.
 */
package ax.r9;

import ax.J8.a;
import ax.Q8.F;
import ax.Q8.g;
import ax.Q8.m;
import ax.Q8.q;
import ax.Q8.t;
import ax.Q8.v;
import ax.R8.k;
import ax.R8.w;
import ax.R8.x;
import ax.l9.n;
import ax.n9.e;
import ax.n9.f;
import ax.p9.c;
import ax.r9.c;
import ax.r9.d;
import ax.s9.i;
import ax.s9.j;
import ax.s9.o;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import javax.crypto.SecretKey;

public class b
implements AutoCloseable {
    private static final ax.Xd.d p0 = ax.Xd.f.k(b.class);
    private ax.l9.a c0;
    private final ax.i9.d d0;
    private ax.n9.c e0;
    private final ax.p9.c f0;
    private n g0;
    private ax.l9.f h0;
    private d i0 = new d();
    private Map<String, b> j0 = new HashMap<String, b>();
    private ReentrantReadWriteLock k0 = new ReentrantReadWriteLock();
    private ax.j9.b l0;
    private c m0;
    private boolean n0;
    private long o0;
    private long q;

    public b(ax.l9.a a8, ax.i9.d d8, ax.j9.b b8, ax.n9.c c8, ax.p9.c c9, n n8, ax.l9.f f8) {
        this.c0 = a8;
        this.d0 = d8;
        this.l0 = b8;
        this.e0 = c8;
        this.f0 = c9;
        this.g0 = n8;
        this.m0 = new c();
        this.h0 = f8;
        if (c8 != null) {
            c8.c(this);
        }
        this.n0 = false;
        this.L();
    }

    private void L() {
        this.o0 = System.currentTimeMillis() + 35000L;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private ax.s9.m c(String object) {
        c.b<ax.s9.m> b8;
        Set<ax.Q8.w> set;
        ax.k9.e e8;
        block13: {
            block14: {
                block16: {
                    block15: {
                        Throwable var1_4;
                        e8 = new ax.k9.e(this.c0.A0(), (String)object);
                        p0.C("Connecting to {} on session {}", e8, this.q);
                        try {
                            object = new w(this.c0.s0().a(), e8, this.q);
                            ((t)((ax.h9.d)object).c()).s(256);
                            object = (x)ax.a9.d.a(this.H((q)object), this.d0.Q(), TimeUnit.MILLISECONDS, ax.c9.e.q);
                        }
                        catch (ax.c9.e e9) {
                            throw new ax.k9.d((Throwable)var1_4);
                        }
                        try {
                            set = this.f0;
                            b8 = new c.b<ax.s9.m>(){
                                final ax.k9.e a;
                                final b b;
                                {
                                    this.b = b8;
                                    this.a = e8;
                                }

                                public ax.s9.m b(ax.k9.e e8) {
                                    b b8 = this.b;
                                    if (!e8.d(this.a)) {
                                        p0.a("Re-routing the connection to host {}", e8.a());
                                        b8 = this.b.m(e8);
                                    }
                                    if (!e8.e(this.a)) {
                                        return b8.b(e8.c());
                                    }
                                    return null;
                                }
                            };
                            b8 = set.c(this, (q)object, e8, b8);
                            if (b8 != null) {
                                return b8;
                            }
                        }
                        catch (ax.c9.e e10) {
                            throw new ax.k9.d((Throwable)var1_4);
                        }
                        catch (ax.p9.b b9) {}
                        if (ax.K8.a.h(((t)((ax.h9.d)object).c()).m())) break block13;
                        if (((x)object).n().contains(v.g0)) break block14;
                        long l8 = ((t)((ax.h9.d)object).c()).n();
                        Set<v> set2 = ((x)object).n();
                        ax.i9.d d8 = this.d0;
                        ax.l9.b b10 = this.c0.o0();
                        ax.n9.c c8 = this.e0;
                        Set<a> set3 = ((x)object).o();
                        set = ((x)object).p();
                        try {
                            b8 = new c.b<ax.s9.m>(l8, e8, this, set2, d8, b10, c8, set3, set);
                            if (!((x)object).q()) break block15;
                            object = new ax.s9.c(e8, (o)((Object)b8), this.f0);
                            break block16;
                        }
                        catch (ax.c9.e e11) {
                            throw new ax.k9.d((Throwable)var1_4);
                        }
                    }
                    if (((x)object).r()) {
                        object = new i(e8, (o)((Object)b8));
                    } else {
                        if (!((x)object).s()) {
                            object = new ax.k9.d("Unknown ShareType returned in the TREE_CONNECT Response");
                            throw object;
                        }
                        object = new j(e8, (o)((Object)b8));
                    }
                }
                this.i0.d((ax.s9.m)object);
                return object;
            }
            object = new ax.k9.d("ASYMMETRIC capability unsupported");
            throw object;
        }
        p0.n(((t)((ax.h9.d)object).c()).toString());
        object = (t)((ax.h9.d)object).c();
        set = new Set<ax.Q8.w>();
        ((StringBuilder)((Object)set)).append("Could not connect to ");
        ((StringBuilder)((Object)set)).append(e8);
        b8 = new c.b<ax.s9.m>((t)object, ((StringBuilder)((Object)set)).toString());
        throw b8;
    }

    private b d(ax.k9.e e8) {
        try {
            b b8 = this.j().d0().a(e8.a()).v(this.g());
            return b8;
        }
        catch (IOException iOException) {
            long l8 = ax.K8.a.y1.getValue();
            m m8 = m.c0;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Could not connect to DFS root ");
            stringBuilder.append(e8);
            throw new F(l8, m8, stringBuilder.toString(), iOException);
        }
    }

    @ax.jc.c
    private void e(f f8) {
        if (f8.a() == this.q) {
            p0.s("Notified of TreeDisconnected <<{}>>", f8.b());
            this.i0.a(f8.b());
        }
    }

    public boolean A() {
        return this.m0.i();
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void F() throws ax.c9.e {
        block14: {
            block13: {
                try {
                    b.p0.C("Logging off session {} from host {}", this.q, this.c0.A0());
lbl3:
                    // 3 sources

                    for (Object var3_8 : this.i0.b()) {
                        var3_8.close();
                    }
                    break block13;
                }
                catch (Throwable var2_3) {
                    break block14;
                }
                catch (ax.k9.d var2_4) {
                }
                catch (IOException var2_5) {
                    // empty catch block
                }
                b.p0.p("Caught exception while closing TreeConnect with id: {}", var3_8.g().f(), var2_2);
                ** GOTO lbl3
            }
            this.k0.writeLock().lock();
            try lbl-1000:
            // 3 sources

            {
                for (Object var4_1 : this.j0.values()) {
                    b.p0.C("Logging off nested session {} for session {}", var4_1.p(), this.q);
                    var4_1.F();
                }
                ** GOTO lbl-1000
            }
            catch (Throwable var2_6) {
                ** GOTO lbl48
            }
            catch (ax.c9.e var2_7) {
                b.p0.t("Caught exception while logging off nested session {}", var4_1.p());
            }
            ** GOTO lbl-1000
lbl-1000:
            // 1 sources

            {
                this.k0.writeLock().unlock();
                var2_2 = new k(this.c0.s0().a(), this.q);
                var3_8 = (k)ax.a9.d.a(this.H((q)var2_2), this.d0.D(), TimeUnit.MILLISECONDS, ax.c9.e.q);
                var1_9 = ax.K8.a.j(((t)var3_8.c()).m());
                if (!var1_9) ** GOTO lbl-1000
                this.e0.b(new e(this.q));
                this.n0 = true;
                return;
            }
lbl-1000:
            // 1 sources

            {
                var3_8 = (t)var3_8.c();
                var4_1 = new StringBuilder();
                var4_1.append("Could not logoff session <<");
                var4_1.append(this.q);
                var4_1.append(">>");
                var2_2 = new F((t)var3_8, var4_1.toString());
                throw var2_2;
lbl48:
                // 1 sources

                this.k0.writeLock().unlock();
                throw var2_6;
            }
        }
        this.e0.b(new e(this.q));
        this.n0 = true;
        throw var2_3;
    }

    public <T extends q> Future<T> H(q q8) throws ax.c9.e {
        SecretKey secretKey = this.q((t)q8.c(), true);
        if (this.m0.i() && secretKey == null) {
            throw new ax.c9.e("Message signing is required, but no signing key is negotiated");
        }
        this.L();
        if (this.d0()) {
            return this.c0.L0(this.h0.g(q8, this.m0.c()));
        }
        if (this.A()) {
            return this.c0.L0(this.g0.b(q8, secretKey));
        }
        if (this.c0.s0().a() == g.i0 && this.c0.o0().l() && secretKey != null) {
            return this.c0.L0(this.g0.b(q8, secretKey));
        }
        return this.c0.L0(q8);
    }

    public void W(long l8) {
        this.q = l8;
    }

    public ax.s9.m b(String string) {
        if (!string.contains("\\")) {
            ax.s9.m m8 = this.i0.c(string);
            if (m8 != null) {
                p0.d("Returning cached Share {} for {}", m8, string);
                return m8;
            }
            return this.c(string);
        }
        throw new IllegalArgumentException(String.format("Share name (%s) cannot contain '\\' characters.", string));
    }

    @Override
    public void close() throws IOException {
        this.F();
    }

    public boolean d0() throws ax.c9.e {
        if (this.m0.g() && this.m0.c() == null) {
            throw new ax.c9.e("Message encryption is required, but no encryption key is negotiated");
        }
        boolean bl = this.m0.g();
        boolean bl2 = this.m0.c() != null && this.c0.o0().a();
        return bl | bl2;
    }

    public void f() {
        this.o0 = 0L;
    }

    public ax.j9.b g() {
        return this.l0;
    }

    public boolean isClosed() {
        return this.n0;
    }

    public ax.l9.a j() {
        return this.c0;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public b m(ax.k9.e e8) {
        Throwable throwable3;
        block6: {
            b b8;
            block5: {
                this.k0.readLock().lock();
                try {
                    b8 = this.j0.get(e8.a());
                    if (b8 != null) {
                        this.k0.readLock().unlock();
                        return b8;
                    }
                    this.k0.readLock().unlock();
                    this.k0.writeLock().lock();
                }
                catch (Throwable throwable2) {
                    this.k0.readLock().unlock();
                    throw throwable2;
                }
                try {
                    b b9;
                    b8 = b9 = this.j0.get(e8.a());
                    if (b9 != null) break block5;
                    b8 = this.d(e8);
                    this.j0.put(e8.a(), b8);
                }
                catch (Throwable throwable3) {
                    break block6;
                }
            }
            this.k0.readLock().lock();
            this.k0.writeLock().unlock();
            this.k0.readLock().unlock();
            return b8;
        }
        this.k0.writeLock().unlock();
        throw throwable3;
    }

    public c o() {
        return this.m0;
    }

    public long p() {
        return this.q;
    }

    public SecretKey q(t t8, boolean bl) {
        if (this.c0.s0().a().j()) {
            if (t8.h() == m.d0) {
                if (bl) {
                    return this.m0.f();
                }
                if (t8.m() != ax.K8.a.c0.getValue()) {
                    return this.m0.f();
                }
            }
            return this.m0.f();
        }
        return this.m0.e();
    }

    public boolean u() {
        return this.o0 < System.currentTimeMillis();
    }

    public boolean v() {
        return this.m0.h();
    }
}

