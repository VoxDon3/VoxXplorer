package j$.nio.file;

import j$.util.Objects;
import j$.util.Spliterator;
import j$.util.o0;
import java.nio.file.DirectoryStream;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

/* loaded from: classes2.dex */
public final class q implements DirectoryStream, AutoCloseable, j$.lang.a {
    public final DirectoryStream a;

    @Override // java.lang.Iterable
    public final /* synthetic */ Spliterator spliterator() {
        return Spliterator.Wrapper.convert(spliterator());
    }

    @Override // java.lang.Iterable, j$.lang.a, j$.util.Collection
    public final j$.util.Spliterator spliterator() {
        return new o0((Iterator) Objects.requireNonNull(iterator()), 0);
    }

    public q(DirectoryStream directoryStream) {
        this.a = directoryStream;
    }

    @Override // java.nio.file.DirectoryStream, java.lang.Iterable
    public final Iterator iterator() {
        return new s(this.a.iterator());
    }

    @Override // java.lang.Iterable, j$.lang.a
    public final void forEach(Consumer consumer) {
        j$.com.android.tools.r8.a.I(this.a, new p(consumer, 0));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }
}
