/*
 * Decompiled with CFR 0.152.
 */
package ax.w9;

import ax.D8.c;
import ax.w9.b;
import ax.w9.e;

public class a
extends b {
    @Override
    protected void b(c c8) throws e {
        block8: {
            block7: {
                if (c8.p().toString().contains("not_defined_in_RFC4178@please_ignore")) break block7;
                int n8 = c8.r();
                if (n8 == 0) break block8;
                if (n8 != 1) {
                    if (n8 != 2) {
                        if (n8 != 3 && n8 != 4) {
                            StringBuilder stringBuilder = new StringBuilder();
                            stringBuilder.append("Unknown Object Tag ");
                            stringBuilder.append(c8.r());
                            stringBuilder.append(" encountered.");
                            throw new e(stringBuilder.toString());
                        }
                    } else {
                        this.k(c8.p());
                    }
                }
            }
            return;
        }
        this.l(c8.p());
    }
}

