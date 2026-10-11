package ax.U8;

import ax.Y8.c;
import ax.Z8.a;

/* loaded from: classes3.dex */
public class e {

    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[ax.U8.a.values().length];
            a = iArr;
            try {
                iArr[ax.U8.a.MsvAvEOL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[ax.U8.a.MsvAvNbComputerName.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[ax.U8.a.MsvAvNbDomainName.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[ax.U8.a.MsvAvDnsComputerName.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[ax.U8.a.MsvAvDnsDomainName.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[ax.U8.a.MsvAvDnsTreeName.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[ax.U8.a.MsvAvTargetName.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[ax.U8.a.MsvAvFlags.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[ax.U8.a.MsvAvTimestamp.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                a[ax.U8.a.MsvAvSingleHost.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                a[ax.U8.a.MsvAvChannelBindings.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    public static b<?> a(ax.Z8.a<?> aVar) throws a.b {
        int J = aVar.J();
        ax.U8.a aVar2 = (ax.U8.a) c.a.f(J, ax.U8.a.class, null);
        if (aVar2 == null) {
            throw new IllegalStateException("Encountered unknown AvId: " + J);
        }
        switch (a.a[aVar2.ordinal()]) {
            case 1:
                return new d().d(aVar);
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                return new h(aVar2).d(aVar);
            case 8:
                return new f().d(aVar);
            case 9:
                return new i().d(aVar);
            case 10:
                return new g().d(aVar);
            case 11:
                return new c().d(aVar);
            default:
                throw new IllegalStateException("Encountered unhandled AvId: " + aVar2);
        }
    }
}
