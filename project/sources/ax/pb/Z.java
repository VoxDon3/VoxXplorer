package ax.pb;

import ax.jb.C2345a;
import java.net.InetAddress;
import java.util.LinkedList;
import java.util.TimeZone;
import okhttp3.internal.http2.Http2;

/* loaded from: classes3.dex */
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
    public static final InetAddress u = C2345a.e();
    public static final int v = C2345a.d("jcifs.smb.client.lport", 0);
    public static final int w = C2345a.d("jcifs.smb.client.maxMpxCount", 10);
    public static final int x = C2345a.d("jcifs.smb.client.snd_buf_size", 16644);
    public static final int y = C2345a.d("jcifs.smb.client.rcv_buf_size", 60416);
    public static final boolean z;

    static {
        boolean a = C2345a.a("jcifs.smb.client.useUnicode", true);
        z = a;
        A = C2345a.a("jcifs.smb.client.useUnicode", false);
        boolean a2 = C2345a.a("jcifs.smb.client.useNtStatus", true);
        B = a2;
        boolean a3 = C2345a.a("jcifs.smb.client.signingPreferred", false);
        C = a3;
        boolean a4 = C2345a.a("jcifs.smb.client.useNTSmbs", true);
        D = a4;
        boolean a5 = C2345a.a("jcifs.smb.client.useExtendedSecurity", true);
        E = a5;
        F = C2345a.h("jcifs.netbios.hostname", null);
        G = C2345a.d("jcifs.smb.lmCompatibility", 3);
        H = (int) (Math.random() * 65536.0d);
        I = TimeZone.getDefault();
        J = C2345a.a("jcifs.smb.client.useBatching", true);
        K = C2345a.h("jcifs.encoding", C2345a.c);
        int i = (a5 ? 2048 : 0) | 3 | (a3 ? 4 : 0) | (a2 ? Http2.INITIAL_MAX_FRAME_SIZE : 0) | (a ? 32768 : 0);
        L = i;
        int i2 = (a2 ? 64 : 0) | (a4 ? 16 : 0) | (a ? 4 : 0) | 4096;
        M = i2;
        N = C2345a.d("jcifs.smb.client.flags2", i);
        O = C2345a.d("jcifs.smb.client.capabilities", i2);
        P = C2345a.a("jcifs.smb.client.tcpNoDelay", false);
        Q = C2345a.d("jcifs.smb.client.responseTimeout", 30000);
        R = new LinkedList();
        S = C2345a.d("jcifs.smb.client.ssnLimit", 250);
        T = C2345a.d("jcifs.smb.client.soTimeout", 35000);
        U = C2345a.d("jcifs.smb.client.connTimeout", 35000);
        V = C2345a.h("jcifs.smb.client.nativeOs", System.getProperty("os.name"));
        W = C2345a.h("jcifs.smb.client.nativeLanMan", "jCIFS");
        X = new k0(null, 0, null, 0);
    }
}
