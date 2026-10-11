package ax.W5;

import ax.W5.H0;
import ax.W5.J0;

/* loaded from: classes3.dex */
public class H0<MessageType extends J0<MessageType, BuilderType>, BuilderType extends H0<MessageType, BuilderType>> extends AbstractC1019c0<MessageType, BuilderType> {
    protected J0 c0;
    private final J0 q;

    protected H0(MessageType messagetype) {
        this.q = messagetype;
        if (messagetype.n()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.c0 = messagetype.c();
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final H0 clone() {
        H0 h0 = (H0) this.q.o(5, null, null);
        h0.c0 = e();
        return h0;
    }

    @Override // ax.W5.InterfaceC1038i1
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public MessageType e() {
        if (!this.c0.n()) {
            return (MessageType) this.c0;
        }
        this.c0.j();
        return (MessageType) this.c0;
    }
}
