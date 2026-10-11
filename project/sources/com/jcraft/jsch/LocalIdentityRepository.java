package com.jcraft.jsch;

import com.jcraft.jsch.JSch;
import java.util.Vector;

/* loaded from: classes3.dex */
class LocalIdentityRepository implements IdentityRepository {
    private Vector<Identity> a = new Vector<>();
    private JSch.InstanceLogger b;

    LocalIdentityRepository(JSch.InstanceLogger instanceLogger) {
        this.b = instanceLogger;
    }

    private void f() {
        Vector vector = new Vector();
        int size = this.a.size();
        if (size == 0) {
            return;
        }
        for (int i = 0; i < size; i++) {
            Identity elementAt = this.a.elementAt(i);
            byte[] d = elementAt.d();
            if (d != null) {
                int i2 = i + 1;
                while (true) {
                    if (i2 >= size) {
                        break;
                    }
                    Identity elementAt2 = this.a.elementAt(i2);
                    byte[] d2 = elementAt2.d();
                    if (d2 != null && Util.a(d, d2) && elementAt.c() == elementAt2.c()) {
                        vector.addElement(d);
                        break;
                    }
                    i2++;
                }
            }
        }
        for (int i3 = 0; i3 < vector.size(); i3++) {
            c((byte[]) vector.elementAt(i3));
        }
    }

    @Override // com.jcraft.jsch.IdentityRepository
    public synchronized Vector<Identity> a() {
        Vector<Identity> vector;
        f();
        vector = new Vector<>();
        for (int i = 0; i < this.a.size(); i++) {
            vector.addElement(this.a.elementAt(i));
        }
        return vector;
    }

    @Override // com.jcraft.jsch.IdentityRepository
    public synchronized boolean b(byte[] bArr) {
        try {
            e(IdentityFile.i("from remote:", bArr, null, this.b));
        } catch (JSchException unused) {
            return false;
        }
        return true;
    }

    @Override // com.jcraft.jsch.IdentityRepository
    public synchronized boolean c(byte[] bArr) {
        if (bArr == null) {
            return false;
        }
        for (int i = 0; i < this.a.size(); i++) {
            Identity elementAt = this.a.elementAt(i);
            byte[] d = elementAt.d();
            if (d != null && Util.a(bArr, d)) {
                this.a.removeElement(elementAt);
                elementAt.clear();
                return true;
            }
        }
        return false;
    }

    @Override // com.jcraft.jsch.IdentityRepository
    public synchronized void d() {
        for (int i = 0; i < this.a.size(); i++) {
            try {
                this.a.elementAt(i).clear();
            } catch (Throwable th) {
                throw th;
            }
        }
        this.a.removeAllElements();
    }

    public synchronized void e(Identity identity) {
        if (!this.a.contains(identity)) {
            byte[] d = identity.d();
            if (d == null) {
                this.a.addElement(identity);
                return;
            }
            for (int i = 0; i < this.a.size(); i++) {
                byte[] d2 = this.a.elementAt(i).d();
                if (d2 != null && Util.a(d, d2)) {
                    if (identity.c() || !this.a.elementAt(i).c()) {
                        return;
                    } else {
                        c(d2);
                    }
                }
            }
            this.a.addElement(identity);
        }
    }
}
