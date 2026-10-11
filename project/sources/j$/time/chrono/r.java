package j$.time.chrono;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class r extends AbstractC3797d {
    private static final long serialVersionUID = -5207853542612002020L;
    public final transient p a;
    public final transient int b;
    public final transient int c;
    public final transient int d;

    @Override // j$.time.chrono.AbstractC3797d, j$.time.chrono.InterfaceC3795b
    public final InterfaceC3798e z(j$.time.i iVar) {
        return new C3800g(this, iVar);
    }

    public r(p pVar, int i, int i2, int i3) {
        pVar.q(i, i2, i3);
        this.a = pVar;
        this.b = i;
        this.c = i2;
        this.d = i3;
    }

    public r(p pVar, long j) {
        int i = (int) j;
        pVar.l();
        if (i < pVar.e || i >= pVar.f) {
            throw new j$.time.a("Hijrah date out of range");
        }
        int binarySearch = Arrays.binarySearch(pVar.d, i);
        binarySearch = binarySearch < 0 ? (-binarySearch) - 2 : binarySearch;
        int i2 = pVar.g;
        int[] iArr = {(binarySearch + i2) / 12, ((i2 + binarySearch) % 12) + 1, (i - pVar.d[binarySearch]) + 1};
        this.a = pVar;
        this.b = iArr[0];
        this.c = iArr[1];
        this.d = iArr[2];
    }

    @Override // j$.time.chrono.InterfaceC3795b
    public final m a() {
        return this.a;
    }

    @Override // j$.time.chrono.AbstractC3797d
    public final n M() {
        return s.AH;
    }

    @Override // j$.time.chrono.AbstractC3797d, j$.time.chrono.InterfaceC3795b
    public final int hashCode() {
        this.a.getClass();
        int i = this.b;
        return (((i << 11) + (this.c << 6)) + this.d) ^ ((i & (-2048)) ^ 2100100019);
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
        int i = q.a[aVar.ordinal()];
        int i2 = this.b;
        return i != 1 ? i != 2 ? i != 3 ? this.a.J(aVar) : j$.time.temporal.u.e(1L, 5L) : j$.time.temporal.u.e(1L, r3.L(i2, 12)) : j$.time.temporal.u.e(1L, r3.w(i2, this.c));
    }

    @Override // j$.time.temporal.n
    public final long w(j$.time.temporal.q qVar) {
        if (!(qVar instanceof j$.time.temporal.a)) {
            return qVar.l(this);
        }
        int i = q.a[((j$.time.temporal.a) qVar).ordinal()];
        int i2 = this.c;
        int i3 = this.d;
        int i4 = this.b;
        switch (i) {
            case 1:
                return i3;
            case 2:
                return S();
            case 3:
                return ((i3 - 1) / 7) + 1;
            case 4:
                return ((int) j$.com.android.tools.r8.a.W(x() + 3, 7)) + 1;
            case 5:
                return ((i3 - 1) % 7) + 1;
            case 6:
                return ((S() - 1) % 7) + 1;
            case 7:
                return x();
            case 8:
                return ((S() - 1) / 7) + 1;
            case 9:
                return i2;
            case 10:
                return ((i4 * 12) + i2) - 1;
            case 11:
                return i4;
            case 12:
                return i4;
            case 13:
                return i4 <= 1 ? 0 : 1;
            default:
                throw new j$.time.temporal.t(j$.time.b.a("Unsupported field: ", qVar));
        }
    }

    @Override // j$.time.chrono.AbstractC3797d, j$.time.temporal.m
    /* renamed from: W, reason: merged with bridge method [inline-methods] */
    public final r d(long j, j$.time.temporal.q qVar) {
        if (!(qVar instanceof j$.time.temporal.a)) {
            return (r) super.d(j, qVar);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) qVar;
        p pVar = this.a;
        pVar.J(aVar).b(j, aVar);
        int i = (int) j;
        int i2 = q.a[aVar.ordinal()];
        int i3 = this.d;
        int i4 = this.c;
        int i5 = this.b;
        switch (i2) {
            case 1:
                return V(i5, i4, i);
            case 2:
                return O(Math.min(i, pVar.L(i5, 12)) - S());
            case 3:
                return O((j - w(j$.time.temporal.a.ALIGNED_WEEK_OF_MONTH)) * 7);
            case 4:
                return O(j - (((int) j$.com.android.tools.r8.a.W(x() + 3, 7)) + 1));
            case 5:
                return O(j - w(j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_MONTH));
            case 6:
                return O(j - w(j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_YEAR));
            case 7:
                return new r(pVar, j);
            case 8:
                return O((j - w(j$.time.temporal.a.ALIGNED_WEEK_OF_YEAR)) * 7);
            case 9:
                return V(i5, i, i3);
            case 10:
                return P(j - (((i5 * 12) + i4) - 1));
            case 11:
                if (i5 < 1) {
                    i = 1 - i;
                }
                return V(i, i4, i3);
            case 12:
                return V(i, i4, i3);
            case 13:
                return V(1 - i5, i4, i3);
            default:
                throw new j$.time.temporal.t(j$.time.b.a("Unsupported field: ", qVar));
        }
    }

    public final r V(int i, int i2, int i3) {
        p pVar = this.a;
        int w = pVar.w(i, i2);
        if (i3 > w) {
            i3 = w;
        }
        return new r(pVar, i, i2, i3);
    }

    @Override // j$.time.chrono.AbstractC3797d
    /* renamed from: R */
    public final InterfaceC3795b p(j$.time.temporal.o oVar) {
        return (r) super.p(oVar);
    }

    @Override // j$.time.chrono.AbstractC3797d, j$.time.temporal.m
    public final j$.time.temporal.m p(j$.time.f fVar) {
        return (r) super.p(fVar);
    }

    @Override // j$.time.chrono.AbstractC3797d, j$.time.chrono.InterfaceC3795b
    public final long x() {
        return this.a.q(this.b, this.c, this.d);
    }

    @Override // j$.time.chrono.AbstractC3797d
    public final InterfaceC3795b Q(long j) {
        if (j == 0) {
            return this;
        }
        long j2 = this.b + ((int) j);
        int i = (int) j2;
        if (j2 == i) {
            return V(i, this.c, this.d);
        }
        throw new ArithmeticException();
    }

    @Override // j$.time.chrono.AbstractC3797d
    /* renamed from: U, reason: merged with bridge method [inline-methods] */
    public final r P(long j) {
        if (j == 0) {
            return this;
        }
        long j2 = (this.b * 12) + (this.c - 1) + j;
        long N = j$.com.android.tools.r8.a.N(j2, 12L);
        int i = this.a.g;
        if (N >= i / 12 && N <= (((r4.d.length - 1) + i) / 12) - 1) {
            return V((int) N, ((int) j$.com.android.tools.r8.a.W(j2, 12L)) + 1, this.d);
        }
        throw new j$.time.a("Invalid Hijrah year: " + N);
    }

    @Override // j$.time.chrono.AbstractC3797d
    /* renamed from: T, reason: merged with bridge method [inline-methods] */
    public final r O(long j) {
        return new r(this.a, x() + j);
    }

    @Override // j$.time.chrono.AbstractC3797d, j$.time.chrono.InterfaceC3795b, j$.time.temporal.m
    public final InterfaceC3795b e(long j, j$.time.temporal.s sVar) {
        return (r) super.e(j, sVar);
    }

    @Override // j$.time.chrono.AbstractC3797d, j$.time.temporal.m
    public final j$.time.temporal.m e(long j, j$.time.temporal.s sVar) {
        return (r) super.e(j, sVar);
    }

    @Override // j$.time.chrono.AbstractC3797d
    /* renamed from: N */
    public final InterfaceC3795b j(long j, j$.time.temporal.s sVar) {
        return (r) super.j(j, sVar);
    }

    @Override // j$.time.chrono.AbstractC3797d, j$.time.temporal.m
    public final j$.time.temporal.m j(long j, j$.time.temporal.b bVar) {
        return (r) super.j(j, bVar);
    }

    public final int S() {
        return this.a.L(this.b, this.c - 1) + this.d;
    }

    @Override // j$.time.chrono.AbstractC3797d
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof r) {
            r rVar = (r) obj;
            if (this.b == rVar.b && this.c == rVar.c && this.d == rVar.d && this.a.equals(rVar.a)) {
                return true;
            }
        }
        return false;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new F((byte) 6, this);
    }
}
