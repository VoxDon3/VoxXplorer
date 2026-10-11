/*
 * Decompiled with CFR 0.152.
 */
package ax.n;

import ax.Y.h;
import java.util.LinkedHashSet;
import java.util.Locale;

final class C {
    private static h a(h h8, h h9) {
        LinkedHashSet<Locale> linkedHashSet = new LinkedHashSet<Locale>();
        for (int i8 = 0; i8 < h8.g() + h9.g(); ++i8) {
            Locale locale = i8 < h8.g() ? h8.d(i8) : h9.d(i8 - h8.g());
            if (locale == null) continue;
            linkedHashSet.add(locale);
        }
        return h.a(linkedHashSet.toArray(new Locale[linkedHashSet.size()]));
    }

    static h b(h h8, h h9) {
        if (h8 != null && !h8.f()) {
            return C.a(h8, h9);
        }
        return h.e();
    }
}

