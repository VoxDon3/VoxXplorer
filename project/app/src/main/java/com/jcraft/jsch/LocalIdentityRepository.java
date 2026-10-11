/*
 * Decompiled with CFR 0.152.
 */
package com.jcraft.jsch;

import com.jcraft.jsch.Identity;
import com.jcraft.jsch.IdentityFile;
import com.jcraft.jsch.IdentityRepository;
import com.jcraft.jsch.JSch;
import com.jcraft.jsch.JSchException;
import com.jcraft.jsch.Util;
import java.util.Vector;

class LocalIdentityRepository
implements IdentityRepository {
    private Vector<Identity> a = new Vector();
    private JSch.InstanceLogger b;

    LocalIdentityRepository(JSch.InstanceLogger instanceLogger) {
        this.b = instanceLogger;
    }

    private void f() {
        Vector<byte[]> vector = new Vector<byte[]>();
        int n8 = this.a.size();
        if (n8 != 0) {
            int n9;
            int n10 = 0;
            int n11 = 0;
            while (true) {
                if (n11 >= n8) break;
                Identity identity = this.a.elementAt(n11);
                byte[] byArray = identity.d();
                if (byArray != null) {
                    for (n9 = n11 + 1; n9 < n8; ++n9) {
                        Identity identity2 = this.a.elementAt(n9);
                        byte[] byArray2 = identity2.d();
                        if (byArray2 == null || !Util.a(byArray, byArray2) || identity.c() != identity2.c()) continue;
                        vector.addElement(byArray);
                        break;
                    }
                }
                ++n11;
            }
            for (n9 = n10; n9 < vector.size(); ++n9) {
                this.c((byte[])vector.elementAt(n9));
            }
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public Vector<Identity> a() {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                Vector<Identity> vector;
                try {
                    this.f();
                    vector = new Vector<Identity>();
                    for (int i8 = 0; i8 < this.a.size(); ++i8) {
                        vector.addElement(this.a.elementAt(i8));
                    }
                }
                catch (Throwable throwable2) {
                    break block5;
                }
                return vector;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public boolean b(byte[] byArray) {
        synchronized (this) {
            try {
                this.e(IdentityFile.i("from remote:", byArray, null, this.b));
                return true;
            }
            catch (JSchException jSchException) {
                return false;
            }
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public boolean c(byte[] byArray) {
        synchronized (this) {
            Throwable throwable2;
            block7: {
                if (byArray == null) {
                    return false;
                }
                int n8 = 0;
                while (true) {
                    try {
                        if (n8 >= this.a.size()) break;
                        Identity identity = this.a.elementAt(n8);
                        byte[] byArray2 = identity.d();
                        if (byArray2 != null && Util.a(byArray, byArray2)) {
                            this.a.removeElement(identity);
                            identity.clear();
                            return true;
                        }
                    }
                    catch (Throwable throwable2) {
                        break block7;
                    }
                    ++n8;
                }
                return false;
            }
            throw throwable2;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void d() {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                try {
                    for (int i8 = 0; i8 < this.a.size(); ++i8) {
                        this.a.elementAt(i8).clear();
                    }
                }
                catch (Throwable throwable2) {
                    break block5;
                }
                {
                    this.a.removeAllElements();
                    return;
                }
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void e(Identity identity) {
        synchronized (this) {
            block7: {
                byte[] byArray;
                try {
                    if (this.a.contains(identity)) break block7;
                    byArray = identity.d();
                    if (byArray == null) {
                        this.a.addElement(identity);
                        return;
                    }
                }
                catch (Throwable throwable) {}
                throw throwable;
                for (int i8 = 0; i8 < this.a.size(); ++i8) {
                    byte[] byArray2 = this.a.elementAt(i8).d();
                    if (byArray2 == null || !Util.a(byArray, byArray2)) continue;
                    if (!identity.c() && this.a.elementAt(i8).c()) {
                        this.c(byArray2);
                        continue;
                    }
                    return;
                }
                this.a.addElement(identity);
            }
            return;
        }
    }
}

