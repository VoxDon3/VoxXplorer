/*
 * Decompiled with CFR 0.152.
 */
package ax.j0;

import android.view.View;
import android.view.ViewGroup;
import ax.Gb.l;
import ax.c0.j0;
import ax.c0.k0;
import ax.j0.c;
import ax.j0.d;

public final class a {
    private static final int a = d.b;
    private static final int b = d.a;

    public static final void a(View object) {
        l.f(object, "<this>");
        object = k0.a((View)object).iterator();
        while (object.hasNext()) {
            ax.j0.a.c((View)object.next()).a();
        }
    }

    public static final void b(ViewGroup object) {
        l.f(object, "<this>");
        object = j0.a((ViewGroup)object).iterator();
        while (object.hasNext()) {
            ax.j0.a.c((View)object.next()).a();
        }
    }

    private static final c c(View view) {
        c c8;
        int n8 = a;
        c c9 = c8 = (c)view.getTag(n8);
        if (c8 == null) {
            c9 = new c();
            view.setTag(n8, (Object)c9);
        }
        return c9;
    }

    public static final void d(View view, boolean bl) {
        l.f(view, "<this>");
        view.setTag(b, (Object)bl);
    }
}

