/*
 * Decompiled with CFR 0.152.
 */
package ax.c3;

import com.jcraft.jsch.HostKey;
import com.jcraft.jsch.HostKeyRepository;
import com.jcraft.jsch.JSchException;
import com.jcraft.jsch.UserInfo;
import java.util.Arrays;

public class j0
implements HostKeyRepository {
    HostKey a;
    byte[] b;

    public j0(String stringArray) throws JSchException {
        stringArray = stringArray.split("\\|");
        this.b = HostKey.a(stringArray[3]);
        this.a = new HostKey(stringArray[0], stringArray[1], HostKey.i(stringArray[2]), this.b, stringArray[4]);
    }

    public static String f(HostKey hostKey) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(hostKey.e());
        stringBuilder.append("|");
        stringBuilder.append(hostKey.c());
        stringBuilder.append("|");
        stringBuilder.append(hostKey.f());
        stringBuilder.append("|");
        stringBuilder.append(hostKey.d());
        stringBuilder.append("|");
        stringBuilder.append(hostKey.b());
        stringBuilder.append("|");
        return stringBuilder.toString();
    }

    @Override
    public String a() {
        return "single_host_key";
    }

    @Override
    public void b(HostKey hostKey, UserInfo userInfo) {
    }

    @Override
    public int c(String string, byte[] byArray) {
        if (string != null && !string.equals(this.a.c())) {
            return 1;
        }
        if (Arrays.equals(byArray, this.b)) {
            return 0;
        }
        return 2;
    }

    @Override
    public void d(String string, String string2, byte[] byArray) {
    }

    @Override
    public HostKey[] e(String string, String string2) {
        if (string != null && (!this.a.equals(string) || string2 != null && !this.a.d().equals(string2))) {
            return new HostKey[0];
        }
        return new HostKey[]{this.a};
    }
}

