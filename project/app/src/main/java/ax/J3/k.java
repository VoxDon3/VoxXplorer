/*
 * Decompiled with CFR 0.152.
 */
package ax.J3;

import ax.i4.a;
import ax.i4.c;

public abstract class k<CHILD extends k<CHILD, TranscodeType>, TranscodeType>
implements Cloneable {
    private c<? super TranscodeType> q = a.a();

    protected final CHILD b() {
        k k8;
        try {
            k8 = (k)super.clone();
        }
        catch (CloneNotSupportedException cloneNotSupportedException) {
            throw new RuntimeException(cloneNotSupportedException);
        }
        return (CHILD)k8;
    }

    final c<? super TranscodeType> c() {
        return this.q;
    }
}

