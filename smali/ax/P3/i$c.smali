.class Lax/P3/i$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lax/P3/f$e;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lax/P3/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "c"
.end annotation


# instance fields
.field private final a:Lax/R3/a$a;

.field private volatile b:Lax/R3/a;


# direct methods
.method public constructor <init>(Lax/R3/a$a;)V
    .registers 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lax/P3/i$c;->a:Lax/R3/a$a;

    .line 5
    .line 6
    return-void
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
.method public a()Lax/R3/a;
    .registers 2

    .line 1
    iget-object v0, p0, Lax/P3/i$c;->b:Lax/R3/a;

    .line 2
    .line 3
    if-nez v0, :cond_23

    .line 4
    .line 5
    monitor-enter p0

    .line 6
    :try_start_5
    iget-object v0, p0, Lax/P3/i$c;->b:Lax/R3/a;

    .line 7
    .line 8
    if-nez v0, :cond_14

    .line 9
    .line 10
    iget-object v0, p0, Lax/P3/i$c;->a:Lax/R3/a$a;

    .line 11
    .line 12
    invoke-interface {v0}, Lax/R3/a$a;->g()Lax/R3/a;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    iput-object v0, p0, Lax/P3/i$c;->b:Lax/R3/a;

    .line 17
    .line 18
    goto :goto_14

    .line 19
    :catchall_12
    move-exception v0

    .line 20
    goto :goto_21

    .line 21
    :cond_14
    :goto_14
    iget-object v0, p0, Lax/P3/i$c;->b:Lax/R3/a;

    .line 22
    .line 23
    if-nez v0, :cond_1f

    .line 24
    .line 25
    new-instance v0, Lax/R3/b;

    .line 26
    .line 27
    invoke-direct {v0}, Lax/R3/b;-><init>()V

    .line 28
    .line 29
    .line 30
    iput-object v0, p0, Lax/P3/i$c;->b:Lax/R3/a;

    .line 31
    .line 32
    :cond_1f
    monitor-exit p0

    .line 33
    goto :goto_23

    .line 34
    :goto_21
    monitor-exit p0
    :try_end_22
    .catchall {:try_start_5 .. :try_end_22} :catchall_12

    .line 35
    throw v0

    .line 36
    :cond_23
    :goto_23
    iget-object v0, p0, Lax/P3/i$c;->b:Lax/R3/a;

    .line 37
    .line 38
    return-object v0
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
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
.end method
