/*
 * Decompiled with CFR 0.152.
 */
package ax.b6;

import ax.b6.Z2;
import ax.b6.n;
import ax.b6.s;
import ax.b6.y2;
import ax.b6.z;
import java.util.Arrays;
import java.util.Comparator;

final class K
implements Comparator<s> {
    private final Z2 c0;
    private final n q;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    K(n n8, Z2 z22) {
        this.q = n8;
        this.c0 = z22;
    }

    @Override
    public final /* synthetic */ int compare(Object object, Object object2) {
        object = (s)object;
        object2 = (s)object2;
        n n8 = this.q;
        Z2 z22 = this.c0;
        if (object instanceof z) {
            if (!(object2 instanceof z)) {
                return 1;
            }
            return 0;
        }
        if (object2 instanceof z) {
            return -1;
        }
        if (n8 == null) {
            return object.g().compareTo(object2.g());
        }
        return (int)y2.a(n8.a(z22, Arrays.asList(object, object2)).f());
    }
}

