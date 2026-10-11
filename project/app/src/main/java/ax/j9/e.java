/*
 * Decompiled with CFR 0.152.
 */
package ax.j9;

import ax.U8.f;
import ax.U8.h;
import ax.U8.i;
import ax.Y8.d;
import ax.Z8.a;
import ax.d9.g;
import ax.j9.c;
import ax.j9.d;
import java.io.IOException;
import java.util.Collection;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.function.Predicate;

public class e
implements c {
    private static final ax.Xd.d h = ax.Xd.f.k(e.class);
    private static final ax.E8.e i = new ax.E8.e("1.3.6.1.4.1.311.2.2.10");
    private g a;
    private Random b;
    private ax.V8.c c;
    private ax.T8.a d;
    private b e;
    private Set<ax.W8.e> f;
    private byte[] g;

    public static /* synthetic */ boolean d(ax.W8.b b8, ax.W8.e e8) {
        return b8.b().contains(e8) ^ true;
    }

    private ax.W8.g f(ax.W8.b object) {
        if (((ax.W8.b)object).d() == null) {
            return null;
        }
        ax.W8.g g8 = ((ax.W8.b)object).d().a();
        if (this.d.i() && ((ax.W8.b)object).d().c(ax.U8.a.j0)) {
            ax.U8.a a8 = ax.U8.a.i0;
            boolean bl = g8.c(a8);
            long l8 = 2L;
            if (bl) {
                l8 = 2L | (Long)((ax.U8.b)g8.b(a8)).b();
            }
            g8.d(new f(l8));
        }
        if (((ax.W8.b)object).b().contains(ax.W8.e.v0)) {
            object = (h)g8.b(ax.U8.a.f0);
            if (object != null) {
                object = String.format("cifs/%s", ((ax.U8.b)object).b());
                g8.d(new h(ax.U8.a.l0, (String)object));
            }
            return g8;
        }
        g8.d(new h(ax.U8.a.l0, ""));
        return g8;
    }

    private ax.j9.a g(ax.j9.b object, ax.W8.b object2, byte[] byArray) throws ax.w9.e {
        long l8;
        Object object3;
        Object object4;
        ax.j9.a a8 = new ax.j9.a();
        a8.j(((ax.W8.b)object2).f());
        if (((ax.W8.b)object2).d() != null && ((ax.W8.g)(object4 = ((ax.W8.b)object2).d())).c((ax.U8.a)(object3 = ax.U8.a.d0))) {
            a8.h((String)((ax.U8.b)((ax.W8.b)object2).d().b((ax.U8.a)object3)).b());
        }
        if (((ax.j9.b)object).d()) {
            a8.f(this.j(new ax.W8.a(null, null, ((ax.j9.b)object).c(), ((ax.j9.b)object).a(), this.d.h(), null, this.f, this.d.g())));
            return a8;
        }
        this.f.add(ax.W8.e.g0);
        ax.W8.g g8 = this.f((ax.W8.b)object2);
        long l9 = l8 = ax.J8.b.b().a();
        if (g8 != null) {
            object4 = ax.U8.a.j0;
            l9 = l8;
            if (g8.c((ax.U8.a)object4)) {
                l9 = ((ax.J8.b)((i)g8.b((ax.U8.a)object4)).b()).a();
            }
        }
        object3 = this.c.c(((ax.j9.b)object).c(), ((ax.j9.b)object).a(), ((ax.j9.b)object).b(), (ax.W8.b)object2, l9, g8);
        object4 = ((ax.V8.a)object3).c();
        byte[] byArray2 = ((ax.V8.a)object3).b();
        object3 = this.c.g((byte[])object4, ((ax.V8.a)object3).a(), ((ax.W8.b)object2).c());
        EnumSet<ax.W8.e> enumSet = ((ax.W8.b)object2).b();
        if (enumSet.contains(ax.W8.e.d0) && (enumSet.contains(ax.W8.e.t0) || enumSet.contains(ax.W8.e.u0) || enumSet.contains(ax.W8.e.m0))) {
            object2 = new byte[16];
            this.b.nextBytes((byte[])object2);
            object4 = ax.V8.b.f(this.a, (byte[])object3, (byte[])object2);
        } else {
            object4 = object3;
            object2 = object3;
        }
        object3 = ((ax.j9.b)object).c();
        String string = ((ax.j9.b)object).a();
        object = this.d.h();
        ax.W8.i i8 = this.d.g();
        object4 = new ax.W8.a(new byte[0], byArray2, (String)object3, string, (String)object, (byte[])object4, enumSet, i8);
        object = g8 != null ? (f)g8.b(ax.U8.a.i0) : null;
        if (object != null && ((Long)((ax.U8.b)object).b() & 2L) > 0L) {
            ((ax.W8.a)object4).d(new byte[16]);
            object = new a.c(ax.Z8.b.b);
            ((ax.W8.a)object4).e((a.c)object);
            ((ax.W8.a)object4).d(ax.V8.b.a(this.a, (byte[])object2, this.g, byArray, ((ax.Z8.a)object).f()));
        }
        a8.i((byte[])object2);
        h.g("Sending NTLM authenticate message: {}", object4);
        a8.f(this.j((ax.W8.a)object4));
        a8.g(this.f);
        return a8;
    }

    private ax.j9.a h(ax.j9.b object, byte[] object2) throws ax.w9.e {
        object2 = new ax.j9.a();
        this.f = EnumSet.of(ax.W8.e.e0, ax.W8.e.v0, ax.W8.e.j0);
        if (!this.d.j() && this.d.g() != null) {
            this.f.add(ax.W8.e.f0);
        }
        if (!((ax.j9.b)object).d()) {
            this.f.add(ax.W8.e.u0);
            this.f.add(ax.W8.e.m0);
            this.f.add(ax.W8.e.d0);
        } else if (((ax.j9.b)object).e()) {
            this.f.add(ax.W8.e.d0);
        } else {
            this.f.add(ax.W8.e.p0);
        }
        if (!this.f.contains(ax.W8.e.f0)) {
            if (ax.x9.a.a(((ax.j9.b)object).a())) {
                this.f.add(ax.W8.e.o0);
            }
            if (ax.x9.a.a(this.d.h())) {
                this.f.add(ax.W8.e.n0);
            }
        }
        object = new ax.W8.d(this.f, ((ax.j9.b)object).a(), this.d.h(), this.d.g(), this.d.j());
        h.g("Sending NTLM negotiate message: {}", this.g);
        ((ax.j9.a)object2).f(this.i((ax.W8.d)object));
        ((ax.j9.a)object2).g(this.f);
        return object2;
    }

    private ax.w9.f i(ax.W8.d object) throws ax.w9.e {
        ax.w9.b b8 = new ax.w9.b();
        b8.g(i);
        a.c c8 = new a.c(ax.Z8.b.b);
        ((ax.W8.d)object).b(c8);
        object = c8.f();
        this.g = (byte[])object;
        b8.m((byte[])object);
        return b8;
    }

    private ax.w9.f j(ax.W8.a a8) throws ax.w9.e {
        ax.w9.c c8 = new ax.w9.c();
        a.c c9 = new a.c(ax.Z8.b.b);
        a8.e(c9);
        c8.m(c9.f());
        return c8;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public ax.j9.a a(ax.j9.b object, byte[] object2, ax.l9.b object3) throws IOException {
        Object object4;
        Object object5;
        try {
            object5 = this.e;
            object3 = ax.j9.e$b.d0;
            if (object5 == object3) {
                return null;
            }
        }
        catch (ax.w9.e e8) {
            throw new ax.k9.d(e8);
        }
        if (object5 == ax.j9.e$b.q) {
            h.s("Initialized Authentication of {} using NTLM", ((ax.j9.b)object).c());
            this.e = ax.j9.e$b.c0;
            return this.h((ax.j9.b)object, (byte[])object2);
        }
        Object object6 = h;
        object6.s("Received token: {}", ax.Y8.a.a((byte[])object2));
        object5 = new ax.w9.c();
        object2 = ((ax.w9.c)object5).g((byte[])object2);
        object5 = new ax.W8.b();
        try {
            object4 = new a.c(((ax.w9.c)object2).e(), ax.Z8.b.b);
            ((ax.W8.b)object5).g((a.c)object4);
            object6.g("Received NTLM challenge: {}", object5);
            object6.s("Received NTLM challenge from: {}", ((ax.W8.b)object5).e());
            object6 = this.f;
            object4 = new d((ax.W8.b)object5);
        }
        catch (a.b b8) {
            object = new IOException(b8);
            throw object;
        }
        j.Collection._EL.removeIf((Collection)object6, (Predicate)object4);
        if (this.f.contains(ax.W8.e.e0)) {
            object = this.g((ax.j9.b)object, (ax.W8.b)object5, ((ax.w9.c)object2).e());
            this.e = object3;
            return object;
        }
        object = new ax.T8.b("Server does not support 128-bit encryption");
        throw object;
    }

    @Override
    public void b(ax.i9.d d8) {
        this.a = d8.K();
        this.b = d8.H();
        this.d = d8.G();
        this.e = ax.j9.e$b.q;
        this.f = new HashSet<ax.W8.e>();
        this.c = new ax.V8.c(this.b, this.a);
    }

    @Override
    public boolean c(ax.j9.b b8) {
        return b8.getClass().equals(ax.j9.b.class);
    }

    public static class a
    implements d.a<c> {
        public e b() {
            return new e();
        }

        @Override
        public String getName() {
            return i.k();
        }
    }

    static final class b
    extends Enum<b> {
        public static final /* enum */ b c0;
        public static final /* enum */ b d0;
        private static final b[] e0;
        public static final /* enum */ b q;

        static {
            q = new b();
            c0 = new b();
            d0 = new b();
            e0 = ax.j9.e$b.d();
        }

        private static /* synthetic */ b[] d() {
            return new b[]{q, c0, d0};
        }

        public static b valueOf(String string) {
            return Enum.valueOf(b.class, string);
        }

        public static b[] values() {
            return (b[])e0.clone();
        }
    }
}

