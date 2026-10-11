/*
 * Decompiled with CFR 0.152.
 */
package ax.xc;

import ax.Gb.l;

public final class E {
    /*
     * Enabled aggressive block sorting
     */
    public static final long a(String charSequence, int n8, int n9) {
        l.f(charSequence, "<this>");
        if (n8 < 0) {
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append("beginIndex < 0: ");
            ((StringBuilder)charSequence).append(n8);
            throw new IllegalArgumentException(((StringBuilder)charSequence).toString().toString());
        }
        if (n9 < n8) {
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append("endIndex < beginIndex: ");
            ((StringBuilder)charSequence).append(n9);
            ((StringBuilder)charSequence).append(" < ");
            ((StringBuilder)charSequence).append(n8);
            throw new IllegalArgumentException(((StringBuilder)charSequence).toString().toString());
        }
        if (n9 > ((String)charSequence).length()) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("endIndex > string.length: ");
            stringBuilder.append(n9);
            stringBuilder.append(" > ");
            stringBuilder.append(((String)charSequence).length());
            throw new IllegalArgumentException(stringBuilder.toString().toString());
        }
        long l8 = 0L;
        while (n8 < n9) {
            char c8 = ((String)charSequence).charAt(n8);
            if (c8 < '\u0080') {
                ++l8;
            } else {
                int n10;
                if (c8 < '\u0800') {
                    n10 = 2;
                } else {
                    if (c8 >= '\ud800' && c8 <= '\udfff') {
                        int n11 = n8 + 1;
                        n10 = n11 < n9 ? (int)((String)charSequence).charAt(n11) : 0;
                        if (c8 <= '\udbff' && n10 >= 56320 && n10 <= 57343) {
                            l8 += (long)4;
                            n8 += 2;
                            continue;
                        }
                        ++l8;
                        n8 = n11;
                        continue;
                    }
                    n10 = 3;
                }
                l8 += (long)n10;
            }
            ++n8;
        }
        return l8;
    }

    public static /* synthetic */ long b(String string, int n8, int n9, int n10, Object object) {
        if ((n10 & 1) != 0) {
            n8 = 0;
        }
        if ((n10 & 2) != 0) {
            n9 = string.length();
        }
        return E.a(string, n8, n9);
    }
}

