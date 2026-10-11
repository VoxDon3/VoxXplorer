/*
 * Decompiled with CFR 0.152.
 */
package ax.M5;

import ax.M5.p;

public final class i {
    private final String a;
    private final String b;

    public i(String string) {
        this(string, null);
    }

    public i(String string, String string2) {
        block5: {
            block4: {
                p.m(string, "log tag cannot be null");
                int n8 = string.length();
                boolean bl = false;
                if (n8 <= 23) {
                    bl = true;
                }
                p.c(bl, "tag \"%s\" is longer than the %d character maximum", string, 23);
                this.a = string;
                if (string2 == null) break block4;
                string = string2;
                if (string2.length() > 0) break block5;
            }
            string = null;
        }
        this.b = string;
    }
}

