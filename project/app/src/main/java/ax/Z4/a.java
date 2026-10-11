/*
 * Decompiled with CFR 0.152.
 */
package ax.Z4;

import ax.T4.d;
import ax.T4.e;
import ax.T4.j;
import ax.T4.n;
import ax.W4.e;
import ax.W4.h;
import ax.W4.m;
import ax.Z4.g;
import ax.Z4.i;
import ax.a5.b;
import java.io.ByteArrayInputStream;
import java.io.CharConversionException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public final class a {
    private final e a;
    private final InputStream b;
    private final byte[] c;
    private int d;
    private int e;
    private final boolean f;
    private boolean g = true;
    private int h;

    public a(e e8, InputStream inputStream) {
        this.a = e8;
        this.b = inputStream;
        this.c = e8.e();
        this.d = 0;
        this.e = 0;
        this.f = true;
    }

    private boolean a(int n8) {
        block4: {
            block3: {
                block2: {
                    if ((0xFF00 & n8) != 0) break block2;
                    this.g = true;
                    break block3;
                }
                if ((n8 & 0xFF) != 0) break block4;
                this.g = false;
            }
            this.h = 2;
            return true;
        }
        return false;
    }

    private boolean b(int n8) throws IOException {
        block6: {
            block3: {
                block5: {
                    block4: {
                        block2: {
                            if (n8 >> 8 != 0) break block2;
                            this.g = true;
                            break block3;
                        }
                        if ((0xFFFFFF & n8) != 0) break block4;
                        this.g = false;
                        break block3;
                    }
                    if ((0xFF00FFFF & n8) != 0) break block5;
                    this.h("3412");
                    break block3;
                }
                if ((n8 & 0xFFFF00FF) != 0) break block6;
                this.h("2143");
            }
            this.h = 4;
            return true;
        }
        return false;
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean g(int n8) throws IOException {
        if (n8 != -16842752) {
            if (n8 == -131072) {
                this.d += 4;
                this.h = 4;
                this.g = false;
                return true;
            }
            if (n8 == 65279) {
                this.g = true;
                this.d += 4;
                this.h = 4;
                return true;
            }
            if (n8 == 65534) {
                this.h("2143");
            }
        } else {
            this.h("3412");
        }
        int n9 = n8 >>> 16;
        if (n9 == 65279) {
            this.d += 2;
            this.h = 2;
            this.g = true;
            return true;
        }
        if (n9 == 65534) {
            this.d += 2;
            this.h = 2;
            this.g = false;
            return true;
        }
        if (n8 >>> 8 == 0xEFBBBF) {
            this.d += 3;
            this.h = 1;
            this.g = true;
            return true;
        }
        return false;
    }

    private void h(String string) throws IOException {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Unsupported UCS-4 endianness (");
        stringBuilder.append(string);
        stringBuilder.append(") detected");
        throw new CharConversionException(stringBuilder.toString());
    }

    public j c(int n8, n n9, ax.a5.a a8, b b8, int n10) throws IOException {
        int n11 = this.d;
        d d8 = e.a.g0.l(n10) ? this.e() : ax.T4.d.e0;
        int n12 = this.d;
        if (d8 == ax.T4.d.e0 && e.a.d0.l(n10)) {
            a8 = a8.A(n10);
            return new i(this.a, n8, this.b, n9, a8, this.c, this.d, this.e, n12 - n11, this.f);
        }
        return new g(this.a, n8, this.d(), n9, b8.n(n10));
    }

    public Reader d() throws IOException {
        InputStream inputStream;
        d d8 = this.a.k();
        int n8 = d8.d();
        if (n8 != 8 && n8 != 16) {
            if (n8 == 32) {
                e e8 = this.a;
                return new m(e8, this.b, this.c, this.d, this.e, e8.k().j());
            }
            throw new RuntimeException("Internal error");
        }
        InputStream inputStream2 = this.b;
        if (inputStream2 == null) {
            inputStream = new ByteArrayInputStream(this.c, this.d, this.e);
        } else {
            inputStream = inputStream2;
            if (this.d < this.e) {
                inputStream = new h(this.a, inputStream2, this.c, this.d, this.e);
            }
        }
        return new InputStreamReader(inputStream, d8.h());
    }

    /*
     * Enabled aggressive block sorting
     */
    public d e() throws IOException {
        Object object;
        block5: {
            block7: {
                int n8;
                block8: {
                    byte by;
                    block6: {
                        if (!this.f(4)) break block6;
                        object = this.c;
                        int n9 = this.d;
                        byte by2 = object[n9];
                        n8 = object[n9 + 1];
                        byte by3 = object[n9 + 2];
                        if (!this.g(n8 = object[n9 + 3] & 0xFF | (by2 << 24 | (n8 & 0xFF) << 16 | (by3 & 0xFF) << 8)) && !this.b(n8) && !this.a(n8 >>> 16)) break block7;
                        break block8;
                    }
                    if (!this.f(2) || !this.a((object = this.c)[(n8 = this.d) + 1] & 0xFF | ((by = object[n8]) & 0xFF) << 8)) break block7;
                }
                if ((n8 = this.h) != 1) {
                    if (n8 != 2) {
                        if (n8 != 4) {
                            throw new RuntimeException("Internal error");
                        }
                        object = this.g ? (Object)((Object)ax.T4.d.h0) : (Object)((Object)ax.T4.d.i0);
                        break block5;
                    } else {
                        object = this.g ? (Object)((Object)ax.T4.d.f0) : (Object)((Object)ax.T4.d.g0);
                    }
                    break block5;
                } else {
                    object = (Object)ax.T4.d.e0;
                }
                break block5;
            }
            object = (Object)ax.T4.d.e0;
        }
        this.a.r((d)((Object)object));
        return object;
    }

    protected boolean f(int n8) throws IOException {
        int n9;
        for (int i8 = this.e - this.d; i8 < n8; i8 += n9) {
            InputStream inputStream = this.b;
            if (inputStream == null) {
                n9 = -1;
            } else {
                byte[] byArray = this.c;
                n9 = this.e;
                n9 = inputStream.read(byArray, n9, byArray.length - n9);
            }
            if (n9 < 1) {
                return false;
            }
            this.e += n9;
        }
        return true;
    }
}

