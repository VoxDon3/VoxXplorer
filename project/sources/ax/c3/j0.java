package ax.c3;

import com.jcraft.jsch.HostKey;
import com.jcraft.jsch.HostKeyRepository;
import com.jcraft.jsch.JSchException;
import com.jcraft.jsch.UserInfo;
import java.util.Arrays;

/* loaded from: classes.dex */
public class j0 implements HostKeyRepository {
    HostKey a;
    byte[] b;

    public j0(String str) throws JSchException {
        String[] split = str.split("\\|");
        this.b = HostKey.a(split[3]);
        this.a = new HostKey(split[0], split[1], HostKey.i(split[2]), this.b, split[4]);
    }

    public static String f(HostKey hostKey) {
        return hostKey.e() + "|" + hostKey.c() + "|" + hostKey.f() + "|" + hostKey.d() + "|" + hostKey.b() + "|";
    }

    @Override // com.jcraft.jsch.HostKeyRepository
    public String a() {
        return "single_host_key";
    }

    @Override // com.jcraft.jsch.HostKeyRepository
    public int c(String str, byte[] bArr) {
        if (str == null || str.equals(this.a.c())) {
            return Arrays.equals(bArr, this.b) ? 0 : 2;
        }
        return 1;
    }

    @Override // com.jcraft.jsch.HostKeyRepository
    public HostKey[] e(String str, String str2) {
        return (str == null || (this.a.equals(str) && (str2 == null || this.a.d().equals(str2)))) ? new HostKey[]{this.a} : new HostKey[0];
    }

    @Override // com.jcraft.jsch.HostKeyRepository
    public void b(HostKey hostKey, UserInfo userInfo) {
    }

    @Override // com.jcraft.jsch.HostKeyRepository
    public void d(String str, String str2, byte[] bArr) {
    }
}
