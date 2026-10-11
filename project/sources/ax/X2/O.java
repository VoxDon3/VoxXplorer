package ax.X2;

import java.io.File;

/* loaded from: classes.dex */
public class O {
    int a;
    int b;
    String c;
    String d;
    File e;
    String f;
    int g;
    String h;

    public static int a(int i) {
        if (i == 0) {
            return 1;
        }
        int i2 = 5;
        if (i != 5) {
            i2 = 2;
            if (i != 2) {
                i2 = 3;
                if (i != 3) {
                    return 10;
                }
            }
        }
        return i2;
    }

    public static int b(String str) {
        if ("mounted".equals(str)) {
            return 2;
        }
        if ("mounted_ro".equals(str)) {
            return 3;
        }
        if ("unmounted".equals(str)) {
            return 1;
        }
        if ("ejecting".equals(str)) {
            return 5;
        }
        return "removed".equals(str) ? 1 : 10;
    }

    public int c() {
        return a(this.g);
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
        return (this.b & 32) != 0;
    }

    public boolean l() {
        return (this.b & 8) != 0;
    }

    public String toString() {
        return "SystemVolumeInfo{type=" + this.a + ", diskFlags=" + this.b + ", fsUuid='" + this.c + "', volumeId='" + this.d + "', path=" + this.e + ", description='" + this.f + "', state=" + this.g + '}';
    }
}
