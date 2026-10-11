.class Lax/m4/b$a;
.super Ljava/io/IOException;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lax/m4/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "a"
.end annotation


# instance fields
.field final synthetic q:Lax/m4/b;


# direct methods
.method public constructor <init>(Lax/m4/b;Ljava/lang/String;)V
    .registers 3

    .line 1
    iput-object p1, p0, Lax/m4/b$a;->q:Lax/m4/b;

    .line 2
    invoke-direct {p0, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Lax/m4/b;Ljava/lang/String;Ljava/lang/Exception;)V
    .registers 4

    .line 3
    iput-object p1, p0, Lax/m4/b$a;->q:Lax/m4/b;

    .line 4
    invoke-direct {p0, p2, p3}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method
