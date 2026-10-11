.class public final Lax/P0/y$g$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lax/P0/y$g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private a:J

.field private b:J

.field private c:J

.field private d:F

.field private e:F


# direct methods
.method public constructor <init>()V
    .registers 3

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 3
    iput-wide v0, p0, Lax/P0/y$g$a;->a:J

    .line 4
    iput-wide v0, p0, Lax/P0/y$g$a;->b:J

    .line 5
    iput-wide v0, p0, Lax/P0/y$g$a;->c:J

    const v0, -0x800001

    .line 6
    iput v0, p0, Lax/P0/y$g$a;->d:F

    .line 7
    iput v0, p0, Lax/P0/y$g$a;->e:F

    return-void
.end method

.method private constructor <init>(Lax/P0/y$g;)V
    .registers 4

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 9
    iget-wide v0, p1, Lax/P0/y$g;->a:J

    iput-wide v0, p0, Lax/P0/y$g$a;->a:J

    .line 10
    iget-wide v0, p1, Lax/P0/y$g;->b:J

    iput-wide v0, p0, Lax/P0/y$g$a;->b:J

    .line 11
    iget-wide v0, p1, Lax/P0/y$g;->c:J

    iput-wide v0, p0, Lax/P0/y$g$a;->c:J

    .line 12
    iget v0, p1, Lax/P0/y$g;->d:F

    iput v0, p0, Lax/P0/y$g$a;->d:F

    .line 13
    iget p1, p1, Lax/P0/y$g;->e:F

    iput p1, p0, Lax/P0/y$g$a;->e:F

    return-void
.end method

.method synthetic constructor <init>(Lax/P0/y$g;Lax/P0/y$a;)V
    .registers 3

    .line 1
    invoke-direct {p0, p1}, Lax/P0/y$g$a;-><init>(Lax/P0/y$g;)V

    return-void
.end method

.method static synthetic a(Lax/P0/y$g$a;)J
    .registers 3

    .line 1
    iget-wide v0, p0, Lax/P0/y$g$a;->a:J

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

.method static synthetic b(Lax/P0/y$g$a;)J
    .registers 3

    .line 1
    iget-wide v0, p0, Lax/P0/y$g$a;->b:J

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

.method static synthetic c(Lax/P0/y$g$a;)J
    .registers 3

    .line 1
    iget-wide v0, p0, Lax/P0/y$g$a;->c:J

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

.method static synthetic d(Lax/P0/y$g$a;)F
    .registers 1

    .line 1
    iget p0, p0, Lax/P0/y$g$a;->d:F

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

.method static synthetic e(Lax/P0/y$g$a;)F
    .registers 1

    .line 1
    iget p0, p0, Lax/P0/y$g$a;->e:F

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


# virtual methods
.method public f()Lax/P0/y$g;
    .registers 3

    .line 1
    new-instance v0, Lax/P0/y$g;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p0, v1}, Lax/P0/y$g;-><init>(Lax/P0/y$g$a;Lax/P0/y$a;)V

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

.method public g(J)Lax/P0/y$g$a;
    .registers 3

    .line 1
    iput-wide p1, p0, Lax/P0/y$g$a;->c:J

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

.method public h(F)Lax/P0/y$g$a;
    .registers 2

    .line 1
    iput p1, p0, Lax/P0/y$g$a;->e:F

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

.method public i(J)Lax/P0/y$g$a;
    .registers 3

    .line 1
    iput-wide p1, p0, Lax/P0/y$g$a;->b:J

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

.method public j(F)Lax/P0/y$g$a;
    .registers 2

    .line 1
    iput p1, p0, Lax/P0/y$g$a;->d:F

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

.method public k(J)Lax/P0/y$g$a;
    .registers 3

    .line 1
    iput-wide p1, p0, Lax/P0/y$g$a;->a:J

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
