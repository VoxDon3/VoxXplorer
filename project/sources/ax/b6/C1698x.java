package ax.b6;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: ax.b6.x, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C1698x implements Iterator<InterfaceC1658s> {
    private final /* synthetic */ C1674u c0;
    private int q = 0;

    C1698x(C1674u c1674u) {
        this.c0 = c1674u;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        String str;
        int i = this.q;
        str = this.c0.q;
        return i < str.length();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ InterfaceC1658s next() {
        String str;
        int i = this.q;
        str = this.c0.q;
        if (i >= str.length()) {
            throw new NoSuchElementException();
        }
        int i2 = this.q;
        this.q = i2 + 1;
        return new C1674u(String.valueOf(i2));
    }
}
