package ax.X2;

import android.content.Context;
import android.os.storage.StorageManager;
import android.os.storage.StorageVolume;
import ax.u3.C3184b;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: ax.X2.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1167m extends C1157c {

    /* renamed from: ax.X2.m$a */
    static class a extends N {
        StorageVolume i;

        a(StorageVolume storageVolume) {
            this.i = storageVolume;
        }

        @Override // ax.X2.N
        protected String b(Context context) {
            String description;
            description = this.i.getDescription(context);
            return description;
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
            String state;
            state = this.i.getState();
            return state;
        }

        @Override // ax.X2.N
        protected String m() {
            String uuid;
            uuid = this.i.getUuid();
            return uuid;
        }

        @Override // ax.X2.N
        protected String o() {
            try {
                String k = w.k(this.i);
                if (!Q.Q()) {
                    return k;
                }
                Q.l(37);
                return k;
            } catch (Exception e) {
                C3184b.h("Can't find volume Id", e);
                return null;
            }
        }

        @Override // ax.X2.N
        protected boolean q() {
            boolean isPrimary;
            isPrimary = this.i.isPrimary();
            return isPrimary;
        }

        @Override // ax.X2.N
        protected boolean s() {
            boolean isRemovable;
            isRemovable = this.i.isRemovable();
            return isRemovable;
        }

        public String toString() {
            String storageVolume;
            storageVolume = this.i.toString();
            return storageVolume;
        }
    }

    @Override // ax.X2.C1157c, ax.X2.C1156b, ax.X2.C1155a.InterfaceC0218a
    public List<N> a(StorageManager storageManager) {
        List storageVolumes;
        ArrayList arrayList = new ArrayList();
        try {
            storageVolumes = storageManager.getStorageVolumes();
            Iterator it = storageVolumes.iterator();
            while (it.hasNext()) {
                arrayList.add(c(C1159e.a(it.next())));
            }
        } catch (NullPointerException unused) {
        }
        return arrayList;
    }

    @Override // ax.X2.C1157c, ax.X2.C1156b, ax.X2.C1155a.InterfaceC0218a
    public N b(StorageManager storageManager, File file) {
        StorageVolume storageVolume;
        try {
            storageVolume = storageManager.getStorageVolume(file);
            return c(storageVolume);
        } catch (NullPointerException | SecurityException e) {
            ax.Ha.c.h().f().b("GET STORAGE VOLUME ERROR").l(e).h();
            return null;
        }
    }

    protected N c(StorageVolume storageVolume) {
        if (storageVolume == null) {
            return null;
        }
        return new a(storageVolume);
    }
}
