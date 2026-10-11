/*
 * Decompiled with CFR 0.152.
 */
package ax.X0;

import android.content.Context;
import android.os.Handler;
import ax.P0.v;
import ax.X0.b;
import ax.X0.c;
import ax.a1.B;
import ax.a1.H;
import ax.a1.z;

public final class f
extends H<b> {
    private final Context V0;

    public f(Context context, Handler handler, z z8, B b8) {
        super(handler, z8, b8);
        this.V0 = context.getApplicationContext();
    }

    @Override
    protected int D0(v v8) {
        if (!"audio/x-exoplayer-midi".equals(v8.o)) {
            return 0;
        }
        if (!this.C0(b.D())) {
            return 1;
        }
        return 4;
    }

    protected b F0(v v8, ax.V0.b b8) throws c {
        return new b(this.V0);
    }

    protected v G0(b b8) {
        return b.D();
    }

    @Override
    public String getName() {
        return "MidiRenderer";
    }
}

