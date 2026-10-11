/*
 * Decompiled with CFR 0.152.
 */
package ax.L3;

import android.util.Log;
import ax.L3.b;
import ax.L3.c;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

public class d {
    private final byte[] a = new byte[256];
    private ByteBuffer b;
    private c c;
    private int d = 0;

    private boolean b() {
        return this.c.b != 0;
    }

    private int d() {
        try {
            byte by = this.b.get();
            return by & 0xFF;
        }
        catch (Exception exception) {
            this.c.b = 1;
            return 0;
        }
    }

    private void e() {
        this.c.d.a = this.n();
        this.c.d.b = this.n();
        this.c.d.c = this.n();
        this.c.d.d = this.n();
        int n8 = this.d();
        boolean bl = false;
        boolean bl2 = (n8 & 0x80) != 0;
        int n9 = (int)Math.pow(2.0, (n8 & 7) + 1);
        Object object = this.c.d;
        if ((n8 & 0x40) != 0) {
            bl = true;
        }
        ((b)object).e = bl;
        ((b)object).k = (int[])(bl2 ? this.g(n9) : null);
        this.c.d.j = this.b.position();
        this.r();
        if (this.b()) {
            return;
        }
        object = this.c;
        ++((c)object).c;
        ((c)object).e.add(((c)object).d);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private int f() {
        int n9;
        this.d = n9 = this.d();
        int n8 = 0;
        int n10 = 0;
        if (n9 <= 0) return n8;
        n8 = 0;
        while (true) {
            n9 = n8;
            try {
                int n11 = this.d;
                n8 = n10;
                if (n10 >= n11) return n8;
                n9 = n8 = n11 - n10;
            }
            catch (Exception exception) {
                if (Log.isLoggable((String)"GifHeaderParser", (int)3)) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Error Reading Block n: ");
                    stringBuilder.append(n10);
                    stringBuilder.append(" count: ");
                    stringBuilder.append(n9);
                    stringBuilder.append(" blockSize: ");
                    stringBuilder.append(this.d);
                    Log.d((String)"GifHeaderParser", (String)stringBuilder.toString(), (Throwable)exception);
                }
                this.c.b = 1;
                return n10;
            }
            {
                this.b.get(this.a, n10, n8);
                n10 += n8;
                continue;
            }
            break;
        }
    }

    private int[] g(int n8) {
        BufferUnderflowException bufferUnderflowException2;
        int[] nArray;
        block7: {
            int[] nArray2;
            block6: {
                int n9;
                int n10;
                byte[] byArray = new byte[n8 * 3];
                nArray = nArray2 = null;
                this.b.get(byArray);
                nArray = nArray2;
                try {
                    nArray2 = new int[256];
                    n10 = 0;
                    n9 = 0;
                }
                catch (BufferUnderflowException bufferUnderflowException2) {}
                while (true) {
                    int n11 = n9;
                    if (n10 < n8) {
                        byte by = byArray[n11];
                        byte by2 = byArray[n11 + 1];
                        n9 = n11 + 3;
                        nArray2[n10] = (by2 & 0xFF) << 8 | ((by & 0xFF) << 16 | 0xFF000000) | byArray[n11 + 2] & 0xFF;
                        ++n10;
                        continue;
                    }
                    break block6;
                    break;
                }
                break block7;
            }
            return nArray2;
        }
        if (Log.isLoggable((String)"GifHeaderParser", (int)3)) {
            Log.d((String)"GifHeaderParser", (String)"Format Error Reading Color Table", (Throwable)bufferUnderflowException2);
        }
        this.c.b = 1;
        return nArray;
    }

    private void h() {
        this.i(Integer.MAX_VALUE);
    }

    private void i(int n8) {
        boolean bl = false;
        while (!bl && !this.b() && this.c.c <= n8) {
            Object object;
            int n9 = this.d();
            if (n9 != 33) {
                if (n9 != 44) {
                    if (n9 != 59) {
                        this.c.b = 1;
                        continue;
                    }
                    bl = true;
                    continue;
                }
                object = this.c;
                if (((c)object).d == null) {
                    ((c)object).d = new b();
                }
                this.e();
                continue;
            }
            n9 = this.d();
            if (n9 != 1) {
                if (n9 != 249) {
                    if (n9 != 254) {
                        if (n9 != 255) {
                            this.q();
                            continue;
                        }
                        this.f();
                        object = "";
                        for (n9 = 0; n9 < 11; ++n9) {
                            StringBuilder stringBuilder = new StringBuilder();
                            stringBuilder.append((String)object);
                            stringBuilder.append((char)this.a[n9]);
                            object = stringBuilder.toString();
                        }
                        if (((String)object).equals("NETSCAPE2.0")) {
                            this.m();
                            continue;
                        }
                        this.q();
                        continue;
                    }
                    this.q();
                    continue;
                }
                this.c.d = new b();
                this.j();
                continue;
            }
            this.q();
        }
    }

    private void j() {
        int n8;
        this.d();
        int n9 = this.d();
        b b8 = this.c.d;
        b8.g = n8 = (n9 & 0x1C) >> 2;
        boolean bl = true;
        if (n8 == 0) {
            b8.g = 1;
        }
        if ((n9 & 1) == 0) {
            bl = false;
        }
        b8.f = bl;
        n8 = n9 = this.n();
        if (n9 < 2) {
            n8 = 10;
        }
        b8 = this.c.d;
        b8.i = n8 * 10;
        b8.h = this.d();
        this.d();
    }

    private void k() {
        Object object = "";
        for (int i8 = 0; i8 < 6; ++i8) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append((String)object);
            stringBuilder.append((char)this.d());
            object = stringBuilder.toString();
        }
        if (!((String)object).startsWith("GIF")) {
            this.c.b = 1;
            return;
        }
        this.l();
        if (this.c.h && !this.b()) {
            object = this.c;
            ((c)object).a = this.g(((c)object).i);
            object = this.c;
            ((c)object).l = ((c)object).a[((c)object).j];
        }
    }

    private void l() {
        this.c.f = this.n();
        this.c.g = this.n();
        int n8 = this.d();
        c c8 = this.c;
        boolean bl = (n8 & 0x80) != 0;
        c8.h = bl;
        c8.i = (int)Math.pow(2.0, (n8 & 7) + 1);
        this.c.j = this.d();
        this.c.k = this.d();
    }

    private void m() {
        do {
            this.f();
            byte[] byArray = this.a;
            if (byArray[0] != 1) continue;
            byte by = byArray[1];
            byte by2 = byArray[2];
            this.c.m = (by2 & 0xFF) << 8 | by & 0xFF;
        } while (this.d > 0 && !this.b());
    }

    private int n() {
        return this.b.getShort();
    }

    private void o() {
        this.b = null;
        Arrays.fill(this.a, (byte)0);
        this.c = new c();
        this.d = 0;
    }

    private void q() {
        int n8;
        do {
            n8 = this.d();
            int n9 = Math.min(this.b.position() + n8, this.b.limit());
            this.b.position(n9);
        } while (n8 > 0);
    }

    private void r() {
        this.d();
        this.q();
    }

    public void a() {
        this.b = null;
        this.c = null;
    }

    public c c() {
        if (this.b != null) {
            if (this.b()) {
                return this.c;
            }
            this.k();
            if (!this.b()) {
                this.h();
                c c8 = this.c;
                if (c8.c < 0) {
                    c8.b = 1;
                }
            }
            return this.c;
        }
        throw new IllegalStateException("You must call setData() before parseHeader()");
    }

    public d p(ByteBuffer byteBuffer) {
        this.o();
        this.b = byteBuffer = byteBuffer.asReadOnlyBuffer();
        byteBuffer.position(0);
        this.b.order(ByteOrder.LITTLE_ENDIAN);
        return this;
    }
}

