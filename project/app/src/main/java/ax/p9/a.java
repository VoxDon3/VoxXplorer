/*
 * Decompiled with CFR 0.152.
 */
package ax.p9;

import ax.H8.c;
import ax.H8.d;
import ax.Q8.F;
import ax.Q8.q;
import ax.Q8.t;
import ax.R8.i;
import ax.Xd.f;
import ax.Z8.a;
import ax.p9.b;
import ax.p9.c;
import ax.s9.m;
import ax.s9.n;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class a
implements ax.p9.c {
    private static final ax.Xd.d g = ax.Xd.f.k(a.class);
    private final n b;
    private final ax.p9.c c;
    private ax.H8.d d = new ax.H8.d();
    private ax.H8.c e = new ax.H8.c();
    private long f;

    public a(ax.p9.c c8, long l8) {
        this.c = c8;
        this.f = l8;
        this.b = new n(){
            final ax.p9.c b;
            final a c;
            {
                this.c = a8;
                this.b = c8;
            }

            @Override
            public boolean a(long l8) {
                return l8 == ax.K8.a.s1.getValue() || this.b.a().a(l8);
                {
                }
            }
        };
    }

    private d e(c c8, m m8, ax.H8.b b8) throws ax.c9.e, a.b {
        ax.I8.e e8 = new ax.I8.e(b8.h());
        ax.h9.b b9 = new ax.h9.b();
        e8.a(b9);
        return this.g(c8, ax.a9.d.a(m8.o(393620L, true, new ax.o9.b(b9)), this.f, TimeUnit.MILLISECONDS, ax.c9.e.q), b8);
    }

    private void f(d d8, ax.I8.f object) {
        if (((ax.I8.f)object).c() < 3) {
            return;
        }
        object = new c.a((ax.I8.f)object);
        this.e.b((c.a)object);
        d8.c = object;
    }

    private d g(c object, i object2, ax.H8.b object3) throws a.b {
        d d8 = new d(((t)((ax.h9.d)object2).c()).m());
        if (d8.a == ax.K8.a.c0.getValue()) {
            object3 = new ax.I8.f(((ax.H8.b)object3).h());
            ((ax.I8.f)object3).d(new ax.h9.b(((i)object2).n()));
            int n8 = ((Enum)object).ordinal();
            if (n8 != 0) {
                if (n8 != 1) {
                    if (n8 != 2 && n8 != 3 && n8 != 4) {
                        object2 = new StringBuilder();
                        ((StringBuilder)object2).append("Encountered unhandled DFS RequestType: ");
                        ((StringBuilder)object2).append(object);
                        throw new IllegalStateException(((StringBuilder)object2).toString());
                    }
                    this.h(d8, (ax.I8.f)object3);
                    return d8;
                }
                this.f(d8, (ax.I8.f)object3);
                return d8;
            }
            object = new StringBuilder();
            ((StringBuilder)object).append((Object)ax.p9.a$c.q);
            ((StringBuilder)object).append(" not used yet.");
            throw new UnsupportedOperationException(((StringBuilder)object).toString());
        }
        return d8;
    }

    private void h(d d8, ax.I8.f object) {
        if (((ax.I8.f)object).a().isEmpty()) {
            d8.a = ax.K8.a.x0.getValue();
            return;
        }
        object = new d.a((ax.I8.f)object, this.e);
        g.a("Got DFS Referral result: {}", object);
        this.d.c((d.a)object);
        d8.b = object;
    }

    /*
     * WARNING - void declaration
     */
    private d i(c object, String object2, ax.r9.b autoCloseable, ax.H8.b b8) throws ax.H8.a {
        Throwable var1_5;
        Object object3 = autoCloseable;
        if (!((String)object2).equals(((ax.r9.b)autoCloseable).j().A0())) {
            object3 = ((ax.r9.b)autoCloseable).g();
            autoCloseable = ((ax.r9.b)autoCloseable).j();
            try {
                object2 = ((ax.l9.a)autoCloseable).d0().a((String)object2);
                object3 = ((ax.l9.a)object2).v((ax.j9.b)object3);
            }
            catch (IOException iOException) {
                throw new ax.H8.a(iOException);
            }
        }
        try {
            object = this.e((c)((Object)object), ((ax.r9.b)object3).b("IPC$"), b8);
            return object;
        }
        catch (IOException iOException) {
        }
        catch (a.b b9) {
            // empty catch block
        }
        throw new ax.H8.a((Throwable)var1_5);
    }

    private <T> T j(ax.r9.b b8, ax.k9.e e8, c.b<T> b9) throws b {
        g.a("Starting DFS resolution for {}", e8.h());
        return this.k(b8, new e<T>(new ax.H8.b(e8.h()), b9));
    }

    private <T> T k(ax.r9.b b8, e<T> e8) throws ax.H8.a {
        g.g("DFS[1]: {}", e8);
        if (!e8.b.b() && !e8.b.c()) {
            return this.q(b8, e8);
        }
        return this.n(e8);
    }

    private <T> T l(ax.r9.b b8, e<T> e8, c.a object) throws ax.H8.a {
        g.g("DFS[10]: {}", e8);
        object = this.i(ax.p9.a$c.d0, ((c.a)object).a(), b8, e8.b);
        if (ax.K8.a.j(((d)object).a)) {
            return this.r(b8, e8, ((d)object).b);
        }
        return this.o(b8, e8, (d)object);
    }

    private <T> T m(ax.r9.b b8, e<T> e8, d.a a8) throws ax.H8.a {
        g.g("DFS[11]: {}", e8);
        e8.b = e8.b.e(a8.b(), a8.c().a());
        e8.d = true;
        return this.q(b8, e8);
    }

    private <T> T n(e<T> e8) {
        g.g("DFS[12]: {}", e8);
        return e8.a.a(ax.k9.e.f(e8.b.h()));
    }

    private <T> T o(ax.r9.b object, e<T> e8, d d8) throws ax.H8.a {
        g.g("DFS[13]: {}", e8);
        long l8 = d8.a;
        object = new StringBuilder();
        ((StringBuilder)object).append("Cannot get DC for domain '");
        ((StringBuilder)object).append(e8.b.a().get(0));
        ((StringBuilder)object).append("'");
        throw new ax.H8.a(l8, ((StringBuilder)object).toString());
    }

    private <T> T p(ax.r9.b object, e<T> e8, d d8) throws ax.H8.a {
        g.g("DFS[14]: {}", e8);
        long l8 = d8.a;
        object = new StringBuilder();
        ((StringBuilder)object).append("DFS request failed for path ");
        ((StringBuilder)object).append(e8.b);
        throw new ax.H8.a(l8, ((StringBuilder)object).toString());
    }

    private <T> T q(ax.r9.b b8, e<T> e8) throws ax.H8.a {
        g.g("DFS[2]: {}", e8);
        d.a a8 = this.d.b(e8.b);
        if (!(a8 == null || a8.d() && a8.g())) {
            if (a8.d()) {
                return this.x(b8, e8, a8);
            }
            if (a8.f()) {
                return this.s(b8, e8, a8);
            }
            return this.r(b8, e8, a8);
        }
        return this.t(b8, e8);
    }

    private <T> T r(ax.r9.b b8, e<T> e8, d.a a8) {
        g.g("DFS[3]: {}", e8);
        d.c c8 = a8.c();
        ax.H8.b b9 = e8.b;
        F f8 = null;
        while (c8 != null) {
            try {
                e8.b = e8.b.e(a8.b(), a8.c().a());
                e8.d = true;
                f8 = this.w(b8, e8, a8);
            }
            catch (F f9) {
                f8 = f9;
                if (f9.b() == ax.K8.a.s1.getValue()) continue;
                c8 = a8.h();
                e8.b = b9;
                f8 = f9;
                continue;
            }
            return (T)f8;
        }
        if (f8 != null) {
            throw f8;
        }
        throw new IllegalStateException("Unknown error resolving DFS");
    }

    private <T> T s(ax.r9.b b8, e<T> e8, d.a a8) throws ax.H8.a {
        g.g("DFS[4]: {}", e8);
        if (e8.b.d()) {
            return this.r(b8, e8, a8);
        }
        if (a8.e()) {
            return this.m(b8, e8, a8);
        }
        return this.r(b8, e8, a8);
    }

    private <T> T t(ax.r9.b b8, e<T> e8) throws ax.H8.a {
        Object object;
        block7: {
            block6: {
                g.g("DFS[5]: {}", e8);
                object = e8.b.a().get(0);
                c.a a8 = this.e.a((String)object);
                if (a8 == null) {
                    e8.e = object;
                    e8.c = false;
                    return this.u(b8, e8);
                }
                if (a8.a() == null) break block6;
                object = a8;
                if (!a8.a().isEmpty()) break block7;
            }
            object = b8.g().a();
            object = this.i(ax.p9.a$c.c0, (String)object, b8, e8.b);
            if (!ax.K8.a.j(((d)object).a)) {
                return this.o(b8, e8, (d)object);
            }
            object = ((d)object).c;
        }
        if (e8.b.d()) {
            return this.l(b8, e8, (c.a)object);
        }
        e8.e = ((c.a)object).a();
        e8.c = true;
        return this.u(b8, e8);
    }

    private <T> T u(ax.r9.b b8, e<T> e8) throws ax.H8.a {
        g.g("DFS[6]: {}", e8);
        d d8 = this.i(ax.p9.a$c.e0, e8.b.a().get(0), b8, e8.b);
        if (ax.K8.a.j(d8.a)) {
            return this.v(b8, e8, d8.b);
        }
        if (e8.c) {
            return this.o(b8, e8, d8);
        }
        if (e8.d) {
            return this.p(b8, e8, d8);
        }
        return this.n(e8);
    }

    private <T> T v(ax.r9.b b8, e<T> e8, d.a a8) throws ax.H8.a {
        g.g("DFS[7]: {}", e8);
        if (a8.g()) {
            return this.r(b8, e8, a8);
        }
        return this.s(b8, e8, a8);
    }

    private <T> T w(ax.r9.b b8, e<T> e8, d.a a8) {
        g.g("DFS[8]: {}", e8);
        return e8.a.a(ax.k9.e.f(e8.b.h()));
    }

    private <T> T x(ax.r9.b b8, e<T> e8, d.a object) throws ax.H8.a {
        ax.Xd.d d8 = g;
        d8.g("DFS[9]: {}", e8);
        ax.H8.b b9 = new ax.H8.b(e8.b.a().subList(0, 2));
        object = this.d.b(b9);
        if (object == null) {
            d8.s("Could not find referral cache entry for {}", b9);
            this.d.a(e8.b);
            return this.k(b8, e8);
        }
        object = this.i(ax.p9.a$c.f0, ((d.a)object).c().a().a().get(0), b8, e8.b);
        if (!ax.K8.a.j(((d)object).a)) {
            return this.p(b8, e8, (d)object);
        }
        if (((d)object).b.g()) {
            return this.r(b8, e8, ((d)object).b);
        }
        return this.s(b8, e8, ((d)object).b);
    }

    @Override
    public n a() {
        return this.b;
    }

    @Override
    public <T> T b(ax.r9.b b8, ax.k9.e e8, c.b<T> b9) throws b {
        T t8 = this.j(b8, e8, b9);
        if (!e8.equals(t8)) {
            g.C("DFS resolved {} -> {}", e8, t8);
            return t8;
        }
        return this.c.b(b8, e8, b9);
    }

    @Override
    public <T> T c(ax.r9.b b8, q q8, ax.k9.e e8, c.b<T> b9) throws b {
        if (!b8.j().o0().q()) {
            return this.c.c(b8, q8, e8, b9);
        }
        if (e8.b() != null && ((t)q8.c()).m() == ax.K8.a.s1.getValue()) {
            g.C("DFS Share {} does not cover {}, resolve through DFS", e8.c(), e8);
            return this.j(b8, e8, new c.b<T>(){
                final ax.k9.e a;
                final c.b b;
                final a c;
                {
                    this.c = a8;
                    this.a = e8;
                    this.b = b8;
                }

                @Override
                public T a(ax.k9.e e8) {
                    g.C("DFS resolved {} -> {}", this.a, e8);
                    return this.b.a(e8);
                }
            });
        }
        if (e8.b() == null && ax.K8.a.h(((t)q8.c()).m())) {
            g.a("Attempting to resolve {} through DFS", e8);
            return this.j(b8, e8, b9);
        }
        return this.c.c(b8, q8, e8, b9);
    }

    private static final class c
    extends Enum<c> {
        public static final /* enum */ c c0;
        public static final /* enum */ c d0;
        public static final /* enum */ c e0;
        public static final /* enum */ c f0;
        private static final c[] g0;
        public static final /* enum */ c q;

        static {
            q = new c();
            c0 = new c();
            d0 = new c();
            e0 = new c();
            f0 = new c();
            g0 = ax.p9.a$c.d();
        }

        private static /* synthetic */ c[] d() {
            return new c[]{q, c0, d0, e0, f0};
        }

        public static c valueOf(String string) {
            return Enum.valueOf(c.class, string);
        }

        public static c[] values() {
            return (c[])g0.clone();
        }
    }

    private static class d {
        long a;
        d.a b;
        c.a c;

        private d(long l8) {
            this.a = l8;
        }
    }

    private static class e<T> {
        final c.b<T> a;
        ax.H8.b b;
        boolean c = false;
        boolean d = false;
        String e = null;

        e(ax.H8.b b8, c.b<T> b9) {
            this.b = b8;
            this.a = b9;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ResolveState{path=");
            stringBuilder.append(this.b);
            stringBuilder.append(", resolvedDomainEntry=");
            stringBuilder.append(this.c);
            stringBuilder.append(", isDFSPath=");
            stringBuilder.append(this.d);
            stringBuilder.append(", hostName='");
            stringBuilder.append(this.e);
            stringBuilder.append('\'');
            stringBuilder.append('}');
            return stringBuilder.toString();
        }
    }
}

