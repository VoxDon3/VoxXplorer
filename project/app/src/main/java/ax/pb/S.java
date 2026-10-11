/*
 * Decompiled with CFR 0.152.
 */
package ax.pb;

import ax.jb.a;
import ax.pb.b;
import ax.pb.i0;
import ax.pb.s;
import ax.qb.d;
import java.io.UnsupportedEncodingException;

class S
extends b {
    private static final boolean L0 = a.a("jcifs.smb.client.disablePlainTextPasswords", false);
    private static byte[] M0 = new byte[]{1, 1, 1, 1, 1, 1, 1, 1, 0};
    private i0 F0;
    private boolean G0 = false;
    private String H0;
    private byte[] I0;
    private int J0;
    String K0;

    static {
        String string = a.g("jcifs.smb.client.TreeConnectAndX.CheckDirectory");
        if (string != null) {
            S.M0[0] = Byte.parseByte(string);
        }
        if ((string = a.g("jcifs.smb.client.TreeConnectAndX.CreateDirectory")) != null) {
            S.M0[2] = Byte.parseByte(string);
        }
        if ((string = a.g("jcifs.smb.client.TreeConnectAndX.Delete")) != null) {
            S.M0[3] = Byte.parseByte(string);
        }
        if ((string = a.g("jcifs.smb.client.TreeConnectAndX.DeleteDirectory")) != null) {
            S.M0[4] = Byte.parseByte(string);
        }
        if ((string = a.g("jcifs.smb.client.TreeConnectAndX.OpenAndX")) != null) {
            S.M0[5] = Byte.parseByte(string);
        }
        if ((string = a.g("jcifs.smb.client.TreeConnectAndX.Rename")) != null) {
            S.M0[6] = Byte.parseByte(string);
        }
        if ((string = a.g("jcifs.smb.client.TreeConnectAndX.Transaction")) != null) {
            S.M0[7] = Byte.parseByte(string);
        }
        if ((string = a.g("jcifs.smb.client.TreeConnectAndX.QueryInformation")) != null) {
            S.M0[8] = Byte.parseByte(string);
        }
    }

    S(i0 i02, String string, String string2, s s8) {
        super(s8);
        this.F0 = i02;
        this.K0 = string;
        this.H0 = string2;
        this.d0 = (byte)117;
    }

    @Override
    int E(byte by) {
        if ((by = (byte)(by & 0xFF)) != 0) {
            if (by != 1) {
                if (by != 6) {
                    if (by != 7) {
                        if (by != 8) {
                            if (by != 16) {
                                if (by != 37) {
                                    if (by != 45) {
                                        return 0;
                                    }
                                    return M0[5];
                                }
                                return M0[7];
                            }
                            return M0[0];
                        }
                        return M0[8];
                    }
                    return M0[6];
                }
                return M0[3];
            }
            return M0[4];
        }
        return M0[2];
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
        stringBuilder.append("SmbComTreeConnectAndX[");
        stringBuilder.append(super.toString());
        stringBuilder.append(",disconnectTid=");
        stringBuilder.append(this.G0);
        stringBuilder.append(",passwordLength=");
        stringBuilder.append(this.J0);
        stringBuilder.append(",password=");
        stringBuilder.append(d.d(this.I0, this.J0, 0));
        stringBuilder.append(",path=");
        stringBuilder.append(this.K0);
        stringBuilder.append(",service=");
        stringBuilder.append(this.H0);
        stringBuilder.append("]");
        return new String(stringBuilder.toString());
    }

    /*
     * Unable to fully structure code
     */
    @Override
    int u(byte[] var1_1, int var2_3) {
        var4_4 = this.F0;
        if (var4_4.h.w0.g != 0) ** GOTO lbl-1000
        var4_4 = var4_4.i;
        if (var4_4.g0 || var4_4.d0.length() > 0) {
            System.arraycopy(this.I0, 0, var1_1, var2_3, this.J0);
            var3_5 = this.J0 + var2_3;
        } else lbl-1000:
        // 2 sources

        {
            var3_5 = var2_3 + 1;
            var1_1[var2_3] = 0;
        }
        var3_5 += this.A(this.K0, var1_1, var3_5);
        try {
            System.arraycopy(this.H0.getBytes("ASCII"), 0, var1_1, var3_5, this.H0.length());
            var1_1[var3_5 += this.H0.length()] = 0;
            return var3_5 + 1 - var2_3;
        }
        catch (UnsupportedEncodingException var1_2) {
            return 0;
        }
    }

    /*
     * Unable to fully structure code
     */
    @Override
    int z(byte[] var1_1, int var2_2) {
        var3_3 = this.F0;
        if (var3_3.h.w0.g != 0) ** GOTO lbl18
        var3_3 = var3_3.i;
        if (!var3_3.g0 && var3_3.d0.length() <= 0) ** GOTO lbl18
        var4_4 = this.F0;
        var3_3 = var4_4.h.w0;
        if (var3_3.h) {
            var3_3 = var4_4.i.c(var3_3.p);
            this.I0 = (byte[])var3_3;
            this.J0 = ((Object)var3_3).length;
        } else if (!S.L0) {
            var3_3 = new byte[(var4_4.i.d0.length() + 1) * 2];
            this.I0 = (byte[])var3_3;
            this.J0 = this.A(this.F0.i.d0, (byte[])var3_3, 0);
        } else {
            throw new RuntimeException("Plain text passwords are disabled");
lbl18:
            // 2 sources

            this.J0 = 1;
        }
        var1_1[var2_2] = (byte)this.G0;
        var1_1[var2_2 + 1] = 0;
        s.w(this.J0, var1_1, var2_2 + 2);
        return 4;
    }
}

