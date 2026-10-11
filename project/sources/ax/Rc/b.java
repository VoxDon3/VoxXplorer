package ax.Rc;

import java.util.EventObject;

/* loaded from: classes3.dex */
public class b extends EventObject {
    private final boolean c0;
    private final String d0;
    private final String e0;
    private final int q;

    public b(Object obj, int i, String str) {
        super(obj);
        this.q = i;
        this.d0 = str;
        this.c0 = false;
        this.e0 = null;
    }

    public b(Object obj, String str, String str2) {
        super(obj);
        this.q = 0;
        this.d0 = str2;
        this.c0 = true;
        this.e0 = str;
    }
}
