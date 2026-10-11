package j$.time.format;

import j$.time.temporal.u;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import okhttp3.HttpUrl;

/* loaded from: classes2.dex */
public final class f extends h {
    public final boolean g;

    public f(j$.time.temporal.q qVar, int i, int i2, boolean z, int i3) {
        super(qVar, i, i2, s.NOT_NEGATIVE, i3);
        this.g = z;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [j$.time.temporal.q, java.lang.Enum] */
    @Override // j$.time.format.h
    public final h a() {
        if (this.e == -1) {
            return this;
        }
        return new f(this.a, this.b, this.c, this.g, -1);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [j$.time.temporal.q, java.lang.Enum] */
    @Override // j$.time.format.h
    public final h b(int i) {
        return new f(this.a, this.b, this.c, this.g, this.e + i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [j$.time.temporal.q, java.lang.Enum] */
    @Override // j$.time.format.h, j$.time.format.e
    public final boolean j(o oVar, StringBuilder sb) {
        ?? r0 = this.a;
        Long a = oVar.a(r0);
        if (a == null) {
            return false;
        }
        q qVar = oVar.b.c;
        long longValue = a.longValue();
        u j = r0.j();
        j.b(longValue, r0);
        BigDecimal valueOf = BigDecimal.valueOf(j.a);
        BigDecimal add = BigDecimal.valueOf(j.d).subtract(valueOf).add(BigDecimal.ONE);
        BigDecimal subtract = BigDecimal.valueOf(longValue).subtract(valueOf);
        RoundingMode roundingMode = RoundingMode.FLOOR;
        BigDecimal divide = subtract.divide(add, 9, roundingMode);
        BigDecimal bigDecimal = BigDecimal.ZERO;
        if (divide.compareTo(bigDecimal) != 0) {
            bigDecimal = divide.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : divide.stripTrailingZeros();
        }
        int scale = bigDecimal.scale();
        boolean z = this.g;
        int i = this.b;
        if (scale != 0) {
            String substring = bigDecimal.setScale(Math.min(Math.max(bigDecimal.scale(), i), this.c), roundingMode).toPlainString().substring(2);
            qVar.getClass();
            if (z) {
                sb.append('.');
            }
            sb.append(substring);
            return true;
        }
        if (i <= 0) {
            return true;
        }
        if (z) {
            qVar.getClass();
            sb.append('.');
        }
        for (int i2 = 0; i2 < i; i2++) {
            qVar.getClass();
            sb.append('0');
        }
        return true;
    }

    @Override // j$.time.format.h
    public final String toString() {
        return "Fraction(" + this.a + "," + this.b + "," + this.c + (this.g ? ",DecimalPoint" : HttpUrl.FRAGMENT_ENCODE_SET) + ")";
    }
}
