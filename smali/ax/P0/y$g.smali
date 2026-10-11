.class public final Lax/P0/y$g;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lax/P0/y;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "g"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lax/P0/y$g$a;
    }
.end annotation


# static fields
.field public static final f:Lax/P0/y$g;

.field private static final g:Ljava/lang/String;

.field private static final h:Ljava/lang/String;

.field private static final i:Ljava/lang/String;

.field private static final j:Ljava/lang/String;

.field private static final k:Ljava/lang/String;


# instance fields
.field public final a:J

.field public final b:J

.field public final c:J

.field public final d:F

.field public final e:F


# direct methods
.method static constructor <clinit>()V
    .registers 1

    .line 1
    new-instance v0, Lax/P0/y$g$a;

    .line 2
    .line 3
    invoke-direct {v0}, Lax/P0/y$g$a;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0}, Lax/P0/y$g$a;->f()Lax/P0/y$g;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    sput-object v0, Lax/P0/y$g;->f:Lax/P0/y$g;

    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    invoke-static {v0}, Lax/S0/d0;->G0(I)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    sput-object v0, Lax/P0/y$g;->g:Ljava/lang/String;

    .line 18
    .line 19
    const/4 v0, 0x1

    .line 20
    invoke-static {v0}, Lax/S0/d0;->G0(I)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    sput-object v0, Lax/P0/y$g;->h:Ljava/lang/String;

    .line 25
    .line 26
    const/4 v0, 0x2

    .line 27
    invoke-static {v0}, Lax/S0/d0;->G0(I)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    sput-object v0, Lax/P0/y$g;->i:Ljava/lang/String;

    .line 32
    .line 33
    const/4 v0, 0x3

    .line 34
    invoke-static {v0}, Lax/S0/d0;->G0(I)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    sput-object v0, Lax/P0/y$g;->j:Ljava/lang/String;

    .line 39
    .line 40
    const/4 v0, 0x4

    .line 41
    invoke-static {v0}, Lax/S0/d0;->G0(I)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    sput-object v0, Lax/P0/y$g;->k:Ljava/lang/String;

    .line 46
    .line 47
    return-void
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
.end method

.method public constructor <init>(JJJFF)V
    .registers 9
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 9
    iput-wide p1, p0, Lax/P0/y$g;->a:J

    .line 10
    iput-wide p3, p0, Lax/P0/y$g;->b:J

    .line 11
    iput-wide p5, p0, Lax/P0/y$g;->c:J

    .line 12
    iput p7, p0, Lax/P0/y$g;->d:F

    .line 13
    iput p8, p0, Lax/P0/y$g;->e:F

    return-void
.end method

.method private constructor <init>(Lax/P0/y$g$a;)V
    .registers 11

    .line 2
    invoke-static {p1}, Lax/P0/y$g$a;->a(Lax/P0/y$g$a;)J

    move-result-wide v1

    .line 3
    invoke-static {p1}, Lax/P0/y$g$a;->b(Lax/P0/y$g$a;)J

    move-result-wide v3

    .line 4
    invoke-static {p1}, Lax/P0/y$g$a;->c(Lax/P0/y$g$a;)J

    move-result-wide v5

    .line 5
    invoke-static {p1}, Lax/P0/y$g$a;->d(Lax/P0/y$g$a;)F

    move-result v7

    .line 6
    invoke-static {p1}, Lax/P0/y$g$a;->e(Lax/P0/y$g$a;)F

    move-result v8

    move-object v0, p0

    .line 7
    invoke-direct/range {v0 .. v8}, Lax/P0/y$g;-><init>(JJJFF)V

    return-void
.end method

.method synthetic constructor <init>(Lax/P0/y$g$a;Lax/P0/y$a;)V
    .registers 3

    .line 1
    invoke-direct {p0, p1}, Lax/P0/y$g;-><init>(Lax/P0/y$g$a;)V

    return-void
.end method


# virtual methods
.method public a()Lax/P0/y$g$a;
    .registers 3

    .line 1
    new-instance v0, Lax/P0/y$g$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p0, v1}, Lax/P0/y$g$a;-><init>(Lax/P0/y$g;Lax/P0/y$a;)V

    .line 5
    .line 6
    .line 7
    return-object v0
    .line 8
    .line 9
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

.method public equals(Ljava/lang/Object;)Z
    .registers 9

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_4

    .line 3
    .line 4
    return v0

    .line 5
    :cond_4
    instance-of v1, p1, Lax/P0/y$g;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-nez v1, :cond_a

    .line 9
    .line 10
    return v2

    .line 11
    :cond_a
    check-cast p1, Lax/P0/y$g;

    .line 12
    .line 13
    iget-wide v3, p0, Lax/P0/y$g;->a:J

    .line 14
    .line 15
    iget-wide v5, p1, Lax/P0/y$g;->a:J

    .line 16
    .line 17
    cmp-long v1, v3, v5

    .line 18
    .line 19
    if-nez v1, :cond_35

    .line 20
    .line 21
    iget-wide v3, p0, Lax/P0/y$g;->b:J

    .line 22
    .line 23
    iget-wide v5, p1, Lax/P0/y$g;->b:J

    .line 24
    .line 25
    cmp-long v1, v3, v5

    .line 26
    .line 27
    if-nez v1, :cond_35

    .line 28
    .line 29
    iget-wide v3, p0, Lax/P0/y$g;->c:J

    .line 30
    .line 31
    iget-wide v5, p1, Lax/P0/y$g;->c:J

    .line 32
    .line 33
    cmp-long v1, v3, v5

    .line 34
    .line 35
    if-nez v1, :cond_35

    .line 36
    .line 37
    iget v1, p0, Lax/P0/y$g;->d:F

    .line 38
    .line 39
    iget v3, p1, Lax/P0/y$g;->d:F

    .line 40
    .line 41
    cmpl-float v1, v1, v3

    .line 42
    .line 43
    if-nez v1, :cond_35

    .line 44
    .line 45
    iget v1, p0, Lax/P0/y$g;->e:F

    .line 46
    .line 47
    iget p1, p1, Lax/P0/y$g;->e:F

    .line 48
    .line 49
    cmpl-float p1, v1, p1

    .line 50
    .line 51
    if-nez p1, :cond_35

    .line 52
    .line 53
    return v0

    .line 54
    :cond_35
    return v2
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
.end method

.method public hashCode()I
    .registers 8

    .line 1
    iget-wide v0, p0, Lax/P0/y$g;->a:J

    .line 2
    .line 3
    const/16 v2, 0x20

    .line 4
    .line 5
    ushr-long v3, v0, v2

    .line 6
    .line 7
    xor-long/2addr v0, v3

    .line 8
    long-to-int v1, v0

    .line 9
    mul-int/lit8 v1, v1, 0x1f

    .line 10
    .line 11
    iget-wide v3, p0, Lax/P0/y$g;->b:J

    .line 12
    .line 13
    ushr-long v5, v3, v2

    .line 14
    .line 15
    xor-long/2addr v3, v5

    .line 16
    long-to-int v0, v3

    .line 17
    add-int/2addr v1, v0

    .line 18
    mul-int/lit8 v1, v1, 0x1f

    .line 19
    .line 20
    iget-wide v3, p0, Lax/P0/y$g;->c:J

    .line 21
    .line 22
    ushr-long v5, v3, v2

    .line 23
    .line 24
    xor-long/2addr v3, v5

    .line 25
    long-to-int v0, v3

    .line 26
    add-int/2addr v1, v0

    .line 27
    mul-int/lit8 v1, v1, 0x1f

    .line 28
    .line 29
    iget v0, p0, Lax/P0/y$g;->d:F

    .line 30
    .line 31
    const/4 v2, 0x0

    .line 32
    const/4 v3, 0x0

    .line 33
    cmpl-float v4, v0, v3

    .line 34
    .line 35
    if-eqz v4, :cond_29

    .line 36
    .line 37
    invoke-static {v0}, Ljava/lang/Float;->floatToIntBits(F)I

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    goto :goto_2a

    .line 42
    :cond_29
    const/4 v0, 0x0

    .line 43
    :goto_2a
    add-int/2addr v1, v0

    .line 44
    mul-int/lit8 v1, v1, 0x1f

    .line 45
    .line 46
    iget v0, p0, Lax/P0/y$g;->e:F

    .line 47
    .line 48
    cmpl-float v3, v0, v3

    .line 49
    .line 50
    if-eqz v3, :cond_37

    .line 51
    .line 52
    invoke-static {v0}, Ljava/lang/Float;->floatToIntBits(F)I

    .line 53
    .line 54
    .line 55
    move-result v2

    .line 56
    :cond_37
    add-int/2addr v1, v2

    .line 57
    return v1
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
.end method
