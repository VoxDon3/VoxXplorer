package ax.T;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.Handler;
import ax.S.e;
import ax.S.h;
import ax.Z.k;

/* loaded from: classes.dex */
public class e {
    private static final k a;
    private static final ax.B.j<String, Typeface> b;

    public static class a extends k.c {
        private h.e a;

        public a(h.e eVar) {
            this.a = eVar;
        }

        @Override // ax.Z.k.c
        public void a(int i) {
            h.e eVar = this.a;
            if (eVar != null) {
                eVar.f(i);
            }
        }

        @Override // ax.Z.k.c
        public void b(Typeface typeface) {
            h.e eVar = this.a;
            if (eVar != null) {
                eVar.g(typeface);
            }
        }
    }

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            a = new j();
        } else if (i >= 28) {
            a = new i();
        } else if (i >= 26) {
            a = new h();
        } else if (i < 24 || !g.j()) {
            a = new f();
        } else {
            a = new g();
        }
        b = new ax.B.j<>(16);
    }

    public static Typeface a(Context context, Typeface typeface, int i) {
        if (context != null) {
            return Typeface.create(typeface, i);
        }
        throw new IllegalArgumentException("Context cannot be null");
    }

    public static Typeface b(Context context, CancellationSignal cancellationSignal, k.b[] bVarArr, int i) {
        return a.b(context, cancellationSignal, bVarArr, i);
    }

    public static Typeface c(Context context, e.b bVar, Resources resources, int i, String str, int i2, int i3, h.e eVar, Handler handler, boolean z) {
        Typeface a2;
        if (bVar instanceof e.C0186e) {
            e.C0186e c0186e = (e.C0186e) bVar;
            Typeface g = g(c0186e.c());
            if (g != null) {
                if (eVar != null) {
                    eVar.d(g, handler);
                }
                return g;
            }
            a2 = ax.Z.k.c(context, c0186e.b(), i3, !z ? eVar != null : c0186e.a() != 0, z ? c0186e.d() : -1, h.e.e(handler), new a(eVar));
        } else {
            a2 = a.a(context, (e.c) bVar, resources, i3);
            if (eVar != null) {
                if (a2 != null) {
                    eVar.d(a2, handler);
                } else {
                    eVar.c(-3, handler);
                }
            }
        }
        if (a2 != null) {
            b.d(e(resources, i, str, i2, i3), a2);
        }
        return a2;
    }

    public static Typeface d(Context context, Resources resources, int i, String str, int i2, int i3) {
        Typeface d = a.d(context, resources, i, str, i3);
        if (d != null) {
            b.d(e(resources, i, str, i2, i3), d);
        }
        return d;
    }

    private static String e(Resources resources, int i, String str, int i2, int i3) {
        return resources.getResourcePackageName(i) + '-' + str + '-' + i2 + '-' + i + '-' + i3;
    }

    public static Typeface f(Resources resources, int i, String str, int i2, int i3) {
        return b.c(e(resources, i, str, i2, i3));
    }

    private static Typeface g(String str) {
        if (str != null && !str.isEmpty()) {
            Typeface create = Typeface.create(str, 0);
            Typeface create2 = Typeface.create(Typeface.DEFAULT, 0);
            if (create != null && !create.equals(create2)) {
                return create;
            }
        }
        return null;
    }
}
