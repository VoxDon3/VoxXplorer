package ax.b6;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: ax.b6.w, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C1690w implements Iterator<InterfaceC1658s> {
    private final /* synthetic */ C1674u c0;
    private int q = 0;

    C1690w(C1674u c1674u) {
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
        String str2;
        int i = this.q;
        str = this.c0.q;
        if (i >= str.length()) {
            throw new NoSuchElementException();
        }
        str2 = this.c0.q;
        int i2 = this.q;
        this.q = i2 + 1;
        return new C1674u(String.valueOf(str2.charAt(i2)));
    }
}
