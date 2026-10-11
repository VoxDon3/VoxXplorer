/*
 * Decompiled with CFR 0.152.
 */
package ax.q1;

import ax.q1.O;

public interface N {
    public boolean i();

    public a l(long var1);

    public long n();

    public static final class a {
        public final O a;
        public final O b;

        public a(O o8) {
            this(o8, o8);
        }

        public a(O o8, O o9) {
            this.a = ax.S0.a.e(o8);
            this.b = ax.S0.a.e(o9);
        }

        public boolean equals(Object object) {
            if (this == object) {
                return true;
            }
            if (object != null && a.class == object.getClass()) {
                object = (a)object;
                if (this.a.equals(((a)object).a) && this.b.equals(((a)object).b)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return this.a.hashCode() * 31 + this.b.hashCode();
        }

        public String toString() {
            CharSequence charSequence;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("[");
            stringBuilder.append(this.a);
            if (this.a.equals(this.b)) {
                charSequence = "";
            } else {
                charSequence = new StringBuilder();
                ((StringBuilder)charSequence).append(", ");
                ((StringBuilder)charSequence).append(this.b);
                charSequence = ((StringBuilder)charSequence).toString();
            }
            stringBuilder.append((String)charSequence);
            stringBuilder.append("]");
            return stringBuilder.toString();
        }
    }

    public static class b
    implements N {
        private final long a;
        private final a b;

        public b(long l8) {
            this(l8, 0L);
        }

        public b(long l8, long l9) {
            this.a = l8;
            O o8 = l9 == 0L ? O.c : new O(0L, l9);
            this.b = new a(o8);
        }

        @Override
        public boolean i() {
            return false;
        }

        @Override
        public a l(long l8) {
            return this.b;
        }

        @Override
        public long n() {
            return this.a;
        }
    }
}

