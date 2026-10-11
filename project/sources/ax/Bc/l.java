package ax.Bc;

import j$.util.DesugarCollections;
import j$.util.DesugarTimeZone;
import j$.util.Objects;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;

/* loaded from: classes3.dex */
public class l implements ax.Ac.a {
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

    private boolean a(Iterable<? extends q> iterable, Iterable<? extends q> iterable2) {
        if (iterable == null) {
            return iterable2 == null;
        }
        if (iterable2 == null) {
            return false;
        }
        Iterator<? extends q> it = iterable.iterator();
        Iterator<? extends q> it2 = iterable2.iterator();
        while (it.hasNext()) {
            if (!it2.hasNext() || !it.next().equals(it2.next())) {
                return false;
            }
        }
        return !it2.hasNext();
    }

    public static long q(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeZone(DesugarTimeZone.getTimeZone("GMT+0"));
        calendar.set(1601, 0, 1, 0, 0, 0);
        calendar.set(14, 0);
        return (date.getTime() - calendar.getTimeInMillis()) * 10000;
    }

    public static Date r(long j) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeZone(DesugarTimeZone.getTimeZone("GMT+0"));
        calendar.set(1601, 0, 1, 0, 0, 0);
        calendar.set(14, 0);
        return new Date(calendar.getTimeInMillis() + (j / 10000));
    }

    public void A(boolean z) {
        this.h0 = z;
    }

    public void B(boolean z) {
        this.n0 = z;
    }

    public void C(boolean z) {
        this.f0 = z;
    }

    public void D(boolean z) {
        this.g0 = z;
    }

    public void E(boolean z) {
        this.c0 = z;
    }

    public void F(boolean z) {
        this.l0 = z;
    }

    public void G(long j) {
        this.j0 = j;
    }

    public void H(Date date) {
        boolean z = date != null;
        this.g0 = z;
        if (z) {
            this.j0 = q(date);
        }
    }

    public void I(String str) {
        this.q = str;
    }

    public void J(long j) {
        this.q0 = j;
    }

    public void K(int i) {
        this.m0 = i;
    }

    @Override // ax.Ac.a
    public Date b() {
        if (this.g0) {
            return r(this.j0);
        }
        throw new UnsupportedOperationException("The entry doesn't have this timestamp");
    }

    public Date c() {
        if (this.h0) {
            return r(this.k0);
        }
        throw new UnsupportedOperationException("The entry doesn't have this timestamp");
    }

    long d() {
        return this.p0;
    }

    long e() {
        return this.r0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            l lVar = (l) obj;
            if (Objects.equals(this.q, lVar.q) && this.c0 == lVar.c0 && this.d0 == lVar.d0 && this.e0 == lVar.e0 && this.f0 == lVar.f0 && this.g0 == lVar.g0 && this.h0 == lVar.h0 && this.i0 == lVar.i0 && this.j0 == lVar.j0 && this.k0 == lVar.k0 && this.l0 == lVar.l0 && this.m0 == lVar.m0 && this.n0 == lVar.n0 && this.o0 == lVar.o0 && this.p0 == lVar.p0 && this.q0 == lVar.q0 && this.r0 == lVar.r0 && a(this.s0, lVar.s0)) {
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

    @Override // ax.Ac.a
    public String getName() {
        return this.q;
    }

    @Override // ax.Ac.a
    public long getSize() {
        return this.q0;
    }

    public Date h() {
        if (this.f0) {
            return r(this.i0);
        }
        throw new UnsupportedOperationException("The entry doesn't have this timestamp");
    }

    public int hashCode() {
        String name = getName();
        if (name == null) {
            return 0;
        }
        return name.hashCode();
    }

    public boolean i() {
        return this.h0;
    }

    @Override // ax.Ac.a
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

    public void s(long j) {
        this.k0 = j;
    }

    public void t(boolean z) {
        this.e0 = z;
    }

    void u(long j) {
        this.p0 = j;
    }

    void v(long j) {
        this.r0 = j;
    }

    public void w(Iterable<? extends q> iterable) {
        if (iterable == null) {
            this.s0 = null;
            return;
        }
        LinkedList linkedList = new LinkedList();
        Iterator<? extends q> it = iterable.iterator();
        while (it.hasNext()) {
            linkedList.addLast(it.next());
        }
        this.s0 = DesugarCollections.unmodifiableList(linkedList);
    }

    public void x(long j) {
        this.o0 = j;
    }

    public void y(long j) {
        this.i0 = j;
    }

    public void z(boolean z) {
        this.d0 = z;
    }
}
