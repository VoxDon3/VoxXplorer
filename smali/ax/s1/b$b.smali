.class Lax/s1/b$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lax/q1/N;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lax/s1/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "b"
.end annotation


# instance fields
.field private final a:J

.field final synthetic b:Lax/s1/b;


# direct methods
.method public constructor <init>(Lax/s1/b;J)V
    .registers 4

    .line 1
    iput-object p1, p0, Lax/s1/b$b;->b:Lax/s1/b;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-wide p2, p0, Lax/s1/b$b;->a:J

    .line 7
    .line 8
    return-void
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
.method public i()Z
    .registers 2

    .line 1
    const/4 v0, 0x1

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

.method public l(J)Lax/q1/N$a;
    .registers 11

    .line 1
    iget-object v0, p0, Lax/s1/b$b;->b:Lax/s1/b;

    .line 2
    .line 3
    invoke-static {v0}, Lax/s1/b;->g(Lax/s1/b;)[Lax/s1/e;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const/4 v1, 0x0

    .line 8
    aget-object v0, v0, v1

    .line 9
    .line 10
    invoke-virtual {v0, p1, p2}, Lax/s1/e;->i(J)Lax/q1/N$a;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    const/4 v1, 0x1

    .line 15
    :goto_e
    iget-object v2, p0, Lax/s1/b$b;->b:Lax/s1/b;

    .line 16
    .line 17
    invoke-static {v2}, Lax/s1/b;->g(Lax/s1/b;)[Lax/s1/e;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    array-length v2, v2

    .line 22
    if-ge v1, v2, :cond_33

    .line 23
    .line 24
    iget-object v2, p0, Lax/s1/b$b;->b:Lax/s1/b;

    .line 25
    .line 26
    invoke-static {v2}, Lax/s1/b;->g(Lax/s1/b;)[Lax/s1/e;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    aget-object v2, v2, v1

    .line 31
    .line 32
    invoke-virtual {v2, p1, p2}, Lax/s1/e;->i(J)Lax/q1/N$a;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    iget-object v3, v2, Lax/q1/N$a;->a:Lax/q1/O;

    .line 37
    .line 38
    iget-wide v3, v3, Lax/q1/O;->b:J

    .line 39
    .line 40
    iget-object v5, v0, Lax/q1/N$a;->a:Lax/q1/O;

    .line 41
    .line 42
    iget-wide v5, v5, Lax/q1/O;->b:J

    .line 43
    .line 44
    cmp-long v7, v3, v5

    .line 45
    .line 46
    if-gez v7, :cond_30

    .line 47
    .line 48
    move-object v0, v2

    .line 49
    :cond_30
    add-int/lit8 v1, v1, 0x1

    .line 50
    .line 51
    goto :goto_e

    .line 52
    :cond_33
    return-object v0
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

.method public n()J
    .registers 3

    .line 1
    iget-wide v0, p0, Lax/s1/b$b;->a:J

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
