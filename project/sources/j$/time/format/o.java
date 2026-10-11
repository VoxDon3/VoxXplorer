package j$.time.format;

import j$.time.chrono.InterfaceC3795b;
import j$.time.v;
import j$.util.Objects;

/* loaded from: classes2.dex */
public final class o {
    public final j$.time.temporal.n a;
    public final DateTimeFormatter b;
    public int c;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [j$.time.chrono.m, java.lang.Object] */
    public o(j$.time.temporal.n nVar, DateTimeFormatter dateTimeFormatter) {
        j$.time.chrono.t tVar = dateTimeFormatter.d;
        if (tVar != null) {
            ?? r1 = (j$.time.chrono.m) nVar.J(j$.time.temporal.r.b);
            v vVar = (v) nVar.J(j$.time.temporal.r.a);
            InterfaceC3795b interfaceC3795b = null;
            tVar = Objects.equals(tVar, r1) ? null : tVar;
            Objects.equals(null, vVar);
            if (tVar != null) {
                j$.time.chrono.t tVar2 = tVar != null ? tVar : r1;
                if (tVar != null) {
                    if (nVar.f(j$.time.temporal.a.EPOCH_DAY)) {
                        interfaceC3795b = tVar2.m(nVar);
                    } else if (tVar != j$.time.chrono.t.c || r1 != 0) {
                        for (j$.time.temporal.a aVar : j$.time.temporal.a.values()) {
                            if (aVar.B() && nVar.f(aVar)) {
                                throw new j$.time.a("Unable to apply override chronology '" + tVar + "' because the temporal object being formatted contains date fields but does not represent a whole date: " + nVar);
                            }
                        }
                    }
                }
                nVar = new n(interfaceC3795b, nVar, tVar2, vVar);
            }
        }
        this.a = nVar;
        this.b = dateTimeFormatter;
    }

    public final Long a(j$.time.temporal.q qVar) {
        int i = this.c;
        j$.time.temporal.n nVar = this.a;
        if (i <= 0 || nVar.f(qVar)) {
            return Long.valueOf(nVar.w(qVar));
        }
        return null;
    }

    public final String toString() {
        return this.a.toString();
    }
}
