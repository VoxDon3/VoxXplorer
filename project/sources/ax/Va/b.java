package ax.Va;

import ax.s8.InterfaceC3061c;
import java.util.Map;

/* loaded from: classes3.dex */
public class b {

    @InterfaceC3061c("trash_size")
    long a;

    @InterfaceC3061c("total_space")
    long b;

    @InterfaceC3061c("used_space")
    long c;

    @InterfaceC3061c("system_folders")
    Map<String, String> d;

    @InterfaceC3061c("user")
    a e;

    public static class a {

        @InterfaceC3061c("login")
        String a;

        @InterfaceC3061c("display_name")
        String b;

        @InterfaceC3061c("uid")
        String c;

        public String a() {
            return this.b;
        }

        public String b() {
            return this.a;
        }
    }

    public long a() {
        return this.b;
    }

    public long b() {
        return this.c;
    }

    public a c() {
        return this.e;
    }

    public String toString() {
        return "DiskCapacity{trashSize=" + this.a + ", totalSpace=" + this.b + ", usedSpace=" + this.c + ", systemFolders=" + this.d + '}';
    }
}
