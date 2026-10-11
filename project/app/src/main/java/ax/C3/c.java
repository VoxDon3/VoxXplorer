/*
 * Decompiled with CFR 0.152.
 */
package ax.C3;

import android.util.Log;
import ax.C3.d;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

public class c {
    private InputStream a;
    private byte[] b;
    private boolean c;
    private int d = 0;
    private int e = 0;

    public c(InputStream inputStream, int n8, boolean bl) {
        this.a = inputStream;
        if (n8 > 0) {
            this.b = new byte[ax.C3.c.e(n8)];
            this.c = bl;
            return;
        }
        throw new IllegalArgumentException(String.format("Buffer size %d must be positive.", n8));
    }

    private boolean b(int n8) {
        boolean bl = false;
        ax.C3.d.a("fill");
        int n9 = this.d;
        if (n8 >= n9) {
            int n10 = n8 - n9;
            if (this.a == null) {
                ax.C3.d.b();
                return false;
            }
            int n11 = n10 + 1;
            n9 = n10;
            if (n11 > this.b.length) {
                if (this.c) {
                    this.a(n8);
                    n9 = n8 - this.d;
                } else {
                    n8 = ax.C3.c.e(n11);
                    Log.w((String)"InputStreamBuffer", (String)String.format("Increasing buffer length from %d to %d. Bad buffer size chosen, or advanceTo() not called.", this.b.length, n8));
                    this.b = Arrays.copyOf(this.b, n8);
                    n9 = n10;
                }
            }
            try {
                InputStream inputStream = this.a;
                byte[] byArray = this.b;
                n8 = this.e;
                n8 = this.f(inputStream, byArray, n8, byArray.length - n8);
            }
            catch (IOException iOException) {
                n8 = -1;
            }
            if (n8 != -1) {
                this.e += n8;
            } else {
                this.a = null;
            }
            if (Log.isLoggable((String)"InputStreamBuffer", (int)3)) {
                Log.d((String)"InputStreamBuffer", (String)String.format("fill %d      buffer: %s", n9, this));
            }
            ax.C3.d.b();
            if (n9 < this.e) {
                bl = true;
            }
            return bl;
        }
        ax.C3.d.b();
        throw new IllegalStateException(String.format("Index %d is before buffer %d", n8, this.d));
    }

    private static int e(int n8) {
        --n8;
        n8 |= n8 >> 1;
        n8 |= n8 >> 2;
        n8 |= n8 >> 4;
        n8 |= n8 >> 8;
        return (n8 | n8 >> 16) + 1;
    }

    private void g(int n8) {
        int n9 = 0;
        if (n8 < this.b.length) {
            int n10;
            while ((n10 = n9 + n8) < this.e) {
                byte[] byArray = this.b;
                byArray[n9] = byArray[n10];
                ++n9;
            }
            return;
        }
        throw new IndexOutOfBoundsException(String.format("Index %d out of bounds. Length %d", n8, this.b.length));
    }

    public void a(int n8) throws IllegalStateException, IndexOutOfBoundsException {
        int n9;
        block11: {
            block12: {
                int n10;
                int n11;
                block9: {
                    block10: {
                        ax.C3.d.a("advance to");
                        n9 = n8 - this.d;
                        if (n9 <= 0) {
                            ax.C3.d.b();
                            return;
                        }
                        n11 = this.e;
                        if (n9 >= n11) break block10;
                        this.g(n9);
                        this.d = n8;
                        this.e -= n9;
                        break block11;
                    }
                    if (this.a == null) break block12;
                    n11 = n9 - n11;
                    int n12 = 0;
                    while (n11 > 0) {
                        int n13;
                        block8: {
                            long l8;
                            long l9;
                            block7: {
                                InputStream inputStream = this.a;
                                l9 = n11;
                                try {
                                    l8 = inputStream.skip(l9);
                                    if (l8 > 0L) break block7;
                                    n13 = n12 + 1;
                                    n10 = n11;
                                    break block8;
                                }
                                catch (IOException iOException) {
                                    // empty catch block
                                }
                            }
                            n10 = (int)(l9 - l8);
                            n13 = n12;
                        }
                        n11 = n10;
                        n12 = n13;
                        if (n13 < 5) continue;
                        n11 = n10;
                        n10 = 1;
                        break block9;
                    }
                    n10 = 0;
                }
                if (n10 != 0) {
                    this.a = null;
                }
                this.d = n8 - n11;
                this.e = 0;
                break block11;
            }
            this.d = n8;
            this.e = 0;
        }
        if (Log.isLoggable((String)"InputStreamBuffer", (int)3)) {
            Log.d((String)"InputStreamBuffer", (String)String.format("advanceTo %d buffer: %s", n9, this));
        }
        ax.C3.d.b();
    }

    public byte c(int n8) throws IllegalStateException, IndexOutOfBoundsException {
        ax.C3.d.a("get");
        if (this.d(n8)) {
            int n9 = this.d;
            ax.C3.d.b();
            return this.b[n8 - n9];
        }
        ax.C3.d.b();
        throw new IndexOutOfBoundsException(String.format("Index %d beyond length.", n8));
    }

    public boolean d(int n8) throws IllegalStateException, IndexOutOfBoundsException {
        ax.C3.d.a("has");
        int n9 = this.d;
        if (n8 >= n9) {
            if ((n9 = n8 - n9) < this.e && n9 < this.b.length) {
                ax.C3.d.b();
                return true;
            }
            ax.C3.d.b();
            return this.b(n8);
        }
        ax.C3.d.b();
        throw new IllegalStateException(String.format("Index %d is before buffer %d", n8, this.d));
    }

    int f(InputStream inputStream, byte[] byArray, int n8, int n9) throws IOException {
        int n10;
        int n11 = 0;
        while (n9 > 0 && (n10 = inputStream.read(byArray, n8, n9)) >= 0) {
            n8 += n10;
            n9 -= n10;
            n11 += n10;
        }
        return n11;
    }

    public String toString() {
        return String.format("+%d+%d [%d]", this.d, this.b.length, this.e);
    }
}

