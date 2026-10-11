package j$.util.stream;

import j$.util.Spliterator;
import java.util.Iterator;

/* renamed from: j$.util.stream.g, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public interface InterfaceC3853g extends AutoCloseable {
    boolean isParallel();

    Iterator iterator();

    InterfaceC3853g onClose(Runnable runnable);

    InterfaceC3853g parallel();

    InterfaceC3853g sequential();

    Spliterator spliterator();

    InterfaceC3853g unordered();
}
