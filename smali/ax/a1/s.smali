.class public final synthetic Lax/a1/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic c0:Lax/Y0/b;

.field public final synthetic q:Lax/a1/z$a;


# direct methods
.method public synthetic constructor <init>(Lax/a1/z$a;Lax/Y0/b;)V
    .registers 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lax/a1/s;->q:Lax/a1/z$a;

    iput-object p2, p0, Lax/a1/s;->c0:Lax/Y0/b;

    return-void
.end method


# virtual methods
.method public final run()V
    .registers 3

    .line 1
    iget-object v0, p0, Lax/a1/s;->q:Lax/a1/z$a;

    iget-object v1, p0, Lax/a1/s;->c0:Lax/Y0/b;

    invoke-static {v0, v1}, Lax/a1/z$a;->c(Lax/a1/z$a;Lax/Y0/b;)V

    return-void
.end method
