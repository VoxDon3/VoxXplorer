/*
 * Decompiled with CFR 0.152.
 */
package ax.Sc;

import java.io.Serializable;
import java.util.Calendar;

public class i
implements Serializable {
    private int c0;
    private long d0 = -1L;
    private String e0;
    private String f0 = "";
    private String g0 = "";
    private String h0;
    private String i0;
    private Calendar j0;
    private final boolean[][] k0;
    private int q = 3;

    public i() {
        this.k0 = new boolean[3][3];
    }

    i(String string) {
        this.k0 = null;
        this.e0 = string;
    }

    public String a() {
        return this.i0;
    }

    public String b() {
        return this.h0;
    }

    public String c() {
        return this.e0;
    }

    public long d() {
        return this.d0;
    }

    public Calendar e() {
        return this.j0;
    }

    public boolean f(int n8, int n9) {
        boolean[][] blArray = this.k0;
        if (blArray == null) {
            return false;
        }
        return blArray[n8][n9];
    }

    public boolean g() {
        return this.q == 1;
    }

    public boolean h() {
        return this.q == 2;
    }

    public void i(String string) {
        this.g0 = string;
    }

    public void j(int n8) {
        this.c0 = n8;
    }

    public void k(String string) {
        this.i0 = string;
    }

    public void l(String string) {
        this.h0 = string;
    }

    public void m(int n8, int n9, boolean bl) {
        this.k0[n8][n9] = bl;
    }

    public void n(String string) {
        this.e0 = string;
    }

    public void o(long l8) {
        this.d0 = l8;
    }

    public void p(Calendar calendar) {
        this.j0 = calendar;
    }

    public void q(int n8) {
        this.q = n8;
    }

    public void r(String string) {
        this.f0 = string;
    }

    public String toString() {
        return this.c();
    }
}

