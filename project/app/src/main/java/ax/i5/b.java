/*
 * Decompiled with CFR 0.152.
 */
package ax.i5;

import android.util.Log;
import ax.e5.a;
import ax.i5.c;
import ax.i5.j;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;

public class b {
    private static final String e = "b";
    private a a;
    private long[] b;
    private int[] c;
    private j d;

    b(a object, c c8, j object2) {
        int n8;
        this.a = object;
        this.d = object2;
        boolean bl = c8.l();
        int n9 = 0;
        if (!bl) {
            n8 = c8.k();
            this.c = new int[]{n8};
            object = e;
            object2 = new StringBuilder();
            ((StringBuilder)object2).append("fat is not mirrored, fat ");
            ((StringBuilder)object2).append(n8);
            ((StringBuilder)object2).append(" is valid");
            Log.i((String)object, (String)((StringBuilder)object2).toString());
        } else {
            int n10 = c8.d();
            this.c = new int[n10];
            for (n8 = 0; n8 < n10; ++n8) {
                this.c[n8] = n8;
            }
            object = e;
            object2 = new StringBuilder();
            ((StringBuilder)object2).append("fat is mirrored, fat count: ");
            ((StringBuilder)object2).append(n10);
            Log.i((String)object, (String)((StringBuilder)object2).toString());
        }
        this.b = new long[this.c.length];
        for (n8 = n9; n8 < ((Object)(object = (Object)this.b)).length; ++n8) {
            object[n8] = c8.e(this.c[n8]);
        }
    }

    Long[] a(Long[] longArray, int n8) throws IOException {
        long l8;
        long l9;
        long l10;
        ArrayList<Long> arrayList = new ArrayList<Long>(longArray.length + n8);
        arrayList.addAll(Arrays.asList(longArray));
        int n9 = this.a.d() * 2;
        ByteBuffer byteBuffer = ByteBuffer.allocate(n9);
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        long l11 = longArray.length != 0 ? longArray[longArray.length - 1] : -1L;
        long l12 = l10 = this.d.c();
        if (l10 == (long)j.d) {
            l12 = 2L;
        }
        int n10 = n8;
        l10 = -1L;
        long l13 = l12;
        while (n10 > 0) {
            long l14 = this.b[0];
            l9 = 4L * ++l13;
            long l15 = n9;
            l8 = (l14 + l9) / l15 * l15;
            l12 = l10;
            if (l10 != l8) {
                byteBuffer.clear();
                this.a.i(l8, byteBuffer);
                l12 = l8;
            }
            if (byteBuffer.getInt((int)((l14 + l9) % l15)) == 0) {
                arrayList.add(l13);
                --n10;
                l10 = l12;
                continue;
            }
            l10 = l12;
        }
        if (l11 != -1L) {
            l13 = this.b[0];
            l9 = l11 * 4L;
            l8 = n9;
            l12 = (l13 + l9) / l8 * l8;
            l11 = l10;
            if (l10 != l12) {
                byteBuffer.clear();
                this.a.i(l12, byteBuffer);
                l11 = l12;
            }
            byteBuffer.putInt((int)((l13 + l9) % l8), (int)((Long)arrayList.get(longArray.length)).longValue());
            l10 = l11;
        }
        n10 = longArray.length;
        while (n10 < arrayList.size() - 1) {
            l11 = (Long)arrayList.get(n10);
            l13 = this.b[0];
            l9 = l11 * 4L;
            l8 = n9;
            l12 = (l13 + l9) / l8 * l8;
            l11 = l10;
            if (l10 != l12) {
                byteBuffer.clear();
                this.a.l(l10, byteBuffer);
                byteBuffer.clear();
                this.a.i(l12, byteBuffer);
                l11 = l12;
            }
            int n11 = (int)((l13 + l9) % l8);
            byteBuffer.putInt(n11, (int)((Long)arrayList.get(++n10)).longValue());
            l10 = l11;
        }
        l8 = this.b[0];
        l9 = (Long)arrayList.get(arrayList.size() - 1);
        l13 = 4L * l9;
        l11 = (l8 + l13) / (l12 = (long)n9) * l12;
        if (l10 != l11) {
            byteBuffer.clear();
            this.a.l(l10, byteBuffer);
            byteBuffer.clear();
            this.a.i(l11, byteBuffer);
        }
        byteBuffer.putInt((int)((l8 + l13) % l12), 0xFFFFFF8);
        byteBuffer.clear();
        this.a.l(l11, byteBuffer);
        this.d.f(l9);
        this.d.a(n8);
        this.d.g();
        Log.i((String)e, (String)"allocating clusters finished");
        return arrayList.toArray(new Long[0]);
    }

    Long[] b(Long[] longArray, int n8) throws IOException {
        int n9 = longArray.length - n8;
        int n10 = this.a.d() * 2;
        Object object = ByteBuffer.allocate(n10);
        ((ByteBuffer)object).order(ByteOrder.LITTLE_ENDIAN);
        if (n9 >= 0) {
            long l8;
            long l9;
            long l10;
            long l11;
            long l12 = -1L;
            for (int i8 = n9; i8 < longArray.length; ++i8) {
                l11 = longArray[i8];
                l10 = this.b[0];
                l9 = l11 * 4L;
                long l13 = n10;
                l8 = (l10 + l9) / l13 * l13;
                l11 = l12;
                if (l12 != l8) {
                    if (l12 != -1L) {
                        ((ByteBuffer)object).clear();
                        this.a.l(l12, (ByteBuffer)object);
                    }
                    ((ByteBuffer)object).clear();
                    this.a.i(l8, (ByteBuffer)object);
                    l11 = l8;
                }
                ((ByteBuffer)object).putInt((int)((l10 + l9) % l13), 0);
                l12 = l11;
            }
            if (n9 > 0) {
                l8 = longArray[n9 - 1];
                l11 = this.b[0];
                l9 = l8 * 4L;
                l10 = n10;
                if (l12 != (l8 = (l11 + l9) / l10 * l10)) {
                    ((ByteBuffer)object).clear();
                    this.a.l(l12, (ByteBuffer)object);
                    ((ByteBuffer)object).clear();
                    this.a.i(l8, (ByteBuffer)object);
                }
                ((ByteBuffer)object).putInt((int)((l11 + l9) % l10), 0xFFFFFF8);
                ((ByteBuffer)object).clear();
                this.a.l(l8, (ByteBuffer)object);
            } else {
                ((ByteBuffer)object).clear();
                this.a.l(l12, (ByteBuffer)object);
            }
            object = e;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("freed ");
            stringBuilder.append(n8);
            stringBuilder.append(" clusters");
            Log.i((String)object, (String)stringBuilder.toString());
            this.d.a(-n8);
            this.d.g();
            return Arrays.copyOfRange(longArray, 0, n9);
        }
        throw new IllegalStateException("trying to remove more clusters in chain than currently exist!");
    }

    Long[] c(long l8, long l9) throws IOException {
        if (l8 == 0L) {
            return new Long[0];
        }
        ArrayList<Long> arrayList = new ArrayList<Long>();
        int n8 = this.a.d() * 2;
        Comparable<ByteBuffer> comparable = ByteBuffer.allocate(n8);
        ((ByteBuffer)comparable).order(ByteOrder.LITTLE_ENDIAN);
        long l10 = -1L;
        long l11 = l8;
        while (this.b.length != 0) {
            arrayList.add(l11);
            long l12 = this.b[0];
            long l13 = 4L * l11;
            long l14 = n8;
            long l15 = (l12 + l13) / l14 * l14;
            long l16 = l10;
            l13 = (l12 + l13) % l14;
            l10 = l16;
            if (l16 != l15) {
                ((ByteBuffer)comparable).clear();
                this.a.i(l15, (ByteBuffer)comparable);
                l10 = l15;
            }
            int n9 = (int)l13;
            try {
                n9 = ((ByteBuffer)comparable).getInt(n9);
            }
            catch (IndexOutOfBoundsException indexOutOfBoundsException) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("IndexOutOfBoundsException: ");
                stringBuilder.append(l13);
                stringBuilder.append(":");
                stringBuilder.append(l11);
                stringBuilder.append(":");
                stringBuilder.append(this.b[0]);
                stringBuilder.append(":");
                stringBuilder.append(l8);
                stringBuilder.append(":");
                stringBuilder.append(n8);
                throw new IOException(stringBuilder.toString());
            }
            l11 = (long)n9 & 0xFFFFFFFFL;
            l16 = (long)arrayList.size() * l9;
            if (l16 <= 0xFFFFFFFFL && l16 >= 0L) {
                if (l11 < 0xFFFFFF8L) continue;
                return arrayList.toArray(new Long[0]);
            }
            comparable = new StringBuilder();
            ((StringBuilder)comparable).append("Too large cluster size : len : ");
            ((StringBuilder)comparable).append(arrayList.size());
            ((StringBuilder)comparable).append(":");
            ((StringBuilder)comparable).append(l9);
            throw new com.github.mjdev.libaums.a(((StringBuilder)comparable).toString());
        }
        throw new IOException("IndexOutOfBoundsException: fatOffset length 0");
    }
}

