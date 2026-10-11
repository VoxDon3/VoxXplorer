package com.jcraft.jsch;

/* loaded from: classes3.dex */
abstract class DHGEX extends KeyExchange {
    byte[] A;
    byte[] B;
    byte[] C;
    private Buffer D;
    private Packet E;
    private byte[] F;
    private byte[] G;
    private byte[] H;
    protected String I;
    int u;
    int v;
    int w;
    private int x;
    DH y;
    byte[] z;

    DHGEX() {
    }

    static boolean q(int i) {
        return i < 1024 || i > 8192 || i % 1024 != 0;
    }

    @Override // com.jcraft.jsch.KeyExchange
    public int k() {
        return this.x;
    }

    @Override // com.jcraft.jsch.KeyExchange
    public void m(Session session, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) throws Exception {
        int i;
        this.z = bArr;
        this.A = bArr2;
        this.B = bArr3;
        this.C = bArr4;
        try {
            HASH hash = (HASH) Class.forName(session.w(this.I)).asSubclass(HASH.class).getDeclaredConstructor(null).newInstance(null);
            this.b = hash;
            hash.e();
            this.D = new Buffer();
            this.E = new Packet(this.D);
            try {
                Class<? extends U> asSubclass = Class.forName(session.w("dh")).asSubclass(DH.class);
                this.u = Integer.parseInt(session.w("dhgex_min"));
                this.w = Integer.parseInt(session.w("dhgex_max"));
                this.v = Integer.parseInt(session.w("dhgex_preferred"));
                if (q(this.u) || q(this.w) || q(this.v) || (i = this.v) < this.u || this.w < i) {
                    throw new JSchException("Invalid DHGEX sizes: min=" + this.u + " max=" + this.w + " preferred=" + this.v);
                }
                DH dh = (DH) asSubclass.getDeclaredConstructor(null).newInstance(null);
                this.y = dh;
                dh.e();
                this.E.c();
                this.D.s((byte) 34);
                this.D.v(this.u);
                this.D.v(this.v);
                this.D.v(this.w);
                session.m0(this.E);
                if (session.A().isEnabled(1)) {
                    session.A().a(1, "SSH_MSG_KEX_DH_GEX_REQUEST(" + this.u + "<" + this.v + "<" + this.w + ") sent");
                    session.A().a(1, "expecting SSH_MSG_KEX_DH_GEX_GROUP");
                }
                this.x = 31;
            } catch (Exception e) {
                throw new JSchException(e.toString(), e);
            }
        } catch (Exception e2) {
            throw new JSchException(e2.toString(), e2);
        }
    }

    @Override // com.jcraft.jsch.KeyExchange
    public boolean n(Buffer buffer) throws Exception {
        int i = this.x;
        if (i == 31) {
            buffer.i();
            buffer.c();
            int c = buffer.c();
            if (c != 31) {
                if (this.a.A().isEnabled(3)) {
                    this.a.A().a(3, "type: must be SSH_MSG_KEX_DH_GEX_GROUP " + c);
                }
                return false;
            }
            this.F = buffer.l();
            this.G = buffer.l();
            this.y.d(this.F);
            this.y.f(this.G);
            this.H = this.y.a();
            this.E.c();
            this.D.s((byte) 32);
            this.D.x(this.H);
            this.a.m0(this.E);
            if (this.a.A().isEnabled(1)) {
                this.a.A().a(1, "SSH_MSG_KEX_DH_GEX_INIT sent");
                this.a.A().a(1, "expecting SSH_MSG_KEX_DH_GEX_REPLY");
            }
            this.x = 33;
            return true;
        }
        if (i != 33) {
            return false;
        }
        buffer.i();
        buffer.c();
        int c2 = buffer.c();
        if (c2 != 33) {
            if (this.a.A().isEnabled(3)) {
                this.a.A().a(3, "type: must be SSH_MSG_KEX_DH_GEX_REPLY " + c2);
            }
            return false;
        }
        this.e = buffer.p();
        byte[] l = buffer.l();
        byte[] p = buffer.p();
        this.y.g(l);
        this.y.b();
        this.c = c(o(this.y.c()));
        this.D.A();
        this.D.y(this.A);
        this.D.y(this.z);
        this.D.y(this.C);
        this.D.y(this.B);
        this.D.y(this.e);
        this.D.v(this.u);
        this.D.v(this.v);
        this.D.v(this.w);
        this.D.x(this.F);
        this.D.x(this.G);
        this.D.x(this.H);
        this.D.x(l);
        int j = this.D.j();
        byte[] bArr = new byte[j];
        this.D.e(bArr);
        this.b.b(bArr, 0, j);
        HASH hash = this.b;
        byte[] bArr2 = this.c;
        hash.b(bArr2, 0, bArr2.length);
        this.d = this.b.c();
        byte[] bArr3 = this.e;
        int i2 = ((bArr3[0] << 24) & (-16777216)) | ((bArr3[1] << 16) & 16711680) | ((bArr3[2] << 8) & 65280) | (bArr3[3] & 255);
        boolean p2 = p(Util.d(bArr3, 4, i2), this.e, 4 + i2, p);
        this.x = 0;
        return p2;
    }
}
