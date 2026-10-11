/*
 * Decompiled with CFR 0.152.
 */
package ax.X2;

import java.io.File;

public class O {
    int a;
    int b;
    String c;
    String d;
    File e;
    String f;
    int g;
    String h;

    public static int a(int n8) {
        if (n8 != 0) {
            int n9 = 5;
            if (n8 != 5) {
                n9 = 2;
                if (n8 != 2) {
                    n9 = 3;
                    if (n8 != 3) {
                        return 10;
                    }
                }
            }
            return n9;
        }
        return 1;
    }

    public static int b(String string) {
        if ("mounted".equals(string)) {
            return 2;
        }
        if ("mounted_ro".equals(string)) {
            return 3;
        }
        if ("unmounted".equals(string)) {
            return 1;
        }
        if ("ejecting".equals(string)) {
            return 5;
        }
        if ("removed".equals(string)) {
            return 1;
        }
        return 10;
    }

    public int c() {
        return O.a(this.g);
    }

    public String d() {
        return this.h;
    }

    public int e() {
        return this.b;
    }

    public String f() {
        return this.c;
    }

    public String g() {
        File file = this.e;
        if (file == null) {
            return null;
        }
        return file.getAbsolutePath();
    }

    public String h() {
        return this.d;
    }

    public boolean i() {
        return this.a == 1;
    }

    public boolean j() {
        return (this.b & 4) != 0;
    }

    public boolean k() {
        return (this.b & 0x20) != 0;
    }

    public boolean l() {
        return (this.b & 8) != 0;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SystemVolumeInfo{type=");
        stringBuilder.append(this.a);
        stringBuilder.append(", diskFlags=");
        stringBuilder.append(this.b);
        stringBuilder.append(", fsUuid='");
        stringBuilder.append(this.c);
        stringBuilder.append('\'');
        stringBuilder.append(", volumeId='");
        stringBuilder.append(this.d);
        stringBuilder.append('\'');
        stringBuilder.append(", path=");
        stringBuilder.append(this.e);
        stringBuilder.append(", description='");
        stringBuilder.append(this.f);
        stringBuilder.append('\'');
        stringBuilder.append(", state=");
        stringBuilder.append(this.g);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}

