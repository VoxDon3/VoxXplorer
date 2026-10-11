package ax.r0;

import ax.r0.S;

/* renamed from: ax.r0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2915b<MessageType extends S> implements a0<MessageType> {
    private static final C2929p a = C2929p.b();

    private MessageType c(MessageType messagetype) throws C2905B {
        if (messagetype == null || messagetype.b()) {
            return messagetype;
        }
        throw d(messagetype).a().i(messagetype);
    }

    private n0 d(MessageType messagetype) {
        return messagetype instanceof AbstractC2914a ? ((AbstractC2914a) messagetype).n() : new n0(messagetype);
    }

    @Override // ax.r0.a0
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public MessageType b(AbstractC2921h abstractC2921h, C2929p c2929p) throws C2905B {
        return c(f(abstractC2921h, c2929p));
    }

    public MessageType f(AbstractC2921h abstractC2921h, C2929p c2929p) throws C2905B {
        AbstractC2922i u = abstractC2921h.u();
        MessageType messagetype = (MessageType) a(u, c2929p);
        try {
            u.a(0);
            return messagetype;
        } catch (C2905B e) {
            throw e.i(messagetype);
        }
    }
}
