/*
 * Decompiled with CFR 0.152.
 */
package ax.q7;

import ax.q7.k;
import ax.q7.n;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;

public final class h {
    public static <T> T a(T t8, T t9) {
        if (t8 != null) {
            return t8;
        }
        if (t9 != null) {
            return t9;
        }
        throw new NullPointerException("Both parameters are null");
    }

    public static b b(Object object) {
        return new b(object.getClass().getSimpleName());
    }

    public static final class b {
        private final String a;
        private final a b;
        private a c;
        private boolean d;
        private boolean e;

        private b(String string) {
            a a8;
            this.b = a8 = new a();
            this.c = a8;
            this.d = false;
            this.e = false;
            this.a = n.n(string);
        }

        private a a() {
            a a8;
            this.c.c = a8 = new a();
            this.c = a8;
            return a8;
        }

        private b b(Object object) {
            this.a().b = object;
            return this;
        }

        private static boolean d(Object object) {
            if (object instanceof CharSequence) {
                return ((CharSequence)object).length() == 0;
            }
            if (object instanceof Collection) {
                return ((Collection)object).isEmpty();
            }
            if (object instanceof Map) {
                return ((Map)object).isEmpty();
            }
            if (object instanceof k) {
                return ((k)object).c() ^ true;
            }
            return object.getClass().isArray() && Array.getLength(object) == 0;
        }

        public b c(Object object) {
            return this.b(object);
        }

        public String toString() {
            boolean bl = this.d;
            boolean bl2 = this.e;
            StringBuilder stringBuilder = new StringBuilder(32);
            stringBuilder.append(this.a);
            stringBuilder.append('{');
            a a8 = this.b.c;
            String string = "";
            while (a8 != null) {
                String string2;
                block8: {
                    Object object;
                    block9: {
                        block7: {
                            object = a8.b;
                            if (object != null) break block7;
                            string2 = string;
                            if (bl) break block8;
                            break block9;
                        }
                        if (!bl2) break block9;
                        string2 = string;
                        if (ax.q7.h$b.d(object)) break block8;
                    }
                    stringBuilder.append(string);
                    string = a8.a;
                    if (string != null) {
                        stringBuilder.append(string);
                        stringBuilder.append('=');
                    }
                    if (object != null && object.getClass().isArray()) {
                        string = Arrays.deepToString(new Object[]{object});
                        stringBuilder.append(string, 1, string.length() - 1);
                    } else {
                        stringBuilder.append(object);
                    }
                    string2 = ", ";
                }
                a8 = a8.c;
                string = string2;
            }
            stringBuilder.append('}');
            return stringBuilder.toString();
        }

        static class a {
            String a;
            Object b;
            a c;

            a() {
            }
        }
    }
}

