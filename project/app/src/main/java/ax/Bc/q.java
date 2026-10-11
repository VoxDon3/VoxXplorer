/*
 * Decompiled with CFR 0.152.
 */
package ax.Bc;

import ax.Bc.g;
import ax.Bc.p;

public class q {
    private final p a;
    private final Object b;

    public q(p p8) {
        this(p8, null);
    }

    public q(p p8, Object object) {
        this.a = p8;
        this.b = object;
        if (object != null && !g.c(p8).a(object)) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("The ");
            stringBuilder.append((Object)p8);
            stringBuilder.append(" method doesn't support options of type ");
            stringBuilder.append(object.getClass());
            throw new IllegalArgumentException(stringBuilder.toString());
        }
    }

    public p a() {
        return this.a;
    }

    public Object b() {
        return this.b;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null && this.getClass() == object.getClass()) {
            object = (q)object;
            if (j.Objects.equals((Object)((Object)this.a), (Object)((Object)((q)object).a)) && j.Objects.equals((Object)this.b, (Object)((q)object).b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        p p8 = this.a;
        if (p8 == null) {
            return 0;
        }
        return ((Object)((Object)p8)).hashCode();
    }
}

