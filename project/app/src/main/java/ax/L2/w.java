/*
 * Decompiled with CFR 0.152.
 */
package ax.L2;

import ax.B2.i;
import ax.C2.D;
import ax.C2.v;

public class w
implements Runnable {
    private static final String e0 = i.i("StopWorkRunnable");
    private final v c0;
    private final boolean d0;
    private final D q;

    public w(D d8, v v8, boolean bl) {
        this.q = d8;
        this.c0 = v8;
        this.d0 = bl;
    }

    @Override
    public void run() {
        boolean bl = this.d0 ? this.q.l().r(this.c0) : this.q.l().s(this.c0);
        i i8 = i.e();
        String string = e0;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("StopWorkRunnable for ");
        stringBuilder.append(this.c0.a().b());
        stringBuilder.append("; Processor.stopWork = ");
        stringBuilder.append(bl);
        i8.a(string, stringBuilder.toString());
    }
}

