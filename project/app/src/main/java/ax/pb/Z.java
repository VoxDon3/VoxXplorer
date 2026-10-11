/*
 * Decompiled with CFR 0.152.
 */
package ax.pb;

import ax.jb.a;
import ax.pb.k0;
import java.net.InetAddress;
import java.util.LinkedList;
import java.util.TimeZone;

interface Z {
    public static final boolean A;
    public static final boolean B;
    public static final boolean C;
    public static final boolean D;
    public static final boolean E;
    public static final String F;
    public static final int G;
    public static final int H;
    public static final TimeZone I;
    public static final boolean J;
    public static final String K;
    public static final int L;
    public static final int M;
    public static final int N;
    public static final int O;
    public static final boolean P;
    public static final int Q;
    public static final LinkedList R;
    public static final int S;
    public static final int T;
    public static final int U;
    public static final String V;
    public static final String W;
    public static final k0 X;
    public static final InetAddress u;
    public static final int v;
    public static final int w;
    public static final int x;
    public static final int y;
    public static final boolean z;

    static {
        boolean bl;
        boolean bl2;
        boolean bl3;
        boolean bl4;
        boolean bl5;
        u = a.e();
        v = a.d("jcifs.smb.client.lport", 0);
        w = a.d("jcifs.smb.client.maxMpxCount", 10);
        x = a.d("jcifs.smb.client.snd_buf_size", 16644);
        y = a.d("jcifs.smb.client.rcv_buf_size", 60416);
        z = bl5 = a.a("jcifs.smb.client.useUnicode", true);
        A = a.a("jcifs.smb.client.useUnicode", false);
        B = bl4 = a.a("jcifs.smb.client.useNtStatus", true);
        C = bl3 = a.a("jcifs.smb.client.signingPreferred", false);
        D = bl2 = a.a("jcifs.smb.client.useNTSmbs", true);
        E = bl = a.a("jcifs.smb.client.useExtendedSecurity", true);
        F = a.h("jcifs.netbios.hostname", null);
        G = a.d("jcifs.smb.lmCompatibility", 3);
        H = (int)(Math.random() * 65536.0);
        I = TimeZone.getDefault();
        J = a.a("jcifs.smb.client.useBatching", true);
        K = a.h("jcifs.encoding", a.c);
        int n8 = bl ? 2048 : 0;
        int n9 = 4;
        int n10 = bl3 ? 4 : 0;
        int n11 = bl4 ? 16384 : 0;
        int n12 = bl5 ? 32768 : 0;
        L = n12 = n8 | 3 | n10 | n11 | n12;
        n8 = bl2 ? 16 : 0;
        n10 = bl4 ? 64 : 0;
        n11 = bl5 ? n9 : 0;
        M = n8 = n10 | n8 | n11 | 0x1000;
        N = a.d("jcifs.smb.client.flags2", n12);
        O = a.d("jcifs.smb.client.capabilities", n8);
        P = a.a("jcifs.smb.client.tcpNoDelay", false);
        Q = a.d("jcifs.smb.client.responseTimeout", 30000);
        R = new LinkedList();
        S = a.d("jcifs.smb.client.ssnLimit", 250);
        T = a.d("jcifs.smb.client.soTimeout", 35000);
        U = a.d("jcifs.smb.client.connTimeout", 35000);
        V = a.h("jcifs.smb.client.nativeOs", System.getProperty("os.name"));
        W = a.h("jcifs.smb.client.nativeLanMan", "jCIFS");
        X = new k0(null, 0, null, 0);
    }
}

