package ax.Rd;

import ax.Sd.b;
import ax.Sd.f;
import ax.Sd.i;
import ax.Sd.j;
import ax.Sd.k;
import ax.Sd.l;
import java.util.Locale;

/* loaded from: classes3.dex */
public class c {
    private a a;
    private boolean b;
    private boolean c;
    private boolean d;
    private byte f;
    private String g;
    private boolean e = true;
    private ax.Sd.b i = null;
    private ax.Sd.b[] h = new ax.Sd.b[3];

    private enum a {
        PURE_ASCII,
        ESC_ASCII,
        HIGHBYTE
    }

    public c(ax.Rd.a aVar) {
        f();
    }

    protected static String b(byte[] bArr, int i) {
        int i2 = i + 3;
        if (bArr.length <= i2) {
            return null;
        }
        int i3 = bArr[i] & 255;
        int i4 = bArr[i + 1] & 255;
        int i5 = bArr[i + 2] & 255;
        int i6 = bArr[i2] & 255;
        if (i3 == 0) {
            if (i4 == 0 && i5 == 254 && i6 == 255) {
                return b.x;
            }
            if (i4 == 0 && i5 == 255 && i6 == 254) {
                return b.E;
            }
            return null;
        }
        if (i3 == 239) {
            if (i4 == 187 && i5 == 191) {
                return b.u;
            }
            return null;
        }
        if (i3 == 254) {
            if (i4 == 255 && i5 == 0 && i6 == 0) {
                return b.D;
            }
            if (i4 == 255) {
                return b.v;
            }
            return null;
        }
        if (i3 != 255) {
            return null;
        }
        if (i4 == 254 && i5 == 0 && i6 == 0) {
            return b.y;
        }
        if (i4 == 254) {
            return b.w;
        }
        return null;
    }

    public void a() {
        ax.Sd.b[] bVarArr;
        if (this.d) {
            String str = this.g;
            if (str != null) {
                this.b = true;
                e(str);
                return;
            }
            Locale locale = Locale.getDefault();
            a aVar = this.a;
            if (aVar != a.HIGHBYTE) {
                if (aVar != a.ESC_ASCII && aVar == a.PURE_ASCII && this.e) {
                    String str2 = b.A;
                    this.g = str2;
                    e(str2);
                    return;
                }
                return;
            }
            int i = 0;
            int i2 = 0;
            float f = 0.0f;
            while (true) {
                bVarArr = this.h;
                if (i >= bVarArr.length) {
                    break;
                }
                float d = bVarArr[i].d() * k.b(locale, this.h[i]);
                if (d > f) {
                    i2 = i;
                    f = d;
                }
                i++;
            }
            if (f > 0.2f) {
                String c = bVarArr[i2].c();
                this.g = c;
                e(c);
            }
        }
    }

    public String c() {
        return this.g;
    }

    public void d(byte[] bArr, int i, int i2) {
        String b;
        if (this.b || i2 == 0) {
            return;
        }
        if (i2 > 0) {
            this.d = true;
        }
        int i3 = 0;
        if (this.c) {
            this.c = false;
            if (i2 > 3 && (b = b(bArr, i)) != null) {
                this.g = b;
                this.b = true;
                return;
            }
        }
        int i4 = i + i2;
        for (int i5 = i; i5 < i4; i5++) {
            byte b2 = bArr[i5];
            int i6 = b2 & 255;
            if ((b2 & 128) == 0 || i6 == 160) {
                a aVar = this.a;
                a aVar2 = a.PURE_ASCII;
                if (aVar == aVar2 && (i6 == 27 || (i6 == 123 && this.f == 126))) {
                    this.a = a.ESC_ASCII;
                }
                if (this.a == aVar2 && this.e) {
                    this.e = (i6 >= 32 && i6 <= 126) || i6 == 10 || i6 == 13 || i6 == 9;
                }
                this.f = b2;
            } else {
                a aVar3 = this.a;
                a aVar4 = a.HIGHBYTE;
                if (aVar3 != aVar4) {
                    this.a = aVar4;
                    if (this.i != null) {
                        this.i = null;
                    }
                    ax.Sd.b[] bVarArr = this.h;
                    if (bVarArr[0] == null) {
                        bVarArr[0] = new j();
                    }
                    ax.Sd.b[] bVarArr2 = this.h;
                    if (bVarArr2[1] == null) {
                        bVarArr2[1] = new l();
                    }
                    ax.Sd.b[] bVarArr3 = this.h;
                    if (bVarArr3[2] == null) {
                        bVarArr3[2] = new i();
                    }
                }
            }
        }
        a aVar5 = this.a;
        if (aVar5 == a.ESC_ASCII) {
            if (this.i == null) {
                this.i = new f();
            }
            if (this.i.f(bArr, i, i2) == b.a.FOUND_IT || 0.99f == this.i.d()) {
                this.b = true;
                this.g = this.i.c();
                return;
            }
            return;
        }
        if (aVar5 != a.HIGHBYTE) {
            return;
        }
        while (true) {
            ax.Sd.b[] bVarArr4 = this.h;
            if (i3 >= bVarArr4.length) {
                return;
            }
            if (bVarArr4[i3].f(bArr, i, i2) == b.a.FOUND_IT) {
                this.b = true;
                this.g = this.h[i3].c();
                return;
            }
            i3++;
        }
    }

    public final void f() {
        int i = 0;
        this.b = false;
        this.c = true;
        this.g = null;
        this.d = false;
        this.a = a.PURE_ASCII;
        this.f = (byte) 0;
        ax.Sd.b bVar = this.i;
        if (bVar != null) {
            bVar.j();
        }
        while (true) {
            ax.Sd.b[] bVarArr = this.h;
            if (i >= bVarArr.length) {
                return;
            }
            ax.Sd.b bVar2 = bVarArr[i];
            if (bVar2 != null) {
                bVar2.j();
            }
            i++;
        }
    }

    private void e(String str) {
    }
}
