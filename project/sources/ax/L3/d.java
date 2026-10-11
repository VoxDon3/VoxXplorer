package ax.L3;

import android.util.Log;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public class d {
    private ByteBuffer b;
    private c c;
    private final byte[] a = new byte[256];
    private int d = 0;

    private boolean b() {
        return this.c.b != 0;
    }

    private int d() {
        try {
            return this.b.get() & 255;
        } catch (Exception unused) {
            this.c.b = 1;
            return 0;
        }
    }

    private void e() {
        this.c.d.a = n();
        this.c.d.b = n();
        this.c.d.c = n();
        this.c.d.d = n();
        int d = d();
        boolean z = (d & 128) != 0;
        int pow = (int) Math.pow(2.0d, (d & 7) + 1);
        b bVar = this.c.d;
        bVar.e = (d & 64) != 0;
        if (z) {
            bVar.k = g(pow);
        } else {
            bVar.k = null;
        }
        this.c.d.j = this.b.position();
        r();
        if (b()) {
            return;
        }
        c cVar = this.c;
        cVar.c++;
        cVar.e.add(cVar.d);
    }

    private int f() {
        int d = d();
        this.d = d;
        int i = 0;
        if (d > 0) {
            int i2 = 0;
            while (true) {
                try {
                    i2 = this.d;
                    if (i >= i2) {
                        break;
                    }
                    i2 -= i;
                    this.b.get(this.a, i, i2);
                    i += i2;
                } catch (Exception e) {
                    if (Log.isLoggable("GifHeaderParser", 3)) {
                        Log.d("GifHeaderParser", "Error Reading Block n: " + i + " count: " + i2 + " blockSize: " + this.d, e);
                    }
                    this.c.b = 1;
                }
            }
        }
        return i;
    }

    private int[] g(int i) {
        byte[] bArr = new byte[i * 3];
        int[] iArr = null;
        try {
            this.b.get(bArr);
            iArr = new int[256];
            int i2 = 0;
            int i3 = 0;
            while (i2 < i) {
                int i4 = bArr[i3] & 255;
                int i5 = i3 + 2;
                int i6 = bArr[i3 + 1] & 255;
                i3 += 3;
                int i7 = i2 + 1;
                iArr[i2] = (i6 << 8) | (i4 << 16) | (-16777216) | (bArr[i5] & 255);
                i2 = i7;
            }
            return iArr;
        } catch (BufferUnderflowException e) {
            if (Log.isLoggable("GifHeaderParser", 3)) {
                Log.d("GifHeaderParser", "Format Error Reading Color Table", e);
            }
            this.c.b = 1;
            return iArr;
        }
    }

    private void h() {
        i(SubsamplingScaleImageView.TILE_SIZE_AUTO);
    }

    private void i(int i) {
        boolean z = false;
        while (!z && !b() && this.c.c <= i) {
            int d = d();
            if (d == 33) {
                int d2 = d();
                if (d2 == 1) {
                    q();
                } else if (d2 == 249) {
                    this.c.d = new b();
                    j();
                } else if (d2 == 254) {
                    q();
                } else if (d2 != 255) {
                    q();
                } else {
                    f();
                    String str = HttpUrl.FRAGMENT_ENCODE_SET;
                    for (int i2 = 0; i2 < 11; i2++) {
                        str = str + ((char) this.a[i2]);
                    }
                    if (str.equals("NETSCAPE2.0")) {
                        m();
                    } else {
                        q();
                    }
                }
            } else if (d == 44) {
                c cVar = this.c;
                if (cVar.d == null) {
                    cVar.d = new b();
                }
                e();
            } else if (d != 59) {
                this.c.b = 1;
            } else {
                z = true;
            }
        }
    }

    private void j() {
        d();
        int d = d();
        b bVar = this.c.d;
        int i = (d & 28) >> 2;
        bVar.g = i;
        if (i == 0) {
            bVar.g = 1;
        }
        bVar.f = (d & 1) != 0;
        int n = n();
        if (n < 2) {
            n = 10;
        }
        b bVar2 = this.c.d;
        bVar2.i = n * 10;
        bVar2.h = d();
        d();
    }

    private void k() {
        String str = HttpUrl.FRAGMENT_ENCODE_SET;
        for (int i = 0; i < 6; i++) {
            str = str + ((char) d());
        }
        if (!str.startsWith("GIF")) {
            this.c.b = 1;
            return;
        }
        l();
        if (!this.c.h || b()) {
            return;
        }
        c cVar = this.c;
        cVar.a = g(cVar.i);
        c cVar2 = this.c;
        cVar2.l = cVar2.a[cVar2.j];
    }

    private void l() {
        this.c.f = n();
        this.c.g = n();
        int d = d();
        c cVar = this.c;
        cVar.h = (d & 128) != 0;
        cVar.i = (int) Math.pow(2.0d, (d & 7) + 1);
        this.c.j = d();
        this.c.k = d();
    }

    private void m() {
        do {
            f();
            byte[] bArr = this.a;
            if (bArr[0] == 1) {
                this.c.m = ((bArr[2] & 255) << 8) | (bArr[1] & 255);
            }
            if (this.d <= 0) {
                return;
            }
        } while (!b());
    }

    private int n() {
        return this.b.getShort();
    }

    private void o() {
        this.b = null;
        Arrays.fill(this.a, (byte) 0);
        this.c = new c();
        this.d = 0;
    }

    private void q() {
        int d;
        do {
            d = d();
            this.b.position(Math.min(this.b.position() + d, this.b.limit()));
        } while (d > 0);
    }

    private void r() {
        d();
        q();
    }

    public void a() {
        this.b = null;
        this.c = null;
    }

    public c c() {
        if (this.b == null) {
            throw new IllegalStateException("You must call setData() before parseHeader()");
        }
        if (b()) {
            return this.c;
        }
        k();
        if (!b()) {
            h();
            c cVar = this.c;
            if (cVar.c < 0) {
                cVar.b = 1;
            }
        }
        return this.c;
    }

    public d p(ByteBuffer byteBuffer) {
        o();
        ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        this.b = asReadOnlyBuffer;
        asReadOnlyBuffer.position(0);
        this.b.order(ByteOrder.LITTLE_ENDIAN);
        return this;
    }
}
