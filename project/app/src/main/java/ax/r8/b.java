/*
 * Decompiled with CFR 0.152.
 */
package ax.r8;

import ax.t8.a;
import java.lang.reflect.Field;

public final class b {
    private final Field a;

    public b(Field field) {
        ax.t8.a.b(field);
        this.a = field;
    }

    public String toString() {
        return this.a.toString();
    }
}

