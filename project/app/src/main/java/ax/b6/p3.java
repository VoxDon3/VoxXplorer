/*
 * Decompiled with CFR 0.152.
 */
package ax.b6;

import ax.b6.T4;
import ax.b6.W3;
import ax.b6.q3;
import ax.b6.s4;

public abstract class p3<MessageType extends q3<MessageType, BuilderType>, BuilderType extends p3<MessageType, BuilderType>>
implements T4 {
    @Override
    public final /* synthetic */ T4 F0(byte[] byArray, W3 w32) throws s4 {
        return this.l(byArray, 0, byArray.length, w32);
    }

    @Override
    public final /* synthetic */ T4 W(byte[] byArray) throws s4 {
        return this.k(byArray, 0, byArray.length);
    }

    public abstract /* synthetic */ Object clone() throws CloneNotSupportedException;

    public abstract BuilderType k(byte[] var1, int var2, int var3) throws s4;

    public abstract BuilderType l(byte[] var1, int var2, int var3, W3 var4) throws s4;
}

