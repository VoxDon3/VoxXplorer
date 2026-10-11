/*
 * Decompiled with CFR 0.152.
 */
package ax.Sd;

import android.os.Build;
import android.os.LocaleList;
import ax.Sd.a;
import ax.Sd.b;
import ax.Sd.c;
import ax.Sd.d;
import ax.Sd.e;
import ax.Sd.g;
import ax.Sd.m;
import ax.Sd.o;
import ax.X2.I;
import ax.Y.k;
import ax.Y.n;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class j
extends b {
    private b.a b;
    private List<b> c = new ArrayList<b>();
    private b d;
    private int e;

    public j() {
        if (this.m()) {
            this.c.add(new g());
        }
        this.c.add(new o());
        this.c.add(new a());
        this.c.add(new m());
        this.c.add(new c());
        this.c.add(new d());
        this.c.add(new e());
        this.j();
    }

    private boolean m() {
        Object object;
        if (Build.VERSION.SDK_INT >= 31) {
            object = I.a();
            for (int i8 = 0; i8 < k.a((LocaleList)object); ++i8) {
                Locale locale = n.a((LocaleList)object, i8);
                if (!"zh".equals(locale.getLanguage()) || !"CN".equals(locale.getCountry())) continue;
                return true;
            }
        }
        return "zh".equals(((Locale)(object = Locale.getDefault())).getLanguage()) && "CN".equals(((Locale)object).getCountry());
    }

    @Override
    public String c() {
        if (this.d == null) {
            this.d();
            if (this.d == null) {
                this.d = this.c.get(0);
            }
        }
        return this.d.c();
    }

    @Override
    public float d() {
        Object object = this.b;
        if (object == b.a.c0) {
            return 0.99f;
        }
        if (object == b.a.d0) {
            return 0.01f;
        }
        object = this.c.iterator();
        float f8 = 0.0f;
        while (object.hasNext()) {
            float f9;
            b b8 = (b)object.next();
            if (!b8.g() || !(f8 < (f9 = b8.d()))) continue;
            this.d = b8;
            f8 = f9;
        }
        return f8;
    }

    @Override
    public b.a e() {
        return this.b;
    }

    @Override
    public b.a f(byte[] object, int n8, int n9) {
        int n10;
        byte[] byArray = new byte[n9];
        boolean bl = true;
        int n11 = 0;
        int n12 = n8;
        while ((n10 = n12) < n9 + n8) {
            boolean bl2;
            byte by = object[n10];
            if ((by & 0x80) != 0) {
                byArray[n11] = by;
                n12 = n11 + 1;
                bl2 = true;
            } else {
                bl2 = bl;
                n12 = n11;
                if (bl) {
                    byArray[n11] = by;
                    n12 = n11 + 1;
                    bl2 = false;
                }
            }
            bl = bl2;
            n11 = n12;
            n12 = ++n10;
        }
        object = this.c.iterator();
        while (object.hasNext()) {
            b.a a8;
            b b8 = (b)object.next();
            if (!b8.g()) continue;
            b.a a9 = b8.f(byArray, 0, n11);
            if (a9 != (a8 = b.a.c0) && 0.99f != b8.d()) {
                a8 = b.a.d0;
                if (a9 != a8) continue;
                b8.k(false);
                this.e = n8 = this.e - 1;
                if (n8 > 0) continue;
                this.b = a8;
                break;
            }
            this.d = b8;
            this.b = a8;
            break;
        }
        return this.b;
    }

    @Override
    public final void j() {
        this.e = 0;
        for (b b8 : this.c) {
            b8.j();
            b8.k(true);
            ++this.e;
        }
        this.d = null;
        this.b = b.a.q;
    }

    public b l() {
        return this.d;
    }
}

