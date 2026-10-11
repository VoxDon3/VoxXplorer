/*
 * Decompiled with CFR 0.152.
 */
package ax.pb;

import ax.jb.a;
import ax.pb.Z;
import ax.pb.a0;
import ax.pb.b;
import ax.pb.i0;
import ax.pb.k0;
import ax.pb.r;
import ax.pb.s;

class N
extends b {
    private static final int O0 = a.d("jcifs.smb.client.SessionSetupAndX.TreeConnectAndX", 1);
    private static final boolean P0 = a.a("jcifs.smb.client.disablePlainTextPasswords", false);
    private byte[] F0;
    private byte[] G0;
    private byte[] H0;
    private int I0;
    private int J0;
    private String K0;
    private String L0;
    i0 M0;
    Object N0;

    N(i0 object, s object2, Object object3) throws a0 {
        int n8;
        block12: {
            block13: {
                block17: {
                    block15: {
                        block16: {
                            k0.a a8;
                            block14: {
                                int n9;
                                super((s)object2);
                                this.H0 = null;
                                this.d0 = (byte)115;
                                this.M0 = object;
                                this.N0 = object3;
                                object2 = ((i0)object).h;
                                this.I0 = ((k0)object2).C0;
                                this.J0 = n9 = ((k0)object2).B0;
                                a8 = ((k0)object2).w0;
                                n8 = a8.g;
                                if (n8 != 1) break block12;
                                if (!(object3 instanceof r)) break block13;
                                object2 = (r)object3;
                                if (object2 != r.q0) break block14;
                                this.F0 = new byte[0];
                                this.G0 = new byte[0];
                                this.J0 = Integer.MAX_VALUE & n9;
                                break block15;
                            }
                            if (!a8.h) break block16;
                            this.F0 = ((r)object2).c(a8.p);
                            object = ((r)object2).l(((i0)object).h.w0.p);
                            this.G0 = (byte[])object;
                            if (this.F0.length == 0 && ((Object)object).length == 0) {
                                throw new RuntimeException("Null setup prohibited.");
                            }
                            break block15;
                        }
                        if (P0) break block17;
                        if (this.q0) {
                            object3 = ((r)object2).i();
                            this.F0 = new byte[0];
                            object = new byte[(((String)object3).length() + 1) * 2];
                            this.G0 = (byte[])object;
                            this.A((String)object3, (byte[])object, 0);
                        } else {
                            object3 = ((r)object2).i();
                            object = new byte[(((String)object3).length() + 1) * 2];
                            this.F0 = (byte[])object;
                            this.G0 = new byte[0];
                            this.A((String)object3, (byte[])object, 0);
                        }
                    }
                    this.K0 = object = ((r)object2).c0;
                    if (this.q0) {
                        this.K0 = ((String)object).toUpperCase();
                    }
                    this.L0 = ((r)object2).q.toUpperCase();
                    return;
                }
                throw new RuntimeException("Plain text passwords are disabled");
            }
            if (object3 instanceof byte[]) {
                this.H0 = (byte[])object3;
                return;
            }
            throw new a0("Unsupported credential type");
        }
        if (n8 == 0) {
            if (object3 instanceof r) {
                object2 = (r)object3;
                this.F0 = new byte[0];
                this.G0 = new byte[0];
                this.K0 = object = ((r)object2).c0;
                if (this.q0) {
                    this.K0 = ((String)object).toUpperCase();
                }
                this.L0 = ((r)object2).q.toUpperCase();
                return;
            }
            throw new a0("Unsupported credential type");
        }
        throw new a0("Unsupported");
    }

    @Override
    int E(byte by) {
        if (by == 117) {
            return O0;
        }
        return 0;
    }

    @Override
    int g(byte[] byArray, int n8) {
        return 0;
    }

    @Override
    int l(byte[] byArray, int n8) {
        return 0;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SmbComSessionSetupAndX[");
        stringBuilder.append(super.toString());
        stringBuilder.append(",snd_buf_size=");
        stringBuilder.append(this.M0.h.z0);
        stringBuilder.append(",maxMpxCount=");
        stringBuilder.append(this.M0.h.y0);
        stringBuilder.append(",VC_NUMBER=");
        Object object = this.M0.h;
        stringBuilder.append(1);
        stringBuilder.append(",sessionKey=");
        stringBuilder.append(this.I0);
        stringBuilder.append(",lmHash.length=");
        object = this.F0;
        int n8 = 0;
        int n9 = object == null ? 0 : ((Object)object).length;
        stringBuilder.append(n9);
        stringBuilder.append(",ntHash.length=");
        object = this.G0;
        n9 = object == null ? n8 : ((Object)object).length;
        stringBuilder.append(n9);
        stringBuilder.append(",capabilities=");
        stringBuilder.append(this.J0);
        stringBuilder.append(",accountName=");
        stringBuilder.append(this.K0);
        stringBuilder.append(",primaryDomain=");
        stringBuilder.append(this.L0);
        stringBuilder.append(",NATIVE_OS=");
        object = this.M0.h;
        stringBuilder.append(Z.V);
        stringBuilder.append(",NATIVE_LANMAN=");
        object = this.M0.h;
        stringBuilder.append(Z.W);
        stringBuilder.append("]");
        return new String(stringBuilder.toString());
    }

    @Override
    int u(byte[] byArray, int n8) {
        int n9;
        Object object = this.H0;
        if (object != null) {
            System.arraycopy(object, 0, byArray, n8, ((byte[])object).length);
            n9 = this.H0.length + n8;
        } else {
            object = this.F0;
            System.arraycopy(object, 0, byArray, n8, ((byte[])object).length);
            n9 = this.F0.length + n8;
            object = this.G0;
            System.arraycopy(object, 0, byArray, n9, ((byte[])object).length);
            n9 += this.G0.length;
            n9 += this.A(this.K0, byArray, n9);
            n9 += this.A(this.L0, byArray, n9);
        }
        object = this.M0.h;
        n9 += this.A(Z.V, byArray, n9);
        object = this.M0.h;
        return n9 + this.A(Z.W, byArray, n9) - n8;
    }

    @Override
    int z(byte[] byArray, int n8) {
        s.w(this.M0.h.z0, byArray, n8);
        s.w(this.M0.h.y0, byArray, n8 + 2);
        Object object = this.M0.h;
        s.w(1L, byArray, n8 + 4);
        s.x(this.I0, byArray, n8 + 6);
        int n9 = n8 + 10;
        object = this.H0;
        if (object != null) {
            s.w(((Object)object).length, byArray, n9);
            n9 = n8 + 12;
        } else {
            s.w(this.F0.length, byArray, n9);
            s.w(this.G0.length, byArray, n8 + 12);
            n9 = n8 + 14;
        }
        byArray[n9] = 0;
        byArray[n9 + 1] = 0;
        byArray[n9 + 2] = 0;
        byArray[n9 + 3] = 0;
        s.x(this.J0, byArray, n9 + 4);
        return n9 + 8 - n8;
    }
}

