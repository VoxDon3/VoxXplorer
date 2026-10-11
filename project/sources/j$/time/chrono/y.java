package j$.time.chrono;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;

/* loaded from: classes2.dex */
public final class y extends AbstractC3797d {
    public static final j$.time.f d = j$.time.f.T(1873, 1, 1);
    private static final long serialVersionUID = -305327627230580483L;
    public final transient j$.time.f a;
    public final transient z b;
    public final transient int c;

    @Override // j$.time.chrono.AbstractC3797d, j$.time.chrono.InterfaceC3795b
    public final InterfaceC3798e z(j$.time.i iVar) {
        return new C3800g(this, iVar);
    }

    public y(j$.time.f fVar) {
        j$.time.f fVar2 = d;
        if (!j$.time.b.b(fVar2) ? fVar.x() >= fVar2.x() : fVar.L(fVar2) >= 0) {
            throw new j$.time.a("JapaneseDate before Meiji 6 is not supported");
        }
        z i = z.i(fVar);
        this.b = i;
        this.c = (fVar.a - i.b.a) + 1;
        this.a = fVar;
    }

    @Override // j$.time.chrono.InterfaceC3795b
    public final m a() {
        return w.c;
    }

    @Override // j$.time.chrono.AbstractC3797d, j$.time.chrono.InterfaceC3795b
    public final int hashCode() {
        w.c.getClass();
        return this.a.hashCode() ^ (-688086063);
    }

    @Override // j$.time.chrono.AbstractC3797d
    public final n M() {
        return this.b;
    }

    @Override // j$.time.chrono.AbstractC3797d, j$.time.chrono.InterfaceC3795b, j$.time.temporal.n
    public final boolean f(j$.time.temporal.q qVar) {
        if (qVar == j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_MONTH || qVar == j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_YEAR || qVar == j$.time.temporal.a.ALIGNED_WEEK_OF_MONTH || qVar == j$.time.temporal.a.ALIGNED_WEEK_OF_YEAR) {
            return false;
        }
        if (qVar instanceof j$.time.temporal.a) {
            return ((j$.time.temporal.a) qVar).B();
        }
        return qVar != null && qVar.p(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x006d  */
    @Override // j$.time.chrono.AbstractC3797d, j$.time.temporal.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final j$.time.temporal.u q(j$.time.temporal.q r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof j$.time.temporal.a
            if (r0 == 0) goto L91
            boolean r0 = r7.f(r8)
            if (r0 == 0) goto L85
            j$.time.temporal.a r8 = (j$.time.temporal.a) r8
            int[] r0 = j$.time.chrono.x.a
            int r1 = r8.ordinal()
            r0 = r0[r1]
            j$.time.f r1 = r7.a
            r2 = 1
            r3 = 1
            if (r0 == r2) goto L7b
            j$.time.chrono.z r5 = r7.b
            r6 = 2
            if (r0 == r6) goto L4a
            r1 = 3
            if (r0 == r1) goto L2a
            j$.time.chrono.w r0 = j$.time.chrono.w.c
            j$.time.temporal.u r8 = r0.l(r8)
            return r8
        L2a:
            j$.time.f r8 = r5.b
            j$.time.chrono.z r0 = r5.k()
            int r8 = r8.a
            if (r0 == 0) goto L40
            j$.time.f r0 = r0.b
            int r0 = r0.a
            int r0 = r0 - r8
            int r0 = r0 + r2
            long r0 = (long) r0
            j$.time.temporal.u r8 = j$.time.temporal.u.e(r3, r0)
            return r8
        L40:
            r0 = 999999999(0x3b9ac9ff, float:0.004723787)
            int r0 = r0 - r8
            long r0 = (long) r0
            j$.time.temporal.u r8 = j$.time.temporal.u.e(r3, r0)
            return r8
        L4a:
            j$.time.chrono.z r8 = r5.k()
            if (r8 == 0) goto L5e
            j$.time.f r8 = r8.b
            int r0 = r1.a
            int r6 = r8.a
            if (r6 != r0) goto L5e
            int r8 = r8.Q()
            int r8 = r8 - r2
            goto L69
        L5e:
            boolean r8 = r1.R()
            if (r8 == 0) goto L67
            r8 = 366(0x16e, float:5.13E-43)
            goto L69
        L67:
            r8 = 365(0x16d, float:5.11E-43)
        L69:
            int r0 = r7.c
            if (r0 != r2) goto L75
            j$.time.f r0 = r5.b
            int r0 = r0.Q()
            int r0 = r0 - r2
            int r8 = r8 - r0
        L75:
            long r0 = (long) r8
            j$.time.temporal.u r8 = j$.time.temporal.u.e(r3, r0)
            return r8
        L7b:
            int r8 = r1.S()
            long r0 = (long) r8
            j$.time.temporal.u r8 = j$.time.temporal.u.e(r3, r0)
            return r8
        L85:
            j$.time.temporal.t r0 = new j$.time.temporal.t
            java.lang.String r1 = "Unsupported field: "
            java.lang.String r8 = j$.time.b.a(r1, r8)
            r0.<init>(r8)
            throw r0
        L91:
            j$.time.temporal.u r8 = r8.w(r7)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.chrono.y.q(j$.time.temporal.q):j$.time.temporal.u");
    }

    @Override // j$.time.temporal.n
    public final long w(j$.time.temporal.q qVar) {
        if (!(qVar instanceof j$.time.temporal.a)) {
            return qVar.l(this);
        }
        int i = x.a[((j$.time.temporal.a) qVar).ordinal()];
        int i2 = this.c;
        z zVar = this.b;
        j$.time.f fVar = this.a;
        switch (i) {
            case 2:
                return i2 == 1 ? (fVar.Q() - zVar.b.Q()) + 1 : fVar.Q();
            case 3:
                return i2;
            case 4:
            case 5:
            case 6:
            case 7:
                throw new j$.time.temporal.t(j$.time.b.a("Unsupported field: ", qVar));
            case 8:
                return zVar.a;
            default:
                return fVar.w(qVar);
        }
    }

    @Override // j$.time.chrono.AbstractC3797d, j$.time.temporal.m
    /* renamed from: S, reason: merged with bridge method [inline-methods] */
    public final y d(long j, j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            j$.time.temporal.a aVar = (j$.time.temporal.a) qVar;
            if (w(aVar) == j) {
                return this;
            }
            int[] iArr = x.a;
            int i = iArr[aVar.ordinal()];
            j$.time.f fVar = this.a;
            if (i == 3 || i == 8 || i == 9) {
                int a = w.c.l(aVar).a(j, aVar);
                int i2 = iArr[aVar.ordinal()];
                if (i2 == 3) {
                    return U(this.b, a);
                }
                if (i2 == 8) {
                    return U(z.m(a), this.c);
                }
                if (i2 == 9) {
                    return T(fVar.d0(a));
                }
            }
            return T(fVar.d(j, qVar));
        }
        return (y) super.d(j, qVar);
    }

    @Override // j$.time.chrono.AbstractC3797d
    /* renamed from: R */
    public final InterfaceC3795b p(j$.time.temporal.o oVar) {
        return (y) super.p(oVar);
    }

    @Override // j$.time.chrono.AbstractC3797d, j$.time.temporal.m
    public final j$.time.temporal.m p(j$.time.f fVar) {
        return (y) super.p(fVar);
    }

    public final y U(z zVar, int i) {
        w.c.getClass();
        if (zVar == null) {
            throw new ClassCastException("Era must be JapaneseEra");
        }
        int i2 = zVar.b.a;
        int i3 = (i2 + i) - 1;
        if (i != 1 && (i3 < -999999999 || i3 > 999999999 || i3 < i2 || zVar != z.i(j$.time.f.T(i3, 1, 1)))) {
            throw new j$.time.a("Invalid yearOfEra value");
        }
        return T(this.a.d0(i3));
    }

    @Override // j$.time.chrono.AbstractC3797d
    public final InterfaceC3795b Q(long j) {
        return T(this.a.Y(j));
    }

    @Override // j$.time.chrono.AbstractC3797d
    public final InterfaceC3795b P(long j) {
        return T(this.a.X(j));
    }

    @Override // j$.time.chrono.AbstractC3797d
    public final InterfaceC3795b O(long j) {
        return T(this.a.W(j));
    }

    @Override // j$.time.chrono.AbstractC3797d, j$.time.chrono.InterfaceC3795b, j$.time.temporal.m
    public final InterfaceC3795b e(long j, j$.time.temporal.s sVar) {
        return (y) super.e(j, sVar);
    }

    @Override // j$.time.chrono.AbstractC3797d, j$.time.temporal.m
    public final j$.time.temporal.m e(long j, j$.time.temporal.s sVar) {
        return (y) super.e(j, sVar);
    }

    @Override // j$.time.chrono.AbstractC3797d
    /* renamed from: N */
    public final InterfaceC3795b j(long j, j$.time.temporal.s sVar) {
        return (y) super.j(j, sVar);
    }

    @Override // j$.time.chrono.AbstractC3797d, j$.time.temporal.m
    public final j$.time.temporal.m j(long j, j$.time.temporal.b bVar) {
        return (y) super.j(j, bVar);
    }

    public final y T(j$.time.f fVar) {
        return fVar.equals(this.a) ? this : new y(fVar);
    }

    @Override // j$.time.chrono.AbstractC3797d, j$.time.chrono.InterfaceC3795b
    public final long x() {
        return this.a.x();
    }

    @Override // j$.time.chrono.AbstractC3797d
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof y) {
            return this.a.equals(((y) obj).a);
        }
        return false;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new F((byte) 4, this);
    }
}
