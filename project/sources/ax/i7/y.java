package ax.i7;

import java.io.InputStream;

/* loaded from: classes3.dex */
public final class y extends AbstractC2278b {
    private long c;
    private boolean d;
    private final InputStream e;

    public y(String str, InputStream inputStream) {
        super(str);
        this.c = -1L;
        this.e = (InputStream) ax.m7.v.d(inputStream);
    }

    @Override // ax.i7.i
    public boolean c() {
        return this.d;
    }

    @Override // ax.i7.AbstractC2278b
    public InputStream e() {
        return this.e;
    }

    @Override // ax.i7.i
    public long getLength() {
        return this.c;
    }

    public y h(boolean z) {
        return (y) super.f(z);
    }

    public y i(long j) {
        this.c = j;
        return this;
    }

    public y j(boolean z) {
        this.d = z;
        return this;
    }

    @Override // ax.i7.AbstractC2278b
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public y g(String str) {
        return (y) super.g(str);
    }
}
