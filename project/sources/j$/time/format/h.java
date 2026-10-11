package j$.time.format;

import okhttp3.internal.connection.RealConnection;

/* loaded from: classes2.dex */
public class h implements e {
    public static final long[] f = {0, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000, 1000000000, RealConnection.IDLE_CONNECTION_HEALTHY_NS};
    public final Enum a;
    public final int b;
    public final int c;
    public final s d;
    public final int e;

    /* JADX WARN: Multi-variable type inference failed */
    public h(j$.time.temporal.q qVar, int i, int i2, s sVar) {
        this.a = (Enum) qVar;
        this.b = i;
        this.c = i2;
        this.d = sVar;
        this.e = 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public h(j$.time.temporal.q qVar, int i, int i2, s sVar, int i3) {
        this.a = (Enum) qVar;
        this.b = i;
        this.c = i2;
        this.d = sVar;
        this.e = i3;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [j$.time.temporal.q, java.lang.Enum] */
    public h a() {
        return this.e == -1 ? this : new h(this.a, this.b, this.c, this.d, -1);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [j$.time.temporal.q, java.lang.Enum] */
    public h b(int i) {
        int i2 = this.e + i;
        return new h(this.a, this.b, this.c, this.d, i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [j$.time.temporal.q, java.lang.Enum, java.lang.Object] */
    @Override // j$.time.format.e
    public boolean j(o oVar, StringBuilder sb) {
        ?? r0 = this.a;
        Long a = oVar.a(r0);
        if (a == null) {
            return false;
        }
        long longValue = a.longValue();
        q qVar = oVar.b.c;
        String l = longValue == Long.MIN_VALUE ? "9223372036854775808" : Long.toString(Math.abs(longValue));
        int length = l.length();
        int i = this.c;
        if (length > i) {
            throw new j$.time.a("Field " + ((Object) r0) + " cannot be printed as the value " + longValue + " exceeds the maximum print width of " + i);
        }
        qVar.getClass();
        int i2 = this.b;
        s sVar = this.d;
        if (longValue >= 0) {
            int i3 = b.a[sVar.ordinal()];
            if (i3 != 1) {
                if (i3 == 2) {
                    sb.append('+');
                }
            } else if (i2 < 19 && longValue >= f[i2]) {
                sb.append('+');
            }
        } else {
            int i4 = b.a[sVar.ordinal()];
            if (i4 == 1 || i4 == 2 || i4 == 3) {
                sb.append('-');
            } else if (i4 == 4) {
                throw new j$.time.a("Field " + ((Object) r0) + " cannot be printed as the value " + longValue + " cannot be negative according to the SignStyle");
            }
        }
        for (int i5 = 0; i5 < i2 - l.length(); i5++) {
            sb.append('0');
        }
        sb.append(l);
        return true;
    }

    public String toString() {
        Enum r0 = this.a;
        int i = this.c;
        s sVar = this.d;
        int i2 = this.b;
        if (i2 == 1 && i == 19 && sVar == s.NORMAL) {
            return "Value(" + r0 + ")";
        }
        if (i2 == i && sVar == s.NOT_NEGATIVE) {
            return "Value(" + r0 + "," + i2 + ")";
        }
        return "Value(" + r0 + "," + i2 + "," + i + "," + sVar + ")";
    }
}
