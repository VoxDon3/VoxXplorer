.class public Lax/c3/S;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lax/M9/g;


# instance fields
.field private a:Lax/K9/a;

.field private b:Lax/L9/d;

.field private c:Lax/P9/n;

.field private d:Lax/Q9/b;

.field private e:Lcom/microsoft/graph/serializer/b;

.field private f:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .registers 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lax/c3/S;->f:Landroid/content/Context;

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

.method public static f(Landroid/content/Context;Lax/K9/a;)Lax/M9/g;
    .registers 5

    .line 1
    new-instance v0, Lax/c3/S$a;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lax/c3/S$a;-><init>(Landroid/content/Context;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, v0, Lax/c3/S;->a:Lax/K9/a;

    .line 7
    .line 8
    invoke-virtual {v0}, Lax/c3/S;->a()Lax/Q9/b;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    new-instance v1, Ljava/lang/StringBuilder;

    .line 13
    .line 14
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 15
    .line 16
    .line 17
    const-string v2, "Using provided auth provider "

    .line 18
    .line 19
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    invoke-virtual {p1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    invoke-interface {p0, p1}, Lax/Q9/b;->a(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    return-object v0
    .line 41
.end method


# virtual methods
.method public a()Lax/Q9/b;
    .registers 3

    .line 1
    iget-object v0, p0, Lax/c3/S;->d:Lax/Q9/b;

    .line 2
    .line 3
    if-nez v0, :cond_10

    .line 4
    .line 5
    new-instance v0, Lax/Q9/a;

    .line 6
    .line 7
    invoke-direct {v0}, Lax/Q9/a;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lax/c3/S;->d:Lax/Q9/b;

    .line 11
    .line 12
    const-string v1, "Created DefaultLogger"

    .line 13
    .line 14
    invoke-interface {v0, v1}, Lax/Q9/b;->a(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    :cond_10
    iget-object v0, p0, Lax/c3/S;->d:Lax/Q9/b;

    .line 18
    .line 19
    return-object v0
    .line 20
    .line 21
.end method

.method public b()Lax/P9/n;
    .registers 8

    .line 1
    iget-object v0, p0, Lax/c3/S;->c:Lax/P9/n;

    .line 2
    .line 3
    if-nez v0, :cond_24

    .line 4
    .line 5
    new-instance v1, Lcom/voxdon/xplorer/file/G;

    .line 6
    .line 7
    iget-object v2, p0, Lax/c3/S;->f:Landroid/content/Context;

    .line 8
    .line 9
    invoke-virtual {p0}, Lax/c3/S;->d()Lax/T9/e;

    .line 10
    .line 11
    .line 12
    move-result-object v3

    .line 13
    invoke-virtual {p0}, Lax/c3/S;->c()Lax/K9/a;

    .line 14
    .line 15
    .line 16
    move-result-object v4

    .line 17
    invoke-virtual {p0}, Lax/c3/S;->e()Lax/L9/d;

    .line 18
    .line 19
    .line 20
    move-result-object v5

    .line 21
    invoke-virtual {p0}, Lax/c3/S;->a()Lax/Q9/b;

    .line 22
    .line 23
    .line 24
    move-result-object v6

    .line 25
    invoke-direct/range {v1 .. v6}, Lcom/voxdon/xplorer/file/G;-><init>(Landroid/content/Context;Lax/T9/e;Lax/K9/a;Lax/L9/d;Lax/Q9/b;)V

    .line 26
    .line 27
    .line 28
    iput-object v1, p0, Lax/c3/S;->c:Lax/P9/n;

    .line 29
    .line 30
    iget-object v0, p0, Lax/c3/S;->d:Lax/Q9/b;

    .line 31
    .line 32
    const-string v1, "Created DefaultHttpProvider"

    .line 33
    .line 34
    invoke-interface {v0, v1}, Lax/Q9/b;->a(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    :cond_24
    iget-object v0, p0, Lax/c3/S;->c:Lax/P9/n;

    .line 38
    .line 39
    return-object v0
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

.method public c()Lax/K9/a;
    .registers 2

    .line 1
    iget-object v0, p0, Lax/c3/S;->a:Lax/K9/a;

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

.method public d()Lax/T9/e;
    .registers 3

    .line 1
    iget-object v0, p0, Lax/c3/S;->e:Lcom/microsoft/graph/serializer/b;

    .line 2
    .line 3
    if-nez v0, :cond_16

    .line 4
    .line 5
    new-instance v0, Lcom/microsoft/graph/serializer/b;

    .line 6
    .line 7
    invoke-virtual {p0}, Lax/c3/S;->a()Lax/Q9/b;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-direct {v0, v1}, Lcom/microsoft/graph/serializer/b;-><init>(Lax/Q9/b;)V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, Lax/c3/S;->e:Lcom/microsoft/graph/serializer/b;

    .line 15
    .line 16
    iget-object v0, p0, Lax/c3/S;->d:Lax/Q9/b;

    .line 17
    .line 18
    const-string v1, "Created DefaultSerializer"

    .line 19
    .line 20
    invoke-interface {v0, v1}, Lax/Q9/b;->a(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    :cond_16
    iget-object v0, p0, Lax/c3/S;->e:Lcom/microsoft/graph/serializer/b;

    .line 24
    .line 25
    return-object v0
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

.method public e()Lax/L9/d;
    .registers 3

    .line 1
    iget-object v0, p0, Lax/c3/S;->b:Lax/L9/d;

    .line 2
    .line 3
    if-nez v0, :cond_16

    .line 4
    .line 5
    new-instance v0, Lax/L9/b;

    .line 6
    .line 7
    invoke-virtual {p0}, Lax/c3/S;->a()Lax/Q9/b;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-direct {v0, v1}, Lax/L9/b;-><init>(Lax/Q9/b;)V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, Lax/c3/S;->b:Lax/L9/d;

    .line 15
    .line 16
    iget-object v0, p0, Lax/c3/S;->d:Lax/Q9/b;

    .line 17
    .line 18
    const-string v1, "Created DefaultExecutors"

    .line 19
    .line 20
    invoke-interface {v0, v1}, Lax/Q9/b;->a(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    :cond_16
    iget-object v0, p0, Lax/c3/S;->b:Lax/L9/d;

    .line 24
    .line 25
    return-object v0
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
