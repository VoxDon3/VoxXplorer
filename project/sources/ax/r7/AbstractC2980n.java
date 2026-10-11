package ax.r7;

import java.util.Comparator;

/* renamed from: ax.r7.n, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC2980n {
    private static final AbstractC2980n a = new a();
    private static final AbstractC2980n b = new b(-1);
    private static final AbstractC2980n c = new b(1);

    /* renamed from: ax.r7.n$a */
    class a extends AbstractC2980n {
        a() {
            super(null);
        }

        @Override // ax.r7.AbstractC2980n
        public AbstractC2980n d(int i, int i2) {
            return k(Integer.compare(i, i2));
        }

        @Override // ax.r7.AbstractC2980n
        public AbstractC2980n e(long j, long j2) {
            return k(Long.compare(j, j2));
        }

        @Override // ax.r7.AbstractC2980n
        public <T> AbstractC2980n f(T t, T t2, Comparator<T> comparator) {
            return k(comparator.compare(t, t2));
        }

        @Override // ax.r7.AbstractC2980n
        public AbstractC2980n g(boolean z, boolean z2) {
            return k(Boolean.compare(z, z2));
        }

        @Override // ax.r7.AbstractC2980n
        public AbstractC2980n h(boolean z, boolean z2) {
            return k(Boolean.compare(z2, z));
        }

        @Override // ax.r7.AbstractC2980n
        public int i() {
            return 0;
        }

        AbstractC2980n k(int i) {
            return i < 0 ? AbstractC2980n.b : i > 0 ? AbstractC2980n.c : AbstractC2980n.a;
        }
    }

    /* synthetic */ AbstractC2980n(a aVar) {
        this();
    }

    public static AbstractC2980n j() {
        return a;
    }

    public abstract AbstractC2980n d(int i, int i2);

    public abstract AbstractC2980n e(long j, long j2);

    public abstract <T> AbstractC2980n f(T t, T t2, Comparator<T> comparator);

    public abstract AbstractC2980n g(boolean z, boolean z2);

    public abstract AbstractC2980n h(boolean z, boolean z2);

    public abstract int i();

    private AbstractC2980n() {
    }

    /* renamed from: ax.r7.n$b */
    private static final class b extends AbstractC2980n {
        final int d;

        b(int i) {
            super(null);
            this.d = i;
        }

        @Override // ax.r7.AbstractC2980n
        public int i() {
            return this.d;
        }

        @Override // ax.r7.AbstractC2980n
        public AbstractC2980n d(int i, int i2) {
            return this;
        }

        @Override // ax.r7.AbstractC2980n
        public AbstractC2980n e(long j, long j2) {
            return this;
        }

        @Override // ax.r7.AbstractC2980n
        public AbstractC2980n g(boolean z, boolean z2) {
            return this;
        }

        @Override // ax.r7.AbstractC2980n
        public AbstractC2980n h(boolean z, boolean z2) {
            return this;
        }

        @Override // ax.r7.AbstractC2980n
        public <T> AbstractC2980n f(T t, T t2, Comparator<T> comparator) {
            return this;
        }
    }
}
