/*
 * Decompiled with CFR 0.152.
 */
package ax.B2;

import ax.B2.g;

public abstract class h {
    public static h c() {
        return new h(){

            @Override
            public g a(String string) {
                return null;
            }
        };
    }

    public abstract g a(String var1);

    public final g b(String string) {
        g g8 = this.a(string);
        if (g8 == null) {
            return g.a(string);
        }
        return g8;
    }
}

