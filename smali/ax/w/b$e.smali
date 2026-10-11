.class abstract Lax/w/b$e;
.super Lax/w/b$f;
.source "SourceFile"

# interfaces
.implements Ljava/util/Iterator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lax/w/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x40a
    name = "e"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:",
        "Ljava/lang/Object;",
        "V:",
        "Ljava/lang/Object;",
        ">",
        "Lax/w/b$f<",
        "TK;TV;>;",
        "Ljava/util/Iterator<",
        "Ljava/util/Map$Entry<",
        "TK;TV;>;>;"
    }
.end annotation


# instance fields
.field c0:Lax/w/b$c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lax/w/b$c<",
            "TK;TV;>;"
        }
    .end annotation
.end field

.field q:Lax/w/b$c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lax/w/b$c<",
            "TK;TV;>;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lax/w/b$c;Lax/w/b$c;)V
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lax/w/b$c<",
            "TK;TV;>;",
            "Lax/w/b$c<",
            "TK;TV;>;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Lax/w/b$f;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, Lax/w/b$e;->q:Lax/w/b$c;

    .line 5
    .line 6
    iput-object p1, p0, Lax/w/b$e;->c0:Lax/w/b$c;

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

.method private g()Lax/w/b$c;
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lax/w/b$c<",
            "TK;TV;>;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lax/w/b$e;->c0:Lax/w/b$c;

    .line 2
    .line 3
    iget-object v1, p0, Lax/w/b$e;->q:Lax/w/b$c;

    .line 4
    .line 5
    if-eq v0, v1, :cond_e

    .line 6
    .line 7
    if-nez v1, :cond_9

    .line 8
    .line 9
    goto :goto_e

    .line 10
    :cond_9
    invoke-virtual {p0, v0}, Lax/w/b$e;->e(Lax/w/b$c;)Lax/w/b$c;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    return-object v0

    .line 15
    :cond_e
    :goto_e
    const/4 v0, 0x0

    .line 16
    return-object v0
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method


# virtual methods
.method public b(Lax/w/b$c;)V
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lax/w/b$c<",
            "TK;TV;>;)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lax/w/b$e;->q:Lax/w/b$c;

    .line 2
    .line 3
    if-ne v0, p1, :cond_d

    .line 4
    .line 5
    iget-object v0, p0, Lax/w/b$e;->c0:Lax/w/b$c;

    .line 6
    .line 7
    if-ne p1, v0, :cond_d

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    iput-object v0, p0, Lax/w/b$e;->c0:Lax/w/b$c;

    .line 11
    .line 12
    iput-object v0, p0, Lax/w/b$e;->q:Lax/w/b$c;

    .line 13
    .line 14
    :cond_d
    iget-object v0, p0, Lax/w/b$e;->q:Lax/w/b$c;

    .line 15
    .line 16
    if-ne v0, p1, :cond_17

    .line 17
    .line 18
    invoke-virtual {p0, v0}, Lax/w/b$e;->c(Lax/w/b$c;)Lax/w/b$c;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    iput-object v0, p0, Lax/w/b$e;->q:Lax/w/b$c;

    .line 23
    .line 24
    :cond_17
    iget-object v0, p0, Lax/w/b$e;->c0:Lax/w/b$c;

    .line 25
    .line 26
    if-ne v0, p1, :cond_21

    .line 27
    .line 28
    invoke-direct {p0}, Lax/w/b$e;->g()Lax/w/b$c;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    iput-object p1, p0, Lax/w/b$e;->c0:Lax/w/b$c;

    .line 33
    .line 34
    :cond_21
    return-void
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

.method abstract c(Lax/w/b$c;)Lax/w/b$c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lax/w/b$c<",
            "TK;TV;>;)",
            "Lax/w/b$c<",
            "TK;TV;>;"
        }
    .end annotation
.end method

.method abstract e(Lax/w/b$c;)Lax/w/b$c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lax/w/b$c<",
            "TK;TV;>;)",
            "Lax/w/b$c<",
            "TK;TV;>;"
        }
    .end annotation
.end method

.method public f()Ljava/util/Map$Entry;
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map$Entry<",
            "TK;TV;>;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lax/w/b$e;->c0:Lax/w/b$c;

    .line 2
    .line 3
    invoke-direct {p0}, Lax/w/b$e;->g()Lax/w/b$c;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    iput-object v1, p0, Lax/w/b$e;->c0:Lax/w/b$c;

    .line 8
    .line 9
    return-object v0
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

.method public hasNext()Z
    .registers 2

    .line 1
    iget-object v0, p0, Lax/w/b$e;->c0:Lax/w/b$c;

    .line 2
    .line 3
    if-eqz v0, :cond_6

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    return v0

    .line 7
    :cond_6
    const/4 v0, 0x0

    .line 8
    return v0
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

.method public bridge synthetic next()Ljava/lang/Object;
    .registers 2

    .line 1
    invoke-virtual {p0}, Lax/w/b$e;->f()Ljava/util/Map$Entry;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
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
