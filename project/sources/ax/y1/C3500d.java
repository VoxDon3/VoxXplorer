package ax.y1;

import ax.S0.C0968a;
import ax.q1.C;
import ax.q1.InterfaceC2858s;

/* renamed from: ax.y1.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C3500d extends C {
    private final long b;

    public C3500d(InterfaceC2858s interfaceC2858s, long j) {
        super(interfaceC2858s);
        C0968a.a(interfaceC2858s.getPosition() >= j);
        this.b = j;
    }

    @Override // ax.q1.C, ax.q1.InterfaceC2858s
    public long getLength() {
        return super.getLength() - this.b;
    }

    @Override // ax.q1.C, ax.q1.InterfaceC2858s
    public long getPosition() {
        return super.getPosition() - this.b;
    }

    @Override // ax.q1.C, ax.q1.InterfaceC2858s
    public long i() {
        return super.i() - this.b;
    }
}
