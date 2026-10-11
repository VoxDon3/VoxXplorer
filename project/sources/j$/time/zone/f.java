package j$.time.zone;

import j$.time.Instant;
import j$.time.LocalDateTime;
import j$.time.ZoneOffset;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.TimeZone;

/* loaded from: classes2.dex */
public final class f implements Serializable {
    public static final long[] i = new long[0];
    public static final e[] j = new e[0];
    public static final LocalDateTime[] k = new LocalDateTime[0];
    public static final b[] l = new b[0];
    private static final long serialVersionUID = 3044319355680032515L;
    public final long[] a;
    public final ZoneOffset[] b;
    public final long[] c;
    public final LocalDateTime[] d;
    public final ZoneOffset[] e;
    public final e[] f;
    public final TimeZone g;
    public final transient ConcurrentHashMap h = new ConcurrentHashMap();

    /* JADX WARN: Removed duplicated region for block: B:12:0x0043 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object a(j$.time.LocalDateTime r5, j$.time.zone.b r6) {
        /*
            j$.time.LocalDateTime r0 = r6.b
            j$.time.ZoneOffset r1 = r6.d
            int r2 = r1.a
            j$.time.ZoneOffset r3 = r6.c
            int r4 = r3.a
            if (r2 <= r4) goto Le
            r2 = 1
            goto Lf
        Le:
            r2 = 0
        Lf:
            j$.time.LocalDateTime r4 = r6.b
            if (r2 == 0) goto L2b
            boolean r0 = r5.N(r0)
            if (r0 == 0) goto L1a
            goto L42
        L1a:
            int r0 = r1.a
            int r2 = r3.a
            int r0 = r0 - r2
            long r2 = (long) r0
            j$.time.LocalDateTime r0 = r4.R(r2)
            boolean r5 = r5.N(r0)
            if (r5 == 0) goto L31
            goto L43
        L2b:
            boolean r0 = r5.N(r0)
            if (r0 != 0) goto L32
        L31:
            return r1
        L32:
            int r0 = r1.a
            int r1 = r3.a
            int r0 = r0 - r1
            long r0 = (long) r0
            j$.time.LocalDateTime r0 = r4.R(r0)
            boolean r5 = r5.N(r0)
            if (r5 == 0) goto L43
        L42:
            return r3
        L43:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.zone.f.a(j$.time.LocalDateTime, j$.time.zone.b):java.lang.Object");
    }

    public f(long[] jArr, ZoneOffset[] zoneOffsetArr, long[] jArr2, ZoneOffset[] zoneOffsetArr2, e[] eVarArr) {
        this.a = jArr;
        this.b = zoneOffsetArr;
        this.c = jArr2;
        this.e = zoneOffsetArr2;
        this.f = eVarArr;
        if (jArr2.length == 0) {
            this.d = k;
        } else {
            ArrayList arrayList = new ArrayList();
            int i2 = 0;
            while (i2 < jArr2.length) {
                ZoneOffset zoneOffset = zoneOffsetArr2[i2];
                int i3 = i2 + 1;
                ZoneOffset zoneOffset2 = zoneOffsetArr2[i3];
                LocalDateTime P = LocalDateTime.P(jArr2[i2], 0, zoneOffset);
                if (zoneOffset2.a > zoneOffset.a) {
                    arrayList.add(P);
                    arrayList.add(P.R(zoneOffset2.a - r0));
                } else {
                    arrayList.add(P.R(r3 - r0));
                    arrayList.add(P);
                }
                i2 = i3;
            }
            this.d = (LocalDateTime[]) arrayList.toArray(new LocalDateTime[arrayList.size()]);
        }
        this.g = null;
    }

    public f(ZoneOffset zoneOffset) {
        ZoneOffset[] zoneOffsetArr = {zoneOffset};
        this.b = zoneOffsetArr;
        long[] jArr = i;
        this.a = jArr;
        this.c = jArr;
        this.d = k;
        this.e = zoneOffsetArr;
        this.f = j;
        this.g = null;
    }

    public f(TimeZone timeZone) {
        ZoneOffset[] zoneOffsetArr = {g(timeZone.getRawOffset())};
        this.b = zoneOffsetArr;
        long[] jArr = i;
        this.a = jArr;
        this.c = jArr;
        this.d = k;
        this.e = zoneOffsetArr;
        this.f = j;
        this.g = timeZone;
    }

    public static ZoneOffset g(int i2) {
        return ZoneOffset.R(i2 / 1000);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new a(this.g != null ? (byte) 100 : (byte) 1, this);
    }

    public static int c(long j2, ZoneOffset zoneOffset) {
        return j$.time.f.U(j$.com.android.tools.r8.a.N(j2 + zoneOffset.a, 86400)).a;
    }

    public final ZoneOffset d(Instant instant) {
        TimeZone timeZone = this.g;
        if (timeZone != null) {
            return g(timeZone.getOffset(instant.toEpochMilli()));
        }
        long[] jArr = this.c;
        if (jArr.length == 0) {
            return this.b[0];
        }
        long j2 = instant.a;
        int length = this.f.length;
        ZoneOffset[] zoneOffsetArr = this.e;
        if (length > 0 && j2 > jArr[jArr.length - 1]) {
            b[] b = b(c(j2, zoneOffsetArr[zoneOffsetArr.length - 1]));
            b bVar = null;
            for (int i2 = 0; i2 < b.length; i2++) {
                bVar = b[i2];
                if (j2 < bVar.a) {
                    return bVar.c;
                }
            }
            return bVar.d;
        }
        int binarySearch = Arrays.binarySearch(jArr, j2);
        if (binarySearch < 0) {
            binarySearch = (-binarySearch) - 2;
        }
        return zoneOffsetArr[binarySearch + 1];
    }

    public final List f(LocalDateTime localDateTime) {
        Object e = e(localDateTime);
        if (!(e instanceof b)) {
            return Collections.singletonList((ZoneOffset) e);
        }
        b bVar = (b) e;
        ZoneOffset zoneOffset = bVar.d;
        int i2 = zoneOffset.a;
        ZoneOffset zoneOffset2 = bVar.c;
        return i2 > zoneOffset2.a ? Collections.EMPTY_LIST : j$.com.android.tools.r8.a.Q(new Object[]{zoneOffset2, zoneOffset});
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0061, code lost:
    
        if (r11.L(r1) > 0) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0082, code lost:
    
        if (r11.b.W() <= r1.b.W()) goto L44;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(j$.time.LocalDateTime r11) {
        /*
            Method dump skipped, instructions count: 245
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.zone.f.e(j$.time.LocalDateTime):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x016c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final j$.time.zone.b[] b(int r24) {
        /*
            Method dump skipped, instructions count: 461
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.zone.f.b(int):j$.time.zone.b[]");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            if (Objects.equals(this.g, fVar.g) && Arrays.equals(this.a, fVar.a) && Arrays.equals(this.b, fVar.b) && Arrays.equals(this.c, fVar.c) && Arrays.equals(this.e, fVar.e) && Arrays.equals(this.f, fVar.f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((Objects.hashCode(this.g) ^ Arrays.hashCode(this.a)) ^ Arrays.hashCode(this.b)) ^ Arrays.hashCode(this.c)) ^ Arrays.hashCode(this.e)) ^ Arrays.hashCode(this.f);
    }

    public final String toString() {
        TimeZone timeZone = this.g;
        if (timeZone != null) {
            return "ZoneRules[timeZone=" + timeZone.getID() + "]";
        }
        return "ZoneRules[currentStandardOffset=" + this.b[r1.length - 1] + "]";
    }
}
