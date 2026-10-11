/*
 * Decompiled with CFR 0.152.
 */
package ax.a6;

import ax.a6.h0;

public final class g0 {
    public static int a(int n8, int n9, String charSequence) {
        if (n8 >= 0 && n8 < n9) {
            return n8;
        }
        if (n8 >= 0) {
            if (n9 < 0) {
                charSequence = new StringBuilder();
                ((StringBuilder)charSequence).append("negative size: ");
                ((StringBuilder)charSequence).append(n9);
                throw new IllegalArgumentException(((StringBuilder)charSequence).toString());
            }
            charSequence = h0.a("%s (%s) must be less than size (%s)", "index", n8, n9);
        } else {
            charSequence = h0.a("%s (%s) must not be negative", "index", n8);
        }
        throw new IndexOutOfBoundsException((String)charSequence);
    }

    public static int b(int n8, int n9, String string) {
        if (n8 >= 0 && n8 <= n9) {
            return n8;
        }
        throw new IndexOutOfBoundsException(g0.d(n8, n9, "index"));
    }

    public static void c(int n8, int n9, int n10) {
        if (n8 >= 0 && n9 >= n8 && n9 <= n10) {
            return;
        }
        String string = n8 >= 0 && n8 <= n10 ? (n9 >= 0 && n9 <= n10 ? h0.a("end index (%s) must not be less than start index (%s)", n9, n8) : g0.d(n9, n10, "end index")) : g0.d(n8, n10, "start index");
        throw new IndexOutOfBoundsException(string);
    }

    private static String d(int n8, int n9, String charSequence) {
        if (n8 < 0) {
            return h0.a("%s (%s) must not be negative", charSequence, n8);
        }
        if (n9 >= 0) {
            return h0.a("%s (%s) must not be greater than size (%s)", charSequence, n8, n9);
        }
        charSequence = new StringBuilder();
        ((StringBuilder)charSequence).append("negative size: ");
        ((StringBuilder)charSequence).append(n9);
        throw new IllegalArgumentException(((StringBuilder)charSequence).toString());
    }
}

