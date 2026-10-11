package ax.j1;

import java.util.NoSuchElementException;

/* renamed from: ax.j1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2303a implements InterfaceC2307e {
    private final long b;
    private final long c;
    private long d;

    public AbstractC2303a(long j, long j2) {
        this.b = j;
        this.c = j2;
        f();
    }

    protected final void c() {
        long j = this.d;
        if (j < this.b || j > this.c) {
            throw new NoSuchElementException();
        }
    }

    protected final long d() {
        return this.d;
    }

    public boolean e() {
        return this.d > this.c;
    }

    public void f() {
        this.d = this.b - 1;
    }

    @Override // ax.j1.InterfaceC2307e
    public boolean next() {
        this.d++;
        return !e();
    }
}
