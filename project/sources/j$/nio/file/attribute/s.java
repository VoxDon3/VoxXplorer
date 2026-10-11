package j$.nio.file.attribute;

import j$.time.Instant;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class s implements Comparable {
    public final long a;
    public Instant b;
    public String c;

    public static long p(long j, long j2, long j3) {
        if (j > j3) {
            return Long.MAX_VALUE;
        }
        if (j < (-j3)) {
            return Long.MIN_VALUE;
        }
        return j * j2;
    }

    public s(long j) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.a = j;
        this.b = null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final j$.time.Instant w() {
        /*
            r8 = this;
            j$.time.Instant r0 = r8.b
            if (r0 != 0) goto L91
            int[] r0 = j$.nio.file.attribute.r.a
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.MILLISECONDS
            int r1 = r1.ordinal()
            r0 = r0[r1]
            long r1 = r8.a
            r7 = 0
            switch(r0) {
                case 1: goto L62;
                case 2: goto L56;
                case 3: goto L4a;
                case 4: goto L6e;
                case 5: goto L39;
                case 6: goto L2a;
                case 7: goto L1c;
                default: goto L14;
            }
        L14:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            java.lang.String r1 = "Unit not handled"
            r0.<init>(r1)
            throw r0
        L1c:
            r3 = 1000000000(0x3b9aca00, double:4.94065646E-315)
            long r5 = j$.com.android.tools.r8.a.N(r1, r3)
            long r0 = j$.com.android.tools.r8.a.W(r1, r3)
            int r7 = (int) r0
        L28:
            r1 = r5
            goto L6e
        L2a:
            r3 = 1000000(0xf4240, double:4.940656E-318)
            long r5 = j$.com.android.tools.r8.a.N(r1, r3)
            long r0 = j$.com.android.tools.r8.a.W(r1, r3)
            int r1 = (int) r0
            int r7 = r1 * 1000
            goto L28
        L39:
            r3 = 1000(0x3e8, double:4.94E-321)
            long r5 = j$.com.android.tools.r8.a.N(r1, r3)
            long r0 = j$.com.android.tools.r8.a.W(r1, r3)
            int r1 = (int) r0
            r0 = 1000000(0xf4240, float:1.401298E-39)
            int r7 = r1 * r0
            goto L28
        L4a:
            r3 = 60
            r5 = 153722867280912930(0x222222222222222, double:2.166167076120538E-298)
            long r1 = p(r1, r3, r5)
            goto L6e
        L56:
            r3 = 3600(0xe10, double:1.7786E-320)
            r5 = 2562047788015215(0x91a2b3c4d5e6f, double:1.2658197950618743E-308)
            long r1 = p(r1, r3, r5)
            goto L6e
        L62:
            r3 = 86400(0x15180, double:4.26873E-319)
            r5 = 106751991167300(0x611722833944, double:5.2742491460911E-310)
            long r1 = p(r1, r3, r5)
        L6e:
            r3 = -31557014167219200(0xff8fe31014641400, double:-2.7989734602046733E306)
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 > 0) goto L7c
            j$.time.Instant r0 = j$.time.Instant.d
            r8.b = r0
            goto L91
        L7c:
            r3 = 31556889864403199(0x701cd2fa9578ff, double:1.434068493154717E-306)
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 < 0) goto L8a
            j$.time.Instant r0 = j$.time.Instant.e
            r8.b = r0
            goto L91
        L8a:
            long r3 = (long) r7
            j$.time.Instant r0 = j$.time.Instant.M(r1, r3)
            r8.b = r0
        L91:
            j$.time.Instant r0 = r8.b
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.nio.file.attribute.s.w():j$.time.Instant");
    }

    public final boolean equals(Object obj) {
        return (obj instanceof s) && compareTo((s) obj) == 0;
    }

    public final int hashCode() {
        return w().hashCode();
    }

    public final long q(long j) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        if (timeUnit != null) {
            return timeUnit.toNanos(this.a - timeUnit.convert(j, TimeUnit.DAYS));
        }
        return TimeUnit.SECONDS.toNanos(w().a - TimeUnit.DAYS.toSeconds(j));
    }

    @Override // java.lang.Comparable
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public final int compareTo(s sVar) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        long j = this.a;
        if (timeUnit != null) {
            sVar.getClass();
            return Long.compare(j, sVar.a);
        }
        long j2 = w().a;
        int compare = Long.compare(j2, sVar.w().a);
        if (compare != 0) {
            return compare;
        }
        int compare2 = Long.compare(w().b, sVar.w().b);
        if (compare2 != 0) {
            return compare2;
        }
        if (j2 != 31556889864403199L && j2 != -31557014167219200L) {
            return 0;
        }
        long days = timeUnit != null ? timeUnit.toDays(j) : TimeUnit.SECONDS.toDays(w().a);
        long days2 = timeUnit != null ? timeUnit.toDays(sVar.a) : TimeUnit.SECONDS.toDays(sVar.w().a);
        return days == days2 ? Long.compare(q(days), sVar.q(days2)) : Long.compare(days, days2);
    }

    public static void j(StringBuilder sb, int i, int i2) {
        while (i > 0) {
            sb.append((char) ((i2 / i) + 48));
            i2 %= i;
            i /= 10;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String toString() {
        /*
            Method dump skipped, instructions count: 242
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.nio.file.attribute.s.toString():java.lang.String");
    }
}
