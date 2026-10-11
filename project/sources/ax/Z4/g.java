package ax.Z4;

import ax.T4.j;
import ax.T4.m;
import ax.T4.n;
import ax.b5.l;
import java.io.IOException;
import java.io.Reader;

/* loaded from: classes.dex */
public class g extends ax.U4.b {
    private static final int d1 = j.a.ALLOW_TRAILING_COMMA.l();
    private static final int e1 = j.a.ALLOW_NUMERIC_LEADING_ZEROS.l();
    private static final int f1 = j.a.ALLOW_NON_NUMERIC_NUMBERS.l();
    private static final int g1 = j.a.ALLOW_MISSING_VALUES.l();
    private static final int h1 = j.a.ALLOW_SINGLE_QUOTES.l();
    private static final int i1 = j.a.ALLOW_UNQUOTED_FIELD_NAMES.l();
    private static final int j1 = j.a.ALLOW_COMMENTS.l();
    private static final int k1 = j.a.ALLOW_YAML_COMMENTS.l();
    protected static final int[] l1 = ax.W4.c.h();
    protected Reader T0;
    protected char[] U0;
    protected boolean V0;
    protected n W0;
    protected final ax.a5.b X0;
    protected final int Y0;
    protected boolean Z0;
    protected long a1;
    protected int b1;
    protected int c1;

    public g(ax.W4.e eVar, int i, Reader reader, n nVar, ax.a5.b bVar, char[] cArr, int i2, int i3, boolean z) {
        super(eVar, i);
        this.T0 = reader;
        this.W0 = nVar;
        this.U0 = cArr;
        this.r0 = i2;
        this.s0 = i3;
        this.v0 = i2;
        this.t0 = -i2;
        this.X0 = bVar;
        this.Y0 = bVar.m();
        this.V0 = z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0026, code lost:
    
        M0(" in a comment", null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x002c, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A2() throws java.io.IOException {
        /*
            r3 = this;
        L0:
            int r0 = r3.r0
            int r1 = r3.s0
            if (r0 < r1) goto Lc
            boolean r0 = r3.h2()
            if (r0 == 0) goto L26
        Lc:
            char[] r0 = r3.U0
            int r1 = r3.r0
            int r2 = r1 + 1
            r3.r0 = r2
            char r0 = r0[r1]
            r1 = 42
            if (r0 > r1) goto L0
            if (r0 != r1) goto L3c
            int r0 = r3.s0
            if (r2 < r0) goto L2d
            boolean r0 = r3.h2()
            if (r0 != 0) goto L2d
        L26:
            java.lang.String r0 = " in a comment"
            r1 = 0
            r3.M0(r0, r1)
            return
        L2d:
            char[] r0 = r3.U0
            int r1 = r3.r0
            char r0 = r0[r1]
            r2 = 47
            if (r0 != r2) goto L0
            int r1 = r1 + 1
            r3.r0 = r1
            return
        L3c:
            r1 = 32
            if (r0 >= r1) goto L0
            r1 = 10
            if (r0 != r1) goto L4d
            int r0 = r3.u0
            int r0 = r0 + 1
            r3.u0 = r0
            r3.v0 = r2
            goto L0
        L4d:
            r1 = 13
            if (r0 != r1) goto L55
            r3.B2()
            goto L0
        L55:
            r1 = 9
            if (r0 == r1) goto L0
            r3.c1(r0)
            goto L0
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.Z4.g.A2():void");
    }

    private final int C2() throws IOException {
        int i = this.r0;
        if (i + 4 >= this.s0) {
            return D2(false);
        }
        char[] cArr = this.U0;
        char c = cArr[i];
        if (c == ':') {
            int i2 = i + 1;
            this.r0 = i2;
            char c2 = cArr[i2];
            if (c2 > ' ') {
                if (c2 == '/' || c2 == '#') {
                    return D2(true);
                }
                this.r0 = i + 2;
                return c2;
            }
            if (c2 == ' ' || c2 == '\t') {
                int i3 = i + 2;
                this.r0 = i3;
                char c3 = cArr[i3];
                if (c3 > ' ') {
                    if (c3 == '/' || c3 == '#') {
                        return D2(true);
                    }
                    this.r0 = i + 3;
                    return c3;
                }
            }
            return D2(true);
        }
        if (c == ' ' || c == '\t') {
            int i4 = i + 1;
            this.r0 = i4;
            c = cArr[i4];
        }
        if (c != ':') {
            return D2(false);
        }
        int i5 = this.r0;
        int i6 = i5 + 1;
        this.r0 = i6;
        char c4 = cArr[i6];
        if (c4 > ' ') {
            if (c4 == '/' || c4 == '#') {
                return D2(true);
            }
            this.r0 = i5 + 2;
            return c4;
        }
        if (c4 == ' ' || c4 == '\t') {
            int i7 = i5 + 2;
            this.r0 = i7;
            char c5 = cArr[i7];
            if (c5 > ' ') {
                if (c5 == '/' || c5 == '#') {
                    return D2(true);
                }
                this.r0 = i5 + 3;
                return c5;
            }
        }
        return D2(true);
    }

    private final int D2(boolean z) throws IOException {
        while (true) {
            if (this.r0 >= this.s0 && !h2()) {
                M0(" within/between " + this.z0.h() + " entries", null);
                return -1;
            }
            char[] cArr = this.U0;
            int i = this.r0;
            int i2 = i + 1;
            this.r0 = i2;
            char c = cArr[i];
            if (c > ' ') {
                if (c == '/') {
                    F2();
                } else if (c != '#' || !K2()) {
                    if (z) {
                        return c;
                    }
                    if (c != ':') {
                        Z0(c, "was expecting a colon to separate field name and value");
                    }
                    z = true;
                }
            } else if (c < ' ') {
                if (c == '\n') {
                    this.u0++;
                    this.v0 = i2;
                } else if (c == '\r') {
                    B2();
                } else if (c != '\t') {
                    c1(c);
                }
            }
        }
    }

    private final int E2(int i) throws IOException {
        if (i != 44) {
            Z0(i, "was expecting comma to separate " + this.z0.h() + " entries");
        }
        while (true) {
            int i2 = this.r0;
            if (i2 >= this.s0) {
                return z2();
            }
            char[] cArr = this.U0;
            int i3 = i2 + 1;
            this.r0 = i3;
            char c = cArr[i2];
            if (c > ' ') {
                if (c != '/' && c != '#') {
                    return c;
                }
                this.r0 = i2;
                return z2();
            }
            if (c < ' ') {
                if (c == '\n') {
                    this.u0++;
                    this.v0 = i3;
                } else if (c == '\r') {
                    B2();
                } else if (c != '\t') {
                    c1(c);
                }
            }
        }
    }

    private void F2() throws IOException {
        if ((this.q & j1) == 0) {
            Z0(47, "maybe a (non-standard) comment? (not recognized as one since Feature 'ALLOW_COMMENTS' not enabled for parser)");
        }
        if (this.r0 >= this.s0 && !h2()) {
            M0(" in a comment", null);
        }
        char[] cArr = this.U0;
        int i = this.r0;
        this.r0 = i + 1;
        char c = cArr[i];
        if (c == '/') {
            G2();
        } else if (c == '*') {
            A2();
        } else {
            Z0(c, "was expecting either '*' or '/' for a comment");
        }
    }

    private void G2() throws IOException {
        while (true) {
            if (this.r0 >= this.s0 && !h2()) {
                return;
            }
            char[] cArr = this.U0;
            int i = this.r0;
            int i2 = i + 1;
            this.r0 = i2;
            char c = cArr[i];
            if (c < ' ') {
                if (c == '\n') {
                    this.u0++;
                    this.v0 = i2;
                    return;
                } else if (c == '\r') {
                    B2();
                    return;
                } else if (c != '\t') {
                    c1(c);
                }
            }
        }
    }

    private final int I2() throws IOException {
        if (this.r0 >= this.s0 && !h2()) {
            return q1();
        }
        char[] cArr = this.U0;
        int i = this.r0;
        int i2 = i + 1;
        this.r0 = i2;
        char c = cArr[i];
        if (c > ' ') {
            if (c != '/' && c != '#') {
                return c;
            }
            this.r0 = i;
            return J2();
        }
        if (c != ' ') {
            if (c == '\n') {
                this.u0++;
                this.v0 = i2;
            } else if (c == '\r') {
                B2();
            } else if (c != '\t') {
                c1(c);
            }
        }
        while (true) {
            int i3 = this.r0;
            if (i3 >= this.s0) {
                return J2();
            }
            char[] cArr2 = this.U0;
            int i4 = i3 + 1;
            this.r0 = i4;
            char c2 = cArr2[i3];
            if (c2 > ' ') {
                if (c2 != '/' && c2 != '#') {
                    return c2;
                }
                this.r0 = i3;
                return J2();
            }
            if (c2 != ' ') {
                if (c2 == '\n') {
                    this.u0++;
                    this.v0 = i4;
                } else if (c2 == '\r') {
                    B2();
                } else if (c2 != '\t') {
                    c1(c2);
                }
            }
        }
    }

    private int J2() throws IOException {
        char c;
        while (true) {
            if (this.r0 >= this.s0 && !h2()) {
                return q1();
            }
            char[] cArr = this.U0;
            int i = this.r0;
            int i2 = i + 1;
            this.r0 = i2;
            c = cArr[i];
            if (c > ' ') {
                if (c == '/') {
                    F2();
                } else if (c != '#' || !K2()) {
                    break;
                }
            } else if (c != ' ') {
                if (c == '\n') {
                    this.u0++;
                    this.v0 = i2;
                } else if (c == '\r') {
                    B2();
                } else if (c != '\t') {
                    c1(c);
                }
            }
        }
        return c;
    }

    private boolean K2() throws IOException {
        if ((this.q & k1) == 0) {
            return false;
        }
        G2();
        return true;
    }

    private final void L2() {
        int i = this.r0;
        this.w0 = this.t0 + i;
        this.x0 = this.u0;
        this.y0 = i - this.v0;
    }

    private final void M2() {
        int i = this.r0;
        this.a1 = i;
        this.b1 = this.u0;
        this.c1 = i - this.v0;
    }

    private char N2() throws IOException {
        char c;
        if ((this.r0 >= this.s0 && !h2()) || (c = this.U0[this.r0]) < '0' || c > '9') {
            return '0';
        }
        if ((this.q & e1) == 0) {
            e1("Leading zeroes not allowed");
        }
        this.r0++;
        if (c != '0') {
            return c;
        }
        do {
            if (this.r0 >= this.s0 && !h2()) {
                return c;
            }
            char[] cArr = this.U0;
            int i = this.r0;
            c = cArr[i];
            if (c < '0' || c > '9') {
                return '0';
            }
            this.r0 = i + 1;
        } while (c == '0');
        return c;
    }

    private final char O2() throws IOException {
        char c;
        int i = this.r0;
        if (i >= this.s0 || ((c = this.U0[i]) >= '0' && c <= '9')) {
            return N2();
        }
        return '0';
    }

    private final void P2(int i) throws IOException {
        int i2 = this.r0;
        int i3 = i2 + 1;
        this.r0 = i3;
        if (i != 9) {
            if (i == 10) {
                this.u0++;
                this.v0 = i3;
            } else if (i == 13) {
                this.r0 = i2;
            } else if (i != 32) {
                Y0(i);
            }
        }
    }

    private final void V1(String str, int i, int i2) throws IOException {
        if (Character.isJavaIdentifierPart((char) i2)) {
            x2(str.substring(0, i));
        }
    }

    private void W1(int i) throws ax.T4.i {
        if (i == 93) {
            L2();
            if (!this.z0.e()) {
                D1(i, '}');
            }
            this.z0 = this.z0.j();
            this.d0 = m.END_ARRAY;
        }
        if (i == 125) {
            L2();
            if (!this.z0.f()) {
                D1(i, ']');
            }
            this.z0 = this.z0.j();
            this.d0 = m.END_OBJECT;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0069 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0061 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.lang.String f2(int r5, int r6, int[] r7) throws java.io.IOException {
        /*
            r4 = this;
            ax.b5.l r0 = r4.B0
            char[] r1 = r4.U0
            int r2 = r4.r0
            int r2 = r2 - r5
            r0.s(r1, r5, r2)
            ax.b5.l r5 = r4.B0
            char[] r5 = r5.m()
            ax.b5.l r0 = r4.B0
            int r0 = r0.n()
            int r1 = r7.length
        L17:
            int r2 = r4.r0
            int r3 = r4.s0
            if (r2 < r3) goto L24
            boolean r2 = r4.h2()
            if (r2 != 0) goto L24
            goto L37
        L24:
            char[] r2 = r4.U0
            int r3 = r4.r0
            char r2 = r2[r3]
            if (r2 >= r1) goto L31
            r3 = r7[r2]
            if (r3 == 0) goto L51
            goto L37
        L31:
            boolean r3 = java.lang.Character.isJavaIdentifierPart(r2)
            if (r3 != 0) goto L51
        L37:
            ax.b5.l r5 = r4.B0
            r5.w(r0)
            ax.b5.l r5 = r4.B0
            char[] r7 = r5.o()
            int r0 = r5.p()
            int r5 = r5.x()
            ax.a5.b r1 = r4.X0
            java.lang.String r5 = r1.l(r7, r0, r5, r6)
            return r5
        L51:
            int r3 = r4.r0
            int r3 = r3 + 1
            r4.r0 = r3
            int r6 = r6 * 33
            int r6 = r6 + r2
            int r3 = r0 + 1
            r5[r0] = r2
            int r0 = r5.length
            if (r3 < r0) goto L69
            ax.b5.l r5 = r4.B0
            char[] r5 = r5.l()
            r0 = 0
            goto L17
        L69:
            r0 = r3
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.Z4.g.f2(int, int, int[]):java.lang.String");
    }

    private final void j2() throws IOException {
        int i;
        char c;
        int i2 = this.r0;
        if (i2 + 4 < this.s0) {
            char[] cArr = this.U0;
            if (cArr[i2] == 'a' && cArr[i2 + 1] == 'l' && cArr[i2 + 2] == 's' && cArr[i2 + 3] == 'e' && ((c = cArr[(i = i2 + 4)]) < '0' || c == ']' || c == '}')) {
                this.r0 = i;
                return;
            }
        }
        l2("false", 1);
    }

    private final void k2() throws IOException {
        int i;
        char c;
        int i2 = this.r0;
        if (i2 + 3 < this.s0) {
            char[] cArr = this.U0;
            if (cArr[i2] == 'u' && cArr[i2 + 1] == 'l' && cArr[i2 + 2] == 'l' && ((c = cArr[(i = i2 + 3)]) < '0' || c == ']' || c == '}')) {
                this.r0 = i;
                return;
            }
        }
        l2("null", 1);
    }

    private final void m2(String str, int i) throws IOException {
        int i2;
        char c;
        int length = str.length();
        do {
            if ((this.r0 >= this.s0 && !h2()) || this.U0[this.r0] != str.charAt(i)) {
                x2(str.substring(0, i));
            }
            i2 = this.r0 + 1;
            this.r0 = i2;
            i++;
        } while (i < length);
        if ((i2 < this.s0 || h2()) && (c = this.U0[this.r0]) >= '0' && c != ']' && c != '}') {
            V1(str, i, c);
        }
    }

    private final void n2() throws IOException {
        int i;
        char c;
        int i2 = this.r0;
        if (i2 + 3 < this.s0) {
            char[] cArr = this.U0;
            if (cArr[i2] == 'r' && cArr[i2 + 1] == 'u' && cArr[i2 + 2] == 'e' && ((c = cArr[(i = i2 + 3)]) < '0' || c == ']' || c == '}')) {
                this.r0 = i;
                return;
            }
        }
        l2("true", 1);
    }

    private final m o2() throws IOException {
        this.D0 = false;
        m mVar = this.A0;
        this.A0 = null;
        if (mVar == m.START_ARRAY) {
            M1(this.x0, this.y0);
        } else if (mVar == m.START_OBJECT) {
            N1(this.x0, this.y0);
        }
        this.d0 = mVar;
        return mVar;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: InitCodeVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Several immutable types in one variable: [int, char], vars: [r10v0 ??, r10v1 ??, r10v18 ??, r10v12 ??, r10v6 ??, r10v5 ??, r10v3 ??, r10v10 ??, r10v9 ??]
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVarType(InitCodeVariables.java:107)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:83)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:57)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:45)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    private final ax.T4.m q2(
    /*  JADX ERROR: JadxRuntimeException in pass: InitCodeVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Several immutable types in one variable: [int, char], vars: [r10v0 ??, r10v1 ??, r10v18 ??, r10v12 ??, r10v6 ??, r10v5 ??, r10v3 ??, r10v10 ??, r10v9 ??]
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVarType(InitCodeVariables.java:107)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:83)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:57)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:45)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r10v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:238)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:223)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:168)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:401)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
        */

    private String t2(int i, int i2, int i3) throws IOException {
        this.B0.s(this.U0, i, this.r0 - i);
        char[] m = this.B0.m();
        int n = this.B0.n();
        while (true) {
            if (this.r0 >= this.s0 && !h2()) {
                M0(" in field name", m.FIELD_NAME);
            }
            char[] cArr = this.U0;
            int i4 = this.r0;
            this.r0 = i4 + 1;
            char c = cArr[i4];
            if (c <= '\\') {
                if (c == '\\') {
                    c = p1();
                } else if (c <= i3) {
                    if (c == i3) {
                        this.B0.w(n);
                        l lVar = this.B0;
                        return this.X0.l(lVar.o(), lVar.p(), lVar.x(), i2);
                    }
                    if (c < ' ') {
                        F1(c, "name");
                    }
                }
            }
            i2 = (i2 * 33) + c;
            int i5 = n + 1;
            m[n] = c;
            if (i5 >= m.length) {
                m = this.B0.l();
                n = 0;
            } else {
                n = i5;
            }
        }
    }

    private final m u2(boolean z, int i) throws IOException {
        int i2;
        char Q2;
        boolean z2;
        int i3;
        char Q22;
        if (z) {
            i++;
        }
        this.r0 = i;
        char[] i4 = this.B0.i();
        if (z) {
            i4[0] = '-';
            i2 = 1;
        } else {
            i2 = 0;
        }
        int i5 = this.r0;
        if (i5 < this.s0) {
            char[] cArr = this.U0;
            this.r0 = i5 + 1;
            Q2 = cArr[i5];
        } else {
            Q2 = Q2("No digit following minus sign", m.VALUE_NUMBER_INT);
        }
        if (Q2 == '0') {
            Q2 = O2();
        }
        int i6 = 0;
        while (Q2 >= '0' && Q2 <= '9') {
            i6++;
            if (i2 >= i4.length) {
                i4 = this.B0.l();
                i2 = 0;
            }
            int i7 = i2 + 1;
            i4[i2] = Q2;
            if (this.r0 >= this.s0 && !h2()) {
                i2 = i7;
                Q2 = 0;
                z2 = true;
                break;
            }
            char[] cArr2 = this.U0;
            int i8 = this.r0;
            this.r0 = i8 + 1;
            Q2 = cArr2[i8];
            i2 = i7;
        }
        z2 = false;
        if (i6 == 0 && !A(e.ALLOW_LEADING_DECIMAL_POINT_FOR_NUMBERS.j())) {
            return c2(Q2, z);
        }
        int i9 = -1;
        if (Q2 == '.') {
            if (i2 >= i4.length) {
                i4 = this.B0.l();
                i2 = 0;
            }
            i4[i2] = Q2;
            i2++;
            i3 = 0;
            while (true) {
                if (this.r0 >= this.s0 && !h2()) {
                    z2 = true;
                    break;
                }
                char[] cArr3 = this.U0;
                int i10 = this.r0;
                this.r0 = i10 + 1;
                Q2 = cArr3[i10];
                if (Q2 < '0' || Q2 > '9') {
                    break;
                }
                i3++;
                if (i2 >= i4.length) {
                    i4 = this.B0.l();
                    i2 = 0;
                }
                i4[i2] = Q2;
                i2++;
            }
            if (i3 == 0 && !A(e.ALLOW_TRAILING_DECIMAL_POINT_FOR_NUMBERS.j())) {
                a1(Q2, "Decimal point not followed by a digit");
            }
        } else {
            i3 = -1;
        }
        if (Q2 == 'e' || Q2 == 'E') {
            if (i2 >= i4.length) {
                i4 = this.B0.l();
                i2 = 0;
            }
            int i11 = i2 + 1;
            i4[i2] = Q2;
            int i12 = this.r0;
            if (i12 < this.s0) {
                char[] cArr4 = this.U0;
                this.r0 = i12 + 1;
                Q22 = cArr4[i12];
            } else {
                Q22 = Q2("expected a digit for number exponent", m.VALUE_NUMBER_FLOAT);
            }
            if (Q22 == '-' || Q22 == '+') {
                if (i11 >= i4.length) {
                    i4 = this.B0.l();
                    i11 = 0;
                }
                int i13 = i11 + 1;
                i4[i11] = Q22;
                int i14 = this.r0;
                if (i14 < this.s0) {
                    char[] cArr5 = this.U0;
                    this.r0 = i14 + 1;
                    Q22 = cArr5[i14];
                } else {
                    Q22 = Q2("expected a digit for number exponent", m.VALUE_NUMBER_FLOAT);
                }
                i11 = i13;
            }
            Q2 = Q22;
            int i15 = 0;
            while (Q2 <= '9' && Q2 >= '0') {
                i15++;
                if (i11 >= i4.length) {
                    i4 = this.B0.l();
                    i11 = 0;
                }
                i2 = i11 + 1;
                i4[i11] = Q2;
                if (this.r0 >= this.s0 && !h2()) {
                    z2 = true;
                    break;
                }
                char[] cArr6 = this.U0;
                int i16 = this.r0;
                this.r0 = i16 + 1;
                Q2 = cArr6[i16];
                i11 = i2;
            }
            i2 = i11;
            i9 = i15;
            if (i9 == 0) {
                a1(Q2, "Exponent indicator not followed by a digit");
            }
        }
        if (!z2) {
            this.r0--;
            if (this.z0.g()) {
                P2(Q2);
            }
        }
        this.B0.w(i2);
        return (i3 >= 0 || i9 >= 0) ? T1(z, i6, i3, i9) : U1(z, i6);
    }

    private final m v2(boolean z) throws IOException {
        int i = this.r0;
        int i2 = z ? i - 1 : i;
        int i3 = this.s0;
        if (i >= i3) {
            return u2(z, i2);
        }
        int i4 = i + 1;
        char c = this.U0[i];
        int i5 = 1;
        if (c > '9' || c < '0') {
            this.r0 = i4;
            return c == '.' ? r2(z) : d2(c, z, true);
        }
        if (c == '0') {
            return u2(z, i2);
        }
        while (i4 < i3) {
            int i6 = i4 + 1;
            char c2 = this.U0[i4];
            if (c2 < '0' || c2 > '9') {
                if (c2 == '.' || c2 == 'e' || c2 == 'E') {
                    this.r0 = i6;
                    return q2(c2, i2, i6, z, i5);
                }
                this.r0 = i4;
                if (this.z0.g()) {
                    P2(c2);
                }
                this.B0.s(this.U0, i2, i4 - i2);
                return U1(z, i5);
            }
            i5++;
            i4 = i6;
        }
        return u2(z, i2);
    }

    private final int z2() throws IOException {
        char c;
        while (true) {
            if (this.r0 >= this.s0 && !h2()) {
                throw a("Unexpected end-of-input within/between " + this.z0.h() + " entries");
            }
            char[] cArr = this.U0;
            int i = this.r0;
            int i2 = i + 1;
            this.r0 = i2;
            c = cArr[i];
            if (c > ' ') {
                if (c == '/') {
                    F2();
                } else if (c != '#' || !K2()) {
                    break;
                }
            } else if (c < ' ') {
                if (c == '\n') {
                    this.u0++;
                    this.v0 = i2;
                } else if (c == '\r') {
                    B2();
                } else if (c != '\t') {
                    c1(c);
                }
            }
        }
        return c;
    }

    protected final void B2() throws IOException {
        if (this.r0 < this.s0 || h2()) {
            char[] cArr = this.U0;
            int i = this.r0;
            if (cArr[i] == '\n') {
                this.r0 = i + 1;
            }
        }
        this.u0++;
        this.v0 = this.r0;
    }

    @Override // ax.U4.b
    protected void C1() throws IOException {
        char[] cArr;
        super.C1();
        this.X0.r();
        if (!this.V0 || (cArr = this.U0) == null) {
            return;
        }
        this.U0 = null;
        this.o0.p(cArr);
    }

    @Override // ax.U4.c, ax.T4.j
    public final m H() throws IOException {
        m mVar;
        m mVar2 = this.d0;
        m mVar3 = m.FIELD_NAME;
        if (mVar2 == mVar3) {
            return o2();
        }
        this.G0 = 0;
        if (this.Z0) {
            H2();
        }
        int I2 = I2();
        if (I2 < 0) {
            close();
            this.d0 = null;
            return null;
        }
        this.F0 = null;
        if (I2 == 93 || I2 == 125) {
            W1(I2);
            return this.d0;
        }
        if (this.z0.n()) {
            I2 = E2(I2);
            if ((this.q & d1) != 0 && (I2 == 93 || I2 == 125)) {
                W1(I2);
                return this.d0;
            }
        }
        boolean f = this.z0.f();
        if (f) {
            M2();
            this.z0.q(I2 == 34 ? s2() : e2(I2));
            this.d0 = mVar3;
            I2 = C2();
        }
        L2();
        if (I2 == 34) {
            this.Z0 = true;
            mVar = m.VALUE_STRING;
        } else if (I2 == 43) {
            mVar = A(e.ALLOW_LEADING_PLUS_SIGN_FOR_NUMBERS.j()) ? v2(false) : g2(I2);
        } else if (I2 == 91) {
            if (!f) {
                M1(this.x0, this.y0);
            }
            mVar = m.START_ARRAY;
        } else if (I2 == 102) {
            j2();
            mVar = m.VALUE_FALSE;
        } else if (I2 != 110) {
            if (I2 != 116) {
                if (I2 == 123) {
                    if (!f) {
                        N1(this.x0, this.y0);
                    }
                    mVar = m.START_OBJECT;
                } else if (I2 == 125) {
                    Z0(I2, "expected a value");
                } else if (I2 == 45) {
                    mVar = v2(true);
                } else if (I2 != 46) {
                    switch (I2) {
                        case 48:
                        case 49:
                        case 50:
                        case 51:
                        case 52:
                        case 53:
                        case 54:
                        case 55:
                        case 56:
                        case 57:
                            mVar = w2(I2);
                            break;
                        default:
                            mVar = g2(I2);
                            break;
                    }
                } else {
                    mVar = r2(false);
                }
            }
            n2();
            mVar = m.VALUE_TRUE;
        } else {
            k2();
            mVar = m.VALUE_NULL;
        }
        if (f) {
            this.A0 = mVar;
            return this.d0;
        }
        this.d0 = mVar;
        return mVar;
    }

    protected final void H2() throws IOException {
        this.Z0 = false;
        int i = this.r0;
        int i2 = this.s0;
        char[] cArr = this.U0;
        while (true) {
            if (i >= i2) {
                this.r0 = i;
                if (!h2()) {
                    M0(": was expecting closing quote for a string value", m.VALUE_STRING);
                }
                i = this.r0;
                i2 = this.s0;
            }
            int i3 = i + 1;
            char c = cArr[i];
            if (c <= '\\') {
                if (c == '\\') {
                    this.r0 = i3;
                    p1();
                    i = this.r0;
                    i2 = this.s0;
                } else if (c <= '\"') {
                    if (c == '\"') {
                        this.r0 = i3;
                        return;
                    } else if (c < ' ') {
                        this.r0 = i3;
                        F1(c, "string value");
                    }
                }
            }
            i = i3;
        }
    }

    protected char Q2(String str, m mVar) throws IOException {
        if (this.r0 >= this.s0 && !h2()) {
            M0(str, mVar);
        }
        char[] cArr = this.U0;
        int i = this.r0;
        this.r0 = i + 1;
        return cArr[i];
    }

    protected byte[] X1(ax.T4.a aVar) throws IOException {
        ax.b5.c t1 = t1();
        while (true) {
            if (this.r0 >= this.s0) {
                i2();
            }
            char[] cArr = this.U0;
            int i = this.r0;
            this.r0 = i + 1;
            char c = cArr[i];
            if (c > ' ') {
                int f = aVar.f(c);
                if (f < 0) {
                    if (c == '\"') {
                        return t1.m();
                    }
                    f = n1(aVar, c, 0);
                    if (f < 0) {
                        continue;
                    }
                }
                if (this.r0 >= this.s0) {
                    i2();
                }
                char[] cArr2 = this.U0;
                int i2 = this.r0;
                this.r0 = i2 + 1;
                char c2 = cArr2[i2];
                int f2 = aVar.f(c2);
                if (f2 < 0) {
                    f2 = n1(aVar, c2, 1);
                }
                int i3 = (f << 6) | f2;
                if (this.r0 >= this.s0) {
                    i2();
                }
                char[] cArr3 = this.U0;
                int i4 = this.r0;
                this.r0 = i4 + 1;
                char c3 = cArr3[i4];
                int f3 = aVar.f(c3);
                if (f3 < 0) {
                    if (f3 != -2) {
                        if (c3 == '\"') {
                            t1.b(i3 >> 4);
                            if (aVar.k()) {
                                this.r0--;
                                w1(aVar);
                            }
                            return t1.m();
                        }
                        f3 = n1(aVar, c3, 2);
                    }
                    if (f3 == -2) {
                        if (this.r0 >= this.s0) {
                            i2();
                        }
                        char[] cArr4 = this.U0;
                        int i5 = this.r0;
                        this.r0 = i5 + 1;
                        char c4 = cArr4[i5];
                        if (!aVar.m(c4) && n1(aVar, c4, 3) != -2) {
                            throw R1(aVar, c4, 3, "expected padding character '" + aVar.i() + "'");
                        }
                        t1.b(i3 >> 4);
                    }
                }
                int i6 = (i3 << 6) | f3;
                if (this.r0 >= this.s0) {
                    i2();
                }
                char[] cArr5 = this.U0;
                int i7 = this.r0;
                this.r0 = i7 + 1;
                char c5 = cArr5[i7];
                int f4 = aVar.f(c5);
                if (f4 < 0) {
                    if (f4 != -2) {
                        if (c5 == '\"') {
                            t1.d(i6 >> 2);
                            if (aVar.k()) {
                                this.r0--;
                                w1(aVar);
                            }
                            return t1.m();
                        }
                        f4 = n1(aVar, c5, 3);
                    }
                    if (f4 == -2) {
                        t1.d(i6 >> 2);
                    }
                }
                t1.c((i6 << 6) | f4);
            }
        }
    }

    protected final void Y1() throws IOException {
        int i = this.r0;
        int i2 = this.s0;
        if (i < i2) {
            int[] iArr = l1;
            int length = iArr.length;
            while (true) {
                char[] cArr = this.U0;
                char c = cArr[i];
                if (c >= length || iArr[c] == 0) {
                    i++;
                    if (i >= i2) {
                        break;
                    }
                } else if (c == '\"') {
                    l lVar = this.B0;
                    int i3 = this.r0;
                    lVar.s(cArr, i3, i - i3);
                    this.r0 = i + 1;
                    return;
                }
            }
        }
        l lVar2 = this.B0;
        char[] cArr2 = this.U0;
        int i4 = this.r0;
        lVar2.r(cArr2, i4, i - i4);
        this.r0 = i;
        Z1();
    }

    protected void Z1() throws IOException {
        char[] m = this.B0.m();
        int n = this.B0.n();
        int[] iArr = l1;
        int length = iArr.length;
        while (true) {
            if (this.r0 >= this.s0 && !h2()) {
                M0(": was expecting closing quote for a string value", m.VALUE_STRING);
            }
            char[] cArr = this.U0;
            int i = this.r0;
            this.r0 = i + 1;
            char c = cArr[i];
            if (c < length && iArr[c] != 0) {
                if (c == '\"') {
                    this.B0.w(n);
                    return;
                } else if (c == '\\') {
                    c = p1();
                } else if (c < ' ') {
                    F1(c, "string value");
                }
            }
            if (n >= m.length) {
                m = this.B0.l();
                n = 0;
            }
            m[n] = c;
            n++;
        }
    }

    protected final String a2(m mVar) throws IOException {
        if (mVar == null) {
            return null;
        }
        int h = mVar.h();
        return h != 5 ? (h == 6 || h == 7 || h == 8) ? this.B0.h() : mVar.d() : this.z0.b();
    }

    protected m b2() throws IOException {
        char[] i = this.B0.i();
        int n = this.B0.n();
        while (true) {
            if (this.r0 >= this.s0 && !h2()) {
                M0(": was expecting closing quote for a string value", m.VALUE_STRING);
            }
            char[] cArr = this.U0;
            int i2 = this.r0;
            this.r0 = i2 + 1;
            char c = cArr[i2];
            if (c <= '\\') {
                if (c == '\\') {
                    c = p1();
                } else if (c <= '\'') {
                    if (c == '\'') {
                        this.B0.w(n);
                        return m.VALUE_STRING;
                    }
                    if (c < ' ') {
                        F1(c, "string value");
                    }
                }
            }
            if (n >= i.length) {
                i = this.B0.l();
                n = 0;
            }
            i[n] = c;
            n++;
        }
    }

    protected m c2(int i, boolean z) throws IOException {
        return d2(i, z, false);
    }

    @Override // ax.T4.j
    public byte[] d(ax.T4.a aVar) throws IOException {
        byte[] bArr;
        m mVar = this.d0;
        if (mVar == m.VALUE_EMBEDDED_OBJECT && (bArr = this.F0) != null) {
            return bArr;
        }
        if (mVar != m.VALUE_STRING) {
            C0("Current token (" + this.d0 + ") not VALUE_STRING or VALUE_EMBEDDED_OBJECT, can not access as binary");
        }
        if (this.Z0) {
            try {
                this.F0 = X1(aVar);
                this.Z0 = false;
            } catch (IllegalArgumentException e) {
                throw a("Failed to decode VALUE_STRING as base64 (" + aVar + "): " + e.getMessage());
            }
        } else if (this.F0 == null) {
            ax.b5.c t1 = t1();
            d0(u(), t1, aVar);
            this.F0 = t1.m();
        }
        return this.F0;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: InitCodeVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Several immutable types in one variable: [int, char], vars: [r10v0 ??, r10v1 ??, r10v5 ??]
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVarType(InitCodeVariables.java:107)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:83)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:57)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:45)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    protected ax.T4.m d2(
    /*  JADX ERROR: JadxRuntimeException in pass: InitCodeVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Several immutable types in one variable: [int, char], vars: [r10v0 ??, r10v1 ??, r10v5 ??]
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVarType(InitCodeVariables.java:107)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:83)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:57)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:45)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r10v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:238)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:223)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:168)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:401)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
        */

    protected String e2(int i) throws IOException {
        if (i == 39 && (this.q & h1) != 0) {
            return p2();
        }
        if ((this.q & i1) == 0) {
            Z0(i, "was expecting double-quote to start field name");
        }
        int[] i2 = ax.W4.c.i();
        int length = i2.length;
        if (!(i < length ? i2[i] == 0 : Character.isJavaIdentifierPart((char) i))) {
            Z0(i, "was expecting either valid name character (for unquoted name) or double-quote (for quoted) to start field name");
        }
        int i3 = this.r0;
        int i4 = this.Y0;
        int i5 = this.s0;
        if (i3 < i5) {
            do {
                char[] cArr = this.U0;
                char c = cArr[i3];
                if (c < length) {
                    if (i2[c] != 0) {
                        int i6 = this.r0 - 1;
                        this.r0 = i3;
                        return this.X0.l(cArr, i6, i3 - i6, i4);
                    }
                } else if (!Character.isJavaIdentifierPart(c)) {
                    int i7 = this.r0 - 1;
                    this.r0 = i3;
                    return this.X0.l(this.U0, i7, i3 - i7, i4);
                }
                i4 = (i4 * 33) + c;
                i3++;
            } while (i3 < i5);
        }
        int i8 = this.r0 - 1;
        this.r0 = i3;
        return f2(i8, i4, i2);
    }

    @Override // ax.T4.j
    public ax.T4.h f() {
        return new ax.T4.h(m1(), -1L, this.r0 + this.t0, this.u0, (this.r0 - this.v0) + 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0017, code lost:
    
        if (r4 != 44) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004b, code lost:
    
        if (r3.z0.g() != false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0052, code lost:
    
        if ((r3.q & ax.Z4.g.g1) == 0) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0054, code lost:
    
        r3.r0--;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x005b, code lost:
    
        return ax.T4.m.VALUE_NULL;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0042, code lost:
    
        if (r3.z0.e() == false) goto L45;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected ax.T4.m g2(int r4) throws java.io.IOException {
        /*
            r3 = this;
            r0 = 39
            if (r4 == r0) goto L8e
            r0 = 73
            r1 = 1
            if (r4 == r0) goto L75
            r0 = 78
            if (r4 == r0) goto L5c
            r0 = 93
            if (r4 == r0) goto L3c
            r0 = 43
            if (r4 == r0) goto L1b
            r0 = 44
            if (r4 == r0) goto L45
            goto L9a
        L1b:
            int r4 = r3.r0
            int r0 = r3.s0
            if (r4 < r0) goto L2c
            boolean r4 = r3.h2()
            if (r4 != 0) goto L2c
            ax.T4.m r4 = ax.T4.m.VALUE_NUMBER_INT
            r3.T0(r4)
        L2c:
            char[] r4 = r3.U0
            int r0 = r3.r0
            int r2 = r0 + 1
            r3.r0 = r2
            char r4 = r4[r0]
            r0 = 0
            ax.T4.m r4 = r3.d2(r4, r0, r1)
            return r4
        L3c:
            ax.Z4.d r0 = r3.z0
            boolean r0 = r0.e()
            if (r0 != 0) goto L45
            goto L9a
        L45:
            ax.Z4.d r0 = r3.z0
            boolean r0 = r0.g()
            if (r0 != 0) goto L9a
            int r0 = r3.q
            int r2 = ax.Z4.g.g1
            r0 = r0 & r2
            if (r0 == 0) goto L9a
            int r4 = r3.r0
            int r4 = r4 - r1
            r3.r0 = r4
            ax.T4.m r4 = ax.T4.m.VALUE_NULL
            return r4
        L5c:
            java.lang.String r0 = "NaN"
            r3.l2(r0, r1)
            int r1 = r3.q
            int r2 = ax.Z4.g.f1
            r1 = r1 & r2
            if (r1 == 0) goto L6f
            r1 = 9221120237041090560(0x7ff8000000000000, double:NaN)
            ax.T4.m r4 = r3.S1(r0, r1)
            return r4
        L6f:
            java.lang.String r0 = "Non-standard token 'NaN': enable `JsonReadFeature.ALLOW_NON_NUMERIC_NUMBERS` to allow"
            r3.C0(r0)
            goto L9a
        L75:
            java.lang.String r0 = "Infinity"
            r3.l2(r0, r1)
            int r1 = r3.q
            int r2 = ax.Z4.g.f1
            r1 = r1 & r2
            if (r1 == 0) goto L88
            r1 = 9218868437227405312(0x7ff0000000000000, double:Infinity)
            ax.T4.m r4 = r3.S1(r0, r1)
            return r4
        L88:
            java.lang.String r0 = "Non-standard token 'Infinity': enable `JsonReadFeature.ALLOW_NON_NUMERIC_NUMBERS` to allow"
            r3.C0(r0)
            goto L9a
        L8e:
            int r0 = r3.q
            int r1 = ax.Z4.g.h1
            r0 = r0 & r1
            if (r0 == 0) goto L9a
            ax.T4.m r4 = r3.b2()
            return r4
        L9a:
            boolean r0 = java.lang.Character.isJavaIdentifierStart(r4)
            if (r0 == 0) goto Lb9
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = ""
            r0.append(r1)
            char r1 = (char) r4
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = r3.G1()
            r3.y2(r0, r1)
        Lb9:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "expected a valid value "
            r0.append(r1)
            java.lang.String r1 = r3.H1()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r3.Z0(r4, r0)
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.Z4.g.g2(int):ax.T4.m");
    }

    protected boolean h2() throws IOException {
        Reader reader = this.T0;
        if (reader != null) {
            char[] cArr = this.U0;
            int read = reader.read(cArr, 0, cArr.length);
            if (read > 0) {
                int i = this.s0;
                long j = i;
                this.t0 += j;
                this.v0 -= i;
                this.a1 -= j;
                this.r0 = 0;
                this.s0 = read;
                return true;
            }
            l1();
            if (read == 0) {
                throw new IOException("Reader returned 0 characters when trying to read " + this.s0);
            }
        }
        return false;
    }

    protected void i2() throws IOException {
        if (h2()) {
            return;
        }
        L0();
    }

    @Override // ax.U4.b
    protected void l1() throws IOException {
        if (this.T0 != null) {
            if (this.o0.l() || A(j.a.AUTO_CLOSE_SOURCE)) {
                this.T0.close();
            }
            this.T0 = null;
        }
    }

    protected final void l2(String str, int i) throws IOException {
        int i2;
        int length = str.length();
        if (this.r0 + length >= this.s0) {
            m2(str, i);
            return;
        }
        do {
            if (this.U0[this.r0] != str.charAt(i)) {
                x2(str.substring(0, i));
            }
            i2 = this.r0 + 1;
            this.r0 = i2;
            i++;
        } while (i < length);
        char c = this.U0[i2];
        if (c < '0' || c == ']' || c == '}') {
            return;
        }
        V1(str, i, c);
    }

    @Override // ax.U4.b
    protected char p1() throws IOException {
        if (this.r0 >= this.s0 && !h2()) {
            M0(" in character escape sequence", m.VALUE_STRING);
        }
        char[] cArr = this.U0;
        int i = this.r0;
        this.r0 = i + 1;
        char c = cArr[i];
        if (c == '\"' || c == '/' || c == '\\') {
            return c;
        }
        if (c == 'b') {
            return '\b';
        }
        if (c == 'f') {
            return '\f';
        }
        if (c == 'n') {
            return '\n';
        }
        if (c == 'r') {
            return '\r';
        }
        if (c == 't') {
            return '\t';
        }
        if (c != 'u') {
            return x1(c);
        }
        int i2 = 0;
        for (int i3 = 0; i3 < 4; i3++) {
            if (this.r0 >= this.s0 && !h2()) {
                M0(" in character escape sequence", m.VALUE_STRING);
            }
            char[] cArr2 = this.U0;
            int i4 = this.r0;
            this.r0 = i4 + 1;
            char c2 = cArr2[i4];
            int b = ax.W4.c.b(c2);
            if (b < 0) {
                Z0(c2, "expected a hex-digit for character escape sequence");
            }
            i2 = (i2 << 4) | b;
        }
        return (char) i2;
    }

    protected String p2() throws IOException {
        int i = this.r0;
        int i2 = this.Y0;
        int i3 = this.s0;
        if (i < i3) {
            int[] iArr = l1;
            int length = iArr.length;
            do {
                char[] cArr = this.U0;
                char c = cArr[i];
                if (c != '\'') {
                    if (c < length && iArr[c] != 0) {
                        break;
                    }
                    i2 = (i2 * 33) + c;
                    i++;
                } else {
                    int i4 = this.r0;
                    this.r0 = i + 1;
                    return this.X0.l(cArr, i4, i - i4, i2);
                }
            } while (i < i3);
        }
        int i5 = this.r0;
        this.r0 = i;
        return t2(i5, i2, 39);
    }

    protected final m r2(boolean z) throws IOException {
        if (!A(e.ALLOW_LEADING_DECIMAL_POINT_FOR_NUMBERS.j())) {
            return g2(46);
        }
        int i = this.r0;
        int i2 = i - 1;
        if (z) {
            i2 = i - 2;
        }
        return q2(46, i2, i, z, 0);
    }

    protected final String s2() throws IOException {
        int i = this.r0;
        int i2 = this.Y0;
        int[] iArr = l1;
        while (true) {
            if (i >= this.s0) {
                break;
            }
            char[] cArr = this.U0;
            char c = cArr[i];
            if (c >= iArr.length || iArr[c] == 0) {
                i2 = (i2 * 33) + c;
                i++;
            } else if (c == '\"') {
                int i3 = this.r0;
                this.r0 = i + 1;
                return this.X0.l(cArr, i3, i - i3, i2);
            }
        }
        int i4 = this.r0;
        this.r0 = i;
        return t2(i4, i2, 34);
    }

    @Override // ax.U4.c, ax.T4.j
    public final String u() throws IOException {
        m mVar = this.d0;
        if (mVar != m.VALUE_STRING) {
            return a2(mVar);
        }
        if (this.Z0) {
            this.Z0 = false;
            Y1();
        }
        return this.B0.h();
    }

    @Override // ax.T4.j
    public ax.T4.h v() {
        if (this.d0 != m.FIELD_NAME) {
            return new ax.T4.h(m1(), -1L, this.w0 - 1, this.x0, this.y0);
        }
        return new ax.T4.h(m1(), -1L, this.t0 + (this.a1 - 1), this.b1, this.c1);
    }

    protected final m w2(int i) throws IOException {
        int i2 = this.r0;
        int i3 = i2 - 1;
        int i4 = this.s0;
        if (i == 48) {
            return u2(false, i3);
        }
        int i5 = 1;
        while (i2 < i4) {
            int i6 = i2 + 1;
            char c = this.U0[i2];
            if (c < '0' || c > '9') {
                if (c == '.' || c == 'e' || c == 'E') {
                    this.r0 = i6;
                    return q2(c, i3, i6, false, i5);
                }
                this.r0 = i2;
                if (this.z0.g()) {
                    P2(c);
                }
                this.B0.s(this.U0, i3, i2 - i3);
                return U1(false, i5);
            }
            i5++;
            i2 = i6;
        }
        this.r0 = i3;
        return u2(false, i3);
    }

    protected void x2(String str) throws IOException {
        y2(str, G1());
    }

    protected void y2(String str, String str2) throws IOException {
        StringBuilder sb = new StringBuilder(str);
        while (true) {
            if (this.r0 >= this.s0 && !h2()) {
                break;
            }
            char c = this.U0[this.r0];
            if (!Character.isJavaIdentifierPart(c)) {
                break;
            }
            this.r0++;
            sb.append(c);
            if (sb.length() >= 256) {
                sb.append("...");
                break;
            }
        }
        F0("Unrecognized token '%s': was expecting %s", sb, str2);
    }

    public g(ax.W4.e eVar, int i, Reader reader, n nVar, ax.a5.b bVar) {
        super(eVar, i);
        this.T0 = reader;
        this.U0 = eVar.f();
        this.r0 = 0;
        this.s0 = 0;
        this.W0 = nVar;
        this.X0 = bVar;
        this.Y0 = bVar.m();
        this.V0 = true;
    }
}
