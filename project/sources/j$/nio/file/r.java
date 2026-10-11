package j$.nio.file;

import j$.util.Objects;
import j$.util.Spliterator;
import j$.util.o0;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

/* loaded from: classes2.dex */
public final class r implements Iterable, j$.lang.a {
    public final Iterable a;

    @Override // java.lang.Iterable
    public final /* synthetic */ Spliterator spliterator() {
        return Spliterator.Wrapper.convert(spliterator());
    }

    public r(Iterable iterable) {
        this.a = iterable;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new s(this.a.iterator());
    }

    @Override // java.lang.Iterable, j$.lang.a
    public final void forEach(Consumer consumer) {
        j$.com.android.tools.r8.a.I(this.a, new p(consumer, 1));
    }

    @Override // java.lang.Iterable, j$.lang.a, j$.util.Collection
    public final j$.util.Spliterator spliterator() {
        return new o0((Iterator) Objects.requireNonNull(iterator()), 0);
    }
}
