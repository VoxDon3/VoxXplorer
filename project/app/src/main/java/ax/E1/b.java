/*
 * Decompiled with CFR 0.152.
 */
package ax.E1;

import ax.E1.i;
import java.util.Arrays;

public final class b
extends i {
    public final byte[] b;

    public b(String string, byte[] byArray) {
        super(string);
        this.b = byArray;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null && b.class == object.getClass()) {
            object = (b)object;
            if (this.a.equals(((i)object).a) && Arrays.equals(this.b, ((b)object).b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (527 + this.a.hashCode()) * 31 + Arrays.hashCode(this.b);
    }
}

