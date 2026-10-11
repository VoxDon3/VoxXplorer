.class public abstract Lax/U0/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lax/U0/g;


# instance fields
.field private final a:Z

.field private final b:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lax/U0/z;",
            ">;"
        }
    .end annotation
.end field

.field private c:I

.field private d:Lax/U0/k;


# direct methods
.method protected constructor <init>(Z)V
    .registers 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-boolean p1, p0, Lax/U0/b;->a:Z

    .line 5
    .line 6
    new-instance p1, Ljava/util/ArrayList;

    .line 7
    .line 8
    const/4 v0, 0x1

    .line 9
    invoke-direct {p1, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 10
    .line 11
    .line 12
    iput-object p1, p0, Lax/U0/b;->b:Ljava/util/ArrayList;

    .line 13
    .line 14
    return-void
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
.method public final d(Lax/U0/z;)V
    .registers 3

    .line 1
    invoke-static {p1}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lax/U0/b;->b:Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-nez v0, :cond_16

    .line 11
    .line 12
    iget-object v0, p0, Lax/U0/b;->b:Ljava/util/ArrayList;

    .line 13
    .line 14
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    iget p1, p0, Lax/U0/b;->c:I

    .line 18
    .line 19
    add-int/lit8 p1, p1, 0x1

    .line 20
    .line 21
    iput p1, p0, Lax/U0/b;->c:I

    .line 22
    .line 23
    :cond_16
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
.end method

.method public synthetic l()Ljava/util/Map;
    .registers 2

    .line 1
    invoke-static {p0}, Lax/U0/f;->a(Lax/U0/g;)Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method protected final q(I)V
    .registers 6

    .line 1
    iget-object v0, p0, Lax/U0/b;->d:Lax/U0/k;

    .line 2
    .line 3
    invoke-static {v0}, Lax/S0/d0;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lax/U0/k;

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    :goto_9
    iget v2, p0, Lax/U0/b;->c:I

    .line 11
    .line 12
    if-ge v1, v2, :cond_1d

    .line 13
    .line 14
    iget-object v2, p0, Lax/U0/b;->b:Ljava/util/ArrayList;

    .line 15
    .line 16
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    check-cast v2, Lax/U0/z;

    .line 21
    .line 22
    iget-boolean v3, p0, Lax/U0/b;->a:Z

    .line 23
    .line 24
    invoke-interface {v2, p0, v0, v3, p1}, Lax/U0/z;->h(Lax/U0/g;Lax/U0/k;ZI)V

    .line 25
    .line 26
    .line 27
    add-int/lit8 v1, v1, 0x1

    .line 28
    .line 29
    goto :goto_9

    .line 30
    :cond_1d
    return-void
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

.method protected final r()V
    .registers 5

    .line 1
    iget-object v0, p0, Lax/U0/b;->d:Lax/U0/k;

    .line 2
    .line 3
    invoke-static {v0}, Lax/S0/d0;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lax/U0/k;

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    :goto_9
    iget v2, p0, Lax/U0/b;->c:I

    .line 11
    .line 12
    if-ge v1, v2, :cond_1d

    .line 13
    .line 14
    iget-object v2, p0, Lax/U0/b;->b:Ljava/util/ArrayList;

    .line 15
    .line 16
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    check-cast v2, Lax/U0/z;

    .line 21
    .line 22
    iget-boolean v3, p0, Lax/U0/b;->a:Z

    .line 23
    .line 24
    invoke-interface {v2, p0, v0, v3}, Lax/U0/z;->b(Lax/U0/g;Lax/U0/k;Z)V

    .line 25
    .line 26
    .line 27
    add-int/lit8 v1, v1, 0x1

    .line 28
    .line 29
    goto :goto_9

    .line 30
    :cond_1d
    const/4 v0, 0x0

    .line 31
    iput-object v0, p0, Lax/U0/b;->d:Lax/U0/k;

    .line 32
    .line 33
    return-void
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

.method protected final s(Lax/U0/k;)V
    .registers 5

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_1
    iget v1, p0, Lax/U0/b;->c:I

    .line 3
    .line 4
    if-ge v0, v1, :cond_15

    .line 5
    .line 6
    iget-object v1, p0, Lax/U0/b;->b:Ljava/util/ArrayList;

    .line 7
    .line 8
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    check-cast v1, Lax/U0/z;

    .line 13
    .line 14
    iget-boolean v2, p0, Lax/U0/b;->a:Z

    .line 15
    .line 16
    invoke-interface {v1, p0, p1, v2}, Lax/U0/z;->i(Lax/U0/g;Lax/U0/k;Z)V

    .line 17
    .line 18
    .line 19
    add-int/lit8 v0, v0, 0x1

    .line 20
    .line 21
    goto :goto_1

    .line 22
    :cond_15
    return-void
.end method

.method protected final t(Lax/U0/k;)V
    .registers 5

    .line 1
    iput-object p1, p0, Lax/U0/b;->d:Lax/U0/k;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    :goto_3
    iget v1, p0, Lax/U0/b;->c:I

    .line 5
    .line 6
    if-ge v0, v1, :cond_17

    .line 7
    .line 8
    iget-object v1, p0, Lax/U0/b;->b:Ljava/util/ArrayList;

    .line 9
    .line 10
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    check-cast v1, Lax/U0/z;

    .line 15
    .line 16
    iget-boolean v2, p0, Lax/U0/b;->a:Z

    .line 17
    .line 18
    invoke-interface {v1, p0, p1, v2}, Lax/U0/z;->c(Lax/U0/g;Lax/U0/k;Z)V

    .line 19
    .line 20
    .line 21
    add-int/lit8 v0, v0, 0x1

    .line 22
    .line 23
    goto :goto_3

    .line 24
    :cond_17
    return-void
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
.end method
