package com.jcraft.jsch;

/* loaded from: classes3.dex */
abstract class DHGN extends KeyExchange {
    byte[] A;
    private Buffer B;
    private Packet C;
    private int u;
    DH v;
    byte[] w;
    byte[] x;
    byte[] y;
    byte[] z;

    DHGN() {
    }

    @Override // com.jcraft.jsch.KeyExchange
    public int k() {
        return this.u;
    }

    @Override // com.jcraft.jsch.KeyExchange
    public void m(Session session, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) throws Exception {
        this.w = bArr;
        this.x = bArr2;
        this.y = bArr3;
        this.z = bArr4;
        try {
            HASH hash = (HASH) Class.forName(session.w(s())).asSubclass(HASH.class).getDeclaredConstructor(null).newInstance(null);
            this.b = hash;
            hash.e();
            this.B = new Buffer();
            this.C = new Packet(this.B);
            try {
                DH dh = (DH) Class.forName(session.w("dh")).asSubclass(DH.class).getDeclaredConstructor(null).newInstance(null);
                this.v = dh;
                dh.e();
                this.v.d(r());
                this.v.f(q());
                this.A = this.v.a();
                this.C.c();
                this.B.s((byte) 30);
                this.B.x(this.A);
                if (bArr == null) {
                    return;
                }
                session.m0(this.C);
                if (session.A().isEnabled(1)) {
                    session.A().a(1, "SSH_MSG_KEXDH_INIT sent");
                    session.A().a(1, "expecting SSH_MSG_KEXDH_REPLY");
                }
                this.u = 31;
            } catch (Exception e) {
                throw new JSchException(e.toString(), e);
            }
        } catch (Exception e2) {
            throw new JSchException(e2.toString(), e2);
        }
    }

    @Override // com.jcraft.jsch.KeyExchange
    public boolean n(Buffer buffer) throws Exception {
        if (this.u != 31) {
            return false;
        }
        buffer.i();
        buffer.c();
        int c = buffer.c();
        if (c != 31) {
            if (this.a.A().isEnabled(3)) {
                this.a.A().a(3, "type: must be SSH_MSG_KEXDH_REPLY " + c);
            }
            return false;
        }
        this.e = buffer.p();
        byte[] l = buffer.l();
        byte[] p = buffer.p();
        this.v.g(l);
        this.v.b();
        this.c = c(o(this.v.c()));
        this.B.A();
        this.B.y(this.x);
        this.B.y(this.w);
        this.B.y(this.z);
        this.B.y(this.y);
        this.B.y(this.e);
        this.B.x(this.A);
        this.B.x(l);
        int j = this.B.j();
        byte[] bArr = new byte[j];
        this.B.e(bArr);
        this.b.b(bArr, 0, j);
        HASH hash = this.b;
        byte[] bArr2 = this.c;
        hash.b(bArr2, 0, bArr2.length);
        this.d = this.b.c();
        byte[] bArr3 = this.e;
        int i = ((bArr3[0] << 24) & (-16777216)) | ((bArr3[1] << 16) & 16711680) | ((bArr3[2] << 8) & 65280) | (bArr3[3] & 255);
        boolean p2 = p(Util.d(bArr3, 4, i), this.e, 4 + i, p);
        this.u = 0;
        return p2;
    }

    abstract byte[] q();

    abstract byte[] r();

    abstract String s();
}
