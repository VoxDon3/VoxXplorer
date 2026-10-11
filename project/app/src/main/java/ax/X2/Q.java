/*
 * Decompiled with CFR 0.152.
 */
package ax.X2;

import android.os.Build;
import android.widget.RadioButton;
import ax.Q2.b;
import ax.X2.J;

public class Q {
    public static boolean A() {
        return Build.VERSION.SDK_INT >= 26;
    }

    public static boolean A0() {
        return true;
    }

    public static boolean A1() {
        return Build.VERSION.SDK_INT >= 23;
    }

    public static boolean B() {
        return Q.e();
    }

    public static boolean B0() {
        return true;
    }

    public static boolean B1() {
        if (Build.VERSION.SDK_INT < 24) {
            return false;
        }
        return J.q();
    }

    public static boolean C() {
        return Build.VERSION.SDK_INT == 26;
    }

    public static boolean C0() {
        return Build.VERSION.SDK_INT >= 33;
    }

    public static boolean C1() {
        int n8 = Build.VERSION.SDK_INT;
        if (n8 >= 30) {
            return false;
        }
        return n8 < 31;
    }

    public static boolean D() {
        return Build.VERSION.SDK_INT == 28;
    }

    public static boolean D0() {
        return true;
    }

    public static boolean D1() {
        return true;
    }

    public static boolean E() {
        return Build.VERSION.SDK_INT == 29;
    }

    public static boolean E0() {
        return Build.VERSION.SDK_INT >= 30;
    }

    public static boolean E1() {
        return Build.VERSION.SDK_INT >= 28;
    }

    public static boolean F() {
        return Build.VERSION.SDK_INT >= 30;
    }

    public static boolean F0() {
        return Build.VERSION.SDK_INT >= 24;
    }

    public static boolean F1() {
        return Build.VERSION.SDK_INT >= 30;
    }

    public static boolean G() {
        return Build.VERSION.SDK_INT == 30;
    }

    public static boolean G0() {
        return Build.VERSION.SDK_INT >= 23;
    }

    public static boolean G1() {
        return Build.VERSION.SDK_INT >= 24;
    }

    public static boolean H() {
        return true;
    }

    public static boolean H0() {
        return true;
    }

    public static boolean H1() {
        return true;
    }

    public static boolean I() {
        return false;
    }

    public static boolean I0() {
        return Build.VERSION.SDK_INT >= 24;
    }

    public static boolean I1() {
        return Build.VERSION.SDK_INT >= 23;
    }

    public static boolean J() {
        return Build.VERSION.SDK_INT >= 34;
    }

    public static boolean J0() {
        return Build.VERSION.SDK_INT >= 26;
    }

    public static boolean J1() {
        return Build.VERSION.SDK_INT >= 26;
    }

    public static boolean K() {
        return Build.VERSION.SDK_INT == 28;
    }

    public static boolean K0() {
        return Q.S1();
    }

    public static boolean K1() {
        return Build.VERSION.SDK_INT >= 23;
    }

    public static boolean L() {
        return Build.VERSION.SDK_INT >= 30;
    }

    public static boolean L0() {
        return Build.VERSION.SDK_INT >= 29;
    }

    public static boolean L1() {
        int n8 = Build.VERSION.SDK_INT;
        return n8 >= 24 && n8 <= 28;
    }

    public static boolean M() {
        return Build.VERSION.SDK_INT >= 29;
    }

    public static boolean M0() {
        return Build.VERSION.SDK_INT >= 24;
    }

    public static boolean M1() {
        return Build.VERSION.SDK_INT >= 27;
    }

    public static boolean N() {
        return Build.VERSION.SDK_INT >= 24;
    }

    public static boolean N0() {
        return true;
    }

    public static boolean N1() {
        return true;
    }

    public static boolean O() {
        return false;
    }

    public static boolean O0() {
        return Build.VERSION.SDK_INT >= 34;
    }

    public static boolean O1() {
        return Build.VERSION.SDK_INT >= 28;
    }

    public static boolean P() {
        return false;
    }

    public static boolean P0() {
        return Build.VERSION.SDK_INT >= 26;
    }

    public static boolean P1() {
        return true;
    }

    public static boolean Q() {
        return Build.VERSION.SDK_INT >= 28;
    }

    public static boolean Q0() {
        return Build.VERSION.SDK_INT >= 28;
    }

    public static boolean Q1() {
        return true;
    }

    public static boolean R() {
        return Build.VERSION.SDK_INT >= 23;
    }

    public static boolean R0() {
        return Build.VERSION.SDK_INT >= 29;
    }

    public static boolean R1() {
        return Build.VERSION.SDK_INT >= 23;
    }

    public static boolean S() {
        return Build.VERSION.SDK_INT >= 30;
    }

    public static boolean S0() {
        return Build.VERSION.SDK_INT >= 26;
    }

    public static boolean S1() {
        return Build.VERSION.SDK_INT >= 24;
    }

    public static boolean T() {
        int n8 = Build.VERSION.SDK_INT;
        if (n8 == 30) {
            return J.y(b.h().g());
        }
        return n8 >= 31;
    }

    public static boolean T0() {
        return Build.VERSION.SDK_INT >= 35;
    }

    public static boolean T1() {
        return Build.VERSION.SDK_INT >= 31;
    }

    public static boolean U() {
        return false;
    }

    public static boolean U0() {
        return true;
    }

    public static boolean U1() {
        return Build.VERSION.SDK_INT >= 30;
    }

    public static boolean V() {
        int n8 = Build.VERSION.SDK_INT;
        if (n8 == 30) {
            return J.y(b.h().g());
        }
        return n8 >= 31;
    }

    public static boolean V0() {
        return Build.VERSION.SDK_INT >= 31;
    }

    public static boolean V1() {
        return true;
    }

    public static boolean W() {
        return Build.VERSION.SDK_INT >= 29;
    }

    public static boolean W0() {
        return Build.VERSION.SDK_INT >= 28;
    }

    public static boolean W1() {
        return Build.VERSION.SDK_INT >= 35;
    }

    public static boolean X() {
        return Build.VERSION.SDK_INT >= 29;
    }

    public static boolean X0() {
        return Build.VERSION.SDK_INT >= 28;
    }

    public static boolean X1() {
        return Build.VERSION.SDK_INT >= 30;
    }

    public static boolean Y() {
        return false;
    }

    public static boolean Y0() {
        return Build.VERSION.SDK_INT >= 23;
    }

    public static boolean Y1() {
        return Build.VERSION.SDK_INT >= 29;
    }

    public static boolean Z() {
        return Build.VERSION.SDK_INT >= 35;
    }

    public static boolean Z0() {
        return Build.VERSION.SDK_INT >= 29;
    }

    public static boolean Z1() {
        return Build.VERSION.SDK_INT >= 29;
    }

    public static boolean a() {
        return Build.VERSION.SDK_INT >= 30;
    }

    public static boolean a0() {
        return Build.VERSION.SDK_INT >= 31;
    }

    public static boolean a1() {
        return Build.VERSION.SDK_INT >= 24;
    }

    public static boolean a2() {
        return Build.VERSION.SDK_INT >= 33;
    }

    public static boolean b() {
        return Build.VERSION.SDK_INT < 29;
    }

    public static boolean b0() {
        return Build.VERSION.SDK_INT >= 31;
    }

    public static boolean b1() {
        return Build.VERSION.SDK_INT >= 23;
    }

    public static boolean b2() {
        return Build.VERSION.SDK_INT >= 26;
    }

    public static boolean c() {
        return Build.VERSION.SDK_INT < 28 && !J.F();
    }

    public static boolean c0() {
        return Build.VERSION.SDK_INT >= 30;
    }

    public static boolean c1() {
        return true;
    }

    public static boolean c2() {
        return Build.VERSION.SDK_INT >= 29;
    }

    public static boolean d() {
        return Build.VERSION.SDK_INT < 27;
    }

    public static boolean d0() {
        return Build.VERSION.SDK_INT < 29;
    }

    public static boolean d1() {
        return true;
    }

    public static boolean e() {
        return Build.VERSION.SDK_INT >= 26;
    }

    public static boolean e0() {
        return Build.VERSION.SDK_INT >= 33;
    }

    public static boolean e1() {
        return Build.VERSION.SDK_INT >= 23;
    }

    public static boolean f() {
        return Build.VERSION.SDK_INT < 35;
    }

    public static boolean f0() {
        return Build.VERSION.SDK_INT >= 33;
    }

    public static boolean f1() {
        return true;
    }

    public static boolean g() {
        return Build.VERSION.SDK_INT >= 33;
    }

    public static boolean g0() {
        return Build.VERSION.SDK_INT <= 25;
    }

    public static boolean g1() {
        return true;
    }

    public static boolean h() {
        return Build.VERSION.SDK_INT >= 31;
    }

    public static boolean h0() {
        return Build.VERSION.SDK_INT >= 30;
    }

    public static boolean h1() {
        return Build.VERSION.SDK_INT >= 30;
    }

    public static boolean i() {
        return true;
    }

    public static boolean i0() {
        return Build.VERSION.SDK_INT >= 34;
    }

    public static boolean i1() {
        return Build.VERSION.SDK_INT >= 26;
    }

    public static boolean j() {
        return Build.VERSION.SDK_INT >= 34;
    }

    public static boolean j0() {
        return Build.VERSION.SDK_INT >= 35;
    }

    public static boolean j1() {
        return Build.VERSION.SDK_INT >= 24;
    }

    public static void k(int n8, int n9) {
    }

    public static boolean k0() {
        return Build.VERSION.SDK_INT >= 29;
    }

    public static boolean k1() {
        return Build.VERSION.SDK_INT >= 26;
    }

    public static void l(int n8) {
    }

    public static boolean l0() {
        return Build.VERSION.SDK_INT < 26;
    }

    public static boolean l1() {
        return true;
    }

    public static boolean m() {
        return Build.VERSION.SDK_INT >= 31;
    }

    public static boolean m0() {
        return Build.VERSION.SDK_INT >= 33;
    }

    public static boolean m1() {
        return Build.VERSION.SDK_INT >= 24;
    }

    public static boolean n() {
        return Build.VERSION.SDK_INT >= 30;
    }

    public static boolean n0() {
        return Build.VERSION.SDK_INT >= 30;
    }

    public static boolean n1() {
        return Build.VERSION.SDK_INT >= 31;
    }

    public static void o(RadioButton radioButton) {
    }

    public static boolean o0() {
        return Build.VERSION.SDK_INT >= 24;
    }

    public static boolean o1() {
        return true;
    }

    public static boolean p() {
        return Build.VERSION.SDK_INT >= 30;
    }

    public static boolean p0() {
        return Build.VERSION.SDK_INT > 29;
    }

    public static boolean p1() {
        return Build.VERSION.SDK_INT >= 34;
    }

    public static boolean q() {
        return Q.e();
    }

    public static boolean q0() {
        return Build.VERSION.SDK_INT >= 28;
    }

    public static boolean q1() {
        return true;
    }

    public static boolean r() {
        if (!J.q()) {
            return false;
        }
        return Build.VERSION.SDK_INT == 28 && J.c() < 81;
    }

    public static boolean r0() {
        return Build.VERSION.SDK_INT >= 23;
    }

    public static boolean r1() {
        return Build.VERSION.SDK_INT >= 26;
    }

    public static boolean s() {
        return Build.VERSION.SDK_INT >= 28;
    }

    public static boolean s0() {
        return true;
    }

    public static boolean s1() {
        return Build.VERSION.SDK_INT >= 26;
    }

    public static boolean t() {
        int n8 = Build.VERSION.SDK_INT;
        return n8 >= 26 && n8 < 29;
    }

    public static boolean t0() {
        return true;
    }

    public static boolean t1() {
        return Build.VERSION.SDK_INT >= 26;
    }

    public static boolean u() {
        return Build.VERSION.SDK_INT == 31;
    }

    public static boolean u0() {
        return true;
    }

    public static boolean u1() {
        return Build.VERSION.SDK_INT >= 23;
    }

    public static boolean v() {
        return Build.VERSION.SDK_INT == 29 && J.t();
    }

    public static boolean v0() {
        return true;
    }

    public static boolean v1() {
        return Build.VERSION.SDK_INT >= 24;
    }

    public static boolean w() {
        return Build.VERSION.SDK_INT == 30;
    }

    public static boolean w0() {
        return Build.VERSION.SDK_INT >= 30;
    }

    public static boolean w1() {
        return Build.VERSION.SDK_INT < 30;
    }

    public static boolean x() {
        int n8 = Build.VERSION.SDK_INT;
        return n8 >= 26 && n8 <= 28;
    }

    public static boolean x0() {
        return Build.VERSION.SDK_INT >= 31;
    }

    public static boolean x1() {
        return Build.VERSION.SDK_INT >= 23;
    }

    public static boolean y() {
        return false;
    }

    public static boolean y0() {
        return Build.VERSION.SDK_INT >= 23;
    }

    public static boolean y1() {
        return Build.VERSION.SDK_INT >= 22;
    }

    public static boolean z() {
        return Build.VERSION.SDK_INT >= 24;
    }

    public static boolean z0() {
        return Build.VERSION.SDK_INT >= 30;
    }

    public static boolean z1() {
        return Build.VERSION.SDK_INT >= 23;
    }
}

