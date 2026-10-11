package ax.r0;

import java.util.List;

/* loaded from: classes.dex */
public class n0 extends RuntimeException {
    private final List<String> q;

    public n0(S s) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
        this.q = null;
    }

    public C2905B a() {
        return new C2905B(getMessage());
    }
}
