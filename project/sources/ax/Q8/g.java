package ax.Q8;

import java.util.Iterator;
import java.util.Set;

/* loaded from: classes3.dex */
public enum g {
    UNKNOWN(0),
    SMB_2_0_2(514),
    SMB_2_1(528),
    SMB_2XX(767),
    SMB_3_0(768),
    SMB_3_0_2(770),
    SMB_3_1_1(785);

    private int q;

    g(int i) {
        this.q = i;
    }

    public static g l(int i) {
        for (g gVar : values()) {
            if (gVar.h() == i) {
                return gVar;
            }
        }
        throw new IllegalStateException("Unknown SMB2 Dialect: " + i);
    }

    public static boolean n(Set<g> set) {
        Iterator<g> it = set.iterator();
        while (it.hasNext()) {
            if (it.next().j()) {
                return true;
            }
        }
        return false;
    }

    public int h() {
        return this.q;
    }

    public boolean j() {
        return this == SMB_3_0 || this == SMB_3_0_2 || this == SMB_3_1_1;
    }
}
