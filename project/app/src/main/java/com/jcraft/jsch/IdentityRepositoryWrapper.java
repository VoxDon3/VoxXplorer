/*
 * Decompiled with CFR 0.152.
 */
package com.jcraft.jsch;

import com.jcraft.jsch.Identity;
import com.jcraft.jsch.IdentityFile;
import com.jcraft.jsch.IdentityRepository;
import com.jcraft.jsch.JSchException;
import java.util.Vector;

class IdentityRepositoryWrapper
implements IdentityRepository {
    private IdentityRepository a;
    private Vector<Identity> b = new Vector();
    private boolean c;

    IdentityRepositoryWrapper(IdentityRepository identityRepository) {
        this(identityRepository, false);
    }

    IdentityRepositoryWrapper(IdentityRepository identityRepository, boolean bl) {
        this.a = identityRepository;
        this.c = bl;
    }

    @Override
    public Vector<Identity> a() {
        int n8;
        Vector<Identity> vector = new Vector<Identity>();
        int n9 = 0;
        for (n8 = 0; n8 < this.b.size(); ++n8) {
            vector.add(this.b.elementAt(n8));
        }
        Vector<Identity> vector2 = this.a.a();
        for (n8 = n9; n8 < vector2.size(); ++n8) {
            vector.add(vector2.elementAt(n8));
        }
        return vector;
    }

    @Override
    public boolean b(byte[] byArray) {
        return this.a.b(byArray);
    }

    @Override
    public boolean c(byte[] byArray) {
        return this.a.c(byArray);
    }

    @Override
    public void d() {
        this.b.removeAllElements();
        this.a.d();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    void e(Identity identity) {
        if (!this.c && !identity.c() && identity instanceof IdentityFile) {
            try {
                this.a.b(((IdentityFile)identity).g().g());
                return;
            }
            catch (JSchException jSchException) {
                return;
            }
        }
        this.b.addElement(identity);
    }

    void f() {
        if (this.b.size() > 0) {
            Object[] objectArray = this.b.toArray();
            for (int i8 = 0; i8 < objectArray.length; ++i8) {
                Identity identity = (Identity)objectArray[i8];
                this.b.removeElement(identity);
                this.e(identity);
            }
        }
    }
}

