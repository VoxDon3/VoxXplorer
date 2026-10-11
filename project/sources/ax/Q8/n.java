package ax.Q8;

import ax.R8.C0967a;
import ax.Z8.a;
import ax.h9.AbstractC2173d;

/* loaded from: classes3.dex */
public class n {
    private static final ax.Xd.d a = ax.Xd.f.k(n.class);

    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[m.values().length];
            a = iArr;
            try {
                iArr[m.SMB2_NEGOTIATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[m.SMB2_SESSION_SETUP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[m.SMB2_TREE_CONNECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[m.SMB2_TREE_DISCONNECT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[m.SMB2_LOGOFF.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[m.SMB2_CREATE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[m.SMB2_CHANGE_NOTIFY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[m.SMB2_QUERY_DIRECTORY.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[m.SMB2_ECHO.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                a[m.SMB2_READ.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                a[m.SMB2_CLOSE.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                a[m.SMB2_FLUSH.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                a[m.SMB2_WRITE.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                a[m.SMB2_IOCTL.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                a[m.SMB2_QUERY_INFO.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                a[m.SMB2_SET_INFO.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                a[m.SMB2_CANCEL.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                a[m.SMB2_LOCK.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                a[m.SMB2_OPLOCK_BREAK.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
        }
    }

    private q a(r rVar) {
        m h = rVar.b().h();
        switch (a.a[h.ordinal()]) {
            case 1:
                return new ax.R8.m();
            case 2:
                return new ax.R8.t();
            case 3:
                return new ax.R8.x();
            case 4:
                return new ax.R8.y();
            case 5:
                return new ax.R8.k();
            case 6:
                return new ax.R8.e();
            case 7:
                return new ax.R8.b();
            case 8:
                return new ax.R8.o();
            case 9:
                return new ax.R8.f();
            case 10:
                return new ax.R8.s();
            case 11:
                return new ax.R8.c();
            case 12:
                return new ax.R8.g();
            case 13:
                return new ax.R8.A();
            case 14:
                return new ax.R8.i();
            case 15:
                return new ax.R8.q();
            case 16:
                return new ax.R8.v();
            case 17:
                return new C0967a();
            case 18:
                return new ax.R8.j();
            default:
                a.f("Unknown SMB2 Message Command type: " + h);
                throw new ax.k9.d("Unknown SMB2 Message Command type: " + h);
        }
    }

    private boolean b(AbstractC2173d<?, ?> abstractC2173d, r rVar) {
        if (rVar.i()) {
            return true;
        }
        m h = rVar.b().h();
        long m = rVar.b().m();
        int i = a.a[h.ordinal()];
        if (i == 2) {
            return m == ax.K8.a.STATUS_MORE_PROCESSING_REQUIRED.getValue();
        }
        if (i == 7) {
            return m == ax.K8.a.STATUS_NOTIFY_ENUM_DIR.getValue();
        }
        if (i != 10) {
            if (i == 14) {
                long o = ((ax.R8.h) abstractC2173d).o();
                return (o == 1130508 || o == 1163287 || o == 393620) ? m == ax.K8.a.STATUS_BUFFER_OVERFLOW.getValue() : (o == 1327346 || o == 1343730) && m == ax.K8.a.STATUS_INVALID_PARAMETER.getValue();
            }
            if (i != 15) {
                return false;
            }
        }
        return m == ax.K8.a.STATUS_BUFFER_OVERFLOW.getValue();
    }

    public q c(AbstractC2173d<?, ?> abstractC2173d, r rVar) throws a.b {
        q a2 = a(rVar);
        if (b(abstractC2173d, rVar)) {
            a2.h(rVar);
            return a2;
        }
        a2.i(rVar);
        return a2;
    }
}
