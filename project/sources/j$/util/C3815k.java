package j$.util;

import java.util.Iterator;
import java.util.Map;
import java.util.function.Consumer;

/* renamed from: j$.util.k, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3815k implements Iterator, InterfaceC3955w {
    public final /* synthetic */ int a = 0;
    public final Iterator b;

    public C3815k(C3816l c3816l) {
        this.b = c3816l.a.iterator();
    }

    @Override // java.util.Iterator, j$.util.InterfaceC3955w
    public final void forEachRemaining(Consumer consumer) {
        switch (this.a) {
            case 0:
                j$.com.android.tools.r8.a.J(this.b, consumer);
                break;
            default:
                j$.com.android.tools.r8.a.J(this.b, new j$.nio.file.p(consumer, 2));
                break;
        }
    }

    public C3815k(C3821q c3821q) {
        this.b = c3821q.a.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.a) {
        }
        return this.b.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.a) {
            case 0:
                return this.b.next();
            default:
                return new C3819o((Map.Entry) this.b.next());
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }
}
