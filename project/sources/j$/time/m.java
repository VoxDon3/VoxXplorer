package j$.time;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Locale;
import okhttp3.HttpUrl;

/* loaded from: classes2.dex */
public final class m implements j$.time.temporal.n, j$.time.temporal.o, Comparable, Serializable {
    public static final /* synthetic */ int c = 0;
    private static final long serialVersionUID = -939150713474957432L;
    public final int a;
    public final int b;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        m mVar = (m) obj;
        int i = this.a - mVar.a;
        return i == 0 ? this.b - mVar.b : i;
    }

    static {
        j$.time.format.m mVar = new j$.time.format.m();
        mVar.d("--");
        mVar.g(j$.time.temporal.a.MONTH_OF_YEAR, 2);
        mVar.c('-');
        mVar.g(j$.time.temporal.a.DAY_OF_MONTH, 2);
        mVar.l(Locale.getDefault(), j$.time.format.r.SMART, null);
    }

    public m(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // j$.time.temporal.n
    public final boolean f(j$.time.temporal.q qVar) {
        return qVar instanceof j$.time.temporal.a ? qVar == j$.time.temporal.a.MONTH_OF_YEAR || qVar == j$.time.temporal.a.DAY_OF_MONTH : qVar != null && qVar.p(this);
    }

    @Override // j$.time.temporal.n
    public final j$.time.temporal.u q(j$.time.temporal.q qVar) {
        if (qVar == j$.time.temporal.a.MONTH_OF_YEAR) {
            return qVar.j();
        }
        if (qVar != j$.time.temporal.a.DAY_OF_MONTH) {
            return j$.time.temporal.r.d(this, qVar);
        }
        k O = k.O(this.a);
        O.getClass();
        int i = j.a[O.ordinal()];
        return j$.time.temporal.u.f(i != 1 ? (i == 2 || i == 3 || i == 4 || i == 5) ? 30 : 31 : 28, k.O(r5).N());
    }

    @Override // j$.time.temporal.n
    public final int l(j$.time.temporal.q qVar) {
        return q(qVar).a(w(qVar), qVar);
    }

    @Override // j$.time.temporal.n
    public final long w(j$.time.temporal.q qVar) {
        int i;
        if (!(qVar instanceof j$.time.temporal.a)) {
            return qVar.l(this);
        }
        int i2 = l.a[((j$.time.temporal.a) qVar).ordinal()];
        if (i2 == 1) {
            i = this.b;
        } else {
            if (i2 != 2) {
                throw new j$.time.temporal.t(b.a("Unsupported field: ", qVar));
            }
            i = this.a;
        }
        return i;
    }

    @Override // j$.time.temporal.n
    public final Object J(j$.desugar.sun.nio.fs.m mVar) {
        if (mVar == j$.time.temporal.r.b) {
            return j$.time.chrono.t.c;
        }
        return j$.time.temporal.r.c(this, mVar);
    }

    @Override // j$.time.temporal.o
    public final j$.time.temporal.m B(j$.time.temporal.m mVar) {
        if (!j$.com.android.tools.r8.a.K(mVar).equals(j$.time.chrono.t.c)) {
            throw new a("Adjustment only supported on ISO date-time");
        }
        j$.time.temporal.m d = mVar.d(this.a, j$.time.temporal.a.MONTH_OF_YEAR);
        j$.time.temporal.a aVar = j$.time.temporal.a.DAY_OF_MONTH;
        return d.d(Math.min(d.q(aVar).d, this.b), aVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof m) {
            m mVar = (m) obj;
            if (this.a == mVar.a && this.b == mVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a << 6) + this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(10);
        sb.append("--");
        int i = this.a;
        sb.append(i < 10 ? "0" : HttpUrl.FRAGMENT_ENCODE_SET);
        sb.append(i);
        int i2 = this.b;
        sb.append(i2 < 10 ? "-0" : "-");
        sb.append(i2);
        return sb.toString();
    }

    private Object writeReplace() {
        return new q((byte) 13, this);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }
}
