package com.jcraft.jsch;

/* loaded from: classes3.dex */
public class Slf4jLogger implements Logger {
    private static final ax.Xd.d a = ax.Xd.f.k(JSch.class);

    @Override // com.jcraft.jsch.Logger
    public void a(int i, String str) {
        b(i, str, null);
    }

    @Override // com.jcraft.jsch.Logger
    public void b(int i, String str, Throwable th) {
        if (isEnabled(i)) {
            if (i == 0) {
                a.y(str, th);
                return;
            }
            if (i == 1) {
                a.v(str, th);
                return;
            }
            if (i == 2) {
                a.w(str, th);
            } else if (i == 3 || i == 4) {
                a.h(str, th);
            } else {
                a.x(str, th);
            }
        }
    }

    @Override // com.jcraft.jsch.Logger
    public boolean isEnabled(int i) {
        return i != 0 ? i != 1 ? i != 2 ? (i == 3 || i == 4) ? a.j() : a.o() : a.c() : a.l() : a.e();
    }
}
