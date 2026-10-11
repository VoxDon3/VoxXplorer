package ax.Ob;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes3.dex */
final class f implements Iterator<String>, ax.Hb.a {
    private static final a g0 = new a(null);
    private int c0;
    private int d0;
    private int e0;
    private int f0;
    private final CharSequence q;

    private static final class a {
        public /* synthetic */ a(ax.Gb.g gVar) {
            this();
        }

        private a() {
        }
    }

    public f(CharSequence charSequence) {
        ax.Gb.l.f(charSequence, "string");
        this.q = charSequence;
    }

    @Override // java.util.Iterator
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public String next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.c0 = 0;
        int i = this.e0;
        int i2 = this.d0;
        this.d0 = this.f0 + i;
        return this.q.subSequence(i2, i).toString();
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        int i;
        int i2;
        int i3 = this.c0;
        if (i3 != 0) {
            return i3 == 1;
        }
        if (this.f0 < 0) {
            this.c0 = 2;
            return false;
        }
        int length = this.q.length();
        int length2 = this.q.length();
        for (int i4 = this.d0; i4 < length2; i4++) {
            char charAt = this.q.charAt(i4);
            if (charAt == '\n' || charAt == '\r') {
                i = (charAt == '\r' && (i2 = i4 + 1) < this.q.length() && this.q.charAt(i2) == '\n') ? 2 : 1;
                length = i4;
                this.c0 = 1;
                this.f0 = i;
                this.e0 = length;
                return true;
            }
        }
        i = -1;
        this.c0 = 1;
        this.f0 = i;
        this.e0 = length;
        return true;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
