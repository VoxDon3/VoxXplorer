package com.jcraft.jsch;

/* loaded from: classes3.dex */
abstract class DHECN extends KeyExchange {
    private Buffer A;
    private Packet B;
    private ECDH C;
    protected String D;
    protected int E;
    private int u;
    byte[] v;
    byte[] w;
    byte[] x;
    byte[] y;
    byte[] z;

    DHECN() {
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
            HASH hash = (HASH) Class.forName(session.w(this.D)).asSubclass(HASH.class).getDeclaredConstructor(null).newInstance(null);
            this.b = hash;
            hash.e();
            this.A = new Buffer();
            Packet packet = new Packet(this.A);
            this.B = packet;
            packet.c();
            this.A.s((byte) 30);
            try {
                ECDH ecdh = (ECDH) Class.forName(session.w("ecdh-sha2-nistp")).asSubclass(ECDH.class).getDeclaredConstructor(null).newInstance(null);
                this.C = ecdh;
                ecdh.b(this.E);
                byte[] a = this.C.a();
                this.v = a;
                this.A.y(a);
                if (bArr == null) {
                    return;
                }
                session.m0(this.B);
                if (session.A().isEnabled(1)) {
                    session.A().a(1, "SSH_MSG_KEX_ECDH_INIT sent");
                    session.A().a(1, "expecting SSH_MSG_KEX_ECDH_REPLY");
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
                this.a.A().a(3, "type: must be SSH_MSG_KEX_ECDH_REPLY " + c);
            }
            return false;
        }
        this.e = buffer.p();
        byte[] p = buffer.p();
        byte[][] H = KeyPairECDSA.H(p);
        if (!this.C.d(H[0], H[1])) {
            return false;
        }
        this.c = c(o(this.C.c(H[0], H[1])));
        byte[] p2 = buffer.p();
        this.A.A();
        this.A.y(this.x);
        this.A.y(this.w);
        this.A.y(this.z);
        this.A.y(this.y);
        this.A.y(this.e);
        this.A.y(this.v);
        this.A.y(p);
        int j = this.A.j();
        byte[] bArr = new byte[j];
        this.A.e(bArr);
        this.b.b(bArr, 0, j);
        HASH hash = this.b;
        byte[] bArr2 = this.c;
        hash.b(bArr2, 0, bArr2.length);
        this.d = this.b.c();
        byte[] bArr3 = this.e;
        int i = ((bArr3[0] << 24) & (-16777216)) | ((bArr3[1] << 16) & 16711680) | ((bArr3[2] << 8) & 65280) | (bArr3[3] & 255);
        boolean p3 = p(Util.d(bArr3, 4, i), this.e, 4 + i, p2);
        this.u = 0;
        return p3;
    }
}
