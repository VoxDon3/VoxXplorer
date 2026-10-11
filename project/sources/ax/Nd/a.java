package ax.Nd;

import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: ax.Nd.a$a, reason: collision with other inner class name */
    public static class C0156a<T> implements Iterator<T> {
        private int c0 = 0;
        private final T[] q;

        public C0156a(T[] tArr) {
            this.q = tArr;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.c0 < this.q.length;
        }

        @Override // java.util.Iterator
        public T next() {
            int i = this.c0;
            T[] tArr = this.q;
            if (i != tArr.length) {
                this.c0 = i + 1;
                return tArr[i];
            }
            throw new NoSuchElementException("Out of elements: " + this.c0);
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Cannot remove element from an Array.");
        }
    }

    public static boolean a(byte[] bArr, int i, int i2) {
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            i3 |= bArr[i + i4];
        }
        return i3 == 0;
    }

    public static boolean b(byte[] bArr, byte[] bArr2) {
        return Arrays.equals(bArr, bArr2);
    }

    public static boolean c(char[] cArr, char[] cArr2) {
        return Arrays.equals(cArr, cArr2);
    }

    public static byte[] d(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return (byte[]) bArr.clone();
    }

    public static boolean e(byte[] bArr, byte[] bArr2) {
        if (bArr != null && bArr2 != null) {
            if (bArr == bArr2) {
                return true;
            }
            int length = bArr.length < bArr2.length ? bArr.length : bArr2.length;
            int length2 = bArr.length ^ bArr2.length;
            for (int i = 0; i != length; i++) {
                length2 |= bArr[i] ^ bArr2[i];
            }
            while (length < bArr2.length) {
                byte b = bArr2[length];
                length2 |= b ^ (~b);
                length++;
            }
            if (length2 == 0) {
                return true;
            }
        }
        return false;
    }

    public static byte[] f(byte[] bArr, int i, int i2) {
        int k = k(i, i2);
        byte[] bArr2 = new byte[k];
        System.arraycopy(bArr, i, bArr2, 0, Math.min(bArr.length - i, k));
        return bArr2;
    }

    public static void g(byte[] bArr, byte b) {
        Arrays.fill(bArr, b);
    }

    public static void h(byte[] bArr, int i, int i2, byte b) {
        Arrays.fill(bArr, i, i2, b);
    }

    public static void i(int[] iArr, int i) {
        Arrays.fill(iArr, i);
    }

    public static void j(long[] jArr, long j) {
        Arrays.fill(jArr, j);
    }

    private static int k(int i, int i2) {
        int i3 = i2 - i;
        if (i3 >= 0) {
            return i3;
        }
        StringBuffer stringBuffer = new StringBuffer(i);
        stringBuffer.append(" > ");
        stringBuffer.append(i2);
        throw new IllegalArgumentException(stringBuffer.toString());
    }

    public static int l(byte[] bArr) {
        if (bArr == null) {
            return 0;
        }
        int length = bArr.length;
        int i = length + 1;
        while (true) {
            length--;
            if (length < 0) {
                return i;
            }
            i = (i * 257) ^ bArr[length];
        }
    }

    public static int m(byte[] bArr, int i, int i2) {
        if (bArr == null) {
            return 0;
        }
        int i3 = i2 + 1;
        while (true) {
            i2--;
            if (i2 < 0) {
                return i3;
            }
            i3 = (i3 * 257) ^ bArr[i + i2];
        }
    }

    public static int n(char[] cArr) {
        if (cArr == null) {
            return 0;
        }
        int length = cArr.length;
        int i = length + 1;
        while (true) {
            length--;
            if (length < 0) {
                return i;
            }
            i = (i * 257) ^ cArr[length];
        }
    }

    public static boolean o(Object[] objArr) {
        if (objArr == null) {
            return true;
        }
        for (Object obj : objArr) {
            if (obj == null) {
                return true;
            }
        }
        return false;
    }

    public static byte[] p(byte[] bArr, byte b) {
        if (bArr == null) {
            return new byte[]{b};
        }
        int length = bArr.length;
        byte[] bArr2 = new byte[length + 1];
        System.arraycopy(bArr, 0, bArr2, 1, length);
        bArr2[0] = b;
        return bArr2;
    }
}
