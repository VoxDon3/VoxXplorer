package ax.j0;

import android.view.View;
import android.view.ViewGroup;
import ax.Gb.l;
import ax.c0.C1772j0;
import ax.c0.C1774k0;
import java.util.Iterator;

/* renamed from: ax.j0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2301a {
    private static final int a = d.b;
    private static final int b = d.a;

    public static final void a(View view) {
        l.f(view, "<this>");
        Iterator<View> it = C1774k0.a(view).iterator();
        while (it.hasNext()) {
            c(it.next()).a();
        }
    }

    public static final void b(ViewGroup viewGroup) {
        l.f(viewGroup, "<this>");
        Iterator<View> it = C1772j0.a(viewGroup).iterator();
        while (it.hasNext()) {
            c(it.next()).a();
        }
    }

    private static final c c(View view) {
        int i = a;
        c cVar = (c) view.getTag(i);
        if (cVar != null) {
            return cVar;
        }
        c cVar2 = new c();
        view.setTag(i, cVar2);
        return cVar2;
    }

    public static final void d(View view, boolean z) {
        l.f(view, "<this>");
        view.setTag(b, Boolean.valueOf(z));
    }
}
