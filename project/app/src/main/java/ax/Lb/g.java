/*
 * Decompiled with CFR 0.152.
 */
package ax.Lb;

import ax.Gb.l;

class g {
    public static final void a(boolean bl, Number number) {
        l.f(number, "step");
        if (bl) {
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Step must be positive, was: ");
        stringBuilder.append(number);
        stringBuilder.append('.');
        throw new IllegalArgumentException(stringBuilder.toString());
    }
}

