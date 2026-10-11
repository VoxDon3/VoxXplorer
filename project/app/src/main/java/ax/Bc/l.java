/*
 * Decompiled with CFR 0.152.
 */
package ax.Bc;

import ax.Ac.a;
import ax.Bc.q;
import java.util.Calendar;
import java.util.Date;
import java.util.LinkedList;

public class l
implements a {
    static final l[] t0 = new l[0];
    private boolean c0;
    private boolean d0;
    private boolean e0;
    private boolean f0;
    private boolean g0;
    private boolean h0;
    private long i0;
    private long j0;
    private long k0;
    private boolean l0;
    private int m0;
    private boolean n0;
    private long o0;
    private long p0;
    private String q;
    private long q0;
    private long r0;
    private Iterable<? extends q> s0;

    private boolean a(Iterable<? extends q> object, Iterable<? extends q> object2) {
        if (object == null) {
            return object2 == null;
        }
        if (object2 == null) {
            return false;
        }
        object = object.iterator();
        object2 = object2.iterator();
        while (object.hasNext()) {
            if (!object2.hasNext()) {
                return false;
            }
            if (((q)object.next()).equals(object2.next())) continue;
            return false;
        }
        return object2.hasNext() ^ true;
    }

    public static long q(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeZone(java.util.DesugarTimeZone.getTimeZone((String)"GMT+0"));
        calendar.set(1601, 0, 1, 0, 0, 0);
        calendar.set(14, 0);
        return (date.getTime() - calendar.getTimeInMillis()) * 10000L;
    }

    public static Date r(long l8) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeZone(java.util.DesugarTimeZone.getTimeZone((String)"GMT+0"));
        calendar.set(1601, 0, 1, 0, 0, 0);
        calendar.set(14, 0);
        return new Date(calendar.getTimeInMillis() + l8 / 10000L);
    }

    public void A(boolean bl) {
        this.h0 = bl;
    }

    public void B(boolean bl) {
        this.n0 = bl;
    }

    public void C(boolean bl) {
        this.f0 = bl;
    }

    public void D(boolean bl) {
        this.g0 = bl;
    }

    public void E(boolean bl) {
        this.c0 = bl;
    }

    public void F(boolean bl) {
        this.l0 = bl;
    }

    public void G(long l8) {
        this.j0 = l8;
    }

    public void H(Date date) {
        boolean bl = date != null;
        this.g0 = bl;
        if (bl) {
            this.j0 = l.q(date);
        }
    }

    public void I(String string) {
        this.q = string;
    }

    public void J(long l8) {
        this.q0 = l8;
    }

    public void K(int n8) {
        this.m0 = n8;
    }

    @Override
    public Date b() {
        if (this.g0) {
            return l.r(this.j0);
        }
        throw new UnsupportedOperationException("The entry doesn't have this timestamp");
    }

    public Date c() {
        if (this.h0) {
            return l.r(this.k0);
        }
        throw new UnsupportedOperationException("The entry doesn't have this timestamp");
    }

    long d() {
        return this.p0;
    }

    long e() {
        return this.r0;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null && this.getClass() == object.getClass()) {
            object = (l)object;
            if (j.Objects.equals((Object)this.q, (Object)((l)object).q) && this.c0 == ((l)object).c0 && this.d0 == ((l)object).d0 && this.e0 == ((l)object).e0 && this.f0 == ((l)object).f0 && this.g0 == ((l)object).g0 && this.h0 == ((l)object).h0 && this.i0 == ((l)object).i0 && this.j0 == ((l)object).j0 && this.k0 == ((l)object).k0 && this.l0 == ((l)object).l0 && this.m0 == ((l)object).m0 && this.n0 == ((l)object).n0 && this.o0 == ((l)object).o0 && this.p0 == ((l)object).p0 && this.q0 == ((l)object).q0 && this.r0 == ((l)object).r0 && this.a(this.s0, ((l)object).s0)) {
                return true;
            }
        }
        return false;
    }

    public Iterable<? extends q> f() {
        return this.s0;
    }

    public long g() {
        return this.o0;
    }

    @Override
    public String getName() {
        return this.q;
    }

    @Override
    public long getSize() {
        return this.q0;
    }

    public Date h() {
        if (this.f0) {
            return l.r(this.i0);
        }
        throw new UnsupportedOperationException("The entry doesn't have this timestamp");
    }

    public int hashCode() {
        String string = this.getName();
        if (string == null) {
            return 0;
        }
        return string.hashCode();
    }

    public boolean i() {
        return this.h0;
    }

    @Override
    public boolean isDirectory() {
        return this.d0;
    }

    public boolean j() {
        return this.n0;
    }

    public boolean k() {
        return this.f0;
    }

    public boolean l() {
        return this.g0;
    }

    public boolean m() {
        return this.l0;
    }

    public int n() {
        return this.m0;
    }

    public boolean o() {
        return this.c0;
    }

    public boolean p() {
        return this.e0;
    }

    public void s(long l8) {
        this.k0 = l8;
    }

    public void t(boolean bl) {
        this.e0 = bl;
    }

    void u(long l8) {
        this.p0 = l8;
    }

    void v(long l8) {
        this.r0 = l8;
    }

    public void w(Iterable<? extends q> object) {
        if (object != null) {
            LinkedList<q> linkedList = new LinkedList<q>();
            object = object.iterator();
            while (object.hasNext()) {
                linkedList.addLast((q)object.next());
            }
            this.s0 = java.util.DesugarCollections.unmodifiableList(linkedList);
            return;
        }
        this.s0 = null;
    }

    public void x(long l8) {
        this.o0 = l8;
    }

    public void y(long l8) {
        this.i0 = l8;
    }

    public void z(boolean bl) {
        this.d0 = bl;
    }
}

