.class Lax/s4/b$c;
.super Lax/s4/a$c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lax/s4/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "c"
.end annotation


# instance fields
.field private final a:Lax/w4/e;

.field private b:Ljava/net/HttpURLConnection;

.field final synthetic c:Lax/s4/b;


# direct methods
.method public constructor <init>(Lax/s4/b;Ljava/net/HttpURLConnection;)V
    .registers 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lax/s4/b$c;->c:Lax/s4/b;

    .line 2
    .line 3
    invoke-direct {p0}, Lax/s4/a$c;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object p2, p0, Lax/s4/b$c;->b:Ljava/net/HttpURLConnection;

    .line 7
    .line 8
    new-instance p1, Lax/w4/e;

    .line 9
    .line 10
    invoke-static {p2}, Lax/s4/b;->c(Ljava/net/HttpURLConnection;)Ljava/io/OutputStream;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-direct {p1, v0}, Lax/w4/e;-><init>(Ljava/io/OutputStream;)V

    .line 15
    .line 16
    .line 17
    iput-object p1, p0, Lax/s4/b$c;->a:Lax/w4/e;

    .line 18
    .line 19
    invoke-virtual {p2}, Ljava/net/URLConnection;->connect()V

    .line 20
    .line 21
    .line 22
    return-void
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
.method public a()V
    .registers 2

    .line 1
    iget-object v0, p0, Lax/s4/b$c;->b:Ljava/net/HttpURLConnection;

    .line 2
    .line 3
    if-nez v0, :cond_5

    .line 4
    .line 5
    return-void

    .line 6
    :cond_5
    invoke-virtual {v0}, Ljava/net/URLConnection;->getDoOutput()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_14

    .line 11
    .line 12
    :try_start_b
    iget-object v0, p0, Lax/s4/b$c;->b:Ljava/net/HttpURLConnection;

    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/net/URLConnection;->getOutputStream()Ljava/io/OutputStream;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-static {v0}, Lax/w4/c;->b(Ljava/io/Closeable;)V
    :try_end_14
    .catch Ljava/io/IOException; {:try_start_b .. :try_end_14} :catch_14

    .line 19
    .line 20
    .line 21
    :catch_14
    :cond_14
    const/4 v0, 0x0

    .line 22
    iput-object v0, p0, Lax/s4/b$c;->b:Ljava/net/HttpURLConnection;

    .line 23
    .line 24
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
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
.end method

.method public b()Lax/s4/a$b;
    .registers 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lax/s4/b$c;->b:Ljava/net/HttpURLConnection;

    .line 2
    .line 3
    if-eqz v0, :cond_12

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    :try_start_5
    iget-object v2, p0, Lax/s4/b$c;->c:Lax/s4/b;

    .line 7
    .line 8
    invoke-static {v2, v0}, Lax/s4/b;->d(Lax/s4/b;Ljava/net/HttpURLConnection;)Lax/s4/a$b;

    .line 9
    .line 10
    .line 11
    move-result-object v0
    :try_end_b
    .catchall {:try_start_5 .. :try_end_b} :catchall_e

    .line 12
    iput-object v1, p0, Lax/s4/b$c;->b:Ljava/net/HttpURLConnection;

    .line 13
    .line 14
    return-object v0

    .line 15
    :catchall_e
    move-exception v0

    .line 16
    iput-object v1, p0, Lax/s4/b$c;->b:Ljava/net/HttpURLConnection;

    .line 17
    .line 18
    throw v0

    .line 19
    :cond_12
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 20
    .line 21
    const-string v1, "Can\'t finish().  Uploader already closed."

    .line 22
    .line 23
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    throw v0
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

.method public c()Ljava/io/OutputStream;
    .registers 2

    .line 1
    iget-object v0, p0, Lax/s4/b$c;->a:Lax/w4/e;

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

.method public d(Lax/w4/c$d;)V
    .registers 3

    .line 1
    iget-object v0, p0, Lax/s4/b$c;->a:Lax/w4/e;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lax/w4/e;->a(Lax/w4/c$d;)V

    .line 4
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
