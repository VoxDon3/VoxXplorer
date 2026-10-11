/*
 * Decompiled with CFR 0.152.
 */
package ax.q7;

import ax.q7.n;
import java.io.IOException;
import java.util.Iterator;

public class g {
    private final String a;

    private g(String string) {
        this.a = n.n(string);
    }

    public static g f(char c8) {
        return new g(String.valueOf(c8));
    }

    public static g g(String string) {
        return new g(string);
    }

    public <A extends Appendable> A a(A a8, Iterator<? extends Object> iterator) throws IOException {
        n.n(a8);
        if (iterator.hasNext()) {
            a8.append(this.h(iterator.next()));
            while (iterator.hasNext()) {
                a8.append(this.a);
                a8.append(this.h(iterator.next()));
            }
        }
        return a8;
    }

    public final StringBuilder b(StringBuilder stringBuilder, Iterable<? extends Object> iterable) {
        return this.c(stringBuilder, iterable.iterator());
    }

    public final StringBuilder c(StringBuilder stringBuilder, Iterator<? extends Object> iterator) {
        try {
            this.a(stringBuilder, iterator);
            return stringBuilder;
        }
        catch (IOException iOException) {
            throw new AssertionError((Object)iOException);
        }
    }

    public final String d(Iterable<? extends Object> iterable) {
        return this.e(iterable.iterator());
    }

    public final String e(Iterator<? extends Object> iterator) {
        return this.c(new StringBuilder(), iterator).toString();
    }

    CharSequence h(Object object) {
        j.Objects.requireNonNull((Object)object);
        if (object instanceof CharSequence) {
            return (CharSequence)object;
        }
        return object.toString();
    }
}

