package ax.b6;

/* renamed from: ax.b6.i0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C1577i0 extends AbstractC1651r0 {
    private String a;
    private EnumC1644q0 b;
    private byte c;

    C1577i0() {
    }

    @Override // ax.b6.AbstractC1651r0
    public final AbstractC1628o0 a() {
        if (this.c == 3 && this.a != null && this.b != null) {
            return new C1586j0(this.a, this.b);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" fileOwner");
        }
        if ((this.c & 1) == 0) {
            sb.append(" hasDifferentDmaOwner");
        }
        if ((this.c & 2) == 0) {
            sb.append(" skipChecks");
        }
        if (this.b == null) {
            sb.append(" filePurpose");
        }
        throw new IllegalStateException("Missing required properties:" + String.valueOf(sb));
    }

    @Override // ax.b6.AbstractC1651r0
    public final AbstractC1651r0 b(EnumC1644q0 enumC1644q0) {
        if (enumC1644q0 == null) {
            throw new NullPointerException("Null filePurpose");
        }
        this.b = enumC1644q0;
        return this;
    }

    @Override // ax.b6.AbstractC1651r0
    public final AbstractC1651r0 c(boolean z) {
        this.c = (byte) (this.c | 1);
        return this;
    }

    @Override // ax.b6.AbstractC1651r0
    public final AbstractC1651r0 d(boolean z) {
        this.c = (byte) (this.c | 2);
        return this;
    }

    public final AbstractC1651r0 e(String str) {
        this.a = str;
        return this;
    }
}
