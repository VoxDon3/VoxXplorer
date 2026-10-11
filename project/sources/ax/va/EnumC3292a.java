package ax.va;

import java.util.HashMap;
import java.util.Map;

/* renamed from: ax.va.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public enum EnumC3292a {
    NetrConnectionEnum(8),
    NetrFileEnum(9),
    NetrFileGetInfo(10),
    NetrFileClose(11),
    NetrSessionEnum(12),
    NetrSessionDel(13),
    NetrShareAdd(14),
    NetrShareEnum(15),
    NetrShareEnumSticky(36),
    NetrShareGetInfo(16),
    NetrShareSetInfo(17),
    NetrShareDel(18),
    NetrShareDelSticky(19),
    NetrShareDelStart(37),
    NetrShareDelCommit(38),
    NetrShareCheck(20),
    NetrServerGetInfo(21),
    NetrServerSetInfo(22),
    NetrServerDiskEnum(23),
    NetrServerStatisticsGet(24),
    NetrRemoteTOD(28),
    NetrServerTransportAdd(25),
    NetrServerTransportAddEx(41),
    NetrServerTransportEnum(26),
    NetrServerTransportDel(27),
    NetrServerTransportDelEx(53),
    NetrpGetFileSecurity(39),
    NetrpSetFileSecurity(40),
    NetprPathType(30),
    NetprPathCanonicalize(31),
    NetprPathCompare(32),
    NetprNameValidate(33),
    NetprNameCanonicalize(34),
    NetprNameCompare(35),
    NetrDfsGetVersion(43),
    NetrDfsCreateLocalPartition(44),
    NetrDfsDeleteLocalPartition(45),
    NetrDfsSetLocalVolumeState(46),
    NetrDfsCreateExitPoint(48),
    NetrDfsModifyPrefix(50),
    NetrDfsDeleteExitPoint(49),
    NetrDfsFixLocalVolume(51),
    NetrDfsManagerReportSiteInfo(52),
    NetrServerAliasAdd(54),
    NetrServerAliasEnum(55),
    NetrServerAliasDel(56),
    NetrShareDelEx(57);

    private static final Map<Short, EnumC3292a> X0 = new HashMap();
    private final short q;

    static {
        for (EnumC3292a enumC3292a : values()) {
            X0.put(Short.valueOf(enumC3292a.h()), enumC3292a);
        }
    }

    EnumC3292a(int i) {
        this.q = (short) i;
    }

    public short h() {
        return this.q;
    }
}
