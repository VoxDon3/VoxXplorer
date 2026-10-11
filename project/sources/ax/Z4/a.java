package ax.Z4;

import ax.T4.e;
import ax.T4.n;
import ax.W4.m;
import ax.a5.C1370a;
import java.io.ByteArrayInputStream;
import java.io.CharConversionException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

/* loaded from: classes.dex */
public final class a {
    private final ax.W4.e a;
    private final InputStream b;
    private final byte[] c;
    private int h;
    private boolean g = true;
    private int d = 0;
    private int e = 0;
    private final boolean f = true;

    public a(ax.W4.e eVar, InputStream inputStream) {
        this.a = eVar;
        this.b = inputStream;
        this.c = eVar.e();
    }

    private boolean a(int i) {
        if ((65280 & i) == 0) {
            this.g = true;
        } else {
            if ((i & 255) != 0) {
                return false;
            }
            this.g = false;
        }
        this.h = 2;
        return true;
    }

    private boolean b(int i) throws IOException {
        if ((i >> 8) == 0) {
            this.g = true;
        } else if ((16777215 & i) == 0) {
            this.g = false;
        } else if (((-16711681) & i) == 0) {
            h("3412");
        } else {
            if ((i & (-65281)) != 0) {
                return false;
            }
            h("2143");
        }
        this.h = 4;
        return true;
    }

    private boolean g(int i) throws IOException {
        if (i == -16842752) {
            h("3412");
        } else {
            if (i == -131072) {
                this.d += 4;
                this.h = 4;
                this.g = false;
                return true;
            }
            if (i == 65279) {
                this.g = true;
                this.d += 4;
                this.h = 4;
                return true;
            }
            if (i == 65534) {
                h("2143");
            }
        }
        int i2 = i >>> 16;
        if (i2 == 65279) {
            this.d += 2;
            this.h = 2;
            this.g = true;
            return true;
        }
        if (i2 == 65534) {
            this.d += 2;
            this.h = 2;
            this.g = false;
            return true;
        }
        if ((i >>> 8) != 15711167) {
            return false;
        }
        this.d += 3;
        this.h = 1;
        this.g = true;
        return true;
    }

    private void h(String str) throws IOException {
        throw new CharConversionException("Unsupported UCS-4 endianness (" + str + ") detected");
    }

    public ax.T4.j c(int i, n nVar, C1370a c1370a, ax.a5.b bVar, int i2) throws IOException {
        int i3 = this.d;
        ax.T4.d e = e.a.CHARSET_DETECTION.l(i2) ? e() : ax.T4.d.UTF8;
        int i4 = this.d - i3;
        if (e == ax.T4.d.UTF8 && e.a.CANONICALIZE_FIELD_NAMES.l(i2)) {
            return new i(this.a, i, this.b, nVar, c1370a.A(i2), this.c, this.d, this.e, i4, this.f);
        }
        return new g(this.a, i, d(), nVar, bVar.n(i2));
    }

    public Reader d() throws IOException {
        ax.T4.d k = this.a.k();
        int d = k.d();
        if (d != 8 && d != 16) {
            if (d != 32) {
                throw new RuntimeException("Internal error");
            }
            ax.W4.e eVar = this.a;
            return new m(eVar, this.b, this.c, this.d, this.e, eVar.k().j());
        }
        InputStream inputStream = this.b;
        if (inputStream == null) {
            inputStream = new ByteArrayInputStream(this.c, this.d, this.e);
        } else if (this.d < this.e) {
            inputStream = new ax.W4.h(this.a, inputStream, this.c, this.d, this.e);
        }
        return new InputStreamReader(inputStream, k.h());
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x005b, code lost:
    
        if (a((r1[r4 + 1] & 255) | ((r1[r4] & 255) << 8)) != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x003e, code lost:
    
        if (a(r1 >>> 16) != false) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ax.T4.d e() throws java.io.IOException {
        /*
            r7 = this;
            r0 = 4
            boolean r1 = r7.f(r0)
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L41
            byte[] r1 = r7.c
            int r4 = r7.d
            r5 = r1[r4]
            int r5 = r5 << 24
            int r6 = r4 + 1
            r6 = r1[r6]
            r6 = r6 & 255(0xff, float:3.57E-43)
            int r6 = r6 << 16
            r5 = r5 | r6
            int r6 = r4 + 2
            r6 = r1[r6]
            r6 = r6 & 255(0xff, float:3.57E-43)
            int r6 = r6 << 8
            r5 = r5 | r6
            int r4 = r4 + 3
            r1 = r1[r4]
            r1 = r1 & 255(0xff, float:3.57E-43)
            r1 = r1 | r5
            boolean r4 = r7.g(r1)
            if (r4 == 0) goto L31
            goto L5d
        L31:
            boolean r4 = r7.b(r1)
            if (r4 == 0) goto L38
            goto L5d
        L38:
            int r1 = r1 >>> 16
            boolean r1 = r7.a(r1)
            if (r1 == 0) goto L84
            goto L5d
        L41:
            boolean r1 = r7.f(r2)
            if (r1 == 0) goto L84
            byte[] r1 = r7.c
            int r4 = r7.d
            r5 = r1[r4]
            r5 = r5 & 255(0xff, float:3.57E-43)
            int r5 = r5 << 8
            int r4 = r4 + r3
            r1 = r1[r4]
            r1 = r1 & 255(0xff, float:3.57E-43)
            r1 = r1 | r5
            boolean r1 = r7.a(r1)
            if (r1 == 0) goto L84
        L5d:
            int r1 = r7.h
            if (r1 == r3) goto L81
            if (r1 == r2) goto L77
            if (r1 != r0) goto L6f
            boolean r0 = r7.g
            if (r0 == 0) goto L6c
            ax.T4.d r0 = ax.T4.d.UTF32_BE
            goto L86
        L6c:
            ax.T4.d r0 = ax.T4.d.UTF32_LE
            goto L86
        L6f:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "Internal error"
            r0.<init>(r1)
            throw r0
        L77:
            boolean r0 = r7.g
            if (r0 == 0) goto L7e
            ax.T4.d r0 = ax.T4.d.UTF16_BE
            goto L86
        L7e:
            ax.T4.d r0 = ax.T4.d.UTF16_LE
            goto L86
        L81:
            ax.T4.d r0 = ax.T4.d.UTF8
            goto L86
        L84:
            ax.T4.d r0 = ax.T4.d.UTF8
        L86:
            ax.W4.e r1 = r7.a
            r1.r(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.Z4.a.e():ax.T4.d");
    }

    protected boolean f(int i) throws IOException {
        int read;
        int i2 = this.e - this.d;
        while (i2 < i) {
            InputStream inputStream = this.b;
            if (inputStream == null) {
                read = -1;
            } else {
                byte[] bArr = this.c;
                int i3 = this.e;
                read = inputStream.read(bArr, i3, bArr.length - i3);
            }
            if (read < 1) {
                return false;
            }
            this.e += read;
            i2 += read;
        }
        return true;
    }
}
