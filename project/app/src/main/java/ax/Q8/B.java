/*
 * Decompiled with CFR 0.152.
 */
package ax.Q8;

import ax.Q8.x;
import ax.Z8.a;
import ax.h9.e;

public class B
extends e<x> {
    public B(byte[] byArray) throws a.b {
        super(new x(), byArray);
    }

    public byte[] d() throws a.b {
        return this.a().G(((x)this.b()).f());
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Encrypted for session id << ");
        stringBuilder.append(((x)this.b()).g());
        stringBuilder.append(" >>");
        return stringBuilder.toString();
    }
}

