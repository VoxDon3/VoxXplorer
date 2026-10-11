.class public final Lax/i1/q0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final d:Lax/i1/q0;

.field private static final e:Ljava/lang/String;


# instance fields
.field public final a:I

.field private final b:Lax/r7/z;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lax/r7/z<",
            "Lax/P0/P;",
            ">;"
        }
    .end annotation
.end field

.field private c:I


# direct methods
.method static constructor <clinit>()V
    .registers 3

    .line 1
    new-instance v0, Lax/i1/q0;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    new-array v2, v1, [Lax/P0/P;

    .line 5
    .line 6
    invoke-direct {v0, v2}, Lax/i1/q0;-><init>([Lax/P0/P;)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lax/i1/q0;->d:Lax/i1/q0;

    .line 10
    .line 11
    invoke-static {v1}, Lax/S0/d0;->G0(I)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    sput-object v0, Lax/i1/q0;->e:Ljava/lang/String;

    .line 16
    .line 17
    return-void
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public varargs constructor <init>([Lax/P0/P;)V
    .registers 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-static {p1}, Lax/r7/z;->w([Ljava/lang/Object;)Lax/r7/z;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iput-object v0, p0, Lax/i1/q0;->b:Lax/r7/z;

    .line 9
    .line 10
    array-length p1, p1

    .line 11
    iput p1, p0, Lax/i1/q0;->a:I

    .line 12
    .line 13
    invoke-direct {p0}, Lax/i1/q0;->g()V

    .line 14
    .line 15
    .line 16
    return-void
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method public static synthetic a(Lax/P0/P;)Ljava/lang/Integer;
    .registers 1

    .line 1
    iget p0, p0, Lax/P0/P;->c:I

    .line 2
    .line 3
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
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

.method public static b(Landroid/os/Bundle;)Lax/i1/q0;
    .registers 4

    .line 1
    sget-object v0, Lax/i1/q0;->e:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Landroid/os/Bundle;->getParcelableArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    const/4 v0, 0x0

    .line 8
    if-nez p0, :cond_11

    .line 9
    .line 10
    new-instance p0, Lax/i1/q0;

    .line 11
    .line 12
    new-array v0, v0, [Lax/P0/P;

    .line 13
    .line 14
    invoke-direct {p0, v0}, Lax/i1/q0;-><init>([Lax/P0/P;)V

    .line 15
    .line 16
    .line 17
    return-object p0

    .line 18
    :cond_11
    new-instance v1, Lax/i1/q0;

    .line 19
    .line 20
    new-instance v2, Lax/i1/o0;

    .line 21
    .line 22
    invoke-direct {v2}, Lax/i1/o0;-><init>()V

    .line 23
    .line 24
    .line 25
    invoke-static {v2, p0}, Lax/S0/g;->b(Lax/q7/f;Ljava/util/List;)Lax/r7/z;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    new-array v0, v0, [Lax/P0/P;

    .line 30
    .line 31
    invoke-virtual {p0, v0}, Lax/r7/x;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    check-cast p0, [Lax/P0/P;

    .line 36
    .line 37
    invoke-direct {v1, p0}, Lax/i1/q0;-><init>([Lax/P0/P;)V

    .line 38
    .line 39
    .line 40
    return-object v1
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

.method private g()V
    .registers 7

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_1
    iget-object v1, p0, Lax/i1/q0;->b:Lax/r7/z;

    .line 3
    .line 4
    invoke-virtual {v1}, Ljava/util/AbstractCollection;->size()I

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    if-ge v0, v1, :cond_3b

    .line 9
    .line 10
    add-int/lit8 v1, v0, 0x1

    .line 11
    .line 12
    move v2, v1

    .line 13
    :goto_c
    iget-object v3, p0, Lax/i1/q0;->b:Lax/r7/z;

    .line 14
    .line 15
    invoke-virtual {v3}, Ljava/util/AbstractCollection;->size()I

    .line 16
    .line 17
    .line 18
    move-result v3

    .line 19
    if-ge v2, v3, :cond_39

    .line 20
    .line 21
    iget-object v3, p0, Lax/i1/q0;->b:Lax/r7/z;

    .line 22
    .line 23
    invoke-interface {v3, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    check-cast v3, Lax/P0/P;

    .line 28
    .line 29
    iget-object v4, p0, Lax/i1/q0;->b:Lax/r7/z;

    .line 30
    .line 31
    invoke-interface {v4, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v4

    .line 35
    invoke-virtual {v3, v4}, Lax/P0/P;->equals(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v3

    .line 39
    if-eqz v3, :cond_36

    .line 40
    .line 41
    new-instance v3, Ljava/lang/IllegalArgumentException;

    .line 42
    .line 43
    const-string v4, "Multiple identical TrackGroups added to one TrackGroupArray."

    .line 44
    .line 45
    invoke-direct {v3, v4}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    const-string v4, "TrackGroupArray"

    .line 49
    .line 50
    const-string v5, ""

    .line 51
    .line 52
    invoke-static {v4, v5, v3}, Lax/S0/u;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 53
    .line 54
    .line 55
    :cond_36
    add-int/lit8 v2, v2, 0x1

    .line 56
    .line 57
    goto :goto_c

    .line 58
    :cond_39
    move v0, v1

    .line 59
    goto :goto_1

    .line 60
    :cond_3b
    return-void
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
.end method


# virtual methods
.method public c(I)Lax/P0/P;
    .registers 3

    .line 1
    iget-object v0, p0, Lax/i1/q0;->b:Lax/r7/z;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, Lax/P0/P;

    .line 8
    .line 9
    return-object p1
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

.method public d()Lax/r7/z;
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lax/r7/z<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lax/i1/q0;->b:Lax/r7/z;

    .line 2
    .line 3
    new-instance v1, Lax/i1/p0;

    .line 4
    .line 5
    invoke-direct {v1}, Lax/i1/p0;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-static {v0, v1}, Lax/r7/I;->i(Ljava/util/List;Lax/q7/f;)Ljava/util/List;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-static {v0}, Lax/r7/z;->u(Ljava/util/Collection;)Lax/r7/z;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    return-object v0
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public e(Lax/P0/P;)I
    .registers 3

    .line 1
    iget-object v0, p0, Lax/i1/q0;->b:Lax/r7/z;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lax/r7/z;->indexOf(Ljava/lang/Object;)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    if-ltz p1, :cond_9

    .line 8
    .line 9
    return p1

    .line 10
    :cond_9
    const/4 p1, -0x1

    .line 11
    return p1
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

.method public equals(Ljava/lang/Object;)Z
    .registers 6

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_4

    .line 3
    .line 4
    return v0

    .line 5
    :cond_4
    const/4 v1, 0x0

    .line 6
    if-eqz p1, :cond_23

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    const-class v3, Lax/i1/q0;

    .line 13
    .line 14
    if-eq v3, v2, :cond_10

    .line 15
    .line 16
    goto :goto_23

    .line 17
    :cond_10
    check-cast p1, Lax/i1/q0;

    .line 18
    .line 19
    iget v2, p0, Lax/i1/q0;->a:I

    .line 20
    .line 21
    iget v3, p1, Lax/i1/q0;->a:I

    .line 22
    .line 23
    if-ne v2, v3, :cond_23

    .line 24
    .line 25
    iget-object v2, p0, Lax/i1/q0;->b:Lax/r7/z;

    .line 26
    .line 27
    iget-object p1, p1, Lax/i1/q0;->b:Lax/r7/z;

    .line 28
    .line 29
    invoke-virtual {v2, p1}, Lax/r7/z;->equals(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result p1

    .line 33
    if-eqz p1, :cond_23

    .line 34
    .line 35
    return v0

    .line 36
    :cond_23
    :goto_23
    return v1
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

.method public f()Landroid/os/Bundle;
    .registers 5

    .line 1
    new-instance v0, Landroid/os/Bundle;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 4
    .line 5
    .line 6
    sget-object v1, Lax/i1/q0;->e:Ljava/lang/String;

    .line 7
    .line 8
    iget-object v2, p0, Lax/i1/q0;->b:Lax/r7/z;

    .line 9
    .line 10
    new-instance v3, Lax/i1/n0;

    .line 11
    .line 12
    invoke-direct {v3}, Lax/i1/n0;-><init>()V

    .line 13
    .line 14
    .line 15
    invoke-static {v2, v3}, Lax/S0/g;->d(Ljava/util/Collection;Lax/q7/f;)Ljava/util/ArrayList;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putParcelableArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 20
    .line 21
    .line 22
    return-object v0
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

.method public hashCode()I
    .registers 2

    .line 1
    iget v0, p0, Lax/i1/q0;->c:I

    .line 2
    .line 3
    if-nez v0, :cond_c

    .line 4
    .line 5
    iget-object v0, p0, Lax/i1/q0;->b:Lax/r7/z;

    .line 6
    .line 7
    invoke-virtual {v0}, Lax/r7/z;->hashCode()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    iput v0, p0, Lax/i1/q0;->c:I

    .line 12
    .line 13
    :cond_c
    iget v0, p0, Lax/i1/q0;->c:I

    .line 14
    .line 15
    return v0
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public toString()Ljava/lang/String;
    .registers 2

    .line 1
    iget-object v0, p0, Lax/i1/q0;->b:Lax/r7/z;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

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
