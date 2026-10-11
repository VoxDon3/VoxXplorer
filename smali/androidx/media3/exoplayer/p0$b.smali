.class public final Landroidx/media3/exoplayer/p0$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/media3/exoplayer/p0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field private a:J

.field private b:F

.field private c:J


# direct methods
.method public constructor <init>()V
    .registers 4

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 3
    iput-wide v0, p0, Landroidx/media3/exoplayer/p0$b;->a:J

    const v2, -0x800001

    .line 4
    iput v2, p0, Landroidx/media3/exoplayer/p0$b;->b:F

    .line 5
    iput-wide v0, p0, Landroidx/media3/exoplayer/p0$b;->c:J

    return-void
.end method

.method private constructor <init>(Landroidx/media3/exoplayer/p0;)V
    .registers 4

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    iget-wide v0, p1, Landroidx/media3/exoplayer/p0;->a:J

    iput-wide v0, p0, Landroidx/media3/exoplayer/p0$b;->a:J

    .line 8
    iget v0, p1, Landroidx/media3/exoplayer/p0;->b:F

    iput v0, p0, Landroidx/media3/exoplayer/p0$b;->b:F

    .line 9
    iget-wide v0, p1, Landroidx/media3/exoplayer/p0;->c:J

    iput-wide v0, p0, Landroidx/media3/exoplayer/p0$b;->c:J

    return-void
.end method

.method synthetic constructor <init>(Landroidx/media3/exoplayer/p0;Landroidx/media3/exoplayer/p0$a;)V
    .registers 3

    .line 1
    invoke-direct {p0, p1}, Landroidx/media3/exoplayer/p0$b;-><init>(Landroidx/media3/exoplayer/p0;)V

    return-void
.end method

.method static synthetic a(Landroidx/media3/exoplayer/p0$b;)J
    .registers 3

    .line 1
    iget-wide v0, p0, Landroidx/media3/exoplayer/p0$b;->a:J

    .line 2
    .line 3
    return-wide v0
    .line 4
    .line 5
    .line 6
    .line 7
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
    .line 22
.end method

.method static synthetic b(Landroidx/media3/exoplayer/p0$b;)F
    .registers 1

    .line 1
    iget p0, p0, Landroidx/media3/exoplayer/p0$b;->b:F

    .line 2
    .line 3
    return p0
    .line 4
    .line 5
    .line 6
    .line 7
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
    .line 22
.end method

.method static synthetic c(Landroidx/media3/exoplayer/p0$b;)J
    .registers 3

    .line 1
    iget-wide v0, p0, Landroidx/media3/exoplayer/p0$b;->c:J

    .line 2
    .line 3
    return-wide v0
    .line 4
    .line 5
    .line 6
    .line 7
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
    .line 22
.end method


# virtual methods
.method public d()Landroidx/media3/exoplayer/p0;
    .registers 3

    .line 1
    new-instance v0, Landroidx/media3/exoplayer/p0;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p0, v1}, Landroidx/media3/exoplayer/p0;-><init>(Landroidx/media3/exoplayer/p0$b;Landroidx/media3/exoplayer/p0$a;)V

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

.method public e(J)Landroidx/media3/exoplayer/p0$b;
    .registers 6

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    cmp-long v2, p1, v0

    .line 4
    .line 5
    if-gez v2, :cond_12

    .line 6
    .line 7
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    cmp-long v2, p1, v0

    .line 13
    .line 14
    if-nez v2, :cond_10

    .line 15
    .line 16
    goto :goto_12

    .line 17
    :cond_10
    const/4 v0, 0x0

    .line 18
    goto :goto_13

    .line 19
    :cond_12
    :goto_12
    const/4 v0, 0x1

    .line 20
    :goto_13
    invoke-static {v0}, Lax/S0/a;->a(Z)V

    .line 21
    .line 22
    .line 23
    iput-wide p1, p0, Landroidx/media3/exoplayer/p0$b;->c:J

    .line 24
    .line 25
    return-object p0
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
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
.end method

.method public f(J)Landroidx/media3/exoplayer/p0$b;
    .registers 3

    .line 1
    iput-wide p1, p0, Landroidx/media3/exoplayer/p0$b;->a:J

    .line 2
    .line 3
    return-object p0
    .line 4
    .line 5
    .line 6
    .line 7
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
    .line 22
.end method

.method public g(F)Landroidx/media3/exoplayer/p0$b;
    .registers 3

    .line 1
    const/4 v0, 0x0

    .line 2
    cmpl-float v0, p1, v0

    .line 3
    .line 4
    if-gtz v0, :cond_f

    .line 5
    .line 6
    const v0, -0x800001

    .line 7
    .line 8
    .line 9
    cmpl-float v0, p1, v0

    .line 10
    .line 11
    if-nez v0, :cond_d

    .line 12
    .line 13
    goto :goto_f

    .line 14
    :cond_d
    const/4 v0, 0x0

    .line 15
    goto :goto_10

    .line 16
    :cond_f
    :goto_f
    const/4 v0, 0x1

    .line 17
    :goto_10
    invoke-static {v0}, Lax/S0/a;->a(Z)V

    .line 18
    .line 19
    .line 20
    iput p1, p0, Landroidx/media3/exoplayer/p0$b;->b:F

    .line 21
    .line 22
    return-object p0
.end method
