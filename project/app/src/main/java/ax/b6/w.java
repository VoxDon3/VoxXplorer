/*
 * Decompiled with CFR 0.152.
 */
package ax.b6;

import ax.b6.s;
import ax.b6.u;
import java.util.Iterator;
import java.util.NoSuchElementException;

final class w
implements Iterator<s> {
    private final u c0;
    private int q;

    w(u u8) {
        this.c0 = u8;
        this.q = 0;
    }

    @Override
    public final boolean hasNext() {
        return this.q < u.h(this.c0).length();
    }

    @Override
    public final /* synthetic */ Object next() {
        if (this.q < u.h(this.c0).length()) {
            String string = u.h(this.c0);
            int n8 = this.q;
            this.q = n8 + 1;
            return new u(String.valueOf(string.charAt(n8)));
        }
        throw new NoSuchElementException();
    }
}

