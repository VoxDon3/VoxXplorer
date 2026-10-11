package ax.n;

import java.util.LinkedHashSet;
import java.util.Locale;

/* renamed from: ax.n.C, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C2558C {
    private static ax.Y.h a(ax.Y.h hVar, ax.Y.h hVar2) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int i = 0;
        while (i < hVar.g() + hVar2.g()) {
            Locale d = i < hVar.g() ? hVar.d(i) : hVar2.d(i - hVar.g());
            if (d != null) {
                linkedHashSet.add(d);
            }
            i++;
        }
        return ax.Y.h.a((Locale[]) linkedHashSet.toArray(new Locale[linkedHashSet.size()]));
    }

    static ax.Y.h b(ax.Y.h hVar, ax.Y.h hVar2) {
        return (hVar == null || hVar.f()) ? ax.Y.h.e() : a(hVar, hVar2);
    }
}
