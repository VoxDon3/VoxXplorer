/*
 * Decompiled with CFR 0.152.
 */
package ax.Rd;

import ax.Rd.b;
import ax.Sd.b;
import ax.Sd.f;
import ax.Sd.i;
import ax.Sd.j;
import ax.Sd.k;
import ax.Sd.l;
import java.util.Locale;

public class c {
    private a a;
    private boolean b;
    private boolean c;
    private boolean d;
    private boolean e = true;
    private byte f;
    private String g;
    private ax.Sd.b[] h = new ax.Sd.b[3];
    private ax.Sd.b i = null;

    public c(ax.Rd.a a8) {
        this.f();
    }

    protected static String b(byte[] byArray, int n8) {
        int n9 = byArray.length;
        int n10 = n8 + 3;
        if (n9 > n10) {
            int n11 = byArray[n8] & 0xFF;
            n9 = byArray[n8 + 1] & 0xFF;
            n8 = byArray[n8 + 2] & 0xFF;
            n10 = byArray[n10] & 0xFF;
            if (n11 != 0) {
                if (n11 != 239) {
                    if (n11 != 254) {
                        if (n11 == 255) {
                            if (n9 == 254 && n8 == 0 && n10 == 0) {
                                return ax.Rd.b.y;
                            }
                            if (n9 == 254) {
                                return ax.Rd.b.w;
                            }
                        }
                    } else {
                        if (n9 == 255 && n8 == 0 && n10 == 0) {
                            return ax.Rd.b.D;
                        }
                        if (n9 == 255) {
                            return ax.Rd.b.v;
                        }
                    }
                } else if (n9 == 187 && n8 == 191) {
                    return ax.Rd.b.u;
                }
            } else {
                if (n9 == 0 && n8 == 254 && n10 == 255) {
                    return ax.Rd.b.x;
                }
                if (n9 == 0 && n8 == 255 && n10 == 254) {
                    return ax.Rd.b.E;
                }
            }
        }
        return null;
    }

    private void e(String string) {
    }

    public void a() {
        if (this.d) {
            Object object = this.g;
            if (object != null) {
                this.b = true;
                this.e((String)object);
                return;
            }
            object = Locale.getDefault();
            ax.Sd.b[] bArray = this.a;
            if (bArray == ax.Rd.c$a.d0) {
                int n8 = 0;
                float f8 = 0.0f;
                for (int i8 = 0; i8 < (bArray = this.h).length; ++i8) {
                    float f9 = bArray[i8].d() * k.b((Locale)object, this.h[i8]);
                    float f10 = f8;
                    if (f9 > f8) {
                        n8 = i8;
                        f10 = f9;
                    }
                    f8 = f10;
                }
                if (f8 > 0.2f) {
                    this.g = object = bArray[n8].c();
                    this.e((String)object);
                    return;
                }
            } else if (bArray != ax.Rd.c$a.c0 && bArray == ax.Rd.c$a.q && this.e) {
                this.g = object = ax.Rd.b.A;
                this.e((String)object);
            }
        }
    }

    public String c() {
        return this.g;
    }

    public void d(byte[] byArray, int n8, int n9) {
        if (!this.b && n9 != 0) {
            int n10;
            Object object;
            if (n9 > 0) {
                this.d = true;
            }
            boolean bl = this.c;
            int n11 = 0;
            if (bl) {
                this.c = false;
                if (n9 > 3 && (object = ax.Rd.c.b(byArray, n8)) != null) {
                    this.g = object;
                    this.b = true;
                    return;
                }
            }
            for (n10 = n8; n10 < n8 + n9; ++n10) {
                a a8;
                byte by = byArray[n10];
                int n12 = by & 0xFF;
                if ((by & 0x80) != 0 && n12 != 160) {
                    a8 = this.a;
                    object = ax.Rd.c$a.d0;
                    if (a8 == object) continue;
                    this.a = object;
                    if (this.i != null) {
                        this.i = null;
                    }
                    if ((object = this.h)[0] == null) {
                        object[0] = new j();
                    }
                    if ((object = this.h)[1] == null) {
                        object[1] = new l();
                    }
                    if ((object = this.h)[2] != null) continue;
                    object[2] = new i();
                    continue;
                }
                a8 = this.a;
                object = ax.Rd.c$a.q;
                if (a8 == object && (n12 == 27 || n12 == 123 && this.f == 126)) {
                    this.a = ax.Rd.c$a.c0;
                }
                if (this.a == object && this.e) {
                    bl = n12 >= 32 && n12 <= 126 || n12 == 10 || n12 == 13 || n12 == 9;
                    this.e = bl;
                }
                this.f = by;
            }
            object = this.a;
            if (object == ax.Rd.c$a.c0) {
                if (this.i == null) {
                    this.i = new f();
                }
                if (this.i.f(byArray, n8, n9) == b.a.c0 || 0.99f == this.i.d()) {
                    this.b = true;
                    this.g = this.i.c();
                    return;
                }
            } else if (object == ax.Rd.c$a.d0) {
                for (n10 = n11; n10 < ((ax.Sd.b[])(object = this.h)).length; ++n10) {
                    if (object[n10].f(byArray, n8, n9) != b.a.c0) continue;
                    this.b = true;
                    this.g = this.h[n10].c();
                    return;
                }
            }
        }
    }

    public final void f() {
        int n8 = 0;
        this.b = false;
        this.c = true;
        this.g = null;
        this.d = false;
        this.a = ax.Rd.c$a.q;
        this.f = 0;
        Object object = this.i;
        int n9 = n8;
        if (object != null) {
            ((ax.Sd.b)object).j();
            n9 = n8;
        }
        while (n9 < ((ax.Sd.b[])(object = this.h)).length) {
            if ((object = object[n9]) != null) {
                ((ax.Sd.b)object).j();
            }
            ++n9;
        }
    }

    private static final class a
    extends Enum<a> {
        public static final /* enum */ a c0;
        public static final /* enum */ a d0;
        private static final a[] e0;
        public static final /* enum */ a q;

        static {
            q = new a();
            c0 = new a();
            d0 = new a();
            e0 = ax.Rd.c$a.d();
        }

        private static /* synthetic */ a[] d() {
            return new a[]{q, c0, d0};
        }

        public static a valueOf(String string) {
            return Enum.valueOf(a.class, string);
        }

        public static a[] values() {
            return (a[])e0.clone();
        }
    }
}

