package ax.p7;

import ax.l7.C2474b;
import ax.l7.InterfaceC2480h;
import ax.m7.C2532g;
import ax.m7.C2534i;
import ax.m7.n;
import java.util.List;
import java.util.Map;

/* renamed from: ax.p7.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2779c extends C2474b {

    @n
    private Map<String, String> appProperties;

    @n
    private a capabilities;

    @n
    private b contentHints;

    @n
    private List<C2778b> contentRestrictions;

    @n
    private Boolean copyRequiresWriterPermission;

    @n
    private C2534i createdTime;

    @n
    private String description;

    @n
    private String driveId;

    @n
    private Boolean explicitlyTrashed;

    @n
    private Map<String, String> exportLinks;

    @n
    private String fileExtension;

    @n
    private String folderColorRgb;

    @n
    private String fullFileExtension;

    @n
    private Boolean hasAugmentedPermissions;

    @n
    private Boolean hasThumbnail;

    @n
    private String headRevisionId;

    @n
    private String iconLink;

    @n
    private String id;

    @n
    private C0419c imageMediaMetadata;

    @n
    private Boolean isAppAuthorized;

    @n
    private String kind;

    @n
    private d labelInfo;

    @n
    private C2781e lastModifyingUser;

    @n
    private e linkShareMetadata;

    @n
    private String md5Checksum;

    @n
    private String mimeType;

    @n
    private Boolean modifiedByMe;

    @n
    private C2534i modifiedByMeTime;

    @n
    private C2534i modifiedTime;

    @n
    private String name;

    @n
    private String originalFilename;

    @n
    private Boolean ownedByMe;

    @n
    private List<C2781e> owners;

    @n
    private List<String> parents;

    @n
    private List<String> permissionIds;

    @n
    private List<Object> permissions;

    @n
    private Map<String, String> properties;

    @InterfaceC2480h
    @n
    private Long quotaBytesUsed;

    @n
    private String resourceKey;

    @n
    private Boolean shared;

    @n
    private C2534i sharedWithMeTime;

    @n
    private C2781e sharingUser;

    @n
    private f shortcutDetails;

    @InterfaceC2480h
    @n
    private Long size;

    @n
    private List<String> spaces;

    @n
    private Boolean starred;

    @n
    private String teamDriveId;

    @n
    private String thumbnailLink;

    @InterfaceC2480h
    @n
    private Long thumbnailVersion;

    @n
    private Boolean trashed;

    @n
    private C2534i trashedTime;

    @n
    private C2781e trashingUser;

    @InterfaceC2480h
    @n
    private Long version;

    @n
    private g videoMediaMetadata;

    @n
    private Boolean viewedByMe;

    @n
    private C2534i viewedByMeTime;

    @n
    private Boolean viewersCanCopyContent;

    @n
    private String webContentLink;

    @n
    private String webViewLink;

    @n
    private Boolean writersCanShare;

    /* renamed from: ax.p7.c$a */
    public static final class a extends C2474b {

        @n
        private Boolean canAcceptOwnership;

        @n
        private Boolean canAddChildren;

        @n
        private Boolean canAddFolderFromAnotherDrive;

        @n
        private Boolean canAddMyDriveParent;

        @n
        private Boolean canChangeCopyRequiresWriterPermission;

        @n
        private Boolean canChangeSecurityUpdateEnabled;

        @n
        private Boolean canChangeViewersCanCopyContent;

        @n
        private Boolean canComment;

        @n
        private Boolean canCopy;

        @n
        private Boolean canDelete;

        @n
        private Boolean canDeleteChildren;

        @n
        private Boolean canDownload;

        @n
        private Boolean canEdit;

        @n
        private Boolean canListChildren;

        @n
        private Boolean canModifyContent;

        @n
        private Boolean canModifyContentRestriction;

        @n
        private Boolean canModifyLabels;

        @n
        private Boolean canMoveChildrenOutOfDrive;

        @n
        private Boolean canMoveChildrenOutOfTeamDrive;

        @n
        private Boolean canMoveChildrenWithinDrive;

        @n
        private Boolean canMoveChildrenWithinTeamDrive;

        @n
        private Boolean canMoveItemIntoTeamDrive;

        @n
        private Boolean canMoveItemOutOfDrive;

        @n
        private Boolean canMoveItemOutOfTeamDrive;

        @n
        private Boolean canMoveItemWithinDrive;

        @n
        private Boolean canMoveItemWithinTeamDrive;

        @n
        private Boolean canMoveTeamDriveItem;

        @n
        private Boolean canReadDrive;

        @n
        private Boolean canReadLabels;

        @n
        private Boolean canReadRevisions;

        @n
        private Boolean canReadTeamDrive;

        @n
        private Boolean canRemoveChildren;

        @n
        private Boolean canRemoveMyDriveParent;

        @n
        private Boolean canRename;

        @n
        private Boolean canShare;

        @n
        private Boolean canTrash;

        @n
        private Boolean canTrashChildren;

        @n
        private Boolean canUntrash;

        @Override // ax.l7.C2474b
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public a clone() {
            return (a) super.clone();
        }

        public Boolean n() {
            return this.canDownload;
        }

        public Boolean o() {
            return this.canEdit;
        }

        @Override // ax.l7.C2474b
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public a f(String str, Object obj) {
            return (a) super.f(str, obj);
        }
    }

    /* renamed from: ax.p7.c$b */
    public static final class b extends C2474b {

        @n
        private String indexableText;

        @n
        private a thumbnail;

        /* renamed from: ax.p7.c$b$a */
        public static final class a extends C2474b {

            @n
            private String image;

            @n
            private String mimeType;

            @Override // ax.l7.C2474b
            /* renamed from: m, reason: merged with bridge method [inline-methods] */
            public a clone() {
                return (a) super.clone();
            }

            @Override // ax.l7.C2474b
            /* renamed from: n, reason: merged with bridge method [inline-methods] */
            public a f(String str, Object obj) {
                return (a) super.f(str, obj);
            }
        }

        @Override // ax.l7.C2474b
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public b clone() {
            return (b) super.clone();
        }

        @Override // ax.l7.C2474b
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public b f(String str, Object obj) {
            return (b) super.f(str, obj);
        }
    }

    /* renamed from: ax.p7.c$c, reason: collision with other inner class name */
    public static final class C0419c extends C2474b {

        @n
        private Float aperture;

        @n
        private String cameraMake;

        @n
        private String cameraModel;

        @n
        private String colorSpace;

        @n
        private Float exposureBias;

        @n
        private String exposureMode;

        @n
        private Float exposureTime;

        @n
        private Boolean flashUsed;

        @n
        private Float focalLength;

        @n
        private Integer height;

        @n
        private Integer isoSpeed;

        @n
        private String lens;

        @n
        private a location;

        @n
        private Float maxApertureValue;

        @n
        private String meteringMode;

        @n
        private Integer rotation;

        @n
        private String sensor;

        @n
        private Integer subjectDistance;

        @n
        private String time;

        @n
        private String whiteBalance;

        @n
        private Integer width;

        /* renamed from: ax.p7.c$c$a */
        public static final class a extends C2474b {

            @n
            private Double altitude;

            @n
            private Double latitude;

            @n
            private Double longitude;

            @Override // ax.l7.C2474b
            /* renamed from: m, reason: merged with bridge method [inline-methods] */
            public a clone() {
                return (a) super.clone();
            }

            @Override // ax.l7.C2474b
            /* renamed from: n, reason: merged with bridge method [inline-methods] */
            public a f(String str, Object obj) {
                return (a) super.f(str, obj);
            }
        }

        @Override // ax.l7.C2474b
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public C0419c clone() {
            return (C0419c) super.clone();
        }

        @Override // ax.l7.C2474b
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public C0419c f(String str, Object obj) {
            return (C0419c) super.f(str, obj);
        }
    }

    /* renamed from: ax.p7.c$d */
    public static final class d extends C2474b {

        @n
        private List<Object> labels;

        @Override // ax.l7.C2474b
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public d clone() {
            return (d) super.clone();
        }

        @Override // ax.l7.C2474b
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public d f(String str, Object obj) {
            return (d) super.f(str, obj);
        }
    }

    /* renamed from: ax.p7.c$e */
    public static final class e extends C2474b {

        @n
        private Boolean securityUpdateEligible;

        @n
        private Boolean securityUpdateEnabled;

        @Override // ax.l7.C2474b
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public e clone() {
            return (e) super.clone();
        }

        @Override // ax.l7.C2474b
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public e f(String str, Object obj) {
            return (e) super.f(str, obj);
        }
    }

    /* renamed from: ax.p7.c$f */
    public static final class f extends C2474b {

        @n
        private String targetId;

        @n
        private String targetMimeType;

        @n
        private String targetResourceKey;

        @Override // ax.l7.C2474b
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public f clone() {
            return (f) super.clone();
        }

        public String n() {
            return this.targetId;
        }

        public String o() {
            return this.targetMimeType;
        }

        @Override // ax.l7.C2474b
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public f f(String str, Object obj) {
            return (f) super.f(str, obj);
        }
    }

    /* renamed from: ax.p7.c$g */
    public static final class g extends C2474b {

        @InterfaceC2480h
        @n
        private Long durationMillis;

        @n
        private Integer height;

        @n
        private Integer width;

        @Override // ax.l7.C2474b
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public g clone() {
            return (g) super.clone();
        }

        @Override // ax.l7.C2474b
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public g f(String str, Object obj) {
            return (g) super.f(str, obj);
        }
    }

    static {
        C2532g.j(C2778b.class);
    }

    public Boolean B() {
        return this.trashed;
    }

    public String C() {
        return this.webViewLink;
    }

    @Override // ax.l7.C2474b
    /* renamed from: D, reason: merged with bridge method [inline-methods] */
    public C2779c f(String str, Object obj) {
        return (C2779c) super.f(str, obj);
    }

    public C2779c E(String str) {
        this.mimeType = str;
        return this;
    }

    public C2779c F(C2534i c2534i) {
        this.modifiedTime = c2534i;
        return this;
    }

    public C2779c G(String str) {
        this.name = str;
        return this;
    }

    public C2779c H(List<String> list) {
        this.parents = list;
        return this;
    }

    public C2779c I(Boolean bool) {
        this.trashed = bool;
        return this;
    }

    @Override // ax.l7.C2474b
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public C2779c clone() {
        return (C2779c) super.clone();
    }

    public a n() {
        return this.capabilities;
    }

    public C2534i o() {
        return this.createdTime;
    }

    public String r() {
        return this.id;
    }

    public String s() {
        return this.mimeType;
    }

    public C2534i t() {
        return this.modifiedTime;
    }

    public String v() {
        return this.name;
    }

    public List<String> w() {
        return this.parents;
    }

    public f x() {
        return this.shortcutDetails;
    }

    public Long y() {
        return this.size;
    }

    public String z() {
        return this.thumbnailLink;
    }
}
