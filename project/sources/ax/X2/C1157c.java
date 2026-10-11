package ax.X2;

import android.content.Context;
import android.os.storage.StorageManager;
import ax.u3.C3184b;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* renamed from: ax.X2.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1157c extends C1156b {

    /* renamed from: ax.X2.c$a */
    private static class a extends N {
        Object i;

        a(Object obj) {
            this.i = obj;
        }

        @Override // ax.X2.N
        protected String b(Context context) {
            return w.c(this.i, context);
        }

        @Override // ax.X2.N
        protected String d(StorageManager storageManager) {
            return w.d(storageManager, this);
        }

        @Override // ax.X2.N
        protected int f(StorageManager storageManager) {
            return w.e(storageManager, this);
        }

        @Override // ax.X2.N
        protected String h() {
            return w.f(this.i);
        }

        @Override // ax.X2.N
        protected String j() {
            return w.g(this.i);
        }

        @Override // ax.X2.N
        protected String m() {
            return w.j(this.i);
        }

        @Override // ax.X2.N
        protected String o() {
            try {
                return w.k(this.i);
            } catch (Exception e) {
                C3184b.h("Can't find volume Id", e);
                return null;
            }
        }

        @Override // ax.X2.N
        protected boolean q() {
            return w.o(this.i);
        }

        @Override // ax.X2.N
        protected boolean s() {
            return w.p(this.i);
        }

        public String toString() {
            return this.i.toString();
        }
    }

    @Override // ax.X2.C1156b, ax.X2.C1155a.InterfaceC0218a
    public List<N> a(StorageManager storageManager) {
        ArrayList arrayList = new ArrayList();
        Object[] m = w.m(storageManager);
        if (m != null) {
            for (Object obj : m) {
                arrayList.add(new a(obj));
            }
        }
        return arrayList;
    }

    @Override // ax.X2.C1156b, ax.X2.C1155a.InterfaceC0218a
    public N b(StorageManager storageManager, File file) {
        Object h = w.h(storageManager, file);
        if (h == null) {
            return null;
        }
        return new a(h);
    }
}
