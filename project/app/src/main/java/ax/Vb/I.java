/*
 * Decompiled with CFR 0.152.
 */
package ax.Vb;

import ax.Ob.h;
import ax.Vb.G;

final class I {
    public static final int a(String string, int n8, int n9, int n10) {
        return (int)G.c(string, n8, n9, n10);
    }

    public static final long b(String string, long l8, long l9, long l10) {
        CharSequence charSequence = G.d(string);
        if (charSequence == null) {
            return l8;
        }
        Comparable<Long> comparable = h.o((String)charSequence);
        if (comparable != null) {
            l8 = (Long)comparable;
            if (l9 <= l8 && l8 <= l10) {
                return l8;
            }
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append("System property '");
            ((StringBuilder)charSequence).append(string);
            ((StringBuilder)charSequence).append("' should be in range ");
            ((StringBuilder)charSequence).append(l9);
            ((StringBuilder)charSequence).append("..");
            ((StringBuilder)charSequence).append(l10);
            ((StringBuilder)charSequence).append(", but is '");
            ((StringBuilder)charSequence).append(l8);
            ((StringBuilder)charSequence).append('\'');
            throw new IllegalStateException(((StringBuilder)charSequence).toString().toString());
        }
        comparable = new StringBuilder();
        ((StringBuilder)comparable).append("System property '");
        ((StringBuilder)comparable).append(string);
        ((StringBuilder)comparable).append("' has unrecognized value '");
        ((StringBuilder)comparable).append((String)charSequence);
        ((StringBuilder)comparable).append('\'');
        throw new IllegalStateException(((StringBuilder)comparable).toString().toString());
    }

    public static final String c(String string, String string2) {
        if ((string = G.d(string)) == null) {
            return string2;
        }
        return string;
    }

    public static final boolean d(String string, boolean bl) {
        if ((string = G.d(string)) != null) {
            return Boolean.parseBoolean(string);
        }
        return bl;
    }

    public static /* synthetic */ int e(String string, int n8, int n9, int n10, int n11, Object object) {
        if ((n11 & 4) != 0) {
            n9 = 1;
        }
        if ((n11 & 8) != 0) {
            n10 = Integer.MAX_VALUE;
        }
        return G.b(string, n8, n9, n10);
    }

    public static /* synthetic */ long f(String string, long l8, long l9, long l10, int n8, Object object) {
        if ((n8 & 4) != 0) {
            l9 = 1L;
        }
        if ((n8 & 8) != 0) {
            l10 = Long.MAX_VALUE;
        }
        return G.c(string, l8, l9, l10);
    }
}

