package ax.Q8;

/* loaded from: classes3.dex */
public enum m {
    SMB2_NEGOTIATE(0),
    SMB2_SESSION_SETUP(1),
    SMB2_LOGOFF(2),
    SMB2_TREE_CONNECT(3),
    SMB2_TREE_DISCONNECT(4),
    SMB2_CREATE(5),
    SMB2_CLOSE(6),
    SMB2_FLUSH(7),
    SMB2_READ(8),
    SMB2_WRITE(9),
    SMB2_LOCK(10),
    SMB2_IOCTL(11),
    SMB2_CANCEL(12),
    SMB2_ECHO(13),
    SMB2_QUERY_DIRECTORY(14),
    SMB2_CHANGE_NOTIFY(15),
    SMB2_QUERY_INFO(16),
    SMB2_SET_INFO(17),
    SMB2_OPLOCK_BREAK(18);

    private static final m[] v0 = new m[19];
    private int q;

    static {
        for (m mVar : values()) {
            v0[mVar.h()] = mVar;
        }
    }

    m(int i) {
        this.q = i;
    }

    public static m j(int i) {
        return v0[i];
    }

    public int h() {
        return this.q;
    }
}
