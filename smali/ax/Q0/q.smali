.class public abstract Lax/Q0/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lax/Q0/o;


# instance fields
.field protected b:Lax/Q0/o$a;

.field protected c:Lax/Q0/o$a;

.field private d:Lax/Q0/o$a;

.field private e:Lax/Q0/o$a;

.field private f:Ljava/nio/ByteBuffer;

.field private g:Ljava/nio/ByteBuffer;

.field private h:Z


# direct methods
.method public constructor <init>()V
    .registers 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Lax/Q0/o;->a:Ljava/nio/ByteBuffer;

    .line 5
    .line 6
    iput-object v0, p0, Lax/Q0/q;->f:Ljava/nio/ByteBuffer;

    .line 7
    .line 8
    iput-object v0, p0, Lax/Q0/q;->g:Ljava/nio/ByteBuffer;

    .line 9
    .line 10
    sget-object v0, Lax/Q0/o$a;->e:Lax/Q0/o$a;

    .line 11
    .line 12
    iput-object v0, p0, Lax/Q0/q;->d:Lax/Q0/o$a;

    .line 13
    .line 14
    iput-object v0, p0, Lax/Q0/q;->e:Lax/Q0/o$a;

    .line 15
    .line 16
    iput-object v0, p0, Lax/Q0/q;->b:Lax/Q0/o$a;

    .line 17
    .line 18
    iput-object v0, p0, Lax/Q0/q;->c:Lax/Q0/o$a;

    .line 19
    .line 20
    return-void
    .line 21
.end method


# virtual methods
.method public final a()V
    .registers 3

    .line 1
    sget-object v0, Lax/Q0/o;->a:Ljava/nio/ByteBuffer;

    .line 2
    .line 3
    iput-object v0, p0, Lax/Q0/q;->g:Ljava/nio/ByteBuffer;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    iput-boolean v1, p0, Lax/Q0/q;->h:Z

    .line 7
    .line 8
    iput-object v0, p0, Lax/Q0/q;->f:Ljava/nio/ByteBuffer;

    .line 9
    .line 10
    sget-object v0, Lax/Q0/o$a;->e:Lax/Q0/o$a;

    .line 11
    .line 12
    iput-object v0, p0, Lax/Q0/q;->d:Lax/Q0/o$a;

    .line 13
    .line 14
    iput-object v0, p0, Lax/Q0/q;->e:Lax/Q0/o$a;

    .line 15
    .line 16
    iput-object v0, p0, Lax/Q0/q;->b:Lax/Q0/o$a;

    .line 17
    .line 18
    iput-object v0, p0, Lax/Q0/q;->c:Lax/Q0/o$a;

    .line 19
    .line 20
    invoke-virtual {p0}, Lax/Q0/q;->l()V

    .line 21
    .line 22
    .line 23
    return-void
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

.method public b()Ljava/nio/ByteBuffer;
    .registers 3

    .line 1
    iget-object v0, p0, Lax/Q0/q;->g:Ljava/nio/ByteBuffer;

    .line 2
    .line 3
    sget-object v1, Lax/Q0/o;->a:Ljava/nio/ByteBuffer;

    .line 4
    .line 5
    iput-object v1, p0, Lax/Q0/q;->g:Ljava/nio/ByteBuffer;

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

.method public c()Z
    .registers 3

    .line 1
    iget-boolean v0, p0, Lax/Q0/q;->h:Z

    .line 2
    .line 3
    if-eqz v0, :cond_c

    .line 4
    .line 5
    iget-object v0, p0, Lax/Q0/q;->g:Ljava/nio/ByteBuffer;

    .line 6
    .line 7
    sget-object v1, Lax/Q0/o;->a:Ljava/nio/ByteBuffer;

    .line 8
    .line 9
    if-ne v0, v1, :cond_c

    .line 10
    .line 11
    const/4 v0, 0x1

    .line 12
    return v0

    .line 13
    :cond_c
    const/4 v0, 0x0

    .line 14
    return v0
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public e()Z
    .registers 3

    .line 1
    iget-object v0, p0, Lax/Q0/q;->e:Lax/Q0/o$a;

    .line 2
    .line 3
    sget-object v1, Lax/Q0/o$a;->e:Lax/Q0/o$a;

    .line 4
    .line 5
    if-eq v0, v1, :cond_8

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    return v0

    .line 9
    :cond_8
    const/4 v0, 0x0

    .line 10
    return v0
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

.method public final f()V
    .registers 2

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lax/Q0/q;->h:Z

    .line 3
    .line 4
    invoke-virtual {p0}, Lax/Q0/q;->k()V

    .line 5
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

.method public final flush()V
    .registers 2

    .line 1
    sget-object v0, Lax/Q0/o;->a:Ljava/nio/ByteBuffer;

    .line 2
    .line 3
    iput-object v0, p0, Lax/Q0/q;->g:Ljava/nio/ByteBuffer;

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    iput-boolean v0, p0, Lax/Q0/q;->h:Z

    .line 7
    .line 8
    iget-object v0, p0, Lax/Q0/q;->d:Lax/Q0/o$a;

    .line 9
    .line 10
    iput-object v0, p0, Lax/Q0/q;->b:Lax/Q0/o$a;

    .line 11
    .line 12
    iget-object v0, p0, Lax/Q0/q;->e:Lax/Q0/o$a;

    .line 13
    .line 14
    iput-object v0, p0, Lax/Q0/q;->c:Lax/Q0/o$a;

    .line 15
    .line 16
    invoke-virtual {p0}, Lax/Q0/q;->j()V

    .line 17
    .line 18
    .line 19
    return-void
    .line 20
    .line 21
.end method

.method public final g(Lax/Q0/o$a;)Lax/Q0/o$a;
    .registers 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/Q0/o$b;
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lax/Q0/q;->d:Lax/Q0/o$a;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lax/Q0/q;->i(Lax/Q0/o$a;)Lax/Q0/o$a;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    iput-object p1, p0, Lax/Q0/q;->e:Lax/Q0/o$a;

    .line 8
    .line 9
    invoke-virtual {p0}, Lax/Q0/q;->e()Z

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    if-eqz p1, :cond_11

    .line 14
    .line 15
    iget-object p1, p0, Lax/Q0/q;->e:Lax/Q0/o$a;

    .line 16
    .line 17
    return-object p1

    .line 18
    :cond_11
    sget-object p1, Lax/Q0/o$a;->e:Lax/Q0/o$a;

    .line 19
    .line 20
    return-object p1
    .line 21
    .line 22
.end method

.method protected final h()Z
    .registers 2

    .line 1
    iget-object v0, p0, Lax/Q0/q;->g:Ljava/nio/ByteBuffer;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/nio/Buffer;->hasRemaining()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
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

.method protected abstract i(Lax/Q0/o$a;)Lax/Q0/o$a;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/Q0/o$b;
        }
    .end annotation
.end method

.method protected j()V
    .registers 1

    .line 1
    return-void
    .line 2
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

.method protected k()V
    .registers 1

    .line 1
    return-void
    .line 2
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

.method protected l()V
    .registers 1

    .line 1
    return-void
    .line 2
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

.method protected final m(I)Ljava/nio/ByteBuffer;
    .registers 3

    .line 1
    iget-object v0, p0, Lax/Q0/q;->f:Ljava/nio/ByteBuffer;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/nio/Buffer;->capacity()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-ge v0, p1, :cond_17

    .line 8
    .line 9
    invoke-static {p1}, Ljava/nio/ByteBuffer;->allocateDirect(I)Ljava/nio/ByteBuffer;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-static {}, Ljava/nio/ByteOrder;->nativeOrder()Ljava/nio/ByteOrder;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    iput-object p1, p0, Lax/Q0/q;->f:Ljava/nio/ByteBuffer;

    .line 22
    .line 23
    goto :goto_1c

    .line 24
    :cond_17
    iget-object p1, p0, Lax/Q0/q;->f:Ljava/nio/ByteBuffer;

    .line 25
    .line 26
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->clear()Ljava/nio/Buffer;

    .line 27
    .line 28
    .line 29
    :goto_1c
    iget-object p1, p0, Lax/Q0/q;->f:Ljava/nio/ByteBuffer;

    .line 30
    .line 31
    iput-object p1, p0, Lax/Q0/q;->g:Ljava/nio/ByteBuffer;

    .line 32
    .line 33
    return-object p1
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
