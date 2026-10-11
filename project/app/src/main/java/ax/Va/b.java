/*
 * Decompiled with CFR 0.152.
 */
package ax.Va;

import ax.s8.c;
import java.util.Map;

public class b {
    @c(value="trash_size")
    long a;
    @c(value="total_space")
    long b;
    @c(value="used_space")
    long c;
    @c(value="system_folders")
    Map<String, String> d;
    @c(value="user")
    a e;

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
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("DiskCapacity{trashSize=");
        stringBuilder.append(this.a);
        stringBuilder.append(", totalSpace=");
        stringBuilder.append(this.b);
        stringBuilder.append(", usedSpace=");
        stringBuilder.append(this.c);
        stringBuilder.append(", systemFolders=");
        stringBuilder.append(this.d);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }

    public static class a {
        @c(value="login")
        String a;
        @c(value="display_name")
        String b;
        @c(value="uid")
        String c;

        public String a() {
            return this.b;
        }

        public String b() {
            return this.a;
        }
    }
}

