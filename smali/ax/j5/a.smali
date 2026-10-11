.class public Lax/j5/a;
.super Lax/e5/c;
.source "SourceFile"


# static fields
.field private static final e:Ljava/lang/String; = "a"


# instance fields
.field private d:Lax/h5/b;


# direct methods
.method static constructor <clinit>()V
    .registers 0

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

.method private constructor <init>(Lax/e5/a;Lax/j5/c;)V
    .registers 3

    .line 1
    invoke-virtual {p2}, Lax/j5/c;->a()I

    .line 2
    .line 3
    .line 4
    move-result p2

    .line 5
    invoke-direct {p0, p1, p2}, Lax/e5/c;-><init>(Lax/e5/a;I)V

    .line 6
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

.method public static a(Lax/j5/c;Lax/e5/a;)Lax/j5/a;
    .registers 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    :try_start_0
    new-instance v0, Lax/j5/a;

    .line 2
    .line 3
    invoke-direct {v0, p1, p0}, Lax/j5/a;-><init>(Lax/e5/a;Lax/j5/c;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p0, v0}, Lax/h5/d;->a(Lax/j5/c;Lax/e5/a;)Lax/h5/b;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    iput-object p0, v0, Lax/j5/a;->d:Lax/h5/b;
    :try_end_b
    .catch Lax/h5/d$a; {:try_start_0 .. :try_end_b} :catch_c

    .line 11
    .line 12
    return-object v0

    .line 13
    :catch_c
    sget-object p0, Lax/j5/a;->e:Ljava/lang/String;

    .line 14
    .line 15
    const-string p1, "Unsupported fs on partition"

    .line 16
    .line 17
    invoke-static {p0, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 18
    .line 19
    .line 20
    const/4 p0, 0x0

    .line 21
    return-object p0
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
.method public b()Lax/h5/b;
    .registers 2

    .line 1
    iget-object v0, p0, Lax/j5/a;->d:Lax/h5/b;

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
