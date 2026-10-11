package j$.time.chrono;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import okhttp3.internal.http2.Http2Connection;

/* loaded from: classes2.dex */
public final class w extends AbstractC3794a implements Serializable {
    public static final w c = new w();
    private static final long serialVersionUID = 459996390165777884L;

    @Override // j$.time.chrono.m
    public final String i() {
        return "Japanese";
    }

    @Override // j$.time.chrono.m
    public final String v() {
        return "japanese";
    }

    @Override // j$.time.chrono.m
    public final InterfaceC3795b m(j$.time.temporal.n nVar) {
        if (nVar instanceof y) {
            return (y) nVar;
        }
        return new y(j$.time.f.N(nVar));
    }

    private w() {
    }

    @Override // j$.time.chrono.m
    public final n H(int i) {
        return z.m(i);
    }

    public final j$.time.temporal.u l(j$.time.temporal.a aVar) {
        switch (v.a[aVar.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
                throw new j$.time.temporal.t("Unsupported field: " + aVar);
            case 5:
                z[] zVarArr = z.e;
                j$.time.f fVar = zVarArr[zVarArr.length - 1].b;
                int i = Http2Connection.DEGRADED_PONG_TIMEOUT_NS - zVarArr[zVarArr.length - 1].b.a;
                int i2 = zVarArr[0].b.a;
                int i3 = 1;
                while (i3 < zVarArr.length) {
                    z zVar = zVarArr[i3];
                    i = Math.min(i, (zVar.b.a - i2) + 1);
                    i3++;
                    i2 = zVar.b.a;
                }
                return j$.time.temporal.u.f(i, 999999999 - fVar.a);
            case 6:
                z zVar2 = z.d;
                j$.time.temporal.u uVar = j$.time.temporal.a.DAY_OF_YEAR.b;
                z[] zVarArr2 = z.e;
                long j = uVar.c;
                for (z zVar3 : zVarArr2) {
                    j = Math.min(j, ((zVar3.b.R() ? 366 : 365) - zVar3.b.Q()) + 1);
                    if (zVar3.k() != null) {
                        j = Math.min(j, zVar3.k().b.Q() - 1);
                    }
                }
                return j$.time.temporal.u.f(j, j$.time.temporal.a.DAY_OF_YEAR.b.d);
            case 7:
                return j$.time.temporal.u.e(y.d.a, 999999999L);
            case 8:
                long j2 = z.d.a;
                z[] zVarArr3 = z.e;
                return j$.time.temporal.u.e(j2, zVarArr3[zVarArr3.length - 1].a);
            default:
                return aVar.b;
        }
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public Object writeReplace() {
        return new F((byte) 1, this);
    }
}
