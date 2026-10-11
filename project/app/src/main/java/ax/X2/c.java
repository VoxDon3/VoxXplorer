/*
 * Decompiled with CFR 0.152.
 */
package ax.X2;

import android.content.Context;
import android.os.storage.StorageManager;
import ax.X2.N;
import ax.X2.b;
import ax.X2.w;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class c
extends b {
    @Override
    public List<N> a(StorageManager objectArray) {
        ArrayList<N> arrayList = new ArrayList<N>();
        if ((objectArray = w.m((StorageManager)objectArray)) != null) {
            int n8 = objectArray.length;
            for (int i8 = 0; i8 < n8; ++i8) {
                arrayList.add(new a(objectArray[i8]));
            }
        }
        return arrayList;
    }

    @Override
    public N b(StorageManager object, File file) {
        if ((object = w.h(object, file)) == null) {
            return null;
        }
        return new a(object);
    }

    private static class a
    extends N {
        Object i;

        a(Object object) {
            this.i = object;
        }

        @Override
        protected String b(Context context) {
            return w.c(this.i, context);
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
            return w.g(this.i);
        }

        @Override
        protected String m() {
            return w.j(this.i);
        }

        @Override
        protected String o() {
            try {
                String string = w.k(this.i);
                return string;
            }
            catch (Exception exception) {
                ax.u3.b.h("Can't find volume Id", exception);
                return null;
            }
        }

        @Override
        protected boolean q() {
            return w.o(this.i);
        }

        @Override
        protected boolean s() {
            return w.p(this.i);
        }

        public String toString() {
            return this.i.toString();
        }
    }
}

