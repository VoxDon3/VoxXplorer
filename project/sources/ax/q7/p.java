package ax.q7;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes3.dex */
public final class p {

    private static class b<T> implements o<T>, Serializable {
        private final List<? extends o<? super T>> q;

        @Override // ax.q7.o
        public boolean apply(T t) {
            for (int i = 0; i < this.q.size(); i++) {
                if (!this.q.get(i).apply(t)) {
                    return false;
                }
            }
            return true;
        }

        public boolean equals(Object obj) {
            if (obj instanceof b) {
                return this.q.equals(((b) obj).q);
            }
            return false;
        }

        public int hashCode() {
            return this.q.hashCode() + 306654252;
        }

        public String toString() {
            return p.d("and", this.q);
        }

        private b(List<? extends o<? super T>> list) {
            this.q = list;
        }
    }

    public static <T> o<T> b(o<? super T> oVar, o<? super T> oVar2) {
        return new b(c((o) n.n(oVar), (o) n.n(oVar2)));
    }

    private static <T> List<o<? super T>> c(o<? super T> oVar, o<? super T> oVar2) {
        return Arrays.asList(oVar, oVar2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String d(String str, Iterable<?> iterable) {
        StringBuilder sb = new StringBuilder("Predicates.");
        sb.append(str);
        sb.append('(');
        boolean z = true;
        for (Object obj : iterable) {
            if (!z) {
                sb.append(',');
            }
            sb.append(obj);
            z = false;
        }
        sb.append(')');
        return sb.toString();
    }
}
