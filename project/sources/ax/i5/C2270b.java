package ax.i5;

import android.util.Log;
import ax.e5.InterfaceC1979a;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: ax.i5.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2270b {
    private static final String e = "b";
    private InterfaceC1979a a;
    private long[] b;
    private int[] c;
    private j d;

    C2270b(InterfaceC1979a interfaceC1979a, c cVar, j jVar) {
        this.a = interfaceC1979a;
        this.d = jVar;
        int i = 0;
        if (cVar.l()) {
            int d = cVar.d();
            this.c = new int[d];
            for (int i2 = 0; i2 < d; i2++) {
                this.c[i2] = i2;
            }
            Log.i(e, "fat is mirrored, fat count: " + d);
        } else {
            int k = cVar.k();
            this.c = new int[]{k};
            Log.i(e, "fat is not mirrored, fat " + k + " is valid");
        }
        this.b = new long[this.c.length];
        while (true) {
            long[] jArr = this.b;
            if (i >= jArr.length) {
                return;
            }
            jArr[i] = cVar.e(this.c[i]);
            i++;
        }
    }

    Long[] a(Long[] lArr, int i) throws IOException {
        char c;
        ArrayList arrayList = new ArrayList(lArr.length + i);
        arrayList.addAll(Arrays.asList(lArr));
        int d = this.a.d() * 2;
        ByteBuffer allocate = ByteBuffer.allocate(d);
        allocate.order(ByteOrder.LITTLE_ENDIAN);
        long longValue = lArr.length != 0 ? lArr[lArr.length - 1].longValue() : -1L;
        long c2 = this.d.c();
        if (c2 == j.d) {
            c2 = 2;
        }
        int i2 = i;
        long j = -1;
        while (i2 > 0) {
            c2++;
            long j2 = this.b[0];
            long j3 = 4 * c2;
            int i3 = i2;
            long j4 = d;
            long j5 = ((j2 + j3) / j4) * j4;
            long j6 = longValue;
            long j7 = (j2 + j3) % j4;
            if (j != j5) {
                allocate.clear();
                this.a.i(j5, allocate);
                j = j5;
            }
            if (allocate.getInt((int) j7) == 0) {
                arrayList.add(Long.valueOf(c2));
                i2 = i3 - 1;
                longValue = j6;
            } else {
                longValue = j6;
                i2 = i3;
            }
        }
        long j8 = longValue;
        if (j8 != -1) {
            long j9 = this.b[0];
            long j10 = j8 * 4;
            long j11 = d;
            c = 0;
            long j12 = ((j9 + j10) / j11) * j11;
            long j13 = (j9 + j10) % j11;
            if (j != j12) {
                allocate.clear();
                this.a.i(j12, allocate);
                j = j12;
            }
            allocate.putInt((int) j13, (int) ((Long) arrayList.get(lArr.length)).longValue());
        } else {
            c = 0;
        }
        int length = lArr.length;
        while (length < arrayList.size() - 1) {
            long longValue2 = ((Long) arrayList.get(length)).longValue();
            long j14 = this.b[c];
            long j15 = longValue2 * 4;
            long j16 = d;
            long j17 = ((j14 + j15) / j16) * j16;
            long j18 = (j14 + j15) % j16;
            if (j != j17) {
                allocate.clear();
                this.a.l(j, allocate);
                allocate.clear();
                this.a.i(j17, allocate);
                j = j17;
            }
            length++;
            allocate.putInt((int) j18, (int) ((Long) arrayList.get(length)).longValue());
            c = 0;
        }
        long longValue3 = ((Long) arrayList.get(arrayList.size() - 1)).longValue();
        long j19 = this.b[0];
        long j20 = 4 * longValue3;
        long j21 = d;
        long j22 = ((j19 + j20) / j21) * j21;
        long j23 = (j19 + j20) % j21;
        if (j != j22) {
            allocate.clear();
            this.a.l(j, allocate);
            allocate.clear();
            this.a.i(j22, allocate);
        }
        allocate.putInt((int) j23, 268435448);
        allocate.clear();
        this.a.l(j22, allocate);
        this.d.f(longValue3);
        this.d.a(i);
        this.d.g();
        Log.i(e, "allocating clusters finished");
        return (Long[]) arrayList.toArray(new Long[0]);
    }

    Long[] b(Long[] lArr, int i) throws IOException {
        int length = lArr.length - i;
        int d = this.a.d() * 2;
        ByteBuffer allocate = ByteBuffer.allocate(d);
        allocate.order(ByteOrder.LITTLE_ENDIAN);
        if (length < 0) {
            throw new IllegalStateException("trying to remove more clusters in chain than currently exist!");
        }
        long j = -1;
        for (int i2 = length; i2 < lArr.length; i2++) {
            long longValue = lArr[i2].longValue();
            long j2 = this.b[0];
            long j3 = longValue * 4;
            long j4 = d;
            long j5 = ((j2 + j3) / j4) * j4;
            long j6 = (j2 + j3) % j4;
            if (j != j5) {
                if (j != -1) {
                    allocate.clear();
                    this.a.l(j, allocate);
                }
                allocate.clear();
                this.a.i(j5, allocate);
                j = j5;
            }
            allocate.putInt((int) j6, 0);
        }
        if (length > 0) {
            long longValue2 = lArr[length - 1].longValue();
            long j7 = this.b[0];
            long j8 = longValue2 * 4;
            long j9 = d;
            long j10 = ((j7 + j8) / j9) * j9;
            long j11 = (j7 + j8) % j9;
            if (j != j10) {
                allocate.clear();
                this.a.l(j, allocate);
                allocate.clear();
                this.a.i(j10, allocate);
            }
            allocate.putInt((int) j11, 268435448);
            allocate.clear();
            this.a.l(j10, allocate);
        } else {
            allocate.clear();
            this.a.l(j, allocate);
        }
        Log.i(e, "freed " + i + " clusters");
        this.d.a((long) (-i));
        this.d.g();
        return (Long[]) Arrays.copyOfRange(lArr, 0, length);
    }

    Long[] c(long j, long j2) throws IOException {
        char c = 0;
        if (j == 0) {
            return new Long[0];
        }
        ArrayList arrayList = new ArrayList();
        int d = this.a.d() * 2;
        ByteBuffer allocate = ByteBuffer.allocate(d);
        allocate.order(ByteOrder.LITTLE_ENDIAN);
        long j3 = -1;
        long j4 = j;
        while (this.b.length != 0) {
            arrayList.add(Long.valueOf(j4));
            long j5 = this.b[c];
            long j6 = 4 * j4;
            long j7 = d;
            long j8 = ((j5 + j6) / j7) * j7;
            long j9 = j3;
            long j10 = (j5 + j6) % j7;
            if (j9 != j8) {
                allocate.clear();
                this.a.i(j8, allocate);
                j9 = j8;
            }
            try {
                j4 = allocate.getInt((int) j10) & 4294967295L;
                long size = arrayList.size() * j2;
                if (size > 4294967295L || size < 0) {
                    throw new com.github.mjdev.libaums.a("Too large cluster size : len : " + arrayList.size() + ":" + j2);
                }
                if (j4 >= 268435448) {
                    return (Long[]) arrayList.toArray(new Long[0]);
                }
                j3 = j9;
                c = 0;
            } catch (IndexOutOfBoundsException unused) {
                throw new IOException("IndexOutOfBoundsException: " + j10 + ":" + j4 + ":" + this.b[0] + ":" + j + ":" + d);
            }
        }
        throw new IOException("IndexOutOfBoundsException: fatOffset length 0");
    }
}
