/*
 * Decompiled with CFR 0.152.
 */
package ax.r0;

import ax.r0.B;
import ax.r0.S;
import ax.r0.a;
import ax.r0.a0;
import ax.r0.h;
import ax.r0.i;
import ax.r0.n0;
import ax.r0.p;

public abstract class b<MessageType extends S>
implements a0<MessageType> {
    private static final p a = p.b();

    private MessageType c(MessageType MessageType) throws B {
        if (MessageType != null && !MessageType.b()) {
            throw this.d(MessageType).a().i((S)MessageType);
        }
        return MessageType;
    }

    private n0 d(MessageType MessageType) {
        if (MessageType instanceof a) {
            return ((a)MessageType).n();
        }
        return new n0((S)MessageType);
    }

    public MessageType e(h h8, p p8) throws B {
        return this.c(this.f(h8, p8));
    }

    public MessageType f(h object, p p8) throws B {
        i i8 = ((h)object).u();
        object = (S)this.a(i8, p8);
        try {
            i8.a(0);
        }
        catch (B b8) {
            throw b8.i((S)object);
        }
        return (MessageType)object;
    }
}

