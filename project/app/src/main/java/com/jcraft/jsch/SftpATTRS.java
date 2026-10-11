/*
 * Decompiled with CFR 0.152.
 */
package com.jcraft.jsch;

import com.jcraft.jsch.Buffer;
import com.jcraft.jsch.Util;
import java.util.Date;

public class SftpATTRS {
    int a = 0;
    long b;
    int c;
    int d;
    int e;
    int f;
    int g;
    String[] h = null;

    private SftpATTRS() {
    }

    static SftpATTRS b(Buffer buffer) {
        int n8;
        int n9;
        SftpATTRS sftpATTRS = new SftpATTRS();
        sftpATTRS.a = n9 = buffer.i();
        if ((n9 & 1) != 0) {
            sftpATTRS.b = buffer.k();
        }
        if ((sftpATTRS.a & 2) != 0) {
            sftpATTRS.c = buffer.i();
            sftpATTRS.d = buffer.i();
        }
        if ((sftpATTRS.a & 4) != 0) {
            sftpATTRS.e = buffer.i();
        }
        if ((sftpATTRS.a & 8) != 0) {
            sftpATTRS.f = buffer.i();
        }
        if ((sftpATTRS.a & 8) != 0) {
            sftpATTRS.g = buffer.i();
        }
        if ((sftpATTRS.a & Integer.MIN_VALUE) != 0 && (n8 = buffer.i()) > 0) {
            sftpATTRS.h = new String[n8 * 2];
            for (n9 = 0; n9 < n8; ++n9) {
                String[] stringArray = sftpATTRS.h;
                int n10 = n9 * 2;
                stringArray[n10] = Util.c(buffer.p());
                sftpATTRS.h[n10 + 1] = Util.c(buffer.p());
            }
        }
        return sftpATTRS;
    }

    private boolean m(int n8) {
        return (this.a & 4) != 0 && (this.e & 0xF000) == n8;
    }

    void a(Buffer buffer) {
        int n8;
        buffer.v(this.a);
        if ((this.a & 1) != 0) {
            buffer.w(this.b);
        }
        if ((this.a & 2) != 0) {
            buffer.v(this.c);
            buffer.v(this.d);
        }
        if ((this.a & 4) != 0) {
            buffer.v(this.e);
        }
        if ((this.a & 8) != 0) {
            buffer.v(this.f);
        }
        if ((this.a & 8) != 0) {
            buffer.v(this.g);
        }
        if ((this.a & Integer.MIN_VALUE) != 0 && (n8 = this.h.length / 2) > 0) {
            for (int i8 = 0; i8 < n8; ++i8) {
                String[] stringArray = this.h;
                int n9 = i8 * 2;
                buffer.y(Util.v(stringArray[n9]));
                buffer.y(Util.v(this.h[n9 + 1]));
            }
        }
    }

    public int c() {
        return this.f;
    }

    public int d() {
        return this.d;
    }

    public int e() {
        return this.g;
    }

    public String f() {
        return new Date((long)this.g * 1000L).toString();
    }

    public int g() {
        return this.e;
    }

    public String h() {
        StringBuilder stringBuilder = new StringBuilder(10);
        if (this.k()) {
            stringBuilder.append('d');
        } else if (this.l()) {
            stringBuilder.append('l');
        } else {
            stringBuilder.append('-');
        }
        if ((this.e & 0x100) != 0) {
            stringBuilder.append('r');
        } else {
            stringBuilder.append('-');
        }
        if ((this.e & 0x80) != 0) {
            stringBuilder.append('w');
        } else {
            stringBuilder.append('-');
        }
        int n8 = this.e;
        if ((n8 & 0x800) != 0) {
            stringBuilder.append('s');
        } else if ((n8 & 0x40) != 0) {
            stringBuilder.append('x');
        } else {
            stringBuilder.append('-');
        }
        if ((this.e & 0x20) != 0) {
            stringBuilder.append('r');
        } else {
            stringBuilder.append('-');
        }
        if ((this.e & 0x10) != 0) {
            stringBuilder.append('w');
        } else {
            stringBuilder.append('-');
        }
        n8 = this.e;
        if ((n8 & 0x400) != 0) {
            stringBuilder.append('s');
        } else if ((n8 & 8) != 0) {
            stringBuilder.append('x');
        } else {
            stringBuilder.append('-');
        }
        if ((this.e & 4) != 0) {
            stringBuilder.append('r');
        } else {
            stringBuilder.append('-');
        }
        if ((this.e & 2) != 0) {
            stringBuilder.append('w');
        } else {
            stringBuilder.append('-');
        }
        if ((this.e & 1) != 0) {
            stringBuilder.append('x');
        } else {
            stringBuilder.append('-');
        }
        return stringBuilder.toString();
    }

    public long i() {
        return this.b;
    }

    public int j() {
        return this.c;
    }

    public boolean k() {
        return this.m(16384);
    }

    public boolean l() {
        return this.m(40960);
    }

    int n() {
        int n8 = this.a;
        int n9 = (n8 & 1) != 0 ? 12 : 4;
        int n10 = n9;
        if ((n8 & 2) != 0) {
            n10 = n9 + 8;
        }
        int n11 = n10;
        if ((n8 & 4) != 0) {
            n11 = n10 + 4;
        }
        n9 = n11;
        if ((n8 & 8) != 0) {
            n9 = n11 + 8;
        }
        n10 = n9;
        if ((n8 & Integer.MIN_VALUE) != 0) {
            n8 = this.h.length / 2;
            n10 = n9 += 4;
            if (n8 > 0) {
                n11 = 0;
                while (true) {
                    n10 = n9;
                    if (n11 >= n8) break;
                    String[] stringArray = this.h;
                    n10 = n11 * 2;
                    n9 = n9 + 4 + stringArray[n10].length() + 4 + this.h[n10 + 1].length();
                    ++n11;
                }
            }
        }
        return n10;
    }

    public void o(int n8, int n9) {
        this.a |= 8;
        this.f = n8;
        this.g = n9;
    }

    void p(int n8) {
        this.a = n8;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.h());
        stringBuilder.append(" ");
        stringBuilder.append(this.j());
        stringBuilder.append(" ");
        stringBuilder.append(this.d());
        stringBuilder.append(" ");
        stringBuilder.append(this.i());
        stringBuilder.append(" ");
        stringBuilder.append(this.f());
        return stringBuilder.toString();
    }
}

