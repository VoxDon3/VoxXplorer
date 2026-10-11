package j$.util.stream;

import j$.util.Spliterator;
import java.util.ArrayDeque;
import java.util.Comparator;

/* renamed from: j$.util.stream.h1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3860h1 implements Spliterator {
    public E0 a;
    public int b;
    public Spliterator c;
    public Spliterator d;
    public ArrayDeque e;

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return 64;
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return j$.com.android.tools.r8.a.k(this);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return j$.com.android.tools.r8.a.m(this, i);
    }

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
        throw new IllegalStateException();
    }

    public AbstractC3860h1(E0 e0) {
        this.a = e0;
    }

    public final ArrayDeque b() {
        ArrayDeque arrayDeque = new ArrayDeque(8);
        int u = this.a.u();
        while (true) {
            u--;
            if (u < this.b) {
                return arrayDeque;
            }
            arrayDeque.addFirst(this.a.b(u));
        }
    }

    public static E0 a(ArrayDeque arrayDeque) {
        while (true) {
            E0 e0 = (E0) arrayDeque.pollFirst();
            if (e0 == null) {
                return null;
            }
            if (e0.u() != 0) {
                for (int u = e0.u() - 1; u >= 0; u--) {
                    arrayDeque.addFirst(e0.b(u));
                }
            } else if (e0.count() > 0) {
                return e0;
            }
        }
    }

    public final boolean c() {
        if (this.a == null) {
            return false;
        }
        if (this.d != null) {
            return true;
        }
        Spliterator spliterator = this.c;
        if (spliterator == null) {
            ArrayDeque b = b();
            this.e = b;
            E0 a = a(b);
            if (a != null) {
                this.d = a.spliterator();
                return true;
            }
            this.a = null;
            return false;
        }
        this.d = spliterator;
        return true;
    }

    @Override // j$.util.Spliterator
    public final Spliterator trySplit() {
        E0 e0 = this.a;
        if (e0 == null || this.d != null) {
            return null;
        }
        Spliterator spliterator = this.c;
        if (spliterator != null) {
            return spliterator.trySplit();
        }
        if (this.b < e0.u() - 1) {
            E0 e02 = this.a;
            int i = this.b;
            this.b = i + 1;
            return e02.b(i).spliterator();
        }
        E0 b = this.a.b(this.b);
        this.a = b;
        if (b.u() == 0) {
            Spliterator spliterator2 = this.a.spliterator();
            this.c = spliterator2;
            return spliterator2.trySplit();
        }
        E0 e03 = this.a;
        this.b = 1;
        return e03.b(0).spliterator();
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        long j = 0;
        if (this.a == null) {
            return 0L;
        }
        Spliterator spliterator = this.c;
        if (spliterator != null) {
            return spliterator.estimateSize();
        }
        for (int i = this.b; i < this.a.u(); i++) {
            j += this.a.b(i).count();
        }
        return j;
    }

    @Override // j$.util.Spliterator
    public /* bridge */ /* synthetic */ j$.util.b0 trySplit() {
        return (j$.util.b0) trySplit();
    }

    @Override // j$.util.Spliterator
    public /* bridge */ /* synthetic */ j$.util.V trySplit() {
        return (j$.util.V) trySplit();
    }

    @Override // j$.util.Spliterator
    public /* bridge */ /* synthetic */ j$.util.Y trySplit() {
        return (j$.util.Y) trySplit();
    }

    @Override // j$.util.Spliterator
    public /* bridge */ /* synthetic */ j$.util.S trySplit() {
        return (j$.util.S) trySplit();
    }
}
