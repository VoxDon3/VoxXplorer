/*
 * Decompiled with CFR 0.152.
 */
package ax.o8;

import ax.Gb.l;

public interface b {
    public boolean a();

    public a b();

    public void c(b var1);

    public static final class a
    extends Enum<a> {
        public static final /* enum */ a c0;
        public static final /* enum */ a d0;
        private static final a[] e0;
        public static final /* enum */ a q;

        static {
            q = new a();
            c0 = new a();
            d0 = new a();
            e0 = a.d();
        }

        private static final /* synthetic */ a[] d() {
            return new a[]{q, c0, d0};
        }

        public static a valueOf(String string) {
            return Enum.valueOf(a.class, string);
        }

        public static a[] values() {
            return (a[])e0.clone();
        }
    }

    public static final class b {
        private final String a;

        public b(String string) {
            l.f(string, "sessionId");
            this.a = string;
        }

        public final String a() {
            return this.a;
        }

        public boolean equals(Object object) {
            if (this == object) {
                return true;
            }
            if (!(object instanceof b)) {
                return false;
            }
            object = (b)object;
            return l.a(this.a, ((b)object).a);
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("SessionDetails(sessionId=");
            stringBuilder.append(this.a);
            stringBuilder.append(')');
            return stringBuilder.toString();
        }
    }
}

