package j$.time.chrono;

import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;

/* loaded from: classes2.dex */
public final class D extends AbstractC3797d {
    private static final long serialVersionUID = 1300372329181994526L;
    public final transient j$.time.f a;

    @Override // j$.time.chrono.AbstractC3797d, j$.time.chrono.InterfaceC3795b
    public final InterfaceC3798e z(j$.time.i iVar) {
        return new C3800g(this, iVar);
    }

    public D(j$.time.f fVar) {
        Objects.requireNonNull(fVar, "isoDate");
        this.a = fVar;
    }

    @Override // j$.time.chrono.InterfaceC3795b
    public final m a() {
        return B.c;
    }

    @Override // j$.time.chrono.AbstractC3797d, j$.time.chrono.InterfaceC3795b
    public final int hashCode() {
        B.c.getClass();
        return this.a.hashCode() ^ (-1990173233);
    }

    @Override // j$.time.chrono.AbstractC3797d
    public final n M() {
        return S() >= 1 ? E.ROC : E.BEFORE_ROC;
    }

    @Override // j$.time.chrono.AbstractC3797d, j$.time.temporal.n
    public final j$.time.temporal.u q(j$.time.temporal.q qVar) {
        if (!(qVar instanceof j$.time.temporal.a)) {
            return qVar.w(this);
        }
        if (!j$.com.android.tools.r8.a.n(this, qVar)) {
            throw new j$.time.temporal.t(j$.time.b.a("Unsupported field: ", qVar));
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) qVar;
        int i = C.a[aVar.ordinal()];
        if (i == 1 || i == 2 || i == 3) {
            return this.a.q(qVar);
        }
        if (i != 4) {
            return B.c.l(aVar);
        }
        j$.time.temporal.u uVar = j$.time.temporal.a.YEAR.b;
        return j$.time.temporal.u.e(1L, S() <= 0 ? (-uVar.a) + 1912 : uVar.d - 1911);
    }

    @Override // j$.time.temporal.n
    public final long w(j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            int i = C.a[((j$.time.temporal.a) qVar).ordinal()];
            if (i == 4) {
                int S = S();
                if (S < 1) {
                    S = 1 - S;
                }
                return S;
            }
            j$.time.f fVar = this.a;
            if (i == 5) {
                return ((S() * 12) + fVar.b) - 1;
            }
            if (i == 6) {
                return S();
            }
            if (i != 7) {
                return fVar.w(qVar);
            }
            return S() < 1 ? 0 : 1;
        }
        return qVar.l(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0024, code lost:
    
        if (r2 != 7) goto L20;
     */
    @Override // j$.time.chrono.AbstractC3797d, j$.time.temporal.m
    /* renamed from: T, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final j$.time.chrono.D d(long r9, j$.time.temporal.q r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof j$.time.temporal.a
            if (r0 == 0) goto L98
            r0 = r11
            j$.time.temporal.a r0 = (j$.time.temporal.a) r0
            long r1 = r8.w(r0)
            int r3 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r3 != 0) goto L10
            return r8
        L10:
            int[] r1 = j$.time.chrono.C.a
            int r2 = r0.ordinal()
            r2 = r1[r2]
            j$.time.f r3 = r8.a
            r4 = 7
            r5 = 6
            r6 = 4
            if (r2 == r6) goto L4a
            r7 = 5
            if (r2 == r7) goto L27
            if (r2 == r5) goto L4a
            if (r2 == r4) goto L4a
            goto L60
        L27:
            j$.time.chrono.B r11 = j$.time.chrono.B.c
            j$.time.temporal.u r11 = r11.l(r0)
            r11.b(r9, r0)
            int r11 = r8.S()
            long r0 = (long) r11
            r4 = 12
            long r0 = r0 * r4
            short r11 = r3.b
            long r4 = (long) r11
            long r0 = r0 + r4
            r4 = 1
            long r0 = r0 - r4
            long r9 = r9 - r0
            j$.time.f r9 = r3.X(r9)
            j$.time.chrono.D r9 = r8.U(r9)
            return r9
        L4a:
            j$.time.chrono.B r2 = j$.time.chrono.B.c
            j$.time.temporal.u r2 = r2.l(r0)
            int r2 = r2.a(r9, r0)
            int r0 = r0.ordinal()
            r0 = r1[r0]
            if (r0 == r6) goto L83
            if (r0 == r5) goto L78
            if (r0 == r4) goto L69
        L60:
            j$.time.f r9 = r3.d(r9, r11)
            j$.time.chrono.D r9 = r8.U(r9)
            return r9
        L69:
            int r9 = r8.S()
            int r9 = 1912 - r9
            j$.time.f r9 = r3.d0(r9)
            j$.time.chrono.D r9 = r8.U(r9)
            return r9
        L78:
            int r2 = r2 + 1911
            j$.time.f r9 = r3.d0(r2)
            j$.time.chrono.D r9 = r8.U(r9)
            return r9
        L83:
            int r9 = r8.S()
            r10 = 1
            if (r9 < r10) goto L8d
            int r2 = r2 + 1911
            goto L8f
        L8d:
            int r2 = 1912 - r2
        L8f:
            j$.time.f r9 = r3.d0(r2)
            j$.time.chrono.D r9 = r8.U(r9)
            return r9
        L98:
            j$.time.chrono.b r9 = super.d(r9, r11)
            j$.time.chrono.D r9 = (j$.time.chrono.D) r9
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.chrono.D.d(long, j$.time.temporal.q):j$.time.chrono.D");
    }

    @Override // j$.time.chrono.AbstractC3797d
    /* renamed from: R */
    public final InterfaceC3795b p(j$.time.temporal.o oVar) {
        return (D) super.p(oVar);
    }

    @Override // j$.time.chrono.AbstractC3797d, j$.time.temporal.m
    public final j$.time.temporal.m p(j$.time.f fVar) {
        return (D) super.p(fVar);
    }

    @Override // j$.time.chrono.AbstractC3797d
    public final InterfaceC3795b Q(long j) {
        return U(this.a.Y(j));
    }

    @Override // j$.time.chrono.AbstractC3797d
    public final InterfaceC3795b P(long j) {
        return U(this.a.X(j));
    }

    @Override // j$.time.chrono.AbstractC3797d
    public final InterfaceC3795b O(long j) {
        return U(this.a.W(j));
    }

    @Override // j$.time.chrono.AbstractC3797d, j$.time.chrono.InterfaceC3795b, j$.time.temporal.m
    public final InterfaceC3795b e(long j, j$.time.temporal.s sVar) {
        return (D) super.e(j, sVar);
    }

    @Override // j$.time.chrono.AbstractC3797d, j$.time.temporal.m
    public final j$.time.temporal.m e(long j, j$.time.temporal.s sVar) {
        return (D) super.e(j, sVar);
    }

    @Override // j$.time.chrono.AbstractC3797d
    /* renamed from: N */
    public final InterfaceC3795b j(long j, j$.time.temporal.s sVar) {
        return (D) super.j(j, sVar);
    }

    @Override // j$.time.chrono.AbstractC3797d, j$.time.temporal.m
    public final j$.time.temporal.m j(long j, j$.time.temporal.b bVar) {
        return (D) super.j(j, bVar);
    }

    public final D U(j$.time.f fVar) {
        return fVar.equals(this.a) ? this : new D(fVar);
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
        if (obj instanceof D) {
            return this.a.equals(((D) obj).a);
        }
        return false;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new F((byte) 7, this);
    }

    public final int S() {
        return this.a.a - 1911;
    }
}
