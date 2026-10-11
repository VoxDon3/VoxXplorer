/*
 * Decompiled with CFR 0.152.
 */
package ax.L7;

import ax.L7.F;
import java.util.List;

final class y
extends F.e.d.f {
    private final List<F.e.d.e> a;

    private y(List<F.e.d.e> list) {
        this.a = list;
    }

    @Override
    public List<F.e.d.e> b() {
        return this.a;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof F.e.d.f) {
            object = (F.e.d.f)object;
            return this.a.equals(((F.e.d.f)object).b());
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode() ^ 0xF4243;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("RolloutsState{rolloutAssignments=");
        stringBuilder.append(this.a);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    static final class b
    extends F.e.d.f.a {
        private List<F.e.d.e> a;

        b() {
        }

        @Override
        public F.e.d.f a() {
            List<F.e.d.e> list = this.a;
            if (list != null) {
                return new y(list);
            }
            list = new StringBuilder();
            ((StringBuilder)((Object)list)).append("Missing required properties:");
            ((StringBuilder)((Object)list)).append(" rolloutAssignments");
            throw new IllegalStateException(((StringBuilder)((Object)list)).toString());
        }

        @Override
        public F.e.d.f.a b(List<F.e.d.e> list) {
            if (list != null) {
                this.a = list;
                return this;
            }
            throw new NullPointerException("Null rolloutAssignments");
        }
    }
}

