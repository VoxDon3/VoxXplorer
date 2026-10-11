.class public Lax/c3/U;
.super Lax/c3/f;
.source "SourceFile"


# instance fields
.field private a:Ljava/io/InputStream;

.field private b:Z

.field private c:J


# direct methods
.method public constructor <init>(Ljava/io/InputStream;J)V
    .registers 4

    .line 1
    invoke-direct {p0}, Lax/c3/f;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lax/c3/U;->a:Ljava/io/InputStream;

    .line 5
    .line 6
    iput-wide p2, p0, Lax/c3/U;->c:J

    .line 7
    .line 8
    const/4 p1, 0x0

    .line 9
    iput-boolean p1, p0, Lax/c3/U;->b:Z

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
    .line 22
    .line 23
    .line 24
    .line 25
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
.end method


# virtual methods
.method public a()Z
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

.method public c(J)Ljava/io/InputStream;
    .registers 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/b3/j;
        }
    .end annotation

    .line 1
    iget-boolean v0, p0, Lax/c3/U;->b:Z

    .line 2
    .line 3
    if-eqz v0, :cond_9

    .line 4
    .line 5
    const-string v0, "createInputStream called twice"

    .line 6
    .line 7
    invoke-static {v0}, Lax/u3/b;->g(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    :cond_9
    const-wide/16 v0, 0x0

    .line 11
    .line 12
    cmp-long v2, p1, v0

    .line 13
    .line 14
    if-lez v2, :cond_20

    .line 15
    .line 16
    invoke-static {}, Lax/Ha/c;->h()Lax/Ha/b;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    const-string p2, "offset > 0"

    .line 21
    .line 22
    invoke-virtual {p1, p2}, Lax/Ha/b;->b(Ljava/lang/String;)Lax/Ha/b;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    invoke-virtual {p1}, Lax/Ha/b;->j()Lax/Ha/b;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    invoke-virtual {p1}, Lax/Ha/b;->h()V

    .line 31
    .line 32
    .line 33
    :cond_20
    const/4 p1, 0x1

    .line 34
    iput-boolean p1, p0, Lax/c3/U;->b:Z

    .line 35
    .line 36
    iget-object p1, p0, Lax/c3/U;->a:Ljava/io/InputStream;

    .line 37
    .line 38
    return-object p1
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

.method public d()J
    .registers 3

    .line 1
    iget-wide v0, p0, Lax/c3/U;->c:J

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

.method public e()V
    .registers 2

    .line 1
    iget-boolean v0, p0, Lax/c3/U;->b:Z

    .line 2
    .line 3
    if-nez v0, :cond_9

    .line 4
    .line 5
    :try_start_4
    iget-object v0, p0, Lax/c3/U;->a:Ljava/io/InputStream;

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/io/InputStream;->close()V
    :try_end_9
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_9} :catch_9

    .line 8
    .line 9
    .line 10
    :catch_9
    :cond_9
    return-void
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
