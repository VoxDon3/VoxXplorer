package ax.W5;

import java.io.Serializable;

/* loaded from: classes3.dex */
public abstract class U implements Serializable {
    U() {
    }

    public static U c() {
        return S.q;
    }

    public static U d(Object obj) {
        return new V(obj);
    }

    public abstract Object a();

    public abstract boolean b();
}
