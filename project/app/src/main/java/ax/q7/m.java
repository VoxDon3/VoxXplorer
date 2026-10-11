/*
 * Decompiled with CFR 0.152.
 */
package ax.q7;

import ax.q7.l;

final class m {
    private static final l a = m.a();

    private static l a() {
        return new b();
    }

    static String b(String string) {
        String string2 = string;
        if (string == null) {
            string2 = "";
        }
        return string2;
    }

    static boolean c(String string) {
        return string == null || string.isEmpty();
        {
        }
    }

    private static final class b
    implements l {
        private b() {
        }
    }
}

