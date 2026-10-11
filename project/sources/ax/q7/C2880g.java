package ax.q7;

import j$.util.Objects;
import java.io.IOException;
import java.util.Iterator;

/* renamed from: ax.q7.g, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C2880g {
    private final String a;

    private C2880g(String str) {
        this.a = (String) n.n(str);
    }

    public static C2880g f(char c) {
        return new C2880g(String.valueOf(c));
    }

    public static C2880g g(String str) {
        return new C2880g(str);
    }

    public <A extends Appendable> A a(A a, Iterator<? extends Object> it) throws IOException {
        n.n(a);
        if (it.hasNext()) {
            a.append(h(it.next()));
            while (it.hasNext()) {
                a.append(this.a);
                a.append(h(it.next()));
            }
        }
        return a;
    }

    public final StringBuilder b(StringBuilder sb, Iterable<? extends Object> iterable) {
        return c(sb, iterable.iterator());
    }

    public final StringBuilder c(StringBuilder sb, Iterator<? extends Object> it) {
        try {
            a(sb, it);
            return sb;
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    public final String d(Iterable<? extends Object> iterable) {
        return e(iterable.iterator());
    }

    public final String e(Iterator<? extends Object> it) {
        return c(new StringBuilder(), it).toString();
    }

    CharSequence h(Object obj) {
        Objects.requireNonNull(obj);
        return obj instanceof CharSequence ? (CharSequence) obj : obj.toString();
    }
}
