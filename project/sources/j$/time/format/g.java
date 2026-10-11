package j$.time.format;

import j$.time.LocalDateTime;
import j$.time.ZoneOffset;
import j$.time.v;

/* loaded from: classes2.dex */
public final class g implements e {
    public final /* synthetic */ int a;

    public /* synthetic */ g(int i) {
        this.a = i;
    }

    @Override // j$.time.format.e
    public final boolean j(o oVar, StringBuilder sb) {
        switch (this.a) {
            case 0:
                Long a = oVar.a(j$.time.temporal.a.INSTANT_SECONDS);
                j$.time.temporal.a aVar = j$.time.temporal.a.NANO_OF_SECOND;
                j$.time.temporal.n nVar = oVar.a;
                Long valueOf = nVar.f(aVar) ? Long.valueOf(nVar.w(aVar)) : null;
                int i = 0;
                if (a == null) {
                    return false;
                }
                long longValue = a.longValue();
                int a2 = aVar.b.a(valueOf != null ? valueOf.longValue() : 0L, aVar);
                if (longValue >= -62167219200L) {
                    long j = longValue - 253402300800L;
                    long N = j$.com.android.tools.r8.a.N(j, 315569520000L) + 1;
                    LocalDateTime P = LocalDateTime.P(j$.com.android.tools.r8.a.W(j, 315569520000L) - 62167219200L, 0, ZoneOffset.UTC);
                    if (N > 0) {
                        sb.append('+');
                        sb.append(N);
                    }
                    sb.append(P);
                    if (P.b.c == 0) {
                        sb.append(":00");
                    }
                } else {
                    long j2 = longValue + 62167219200L;
                    long j3 = j2 / 315569520000L;
                    long j4 = j2 % 315569520000L;
                    LocalDateTime P2 = LocalDateTime.P(j4 - 62167219200L, 0, ZoneOffset.UTC);
                    int length = sb.length();
                    sb.append(P2);
                    if (P2.b.c == 0) {
                        sb.append(":00");
                    }
                    if (j3 < 0) {
                        if (P2.a.a == -10000) {
                            sb.replace(length, length + 2, Long.toString(j3 - 1));
                        } else if (j4 == 0) {
                            sb.insert(length, j3);
                        } else {
                            sb.insert(length + 1, Math.abs(j3));
                        }
                    }
                }
                if (a2 > 0) {
                    sb.append('.');
                    int i2 = 100000000;
                    while (true) {
                        if (a2 > 0 || i % 3 != 0 || i < -2) {
                            int i3 = a2 / i2;
                            sb.append((char) (i3 + 48));
                            a2 -= i3 * i2;
                            i2 /= 10;
                            i++;
                        }
                    }
                }
                sb.append('Z');
                return true;
            default:
                j$.desugar.sun.nio.fs.m mVar = m.f;
                j$.time.temporal.n nVar2 = oVar.a;
                Object J = nVar2.J(mVar);
                if (J == null && oVar.c == 0) {
                    throw new j$.time.a("Unable to extract " + mVar + " from temporal " + nVar2);
                }
                v vVar = (v) J;
                if (vVar == null) {
                    return false;
                }
                sb.append(vVar.i());
                return true;
        }
    }

    public final String toString() {
        switch (this.a) {
            case 0:
                return "Instant()";
            default:
                return "ZoneRegionId()";
        }
    }
}
