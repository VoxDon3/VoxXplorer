package ax.C3;

import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

/* loaded from: classes.dex */
public class c {
    private InputStream a;
    private byte[] b;
    private boolean c;
    private int d = 0;
    private int e = 0;

    public c(InputStream inputStream, int i, boolean z) {
        this.a = inputStream;
        if (i <= 0) {
            throw new IllegalArgumentException(String.format("Buffer size %d must be positive.", Integer.valueOf(i)));
        }
        this.b = new byte[e(i)];
        this.c = z;
    }

    private boolean b(int i) {
        int i2;
        d.a("fill");
        int i3 = this.d;
        if (i < i3) {
            d.b();
            throw new IllegalStateException(String.format("Index %d is before buffer %d", Integer.valueOf(i), Integer.valueOf(this.d)));
        }
        int i4 = i - i3;
        if (this.a == null) {
            d.b();
            return false;
        }
        int i5 = i4 + 1;
        if (i5 > this.b.length) {
            if (this.c) {
                a(i);
                i4 = i - this.d;
            } else {
                int e = e(i5);
                Log.w("InputStreamBuffer", String.format("Increasing buffer length from %d to %d. Bad buffer size chosen, or advanceTo() not called.", Integer.valueOf(this.b.length), Integer.valueOf(e)));
                this.b = Arrays.copyOf(this.b, e);
            }
        }
        try {
            InputStream inputStream = this.a;
            byte[] bArr = this.b;
            int i6 = this.e;
            i2 = f(inputStream, bArr, i6, bArr.length - i6);
        } catch (IOException unused) {
            i2 = -1;
        }
        if (i2 != -1) {
            this.e += i2;
        } else {
            this.a = null;
        }
        if (Log.isLoggable("InputStreamBuffer", 3)) {
            Log.d("InputStreamBuffer", String.format("fill %d      buffer: %s", Integer.valueOf(i4), this));
        }
        d.b();
        return i4 < this.e;
    }

    private static int e(int i) {
        int i2 = i - 1;
        int i3 = i2 | (i2 >> 1);
        int i4 = i3 | (i3 >> 2);
        int i5 = i4 | (i4 >> 4);
        int i6 = i5 | (i5 >> 8);
        return (i6 | (i6 >> 16)) + 1;
    }

    private void g(int i) {
        int i2 = 0;
        if (i >= this.b.length) {
            throw new IndexOutOfBoundsException(String.format("Index %d out of bounds. Length %d", Integer.valueOf(i), Integer.valueOf(this.b.length)));
        }
        while (true) {
            int i3 = i2 + i;
            if (i3 >= this.e) {
                return;
            }
            byte[] bArr = this.b;
            bArr[i2] = bArr[i3];
            i2++;
        }
    }

    public void a(int i) throws IllegalStateException, IndexOutOfBoundsException {
        boolean z;
        d.a("advance to");
        int i2 = i - this.d;
        if (i2 <= 0) {
            d.b();
            return;
        }
        int i3 = this.e;
        if (i2 < i3) {
            g(i2);
            this.d = i;
            this.e -= i2;
        } else if (this.a != null) {
            int i4 = i2 - i3;
            int i5 = 0;
            while (i4 > 0) {
                try {
                    long j = i4;
                    long skip = this.a.skip(j);
                    if (skip <= 0) {
                        i5++;
                    } else {
                        i4 = (int) (j - skip);
                    }
                } catch (IOException unused) {
                }
                if (i5 >= 5) {
                    z = true;
                    break;
                }
            }
            z = false;
            if (z) {
                this.a = null;
            }
            this.d = i - i4;
            this.e = 0;
        } else {
            this.d = i;
            this.e = 0;
        }
        if (Log.isLoggable("InputStreamBuffer", 3)) {
            Log.d("InputStreamBuffer", String.format("advanceTo %d buffer: %s", Integer.valueOf(i2), this));
        }
        d.b();
    }

    public byte c(int i) throws IllegalStateException, IndexOutOfBoundsException {
        d.a("get");
        if (!d(i)) {
            d.b();
            throw new IndexOutOfBoundsException(String.format("Index %d beyond length.", Integer.valueOf(i)));
        }
        int i2 = i - this.d;
        d.b();
        return this.b[i2];
    }

    public boolean d(int i) throws IllegalStateException, IndexOutOfBoundsException {
        d.a("has");
        int i2 = this.d;
        if (i < i2) {
            d.b();
            throw new IllegalStateException(String.format("Index %d is before buffer %d", Integer.valueOf(i), Integer.valueOf(this.d)));
        }
        int i3 = i - i2;
        if (i3 >= this.e || i3 >= this.b.length) {
            d.b();
            return b(i);
        }
        d.b();
        return true;
    }

    int f(InputStream inputStream, byte[] bArr, int i, int i2) throws IOException {
        int i3 = 0;
        while (i2 > 0) {
            int read = inputStream.read(bArr, i, i2);
            if (read < 0) {
                break;
            }
            i += read;
            i2 -= read;
            i3 += read;
        }
        return i3;
    }

    public String toString() {
        return String.format("+%d+%d [%d]", Integer.valueOf(this.d), Integer.valueOf(this.b.length), Integer.valueOf(this.e));
    }
}
