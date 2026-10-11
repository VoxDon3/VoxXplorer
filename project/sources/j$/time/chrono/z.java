package j$.time.chrono;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* loaded from: classes2.dex */
public final class z implements n, Serializable {
    public static final z d;
    public static final z[] e;
    private static final long serialVersionUID = 1466499369062886794L;
    public final transient int a;
    public final transient j$.time.f b;
    public final transient String c;

    @Override // j$.time.temporal.n
    public final /* synthetic */ Object J(j$.desugar.sun.nio.fs.m mVar) {
        return j$.com.android.tools.r8.a.s(this, mVar);
    }

    @Override // j$.time.temporal.n
    public final /* synthetic */ boolean f(j$.time.temporal.q qVar) {
        return j$.com.android.tools.r8.a.o(this, qVar);
    }

    @Override // j$.time.temporal.n
    public final /* synthetic */ int l(j$.time.temporal.q qVar) {
        return j$.com.android.tools.r8.a.j(this, (j$.time.temporal.a) qVar);
    }

    @Override // j$.time.temporal.n
    public final /* synthetic */ long w(j$.time.temporal.q qVar) {
        return j$.com.android.tools.r8.a.l(this, qVar);
    }

    static {
        z zVar = new z(-1, j$.time.f.T(1868, 1, 1), "Meiji");
        d = zVar;
        e = new z[]{zVar, new z(0, j$.time.f.T(1912, 7, 30), "Taisho"), new z(1, j$.time.f.T(1926, 12, 25), "Showa"), new z(2, j$.time.f.T(1989, 1, 8), "Heisei"), new z(3, j$.time.f.T(2019, 5, 1), "Reiwa")};
    }

    public final z k() {
        if (this == e[r0.length - 1]) {
            return null;
        }
        return m(this.a + 1);
    }

    public z(int i, j$.time.f fVar, String str) {
        this.a = i;
        this.b = fVar;
        this.c = str;
    }

    public static z m(int i) {
        int i2 = i + 1;
        if (i2 >= 0) {
            z[] zVarArr = e;
            if (i2 < zVarArr.length) {
                return zVarArr[i2];
            }
        }
        throw new j$.time.a("Invalid era: " + i);
    }

    @Override // j$.time.temporal.o
    public final j$.time.temporal.m B(j$.time.temporal.m mVar) {
        return mVar.d(getValue(), j$.time.temporal.a.ERA);
    }

    public static z i(j$.time.f fVar) {
        j$.time.f fVar2 = y.d;
        if (!j$.time.b.b(fVar2) ? fVar.x() >= fVar2.x() : fVar.L(fVar2) >= 0) {
            throw new j$.time.a("JapaneseDate before Meiji 6 are not supported");
        }
        z[] zVarArr = e;
        for (int length = zVarArr.length - 1; length >= 0; length--) {
            z zVar = zVarArr[length];
            if (fVar.compareTo(zVar.b) >= 0) {
                return zVar;
            }
        }
        return null;
    }

    @Override // j$.time.chrono.n
    public final int getValue() {
        return this.a;
    }

    @Override // j$.time.temporal.n
    public final j$.time.temporal.u q(j$.time.temporal.q qVar) {
        j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
        if (qVar != aVar) {
            return j$.time.temporal.r.d(this, qVar);
        }
        return w.c.l(aVar);
    }

    public final String toString() {
        return this.c;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new F((byte) 5, this);
    }
}
