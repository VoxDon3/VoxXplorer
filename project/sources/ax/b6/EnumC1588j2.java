package ax.b6;

/* renamed from: ax.b6.j2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public enum EnumC1588j2 implements InterfaceC1640p4 {
    AT_TRACKING_MANAGER_AUTHORIZATION_STATUS_UNKNOWN(0),
    AT_TRACKING_MANAGER_AUTHORIZATION_STATUS_RESTRICTED(1),
    AT_TRACKING_MANAGER_AUTHORIZATION_STATUS_DENIED(2),
    AT_TRACKING_MANAGER_AUTHORIZATION_STATUS_AUTHORIZED(3),
    AT_TRACKING_MANAGER_AUTHORIZATION_STATUS_NOT_DETERMINED(4),
    AT_TRACKING_MANAGER_AUTHORIZATION_STATUS_NOT_CONFIGURED(5);

    private final int q;

    EnumC1588j2(int i) {
        this.q = i;
    }

    public static EnumC1588j2 d(int i) {
        if (i == 0) {
            return AT_TRACKING_MANAGER_AUTHORIZATION_STATUS_UNKNOWN;
        }
        if (i == 1) {
            return AT_TRACKING_MANAGER_AUTHORIZATION_STATUS_RESTRICTED;
        }
        if (i == 2) {
            return AT_TRACKING_MANAGER_AUTHORIZATION_STATUS_DENIED;
        }
        if (i == 3) {
            return AT_TRACKING_MANAGER_AUTHORIZATION_STATUS_AUTHORIZED;
        }
        if (i == 4) {
            return AT_TRACKING_MANAGER_AUTHORIZATION_STATUS_NOT_DETERMINED;
        }
        if (i != 5) {
            return null;
        }
        return AT_TRACKING_MANAGER_AUTHORIZATION_STATUS_NOT_CONFIGURED;
    }

    public static InterfaceC1632o4 h() {
        return C1606l2.a;
    }

    @Override // ax.b6.InterfaceC1640p4
    public final int a() {
        return this.q;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "<" + EnumC1588j2.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.q + " name=" + name() + '>';
    }
}
