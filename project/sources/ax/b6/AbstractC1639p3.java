package ax.b6;

import ax.b6.AbstractC1639p3;
import ax.b6.AbstractC1647q3;

/* renamed from: ax.b6.p3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1639p3<MessageType extends AbstractC1647q3<MessageType, BuilderType>, BuilderType extends AbstractC1639p3<MessageType, BuilderType>> implements T4 {
    @Override // ax.b6.T4
    public final /* synthetic */ T4 F0(byte[] bArr, W3 w3) throws C1663s4 {
        return l(bArr, 0, bArr.length, w3);
    }

    @Override // ax.b6.T4
    public final /* synthetic */ T4 W(byte[] bArr) throws C1663s4 {
        return k(bArr, 0, bArr.length);
    }

    public abstract /* synthetic */ Object clone() throws CloneNotSupportedException;

    public abstract BuilderType k(byte[] bArr, int i, int i2) throws C1663s4;

    public abstract BuilderType l(byte[] bArr, int i, int i2, W3 w3) throws C1663s4;
}
