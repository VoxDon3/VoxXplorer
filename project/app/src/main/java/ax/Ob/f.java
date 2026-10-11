/*
 * Decompiled with CFR 0.152.
 */
package ax.Ob;

import ax.Gb.g;
import ax.Gb.l;
import java.util.Iterator;
import java.util.NoSuchElementException;

final class f
implements Iterator<String>,
ax.Hb.a {
    private static final a g0 = new a(null);
    private int c0;
    private int d0;
    private int e0;
    private int f0;
    private final CharSequence q;

    public f(CharSequence charSequence) {
        l.f(charSequence, "string");
        this.q = charSequence;
    }

    public String b() {
        if (this.hasNext()) {
            this.c0 = 0;
            int n8 = this.e0;
            int n9 = this.d0;
            this.d0 = this.f0 + n8;
            return ((Object)this.q.subSequence(n9, n8)).toString();
        }
        throw new NoSuchElementException();
    }

    @Override
    public boolean hasNext() {
        int n8;
        int n9;
        block5: {
            n9 = this.c0;
            if (n9 != 0) {
                return n9 == 1;
            }
            n9 = this.f0;
            n8 = 2;
            if (n9 < 0) {
                this.c0 = 2;
                return false;
            }
            int n10 = this.q.length();
            int n11 = this.q.length();
            for (n9 = this.d0; n9 < n11; ++n9) {
                char c8 = this.q.charAt(n9);
                if (c8 != '\n' && c8 != '\r') {
                    continue;
                }
                if (c8 != '\r' || (n10 = n9 + 1) >= this.q.length() || this.q.charAt(n10) != '\n') {
                    n8 = 1;
                }
                break block5;
            }
            n8 = -1;
            n9 = n10;
        }
        this.c0 = 1;
        this.f0 = n8;
        this.e0 = n9;
        return true;
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    private static final class a {
        private a() {
        }

        public /* synthetic */ a(g g8) {
            this();
        }
    }
}

