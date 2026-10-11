package j$.time.chrono;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.HashMap;

/* loaded from: classes2.dex */
public final class H extends AbstractC3794a implements Serializable {
    public static final H c = new H();
    private static final long serialVersionUID = 2775954514031616474L;

    static {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        HashMap hashMap3 = new HashMap();
        hashMap.put("en", new String[]{"BB", "BE"});
        hashMap.put("th", new String[]{"BB", "BE"});
        hashMap2.put("en", new String[]{"B.B.", "B.E."});
        hashMap2.put("th", new String[]{"พ.ศ.", "ปีก่อนคริสต์กาลที่"});
        hashMap3.put("en", new String[]{"Before Buddhist", "Budhhist Era"});
        hashMap3.put("th", new String[]{"พุทธศักราช", "ปีก่อนคริสต์กาลที่"});
    }

    @Override // j$.time.chrono.m
    public final n H(int i) {
        if (i == 0) {
            return K.BEFORE_BE;
        }
        if (i == 1) {
            return K.BE;
        }
        throw new j$.time.a("Invalid era: " + i);
    }

    @Override // j$.time.chrono.m
    public final String i() {
        return "ThaiBuddhist";
    }

    @Override // j$.time.chrono.m
    public final String v() {
        return "buddhist";
    }

    @Override // j$.time.chrono.m
    public final InterfaceC3795b m(j$.time.temporal.n nVar) {
        if (nVar instanceof J) {
            return (J) nVar;
        }
        return new J(j$.time.f.N(nVar));
    }

    private H() {
    }

    public final j$.time.temporal.u l(j$.time.temporal.a aVar) {
        int i = G.a[aVar.ordinal()];
        if (i == 1) {
            j$.time.temporal.u uVar = j$.time.temporal.a.PROLEPTIC_MONTH.b;
            return j$.time.temporal.u.e(uVar.a + 6516, uVar.d + 6516);
        }
        if (i == 2) {
            j$.time.temporal.u uVar2 = j$.time.temporal.a.YEAR.b;
            return j$.time.temporal.u.f((-(uVar2.a + 543)) + 1, uVar2.d + 543);
        }
        if (i != 3) {
            return aVar.b;
        }
        j$.time.temporal.u uVar3 = j$.time.temporal.a.YEAR.b;
        return j$.time.temporal.u.e(uVar3.a + 543, uVar3.d + 543);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public Object writeReplace() {
        return new F((byte) 1, this);
    }
}
