/*
 * Decompiled with CFR 0.152.
 */
package ax.X2;

import android.content.Context;
import android.os.storage.StorageManager;
import android.os.storage.StorageVolume;
import ax.X2.N;
import ax.X2.Q;
import ax.X2.c;
import ax.X2.d;
import ax.X2.e;
import ax.X2.f;
import ax.X2.g;
import ax.X2.h;
import ax.X2.i;
import ax.X2.j;
import ax.X2.k;
import ax.X2.l;
import ax.X2.w;
import ax.u3.b;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class m
extends c {
    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public List<N> a(StorageManager object) {
        ArrayList<N> arrayList = new ArrayList<N>();
        try {
            object = d.a((StorageManager)object).iterator();
            while (object.hasNext()) {
                arrayList.add(this.c(e.a(object.next())));
            }
            return arrayList;
        }
        catch (NullPointerException nullPointerException) {
            return arrayList;
        }
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public N b(StorageManager object, File file) {
        Throwable var1_4;
        try {
            object = this.c(f.a(object, file));
            return object;
        }
        catch (NullPointerException nullPointerException) {
        }
        catch (SecurityException securityException) {
            // empty catch block
        }
        ax.Ha.c.h().f().b("GET STORAGE VOLUME ERROR").l((Throwable)var1_4).h();
        return null;
    }

    protected N c(StorageVolume storageVolume) {
        if (storageVolume == null) {
            return null;
        }
        return new a(storageVolume);
    }

    static class a
    extends N {
        StorageVolume i;

        a(StorageVolume storageVolume) {
            this.i = storageVolume;
        }

        @Override
        protected String b(Context context) {
            return l.a(this.i, context);
        }

        @Override
        protected String d(StorageManager storageManager) {
            return w.d(storageManager, this);
        }

        @Override
        protected int f(StorageManager storageManager) {
            return w.e(storageManager, this);
        }

        @Override
        protected String h() {
            return w.f(this.i);
        }

        @Override
        protected String j() {
            return j.a(this.i);
        }

        @Override
        protected String m() {
            return k.a(this.i);
        }

        @Override
        protected String o() {
            Exception exception2;
            block3: {
                String string;
                try {
                    string = w.k(this.i);
                    if (Q.Q()) {
                        Q.l(37);
                        return string;
                    }
                }
                catch (Exception exception2) {
                    break block3;
                }
                return string;
            }
            b.h("Can't find volume Id", exception2);
            return null;
        }

        @Override
        protected boolean q() {
            return g.a(this.i);
        }

        @Override
        protected boolean s() {
            return h.a(this.i);
        }

        public String toString() {
            return ax.X2.i.a(this.i);
        }
    }
}

