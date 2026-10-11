/*
 * Decompiled with CFR 0.152.
 */
package ax.p4;

import ax.p4.j;
import ax.p4.s;

public class f
extends j {
    private final s c0;

    public f(String string, s s8, String string2) {
        super(string, string2);
        this.c0 = s8;
    }

    protected static String a(String string, s s8, Object object) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Exception in ");
        stringBuilder.append(string);
        if (object != null) {
            stringBuilder.append(": ");
            stringBuilder.append(object);
        }
        if (s8 != null) {
            stringBuilder.append(" (user message: ");
            stringBuilder.append(s8);
            stringBuilder.append(")");
        }
        return stringBuilder.toString();
    }

    public s b() {
        return this.c0;
    }
}

