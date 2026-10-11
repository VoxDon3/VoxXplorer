/*
 * Decompiled with CFR 0.152.
 */
package ax.W5;

import ax.W5.J0;
import ax.W5.c0;

public class H0<MessageType extends J0<MessageType, BuilderType>, BuilderType extends H0<MessageType, BuilderType>>
extends c0<MessageType, BuilderType> {
    protected J0 c0;
    private final J0 q;

    protected H0(MessageType MessageType) {
        this.q = MessageType;
        if (!((J0)MessageType).n()) {
            this.c0 = ((J0)MessageType).c();
            return;
        }
        throw new IllegalArgumentException("Default instance must be immutable.");
    }

    public final H0 b() {
        H0 h02 = (H0)this.q.o(5, null, null);
        h02.c0 = this.c();
        return h02;
    }

    public MessageType c() {
        if (!this.c0.n()) {
            return (MessageType)this.c0;
        }
        this.c0.j();
        return (MessageType)this.c0;
    }
}

