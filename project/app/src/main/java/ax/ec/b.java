/*
 * Decompiled with CFR 0.152.
 */
package ax.ec;

import ax.ec.c;

public class b
extends RuntimeException {
    private String q;

    private b(String string) {
        this.q = string;
    }

    public static b a(Class<? extends c> clazz) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("The expected feature ");
        stringBuilder.append(clazz);
        stringBuilder.append(" was missing. Use addFeature() in IBusConfiguration to add features.");
        return new b(stringBuilder.toString());
    }

    @Override
    public String toString() {
        return this.q;
    }
}

