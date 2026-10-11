package ax.p7;

import ax.l7.C2474b;
import ax.l7.InterfaceC2480h;
import ax.m7.C2532g;
import ax.m7.n;
import java.util.List;
import java.util.Map;

/* renamed from: ax.p7.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2777a extends C2474b {

    @n
    private Boolean appInstalled;

    @n
    private Boolean canCreateDrives;

    @n
    private Boolean canCreateTeamDrives;

    @n
    private List<C0418a> driveThemes;

    @n
    private Map<String, List<String>> exportFormats;

    @n
    private List<String> folderColorPalette;

    @n
    private Map<String, List<String>> importFormats;

    @n
    private String kind;

    @InterfaceC2480h
    @n
    private Map<String, Long> maxImportSizes;

    @InterfaceC2480h
    @n
    private Long maxUploadSize;

    @n
    private b storageQuota;

    @n
    private List<c> teamDriveThemes;

    @n
    private C2781e user;

    /* renamed from: ax.p7.a$a, reason: collision with other inner class name */
    public static final class C0418a extends C2474b {

        @n
        private String backgroundImageLink;

        @n
        private String colorRgb;

        @n
        private String id;

        @Override // ax.l7.C2474b
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public C0418a clone() {
            return (C0418a) super.clone();
        }

        @Override // ax.l7.C2474b
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public C0418a f(String str, Object obj) {
            return (C0418a) super.f(str, obj);
        }
    }

    /* renamed from: ax.p7.a$b */
    public static final class b extends C2474b {

        @InterfaceC2480h
        @n
        private Long limit;

        @InterfaceC2480h
        @n
        private Long usage;

        @InterfaceC2480h
        @n
        private Long usageInDrive;

        @InterfaceC2480h
        @n
        private Long usageInDriveTrash;

        @Override // ax.l7.C2474b
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public b clone() {
            return (b) super.clone();
        }

        public Long n() {
            return this.limit;
        }

        public Long o() {
            return this.usage;
        }

        @Override // ax.l7.C2474b
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public b f(String str, Object obj) {
            return (b) super.f(str, obj);
        }
    }

    /* renamed from: ax.p7.a$c */
    public static final class c extends C2474b {

        @n
        private String backgroundImageLink;

        @n
        private String colorRgb;

        @n
        private String id;

        @Override // ax.l7.C2474b
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public c clone() {
            return (c) super.clone();
        }

        @Override // ax.l7.C2474b
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public c f(String str, Object obj) {
            return (c) super.f(str, obj);
        }
    }

    static {
        C2532g.j(C0418a.class);
        C2532g.j(c.class);
    }

    @Override // ax.l7.C2474b
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public C2777a clone() {
        return (C2777a) super.clone();
    }

    public b n() {
        return this.storageQuota;
    }

    public C2781e o() {
        return this.user;
    }

    @Override // ax.l7.C2474b
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public C2777a f(String str, Object obj) {
        return (C2777a) super.f(str, obj);
    }
}
