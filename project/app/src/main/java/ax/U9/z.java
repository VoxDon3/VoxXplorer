/*
 * Decompiled with CFR 0.152.
 */
package ax.U9;

import android.os.AsyncTask;
import ax.U9.c;
import ax.U9.f;
import ax.U9.s;
import ax.U9.t;
import ax.U9.y;

class z
extends AsyncTask<Void, Void, Void> {
    private final c a;
    private f b;
    private t c;
    private final y d;

    public z(y y8) {
        if (y8 != null) {
            this.a = new c();
            this.d = y8;
            return;
        }
        throw new AssertionError();
    }

    public void a(s s8) {
        this.a.a(s8);
    }

    protected Void b(Void ... voidArray) {
        try {
            this.c = this.d.b();
        }
        catch (f f8) {
            this.b = f8;
        }
        return null;
    }

    protected void c(Void object) {
        super.onPostExecute(object);
        object = this.c;
        if (object != null) {
            this.a.c((t)object);
            return;
        }
        object = this.b;
        if (object != null) {
            this.a.b((f)object);
            return;
        }
        object = new f("An error occured on the client during the operation.");
        this.a.b((f)object);
    }
}

