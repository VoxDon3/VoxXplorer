package com.jcraft.jsch;

import java.util.Vector;

/* loaded from: classes3.dex */
class IdentityRepositoryWrapper implements IdentityRepository {
    private IdentityRepository a;
    private Vector<Identity> b;
    private boolean c;

    IdentityRepositoryWrapper(IdentityRepository identityRepository) {
        this(identityRepository, false);
    }

    @Override // com.jcraft.jsch.IdentityRepository
    public Vector<Identity> a() {
        Vector<Identity> vector = new Vector<>();
        for (int i = 0; i < this.b.size(); i++) {
            vector.add(this.b.elementAt(i));
        }
        Vector<Identity> a = this.a.a();
        for (int i2 = 0; i2 < a.size(); i2++) {
            vector.add(a.elementAt(i2));
        }
        return vector;
    }

    @Override // com.jcraft.jsch.IdentityRepository
    public boolean b(byte[] bArr) {
        return this.a.b(bArr);
    }

    @Override // com.jcraft.jsch.IdentityRepository
    public boolean c(byte[] bArr) {
        return this.a.c(bArr);
    }

    @Override // com.jcraft.jsch.IdentityRepository
    public void d() {
        this.b.removeAllElements();
        this.a.d();
    }

    void e(Identity identity) {
        if (this.c || identity.c() || !(identity instanceof IdentityFile)) {
            this.b.addElement(identity);
        } else {
            try {
                this.a.b(((IdentityFile) identity).g().g());
            } catch (JSchException unused) {
            }
        }
    }

    void f() {
        if (this.b.size() > 0) {
            for (Object obj : this.b.toArray()) {
                Identity identity = (Identity) obj;
                this.b.removeElement(identity);
                e(identity);
            }
        }
    }

    IdentityRepositoryWrapper(IdentityRepository identityRepository, boolean z) {
        this.b = new Vector<>();
        this.a = identityRepository;
        this.c = z;
    }
}
