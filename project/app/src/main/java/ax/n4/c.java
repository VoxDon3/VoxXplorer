/*
 * Decompiled with CFR 0.152.
 */
package ax.n4;

import ax.n4.k;

public class c {
    public static final c a = new c();

    protected void a(StringBuilder stringBuilder, String string, boolean bl) {
        int n8;
        int n9 = 0;
        boolean bl2 = bl;
        if (!bl) {
            n8 = 0;
            while (true) {
                bl2 = bl;
                if (n8 >= string.length()) break;
                bl2 = bl;
                if (bl) break;
                bl = this.c(string.charAt(n8));
                ++n8;
            }
        }
        n8 = n9;
        if (bl2) {
            stringBuilder.append('\"');
            n8 = n9;
        }
        while (n8 < string.length()) {
            char c8 = string.charAt(n8);
            if (this.d(c8)) {
                stringBuilder.append('\\');
            }
            stringBuilder.append(c8);
            ++n8;
        }
        if (bl2) {
            stringBuilder.append('\"');
        }
    }

    public StringBuilder b(StringBuilder stringBuilder, k object, boolean bl) {
        stringBuilder.append(object.getName());
        object = object.getValue();
        if (object != null) {
            stringBuilder.append('=');
            this.a(stringBuilder, (String)object, bl);
        }
        return stringBuilder;
    }

    protected boolean c(char c8) {
        return " ;,:@()<>\\\"/[]?={}\t".indexOf(c8) >= 0;
    }

    protected boolean d(char c8) {
        return "\"\\".indexOf(c8) >= 0;
    }
}

