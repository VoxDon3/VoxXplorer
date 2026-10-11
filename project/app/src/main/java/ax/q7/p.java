/*
 * Decompiled with CFR 0.152.
 */
package ax.q7;

import ax.q7.n;
import ax.q7.o;
import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

public final class p {
    public static <T> o<T> b(o<? super T> o8, o<? super T> o9) {
        return new b(p.c(n.n(o8), n.n(o9)));
    }

    private static <T> List<o<? super T>> c(o<? super T> o8, o<? super T> o9) {
        return Arrays.asList(o8, o9);
    }

    private static String d(String string, Iterable<?> object) {
        StringBuilder stringBuilder = new StringBuilder("Predicates.");
        stringBuilder.append(string);
        stringBuilder.append('(');
        object = object.iterator();
        boolean bl = true;
        while (object.hasNext()) {
            string = object.next();
            if (!bl) {
                stringBuilder.append(',');
            }
            stringBuilder.append((Object)string);
            bl = false;
        }
        stringBuilder.append(')');
        return stringBuilder.toString();
    }

    private static class b<T>
    implements o<T>,
    Serializable {
        private final List<? extends o<? super T>> q;

        private b(List<? extends o<? super T>> list) {
            this.q = list;
        }

        @Override
        public boolean apply(T t8) {
            for (int i8 = 0; i8 < this.q.size(); ++i8) {
                if (this.q.get(i8).apply(t8)) continue;
                return false;
            }
            return true;
        }

        public boolean equals(Object object) {
            if (object instanceof b) {
                object = (b)object;
                return this.q.equals(((b)object).q);
            }
            return false;
        }

        public int hashCode() {
            return this.q.hashCode() + 306654252;
        }

        public String toString() {
            return p.d("and", this.q);
        }
    }
}

