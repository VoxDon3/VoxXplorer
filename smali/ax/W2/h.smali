.class public abstract Lax/W2/h;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lax/W2/h$c;,
        Lax/W2/h$a;,
        Lax/W2/h$b;
    }
.end annotation


# instance fields
.field private a:Lax/W2/h$a;

.field private b:Lax/W2/h$c;

.field private c:J


# direct methods
.method public constructor <init>()V
    .registers 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Lax/W2/h$c;->q:Lax/W2/h$c;

    .line 5
    .line 6
    iput-object v0, p0, Lax/W2/h;->b:Lax/W2/h$c;

    .line 7
    .line 8
    invoke-direct {p0}, Lax/W2/h;->h()V

    .line 9
    .line 10
    .line 11
    return-void
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

.method private h()V
    .registers 3

    .line 1
    invoke-static {p0}, Lax/W2/i;->b(Lax/W2/h;)J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    iput-wide v0, p0, Lax/W2/h;->c:J

    .line 6
    .line 7
    return-void
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


# virtual methods
.method public a()Lax/W2/j;
    .registers 4

    .line 1
    invoke-virtual {p0}, Lax/W2/h;->b()Lax/W2/j;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0}, Lax/W2/h;->e()J

    .line 6
    .line 7
    .line 8
    move-result-wide v1

    .line 9
    invoke-virtual {v0, v1, v2}, Lax/W2/j;->o0(J)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0}, Lax/W2/h;->d()V

    .line 13
    .line 14
    .line 15
    return-object v0
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method protected abstract b()Lax/W2/j;
.end method

.method protected c()Z
    .registers 2

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
    .line 3
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
.end method

.method public d()V
    .registers 2

    .line 1
    sget-object v0, Lax/W2/h$c;->d0:Lax/W2/h$c;

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lax/W2/h;->j(Lax/W2/h$c;)V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    iput-object v0, p0, Lax/W2/h;->a:Lax/W2/h$a;

    .line 8
    .line 9
    invoke-virtual {p0}, Lax/W2/h;->c()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_11

    .line 14
    .line 15
    invoke-direct {p0}, Lax/W2/h;->h()V

    .line 16
    .line 17
    .line 18
    :cond_11
    return-void
    .line 19
    .line 20
    .line 21
.end method

.method public e()J
    .registers 3

    .line 1
    iget-wide v0, p0, Lax/W2/h;->c:J

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
.end method

.method public f()Lax/W2/h$a;
    .registers 2

    .line 1
    iget-object v0, p0, Lax/W2/h;->a:Lax/W2/h$a;

    .line 2
    .line 3
    return-object v0
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
.end method

.method public g()Lax/W2/h$c;
    .registers 2

    .line 1
    iget-object v0, p0, Lax/W2/h;->b:Lax/W2/h$c;

    .line 2
    .line 3
    return-object v0
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
.end method

.method public i(Lax/W2/h$a;)V
    .registers 2

    .line 1
    iput-object p1, p0, Lax/W2/h;->a:Lax/W2/h$a;

    .line 2
    .line 3
    return-void
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

.method public j(Lax/W2/h$c;)V
    .registers 2

    .line 1
    iput-object p1, p0, Lax/W2/h;->b:Lax/W2/h$c;

    .line 2
    .line 3
    return-void
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
