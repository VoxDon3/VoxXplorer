package ax.L5;

import ax.J5.C0742c;
import ax.j6.C2328k;
import java.util.Set;

/* loaded from: classes3.dex */
public final class E {
    private final ax.B.a a;
    private final ax.B.a b;
    private final C2328k c;
    private int d;
    private boolean e;

    public final Set a() {
        return this.a.keySet();
    }

    public final void b(C0790b c0790b, C0742c c0742c, String str) {
        this.a.put(c0790b, c0742c);
        this.b.put(c0790b, str);
        this.d--;
        if (!c0742c.C()) {
            this.e = true;
        }
        if (this.d == 0) {
            if (!this.e) {
                this.c.c(this.b);
            } else {
                this.c.b(new ax.K5.c(this.a));
            }
        }
    }
}
