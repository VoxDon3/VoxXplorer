.class public final Lax/P0/T$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lax/P0/T;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lax/P0/T$b$a;
    }
.end annotation


# static fields
.field public static final d:Lax/P0/T$b;

.field private static final e:Ljava/lang/String;

.field private static final f:Ljava/lang/String;

.field private static final g:Ljava/lang/String;


# instance fields
.field public final a:I

.field public final b:Z

.field public final c:Z


# direct methods
.method static constructor <clinit>()V
    .registers 1

    .line 1
    new-instance v0, Lax/P0/T$b$a;

    .line 2
    .line 3
    invoke-direct {v0}, Lax/P0/T$b$a;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0}, Lax/P0/T$b$a;->d()Lax/P0/T$b;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    sput-object v0, Lax/P0/T$b;->d:Lax/P0/T$b;

    .line 11
    .line 12
    const/4 v0, 0x1

    .line 13
    invoke-static {v0}, Lax/S0/d0;->G0(I)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    sput-object v0, Lax/P0/T$b;->e:Ljava/lang/String;

    .line 18
    .line 19
    const/4 v0, 0x2

    .line 20
    invoke-static {v0}, Lax/S0/d0;->G0(I)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    sput-object v0, Lax/P0/T$b;->f:Ljava/lang/String;

    .line 25
    .line 26
    const/4 v0, 0x3

    .line 27
    invoke-static {v0}, Lax/S0/d0;->G0(I)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    sput-object v0, Lax/P0/T$b;->g:Ljava/lang/String;

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

.method private constructor <init>(Lax/P0/T$b$a;)V
    .registers 3

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    invoke-static {p1}, Lax/P0/T$b$a;->a(Lax/P0/T$b$a;)I

    move-result v0

    iput v0, p0, Lax/P0/T$b;->a:I

    .line 4
    invoke-static {p1}, Lax/P0/T$b$a;->b(Lax/P0/T$b$a;)Z

    move-result v0

    iput-boolean v0, p0, Lax/P0/T$b;->b:Z

    .line 5
    invoke-static {p1}, Lax/P0/T$b$a;->c(Lax/P0/T$b$a;)Z

    move-result p1

    iput-boolean p1, p0, Lax/P0/T$b;->c:Z

    return-void
.end method

.method synthetic constructor <init>(Lax/P0/T$b$a;Lax/P0/T$a;)V
    .registers 3

    .line 1
    invoke-direct {p0, p1}, Lax/P0/T$b;-><init>(Lax/P0/T$b$a;)V

    return-void
.end method

.method public static a(Landroid/os/Bundle;)Lax/P0/T$b;
    .registers 5

    .line 1
    new-instance v0, Lax/P0/T$b$a;

    .line 2
    .line 3
    invoke-direct {v0}, Lax/P0/T$b$a;-><init>()V

    .line 4
    .line 5
    .line 6
    sget-object v1, Lax/P0/T$b;->e:Ljava/lang/String;

    .line 7
    .line 8
    sget-object v2, Lax/P0/T$b;->d:Lax/P0/T$b;

    .line 9
    .line 10
    iget v3, v2, Lax/P0/T$b;->a:I

    .line 11
    .line 12
    invoke-virtual {p0, v1, v3}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    invoke-virtual {v0, v1}, Lax/P0/T$b$a;->e(I)Lax/P0/T$b$a;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    sget-object v1, Lax/P0/T$b;->f:Ljava/lang/String;

    .line 21
    .line 22
    iget-boolean v3, v2, Lax/P0/T$b;->b:Z

    .line 23
    .line 24
    invoke-virtual {p0, v1, v3}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    invoke-virtual {v0, v1}, Lax/P0/T$b$a;->f(Z)Lax/P0/T$b$a;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    sget-object v1, Lax/P0/T$b;->g:Ljava/lang/String;

    .line 33
    .line 34
    iget-boolean v2, v2, Lax/P0/T$b;->c:Z

    .line 35
    .line 36
    invoke-virtual {p0, v1, v2}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    .line 37
    .line 38
    .line 39
    move-result p0

    .line 40
    invoke-virtual {v0, p0}, Lax/P0/T$b$a;->g(Z)Lax/P0/T$b$a;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    invoke-virtual {p0}, Lax/P0/T$b$a;->d()Lax/P0/T$b;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    return-object p0
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


# virtual methods
.method public b()Landroid/os/Bundle;
    .registers 4

    .line 1
    new-instance v0, Landroid/os/Bundle;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 4
    .line 5
    .line 6
    sget-object v1, Lax/P0/T$b;->e:Ljava/lang/String;

    .line 7
    .line 8
    iget v2, p0, Lax/P0/T$b;->a:I

    .line 9
    .line 10
    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 11
    .line 12
    .line 13
    sget-object v1, Lax/P0/T$b;->f:Ljava/lang/String;

    .line 14
    .line 15
    iget-boolean v2, p0, Lax/P0/T$b;->b:Z

    .line 16
    .line 17
    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 18
    .line 19
    .line 20
    sget-object v1, Lax/P0/T$b;->g:Ljava/lang/String;

    .line 21
    .line 22
    iget-boolean v2, p0, Lax/P0/T$b;->c:Z

    .line 23
    .line 24
    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 25
    .line 26
    .line 27
    return-object v0
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
    if-eqz p1, :cond_25

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    const-class v3, Lax/P0/T$b;

    .line 13
    .line 14
    if-eq v3, v2, :cond_10

    .line 15
    .line 16
    goto :goto_25

    .line 17
    :cond_10
    check-cast p1, Lax/P0/T$b;

    .line 18
    .line 19
    iget v2, p0, Lax/P0/T$b;->a:I

    .line 20
    .line 21
    iget v3, p1, Lax/P0/T$b;->a:I

    .line 22
    .line 23
    if-ne v2, v3, :cond_25

    .line 24
    .line 25
    iget-boolean v2, p0, Lax/P0/T$b;->b:Z

    .line 26
    .line 27
    iget-boolean v3, p1, Lax/P0/T$b;->b:Z

    .line 28
    .line 29
    if-ne v2, v3, :cond_25

    .line 30
    .line 31
    iget-boolean v2, p0, Lax/P0/T$b;->c:Z

    .line 32
    .line 33
    iget-boolean p1, p1, Lax/P0/T$b;->c:Z

    .line 34
    .line 35
    if-ne v2, p1, :cond_25

    .line 36
    .line 37
    return v0

    .line 38
    :cond_25
    :goto_25
    return v1
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

.method public hashCode()I
    .registers 4

    .line 1
    iget v0, p0, Lax/P0/T$b;->a:I

    .line 2
    .line 3
    const/16 v1, 0x1f

    .line 4
    .line 5
    add-int/2addr v0, v1

    .line 6
    mul-int/lit8 v0, v0, 0x1f

    .line 7
    .line 8
    iget-boolean v2, p0, Lax/P0/T$b;->b:Z

    .line 9
    .line 10
    add-int/2addr v0, v2

    .line 11
    mul-int/lit8 v0, v0, 0x1f

    .line 12
    .line 13
    iget-boolean v1, p0, Lax/P0/T$b;->c:Z

    .line 14
    .line 15
    add-int/2addr v0, v1

    .line 16
    return v0
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method
