package j$.time.chrono;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* loaded from: classes2.dex */
public final class B extends AbstractC3794a implements Serializable {
    public static final B c = new B();
    private static final long serialVersionUID = 1039765215346859963L;

    @Override // j$.time.chrono.m
    public final String i() {
        return "Minguo";
    }

    @Override // j$.time.chrono.m
    public final n H(int i) {
        if (i == 0) {
            return E.BEFORE_ROC;
        }
        if (i == 1) {
            return E.ROC;
        }
        throw new j$.time.a("Invalid era: " + i);
    }

    @Override // j$.time.chrono.m
    public final String v() {
        return "roc";
    }

    @Override // j$.time.chrono.m
    public final InterfaceC3795b m(j$.time.temporal.n nVar) {
        if (nVar instanceof D) {
            return (D) nVar;
        }
        return new D(j$.time.f.N(nVar));
    }

    public final j$.time.temporal.u l(j$.time.temporal.a aVar) {
        int i = A.a[aVar.ordinal()];
        if (i == 1) {
            j$.time.temporal.u uVar = j$.time.temporal.a.PROLEPTIC_MONTH.b;
            return j$.time.temporal.u.e(uVar.a - 22932, uVar.d - 22932);
        }
        if (i == 2) {
            j$.time.temporal.u uVar2 = j$.time.temporal.a.YEAR.b;
            return j$.time.temporal.u.f(uVar2.d - 1911, (-uVar2.a) + 1912);
        }
        if (i != 3) {
            return aVar.b;
        }
        j$.time.temporal.u uVar3 = j$.time.temporal.a.YEAR.b;
        return j$.time.temporal.u.e(uVar3.a - 1911, uVar3.d - 1911);
    }

    private B() {
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public Object writeReplace() {
        return new F((byte) 1, this);
    }
}
