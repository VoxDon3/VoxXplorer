.class public Lax/c3/l;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final g:[Ljava/lang/String;


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Ljava/lang/String;

.field public final c:Ljava/lang/String;

.field public final d:J

.field public final e:J

.field public final f:I


# direct methods
.method static constructor <clinit>()V
    .registers 6

    .line 1
    const-string v4, "_size"

    .line 2
    .line 3
    const-string v5, "flags"

    .line 4
    .line 5
    const-string v0, "document_id"

    .line 6
    .line 7
    const-string v1, "_display_name"

    .line 8
    .line 9
    const-string v2, "mime_type"

    .line 10
    .line 11
    const-string v3, "last_modified"

    .line 12
    .line 13
    filled-new-array/range {v0 .. v5}, [Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    sput-object v0, Lax/c3/l;->g:[Ljava/lang/String;

    .line 18
    .line 19
    return-void
    .line 20
    .line 21
.end method

.method public constructor <init>(Landroid/database/Cursor;)V
    .registers 7

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 2
    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lax/c3/l;->a:Ljava/lang/String;

    const/4 v1, 0x1

    .line 3
    invoke-interface {p1, v1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lax/c3/l;->b:Ljava/lang/String;

    const/4 v1, 0x2

    .line 4
    invoke-interface {p1, v1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lax/c3/l;->c:Ljava/lang/String;

    const/4 v1, 0x3

    .line 5
    invoke-interface {p1, v1}, Landroid/database/Cursor;->isNull(I)Z

    move-result v2

    const-wide/16 v3, 0x0

    if-eqz v2, :cond_24

    .line 6
    iput-wide v3, p0, Lax/c3/l;->d:J

    goto :goto_2a

    .line 7
    :cond_24
    invoke-interface {p1, v1}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v1

    iput-wide v1, p0, Lax/c3/l;->d:J

    :goto_2a
    const/4 v1, 0x4

    .line 8
    invoke-interface {p1, v1}, Landroid/database/Cursor;->isNull(I)Z

    move-result v2

    if-eqz v2, :cond_34

    .line 9
    iput-wide v3, p0, Lax/c3/l;->e:J

    goto :goto_3a

    .line 10
    :cond_34
    invoke-interface {p1, v1}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v1

    iput-wide v1, p0, Lax/c3/l;->e:J

    :goto_3a
    const/4 v1, 0x5

    .line 11
    invoke-interface {p1, v1}, Landroid/database/Cursor;->isNull(I)Z

    move-result v2

    if-eqz v2, :cond_44

    .line 12
    iput v0, p0, Lax/c3/l;->f:I

    return-void

    .line 13
    :cond_44
    invoke-interface {p1, v1}, Landroid/database/Cursor;->getInt(I)I

    move-result p1

    iput p1, p0, Lax/c3/l;->f:I

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .registers 3

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 15
    iput-object p1, p0, Lax/c3/l;->a:Ljava/lang/String;

    .line 16
    iput-object p2, p0, Lax/c3/l;->b:Ljava/lang/String;

    .line 17
    const-string p1, "vnd.android.document/directory"

    iput-object p1, p0, Lax/c3/l;->c:Ljava/lang/String;

    const-wide/16 p1, 0x0

    .line 18
    iput-wide p1, p0, Lax/c3/l;->d:J

    .line 19
    iput-wide p1, p0, Lax/c3/l;->e:J

    const/4 p1, 0x0

    .line 20
    iput p1, p0, Lax/c3/l;->f:I

    return-void
.end method

.method static c(Ljava/lang/String;I)Z
    .registers 5

    .line 1
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_8

    .line 7
    .line 8
    return v1

    .line 9
    :cond_8
    and-int/lit8 v0, p1, 0x4

    .line 10
    .line 11
    const/4 v2, 0x1

    .line 12
    if-eqz v0, :cond_e

    .line 13
    .line 14
    return v2

    .line 15
    :cond_e
    const-string v0, "vnd.android.document/directory"

    .line 16
    .line 17
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-eqz v0, :cond_1b

    .line 22
    .line 23
    and-int/lit8 v0, p1, 0x8

    .line 24
    .line 25
    if-eqz v0, :cond_1b

    .line 26
    .line 27
    return v2

    .line 28
    :cond_1b
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 29
    .line 30
    .line 31
    move-result p0

    .line 32
    if-nez p0, :cond_26

    .line 33
    .line 34
    and-int/lit8 p0, p1, 0x2

    .line 35
    .line 36
    if-eqz p0, :cond_26

    .line 37
    .line 38
    return v2

    .line 39
    :cond_26
    return v1
    .line 40
    .line 41
.end method


# virtual methods
.method public a()Z
    .registers 2

    .line 1
    iget-object v0, p0, Lax/c3/l;->c:Ljava/lang/String;

    .line 2
    .line 3
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    xor-int/lit8 v0, v0, 0x1

    .line 8
    .line 9
    return v0
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public b()Z
    .registers 3

    .line 1
    iget-object v0, p0, Lax/c3/l;->c:Ljava/lang/String;

    .line 2
    .line 3
    iget v1, p0, Lax/c3/l;->f:I

    .line 4
    .line 5
    invoke-static {v0, v1}, Lax/c3/l;->c(Ljava/lang/String;I)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public d()Z
    .registers 3

    .line 1
    const-string v0, "vnd.android.document/directory"

    .line 2
    .line 3
    iget-object v1, p0, Lax/c3/l;->c:Ljava/lang/String;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method
