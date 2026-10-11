.class public final Lax/i1/f$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lax/i1/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field private final a:Lax/i1/F;

.field private b:J

.field private c:J

.field private d:Z

.field private e:Z

.field private f:Z

.field private g:Z

.field private h:Z


# direct methods
.method public constructor <init>(Lax/i1/F;)V
    .registers 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-static {p1}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    check-cast p1, Lax/i1/F;

    .line 9
    .line 10
    iput-object p1, p0, Lax/i1/f$b;->a:Lax/i1/F;

    .line 11
    .line 12
    const/4 p1, 0x1

    .line 13
    iput-boolean p1, p0, Lax/i1/f$b;->d:Z

    .line 14
    .line 15
    const-wide/high16 v0, -0x8000000000000000L

    .line 16
    .line 17
    iput-wide v0, p0, Lax/i1/f$b;->c:J

    .line 18
    .line 19
    return-void
    .line 20
    .line 21
    .line 22
.end method

.method static synthetic a(Lax/i1/f$b;)Lax/i1/F;
    .registers 1

    .line 1
    iget-object p0, p0, Lax/i1/f$b;->a:Lax/i1/F;

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

.method static synthetic b(Lax/i1/f$b;)J
    .registers 3

    .line 1
    iget-wide v0, p0, Lax/i1/f$b;->b:J

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

.method static synthetic c(Lax/i1/f$b;)J
    .registers 3

    .line 1
    iget-wide v0, p0, Lax/i1/f$b;->c:J

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

.method static synthetic d(Lax/i1/f$b;)Z
    .registers 1

    .line 1
    iget-boolean p0, p0, Lax/i1/f$b;->d:Z

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

.method static synthetic e(Lax/i1/f$b;)Z
    .registers 1

    .line 1
    iget-boolean p0, p0, Lax/i1/f$b;->e:Z

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

.method static synthetic f(Lax/i1/f$b;)Z
    .registers 1

    .line 1
    iget-boolean p0, p0, Lax/i1/f$b;->f:Z

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

.method static synthetic g(Lax/i1/f$b;)Z
    .registers 1

    .line 1
    iget-boolean p0, p0, Lax/i1/f$b;->g:Z

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
.method public h()Lax/i1/f;
    .registers 3

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lax/i1/f$b;->h:Z

    .line 3
    .line 4
    new-instance v0, Lax/i1/f;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-direct {v0, p0, v1}, Lax/i1/f;-><init>(Lax/i1/f$b;Lax/i1/f$a;)V

    .line 8
    .line 9
    .line 10
    return-object v0
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

.method public i(Z)Lax/i1/f$b;
    .registers 3

    .line 1
    iget-boolean v0, p0, Lax/i1/f$b;->h:Z

    .line 2
    .line 3
    xor-int/lit8 v0, v0, 0x1

    .line 4
    .line 5
    invoke-static {v0}, Lax/S0/a;->g(Z)V

    .line 6
    .line 7
    .line 8
    iput-boolean p1, p0, Lax/i1/f$b;->e:Z

    .line 9
    .line 10
    return-object p0
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

.method public j(Z)Lax/i1/f$b;
    .registers 3

    .line 1
    iget-boolean v0, p0, Lax/i1/f$b;->h:Z

    .line 2
    .line 3
    xor-int/lit8 v0, v0, 0x1

    .line 4
    .line 5
    invoke-static {v0}, Lax/S0/a;->g(Z)V

    .line 6
    .line 7
    .line 8
    iput-boolean p1, p0, Lax/i1/f$b;->g:Z

    .line 9
    .line 10
    return-object p0
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

.method public k(Z)Lax/i1/f$b;
    .registers 3

    .line 1
    iget-boolean v0, p0, Lax/i1/f$b;->h:Z

    .line 2
    .line 3
    xor-int/lit8 v0, v0, 0x1

    .line 4
    .line 5
    invoke-static {v0}, Lax/S0/a;->g(Z)V

    .line 6
    .line 7
    .line 8
    iput-boolean p1, p0, Lax/i1/f$b;->d:Z

    .line 9
    .line 10
    return-object p0
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

.method public l(J)Lax/i1/f$b;
    .registers 4

    .line 1
    iget-boolean v0, p0, Lax/i1/f$b;->h:Z

    .line 2
    .line 3
    xor-int/lit8 v0, v0, 0x1

    .line 4
    .line 5
    invoke-static {v0}, Lax/S0/a;->g(Z)V

    .line 6
    .line 7
    .line 8
    iput-wide p1, p0, Lax/i1/f$b;->c:J

    .line 9
    .line 10
    return-object p0
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

.method public m(Z)Lax/i1/f$b;
    .registers 3

    .line 1
    iget-boolean v0, p0, Lax/i1/f$b;->h:Z

    .line 2
    .line 3
    xor-int/lit8 v0, v0, 0x1

    .line 4
    .line 5
    invoke-static {v0}, Lax/S0/a;->g(Z)V

    .line 6
    .line 7
    .line 8
    iput-boolean p1, p0, Lax/i1/f$b;->f:Z

    .line 9
    .line 10
    return-object p0
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

.method public n(J)Lax/i1/f$b;
    .registers 7

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    const/4 v2, 0x1

    .line 4
    cmp-long v3, p1, v0

    .line 5
    .line 6
    if-ltz v3, :cond_9

    .line 7
    .line 8
    const/4 v0, 0x1

    .line 9
    goto :goto_a

    .line 10
    :cond_9
    const/4 v0, 0x0

    .line 11
    :goto_a
    invoke-static {v0}, Lax/S0/a;->a(Z)V

    .line 12
    .line 13
    .line 14
    iget-boolean v0, p0, Lax/i1/f$b;->h:Z

    .line 15
    .line 16
    xor-int/2addr v0, v2

    .line 17
    invoke-static {v0}, Lax/S0/a;->g(Z)V

    .line 18
    .line 19
    .line 20
    iput-wide p1, p0, Lax/i1/f$b;->b:J

    .line 21
    .line 22
    return-object p0
.end method
