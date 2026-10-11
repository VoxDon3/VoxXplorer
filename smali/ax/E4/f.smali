.class public final Lax/E4/f;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lax/E4/f$b;,
        Lax/E4/f$c;
    }
.end annotation


# static fields
.field public static final c:Lax/E4/f;

.field public static final d:Lax/E4/f;


# instance fields
.field private a:Lax/E4/f$c;

.field private b:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .registers 2

    .line 1
    new-instance v0, Lax/E4/f;

    .line 2
    .line 3
    invoke-direct {v0}, Lax/E4/f;-><init>()V

    .line 4
    .line 5
    .line 6
    sget-object v1, Lax/E4/f$c;->c0:Lax/E4/f$c;

    .line 7
    .line 8
    invoke-direct {v0, v1}, Lax/E4/f;->d(Lax/E4/f$c;)Lax/E4/f;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    sput-object v0, Lax/E4/f;->c:Lax/E4/f;

    .line 13
    .line 14
    new-instance v0, Lax/E4/f;

    .line 15
    .line 16
    invoke-direct {v0}, Lax/E4/f;-><init>()V

    .line 17
    .line 18
    .line 19
    sget-object v1, Lax/E4/f$c;->d0:Lax/E4/f$c;

    .line 20
    .line 21
    invoke-direct {v0, v1}, Lax/E4/f;->d(Lax/E4/f$c;)Lax/E4/f;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    sput-object v0, Lax/E4/f;->d:Lax/E4/f;

    .line 26
    .line 27
    return-void
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

.method private constructor <init>()V
    .registers 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
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

.method static synthetic a(Lax/E4/f;)Ljava/lang/String;
    .registers 1

    .line 1
    iget-object p0, p0, Lax/E4/f;->b:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
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

.method public static c(Ljava/lang/String;)Lax/E4/f;
    .registers 3

    .line 1
    if-eqz p0, :cond_2d

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x1

    .line 8
    if-lt v0, v1, :cond_25

    .line 9
    .line 10
    const-string v0, "(/|ptid:).*"

    .line 11
    .line 12
    invoke-static {v0, p0}, Ljava/util/regex/Pattern;->matches(Ljava/lang/String;Ljava/lang/CharSequence;)Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-eqz v0, :cond_1d

    .line 17
    .line 18
    new-instance v0, Lax/E4/f;

    .line 19
    .line 20
    invoke-direct {v0}, Lax/E4/f;-><init>()V

    .line 21
    .line 22
    .line 23
    sget-object v1, Lax/E4/f$c;->q:Lax/E4/f$c;

    .line 24
    .line 25
    invoke-direct {v0, v1, p0}, Lax/E4/f;->e(Lax/E4/f$c;Ljava/lang/String;)Lax/E4/f;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    return-object p0

    .line 30
    :cond_1d
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 31
    .line 32
    const-string v0, "String does not match pattern"

    .line 33
    .line 34
    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    throw p0

    .line 38
    :cond_25
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 39
    .line 40
    const-string v0, "String is shorter than 1"

    .line 41
    .line 42
    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    throw p0

    .line 46
    :cond_2d
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 47
    .line 48
    const-string v0, "Value is null"

    .line 49
    .line 50
    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    throw p0
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
.end method

.method private d(Lax/E4/f$c;)Lax/E4/f;
    .registers 3

    .line 1
    new-instance v0, Lax/E4/f;

    .line 2
    .line 3
    invoke-direct {v0}, Lax/E4/f;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object p1, v0, Lax/E4/f;->a:Lax/E4/f$c;

    .line 7
    .line 8
    return-object v0
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

.method private e(Lax/E4/f$c;Ljava/lang/String;)Lax/E4/f;
    .registers 4

    .line 1
    new-instance v0, Lax/E4/f;

    .line 2
    .line 3
    invoke-direct {v0}, Lax/E4/f;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object p1, v0, Lax/E4/f;->a:Lax/E4/f$c;

    .line 7
    .line 8
    iput-object p2, v0, Lax/E4/f;->b:Ljava/lang/String;

    .line 9
    .line 10
    return-object v0
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
.method public b()Lax/E4/f$c;
    .registers 2

    .line 1
    iget-object v0, p0, Lax/E4/f;->a:Lax/E4/f$c;

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

.method public equals(Ljava/lang/Object;)Z
    .registers 6

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p1, p0, :cond_4

    .line 3
    .line 4
    return v0

    .line 5
    :cond_4
    const/4 v1, 0x0

    .line 6
    if-nez p1, :cond_8

    .line 7
    .line 8
    return v1

    .line 9
    :cond_8
    instance-of v2, p1, Lax/E4/f;

    .line 10
    .line 11
    if-eqz v2, :cond_36

    .line 12
    .line 13
    check-cast p1, Lax/E4/f;

    .line 14
    .line 15
    iget-object v2, p0, Lax/E4/f;->a:Lax/E4/f$c;

    .line 16
    .line 17
    iget-object v3, p1, Lax/E4/f;->a:Lax/E4/f$c;

    .line 18
    .line 19
    if-eq v2, v3, :cond_15

    .line 20
    .line 21
    return v1

    .line 22
    :cond_15
    sget-object v3, Lax/E4/f$a;->a:[I

    .line 23
    .line 24
    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    aget v2, v3, v2

    .line 29
    .line 30
    if-eq v2, v0, :cond_27

    .line 31
    .line 32
    const/4 p1, 0x2

    .line 33
    if-eq v2, p1, :cond_26

    .line 34
    .line 35
    const/4 p1, 0x3

    .line 36
    if-eq v2, p1, :cond_26

    .line 37
    .line 38
    return v1

    .line 39
    :cond_26
    return v0

    .line 40
    :cond_27
    iget-object v2, p0, Lax/E4/f;->b:Ljava/lang/String;

    .line 41
    .line 42
    iget-object p1, p1, Lax/E4/f;->b:Ljava/lang/String;

    .line 43
    .line 44
    if-eq v2, p1, :cond_35

    .line 45
    .line 46
    invoke-virtual {v2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    move-result p1

    .line 50
    if-eqz p1, :cond_34

    .line 51
    .line 52
    goto :goto_35

    .line 53
    :cond_34
    return v1

    .line 54
    :cond_35
    :goto_35
    return v0

    .line 55
    :cond_36
    return v1
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
.end method

.method public hashCode()I
    .registers 5

    .line 1
    iget-object v0, p0, Lax/E4/f;->a:Lax/E4/f$c;

    .line 2
    .line 3
    iget-object v1, p0, Lax/E4/f;->b:Ljava/lang/String;

    .line 4
    .line 5
    const/4 v2, 0x2

    .line 6
    new-array v2, v2, [Ljava/lang/Object;

    .line 7
    .line 8
    const/4 v3, 0x0

    .line 9
    aput-object v0, v2, v3

    .line 10
    .line 11
    const/4 v0, 0x1

    .line 12
    aput-object v1, v2, v0

    .line 13
    .line 14
    invoke-static {v2}, Ljava/util/Arrays;->hashCode([Ljava/lang/Object;)I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    return v0
    .line 19
    .line 20
    .line 21
.end method

.method public toString()Ljava/lang/String;
    .registers 3

    .line 1
    sget-object v0, Lax/E4/f$b;->b:Lax/E4/f$b;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {v0, p0, v1}, Lax/v4/c;->j(Ljava/lang/Object;Z)Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    return-object v0
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
