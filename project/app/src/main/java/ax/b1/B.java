/*
 * Decompiled with CFR 0.152.
 */
package ax.b1;

import android.media.MediaDrmException;
import ax.P0.o;
import ax.V0.b;
import ax.Z0.I1;
import ax.b1.D;
import ax.b1.E;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class B
implements E {
    @Override
    public Map<String, String> a(byte[] byArray) {
        throw new IllegalStateException();
    }

    @Override
    public E.d b() {
        throw new IllegalStateException();
    }

    @Override
    public b c(byte[] byArray) {
        throw new IllegalStateException();
    }

    @Override
    public void d() {
    }

    @Override
    public byte[] e() throws MediaDrmException {
        throw new MediaDrmException("Attempting to open a session using a dummy ExoMediaDrm.");
    }

    @Override
    public boolean f(byte[] byArray, String string) {
        throw new IllegalStateException();
    }

    @Override
    public void g(byte[] byArray, byte[] byArray2) {
        throw new IllegalStateException();
    }

    @Override
    public void h(byte[] byArray) {
    }

    @Override
    public /* synthetic */ void i(byte[] byArray, I1 i12) {
        D.a(this, byArray, i12);
    }

    @Override
    public byte[] j(byte[] byArray, byte[] byArray2) {
        throw new IllegalStateException();
    }

    @Override
    public void k(E.b b8) {
    }

    @Override
    public void l(byte[] byArray) {
        throw new IllegalStateException();
    }

    @Override
    public E.a m(byte[] byArray, List<o.b> list, int n8, HashMap<String, String> hashMap) {
        throw new IllegalStateException();
    }

    @Override
    public int n() {
        return 1;
    }
}

